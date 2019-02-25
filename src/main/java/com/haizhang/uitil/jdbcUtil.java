package com.haizhang.uitil;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 海章
 * @create 2018-11-28 15:12
 */

public class jdbcUtil  {
    private static  DataSource ds;
    static{

        try {
            Properties pro=new Properties();
            String path=jdbcUtil.class.getClassLoader().getResource("db.properties").getPath();
            FileInputStream in=new FileInputStream(path);
            pro.load(in);
            ds= DruidDataSourceFactory.createDataSource(pro);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 得到数据源
     */
    public static DataSource getDataSource(){
        return ds;
    }
}
