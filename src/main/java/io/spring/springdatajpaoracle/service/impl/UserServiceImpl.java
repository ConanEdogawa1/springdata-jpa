package io.spring.springdatajpaoracle.service.impl;

import io.spring.springdatajpaoracle.dao.UserDao;
import io.spring.springdatajpaoracle.model.User;
import io.spring.springdatajpaoracle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <H3></H3>
 * <p></p >
 *
 * @author yiwen zhai
 * @Date 2020/7/1
 * @Time 1:50 下午
 * @Description No Description
 * @since
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }

    /**
     * 如对象存在就修改如果不存在就添加
     *
     * @param user 将对象{@link User} 通过
     *         {@link org.springframework.data.jpa.repository.JpaRepository#saveAndFlush(Object)}
     *         方法来保存并立即刷新修改的对象
     */
    @Override
    public void update(User user) {
        userDao.saveAndFlush(user);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }
}
