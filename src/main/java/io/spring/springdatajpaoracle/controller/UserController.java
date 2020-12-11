package io.spring.springdatajpaoracle.controller;

import io.spring.springdatajpaoracle.model.User;
import io.spring.springdatajpaoracle.service.UserService;
import io.spring.springdatajpaoracle.utils.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <H3></H3>
 * <p></p >
 *
 * @author yiwen zhai
 * @Date 2020/7/1
 * @Time 2:11 下午
 * @Description No Description
 * @since
 */
@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(produces = "application/json")
    public ResponseVO<Object> addUser(@RequestBody User user) {
        userService.add(user);
        return new ResponseVO<>();
    }

    @GetMapping(produces = "application/json")
    public ResponseVO<Object> findAllUser() {
        return new ResponseVO<>(userService.findAllUser());
    }

    @DeleteMapping(value = "/{id}", produces = "application/json")
    public ResponseVO<Object> deleteUser(@PathVariable("id") Long id) {
        userService.delete(id);
        return new ResponseVO<>();
    }

    @PutMapping(produces = "application/json")
    public ResponseVO<Object> updateUser(@RequestBody User user) {
        userService.update(user);
        return new ResponseVO<>();
    }
}
