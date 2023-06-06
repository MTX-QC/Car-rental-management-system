package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.domain.Book;
import com.itheima.mapper.MessageMapper;
import com.itheima.service.MessageService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
@Service
@Transactional
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    //VIP用户新增车辆
    @Override
    public Integer addVehicle(Book book,Integer userId) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //设置新增车辆的上架时间
        book.setUploadTime(dateFormat.format(new Date()));
        return  messageMapper.addVehicle(book,userId);
    }

    @Override
    public Integer editVehicle(Book book) {
        return messageMapper.editVehicle(book);
    }


    @Override
    public PageResult search(Book book, Integer id) {
        Page<Book> page=messageMapper.search(id);
        return new PageResult(page.getTotal(),page.getResult());
    }

//    管理员查询全部车辆信息
    @Override
    public PageResult selectAllVehicles(Book book) {
        Page<Book> page=messageMapper.selectAllVehicles(book);
        return new PageResult(page.getTotal(),page.getResult());
    }



}
