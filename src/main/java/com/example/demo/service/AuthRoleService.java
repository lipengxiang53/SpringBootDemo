package com.example.demo.service;

import com.example.demo.bean.AuthRole;
import com.example.demo.mappers.AuthRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther Lee53
 * @Date 2019-12-01 16:02
 */
@Service
public class AuthRoleService {

    @Autowired
    private AuthRoleMapper authRoleMapper;

    public List<AuthRole> getAllAuthRole(){
        return authRoleMapper.selectAll();
    }
}
