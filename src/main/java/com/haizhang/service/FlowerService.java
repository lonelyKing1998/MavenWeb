package com.haizhang.service;

import com.haizhang.bean.Flower;
import com.haizhang.dao.DaoFactory.DaoFactory;
import com.haizhang.dao.FlowerDao;

/**
 * @author 海章
 * @create 2019-02-25 10:16
 */
public class FlowerService {
    private FlowerDao flowerDao=DaoFactory.getFlowerDaoImpl();
    public void insertFlower(String name,double price,String production){
        flowerDao.inputFlower(name,price,production);
    }
}
