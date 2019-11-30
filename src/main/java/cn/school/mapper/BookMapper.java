package cn.school.mapper;

import cn.school.demain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author torrent
 * @date 19-10-30 上午10:37
 */
@Mapper
public interface BookMapper {

    @Select("select * from book")
    List<Book> getAllBooks();

    @Delete("delete from book where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into book(name, publisher, price, introduction) values(#{name}, #{publisher}, #{price}, #{introduction})")
    void addBook(Book book);

    @Select("select * from book where id=#{id}")
    Book findById(Integer id);

    @Update("UPDATE book SET name = #{name}, publisher=#{publisher},price=#{price},introduction=#{introduction} WHERE id = #{id} ")
    void updateBook(Book book);
}
