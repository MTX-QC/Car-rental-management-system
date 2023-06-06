package com.itheima.controller;
import com.itheima.domain.Book;
import com.itheima.domain.User;
import com.itheima.service.BookService;
import com.itheima.service.MessageService;
import entity.PageResult;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/*
车辆信息Controller
 */
@Controller
@RequestMapping("/message")
public class MessageController {
    //MessageServicede
    @Autowired
    private MessageService messageService;
    @RequestMapping("/search")
    public ModelAndView search(Book book, HttpSession session) {
        //获取当前登录的用户ID
        Integer id = ((User) session.getAttribute("USER_SESSION")).getId();

        //查询到的车辆信息
        PageResult pageResult = messageService.search(book,id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("postMessage");
        //将查询到的数据存放在 ModelAndView的对象中
        modelAndView.addObject("pageResult", pageResult);
        //将查询的参数返回到页面，用于回显到查询的输入框中
        modelAndView.addObject("search", book);
        return modelAndView;
    }
    /**
     * 新增车辆
     * @param book 页面表单提交的车辆信息
     * 将新增的结果和向页面传递信息封装到Result对象中返回
     */
    @ResponseBody
    @RequestMapping("/addVehicle")
    public Result addBook(Book book,HttpSession session) {
        //获取当前登录的用户ID
        Integer userId = ((User) session.getAttribute("USER_SESSION")).getId();
        try {
            Integer count=messageService.addVehicle(book,userId);
            if(count!=1){
                return new Result(false, "新增车辆失败!");
            }
            return new Result(true, "新增车辆成功!");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false, "新增车辆失败!");
        }
    }

    /**
     * 编辑车辆信息
     * @param book 编辑的车辆信息
     */
    @ResponseBody
    @RequestMapping("/editVehicle")
    public Result editVehicle(Book book) {
        try {
            Integer count= messageService.editVehicle(book);
            if(count!=1){
                return new Result(false, "编辑失败!");
            }
            return new Result(true, "编辑成功!");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false, "编辑失败!");
        }
    }

    @ResponseBody
    @RequestMapping("ReleaseInformationManagement")
    public ModelAndView ReleaseInformationManagement(Book book) {
        //查询到的车辆信息
        PageResult pageResult = messageService.selectAllVehicles(book);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("VehicleReleaseManagement");
        //将查询到的数据存放在 ModelAndView的对象中
        modelAndView.addObject("pageResult", pageResult);
        //将查询的参数返回到页面，用于回显到查询的输入框中
        modelAndView.addObject("search", book);
        return modelAndView;
    }

}

