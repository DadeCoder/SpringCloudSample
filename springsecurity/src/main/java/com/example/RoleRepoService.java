//package com.example;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Dade on 2017/3/10.
// */
//public class RoleRepoService implements UserDetailsService {
//
//
//    private final RoleRepo roleRepo;
//
//    public RoleRepoService(RoleRepo roleRepo){
//        this.roleRepo = roleRepo;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//
//        SysRole sysRole = roleRepo.findOne(s);
//
//        if (sysRole != null){
//            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//            authorities.add(new SimpleGrantedAuthority("HUNTER_USER"));
//            return new org.springframework.security.core.userdetails.User(hunterUser.getPhoneNumber(), hunterUser.getPassword(), authorities);
//        }
//
//        throw new UsernameNotFoundException("User " + phoneNumber + "Not Found!");
//
//
//        return null;
//    }
//}
