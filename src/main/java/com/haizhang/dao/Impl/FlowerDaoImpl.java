package com.haizhang.dao.Impl;

import com.haizhang.bean.Flower;
import com.haizhang.dao.BaseDao;
import com.haizhang.dao.FlowerDao;

/**
 * 花卉接口实现
 *
 * @author 海章
 * @create 2019-02-25 10:20
 */
public class FlowerDaoImpl extends BaseDao<Flower> implements FlowerDao {

    /**
     * 卖花接口
     * @param name
     * @param price
     * @param production
     */
    public void inputFlower(String name, double price, String production) {
          super.update("insert into flower(name,price,production) values(?,?,?)",name,price,production);
    }
}
