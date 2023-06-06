package com.itheima.service;
import com.itheima.domain.Book;
import com.itheima.domain.User;
import entity.PageResult;
/**
 * 车辆接口
 */
public interface BookService {
//查询最新上架的车辆
PageResult selectNewBooks(Integer pageNum, Integer pageSize);
//根据id查询车辆信息
Book findById(String id);
//借阅车辆
Integer borrowBook(Book book);
//分页查询车辆
PageResult search(Book book, Integer pageNum, Integer pageSize);
//新增车辆
Integer addBook(Book book);
//编辑车辆信息
Integer editBook(Book book);
//查询当前借阅的车辆
PageResult searchBorrowed(Book book, User user, Integer pageNum, Integer pageSize);
//归还车辆
boolean returnBook(String  id,User user);
//归还确认
Integer returnConfirm(String id);

    //新增车辆
    Integer addVehicle(Book book);

}
