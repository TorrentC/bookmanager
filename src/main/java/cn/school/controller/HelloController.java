package cn.school.controller;

import cn.school.demain.Book;
import cn.school.demain.User;
import cn.school.mapper.BookMapper;
import cn.school.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author torrent
 * @date 19-10-29 下午7:08
 */
@Controller
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BookMapper bookMapper;

    @RequestMapping("/")
    public String hello(Model model, HttpServletRequest request) {
        List<Book> bookList = bookMapper.getAllBooks();
        model.addAttribute("books", bookList);
        return "home";

    }

    @RequestMapping("/login")
    public String login(User requestUser, HttpServletRequest request) {
        User user = userMapper.getUser(requestUser);
        if (user != null) {
            request.getSession().setAttribute("user", user);
            return "redirect:/";
        }
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        return "redirect:/";
    }

    @RequestMapping("/delete")
    public String delete(Integer id) {
        bookMapper.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping("/edit")
    public String add(Book book, Integer id, Model model) {

        //修改
        if (book.getId() != null && book.getName() != null) {
            bookMapper.updateBook(book);
            return "redirect:/";
        }

        //添加
        if (book.getName() != null) {
            bookMapper.addBook(book);
            return "redirect:/";
        }
        //修改动作
        if (id != null) {
            Book byId = bookMapper.findById(id);
            model.addAttribute("book", byId);
            return "edit";
        }
        return "edit";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request, String name, Model model) {
        model.addAttribute("name", name);
        HttpSession session = request.getSession();
        session.setAttribute("name", 456);
        return "index";
    }

    @RequestMapping("/remove")
    public String remove(HttpServletRequest request) {
        request.getSession().removeAttribute("name");
        return "redirect:/";
    }
}
