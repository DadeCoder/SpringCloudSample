package com.example;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dade on 2017/3/6.
 */
public class HunterUserSecurityServices implements UserDetailsService {

    private final HunterUserRepository hunterUserRepository;

    public HunterUserSecurityServices(HunterUserRepository hunterUserRepository){
        this.hunterUserRepository = hunterUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String phoneNumber) throws UsernameNotFoundException {

//        LogUtil.info(phoneNumber);

        User hunterUser = hunterUserRepository.findByPhoneNumber(phoneNumber);

//        LogUtil.info(hunterUser.toString());

        if (hunterUser != null){
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            authorities.add(new SimpleGrantedAuthority("ROLE_" + hunterUser.getRole()));

            System.out.println("ROLE_" + hunterUser.getRole());

            return new org.springframework.security.core.userdetails.User(hunterUser.getPhoneNumber(), hunterUser.getPassword(), authorities);
        }

        throw new UsernameNotFoundException("User " + phoneNumber + "Not Found!");

    }

}
