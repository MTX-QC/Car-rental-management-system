package com.itheima.service;

import com.itheima.domain.Book;
import com.itheima.domain.User;
import entity.PageResult;
import org.springframework.stereotype.Service;

@Service
public interface MessageService {
    //新增车辆
    Integer addVehicle(Book book,Integer userId);
    //编辑车辆
    Integer editVehicle(Book book);

    //分页查询VIP用户发布的租车信息
    PageResult search(Book book, Integer id);

    //管理员查询全部车辆信息
    PageResult selectAllVehicles(Book book);

}
