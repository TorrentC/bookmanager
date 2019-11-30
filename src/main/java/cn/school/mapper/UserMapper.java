package cn.school.mapper;

import cn.school.demain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author torrent
 * @date 19-10-29 下午7:30
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> getAllUser();

    @Select(("select * from user where username=#{username} and password=#{password}"))
    User getUser(User user);
}
