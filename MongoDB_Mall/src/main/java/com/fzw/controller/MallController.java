package com.fzw.controller;

import com.fzw.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/mall")
public class MallController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Query query = new Query(Criteria.where("username").is(username));
        List<UserEntity> userEntities = mongoTemplate.find(query, UserEntity.class);
        if (userEntities!=null){
            for (UserEntity use:userEntities) {
                if(use.getPassword().equals(password)){
                    return "home";
                }

            }
        }
        return "redirect:/mall/index";
    }
    @RequestMapping("function")
    public String function(){
        return "function";
    }


}
