package com.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Dade on 2017/3/6.
 */
public interface HunterUserRepository extends CrudRepository<User, String> {

    User findByPhoneNumber(String phoneNumber);

}
