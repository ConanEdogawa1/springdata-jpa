package io.spring.springdatajpaoracle.dao;

import io.spring.springdatajpaoracle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <H3></H3>
 * <p></p >
 *
 * @author yiwen zhai
 * @Date 2020/7/1
 * @Time 1:44 下午
 * @Description No Description
 * @since
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {
}
