package io.spring.springdatajpaoracle.service;

import io.spring.springdatajpaoracle.model.User;

import java.util.List;

/**
 * <H3></H3>
 * <p></p >
 *
 * @author yiwen zhai
 * @Date 2020/7/1
 * @Time 1:46 下午
 * @Description No Description
 * @since
 */
public interface UserService {

    /**
     * 添加用户
     * @param user {@link User}
     */
    void add(User user);

    /**
     * 查询所有的用户
     * @return List<T>
     */
    List<User> findAllUser();

    /**
     * 修改
     * @param user {@link User}
     */
    void update(User user);

    /**
     * 通过ID来删除
     * @param id {@link User#getId()}
     */
    void delete(Long id);
}
