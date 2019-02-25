package com.haizhang.dao.DaoFactory;

import com.haizhang.dao.FlowerDao;
import com.haizhang.dao.Impl.FlowerDaoImpl;

/**
 * @author 海章
 * @create 2019-02-25 10:27
 */
public class DaoFactory {
    public static FlowerDao getFlowerDaoImpl(){
        return new FlowerDaoImpl();
    }
}
