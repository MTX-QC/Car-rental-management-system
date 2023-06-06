package com.itheima.domain;
import java.io.Serializable;
public class Book implements Serializable {
    private Integer id;        //车辆编号
    private String name;       //车辆名称
    private String isbn;       //车辆标准ISBN编号
    private String press;      //车辆出版社
    private String author;     //车辆作者
    private Integer pagination;//车辆页数
    private Double price;      //车辆价格
    private String uploadTime; //车辆上架时间
    private String status;     //车辆状态
    private String borrower;   //车辆借阅人
    private String borrowTime; //车辆借阅时间
    private String returnTime; //车辆预计归还时间
    private Integer userId;//用户id
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getPress() {
        return press;
    }
    public void setPress(String press) {
        this.press = press;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Integer getPagination() {
        return pagination;
    }
    public void setPagination(Integer pagination) {
        this.pagination = pagination;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getUploadTime() {
        return uploadTime;
    }
    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getBorrower() {
        return borrower;
    }
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }
    public String getBorrowTime() {
        return borrowTime;
    }
    public void setBorrowTime(String borrowTime) {
        this.borrowTime = borrowTime;
    }
    public String getReturnTime() {
        return returnTime;
    }
    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
