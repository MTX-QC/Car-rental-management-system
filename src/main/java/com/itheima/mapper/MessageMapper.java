package com.itheima.mapper;
import com.github.pagehelper.Page;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.*;
/**
 * 车辆接口
 */
public interface MessageMapper {
    @Select("SELECT * FROM book where user_id = #{userId} order by book_uploadtime DESC")
    @Results(id = "bookMap",value = {
            //id字段默认为false，表示不是主键
            //column表示数据库表字段，property表示实体类属性名。
            @Result(id = true,column = "book_id",property = "id"),
            @Result(column = "book_name",property = "name"),
            @Result(column = "book_isbn",property = "isbn"),
            @Result(column = "book_press",property = "press"),
            @Result(column = "book_author",property = "author"),
            @Result(column = "book_pagination",property = "pagination"),
            @Result(column = "book_price",property = "price"),
            @Result(column = "book_uploadtime",property = "uploadTime"),
            @Result(column = "book_status",property = "status"),
            @Result(column = "book_borrower",property = "borrower"),
            @Result(column = "book_borrowtime",property = "borrowTime"),
            @Result(column = "book_returntime",property = "returnTime"),
            @Result(column = "user_id",property = "userId")
    })
    Page<Book> selectNewBooks();

    @Select("SELECT * FROM book where book_id=#{id}")
    @ResultMap("bookMap")
    //根据id查询车辆信息
    Book findById(String id);

    @Select({"<script>" +
            "SELECT * FROM book " +
            "where user_id = #{id}" +
            "</script>"
    })
    //分页查询VIP发布的车辆
    @ResultMap("bookMap")
    Page<Book> search(Integer id);

    //新增车辆
    @Insert("insert into book (book_id, book_name, book_isbn, book_press, book_author, book_pagination, book_price, book_uploadtime, book_status, book_borrower, book_borrowtime, book_returntime,user_id)\n" +
            "        values (#{Book.id}, #{Book.name}, #{Book.isbn}, #{Book.press}, #{Book.author}, #{Book.pagination}, #{Book.price}, #{Book.uploadTime},'4', #{Book.borrower}, #{Book.borrowTime}, #{Book.returnTime},#{userId})\n" +
            "  ")
    Integer addVehicle(@Param("Book") Book book,@Param("userId") Integer userId);

    //编辑车辆
    Integer editVehicle(Book book);
    //管理员查询全部车辆信息
    @Select({"<script>" +
            "SELECT * FROM book " +
            "where book_status = '4' " +
            "</script>"
    })
    //分页查询VIP发布的车辆
    @ResultMap("bookMap")
    Page<Book> selectAllVehicles(Book book);





}
