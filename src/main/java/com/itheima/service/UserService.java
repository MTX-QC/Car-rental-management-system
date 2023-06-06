package com.itheima.service;
import com.itheima.domain.User;
import entity.PageResult;

/**
 *用户接口
 */
public interface UserService{
    //升级为vip（申请）
    void updateToVip(Integer id);

    //审核用户的申请
    void auditUser(Integer id);



    //通过User的用户账号和用户密码查询用户信息
    User login(User user);
    //注册用户
    void register(String name,String email,String password);

//添加用户
    void addUser(User user);
//根据用户id办理用户离职
    void delUser(Integer id);
//编辑用户信息
    void editUser(User user);
//搜索用户
    PageResult searchUsers(User user, Integer pageNum, Integer pageSize);
//根据id查询用户信息
    User findById(Integer id);


    Integer checkName(String name);

    Integer checkEmail(String email);

    //查询待审核用户
    PageResult queryAuditUser(User user, Integer pageNum, Integer pageSize);

}
