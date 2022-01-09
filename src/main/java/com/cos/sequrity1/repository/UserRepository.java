package com.cos.sequrity1.repository;

import com.cos.sequrity1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


//@Repository 라는 어노테이션이 없어도 ioc jparepository를 상속해서
public interface UserRepository extends JpaRepository<User,Integer> {

    //findBy 규칙 -> Username 문법
    //select * from user wher username =?

    public User findByUsername(String username);
}
