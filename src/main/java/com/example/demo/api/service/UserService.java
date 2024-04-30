package com.example.demo.api.service;

import com.example.demo.api.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;import java.util.Arrays;
import java.util.Optional;
@Service
public class UserService {
    private List <User> userList;

    public UserService(List<User> userList) {
        this.userList = userList;
    }
    public UserService(){
        userList = new ArrayList <>();
        User user1 = new User(1,"Ida",32,"ida@mail.ru");
        User user2 = new User(2,"Olivia",42,"oliviamia@mail.ru");
        User user3 = new User(3,"Jannet",22,"Imba@mail.ru");
        User user4 = new User(4,"Sia",18,"asia@mail.ru");
        User user5 = new User(5,"Amanda",33,"amanda@mail.ru");
        userList.addAll(Arrays.asList(user1,user2,user3,user5));
    }
    public Optional<User> getUser(Integer id){
        Optional optional= Optional.empty();
        for(User user: userList){
            if(id==user.getId()){
                optional=Optional.of(user);
                return optional;        }
        }
        return optional;
    }




}