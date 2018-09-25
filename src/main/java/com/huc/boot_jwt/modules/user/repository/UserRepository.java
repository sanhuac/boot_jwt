package com.huc.boot_jwt.modules.user.repository;

import com.huc.boot_jwt.modules.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: 胡丛
 * @Date: 2018/9/25 10:41
 * @Description:
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
