package com.example.demo.controller;

import com.example.demo.bean.AuthRole;
import com.example.demo.service.AuthRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther Lee53
 * @Date 2019-12-01 16:00
 */
@RestController
@RequestMapping(value = "/authRole")
public class IndexController {

        @Autowired
        private AuthRoleService authRoleService;

        @RequestMapping(value = {"/getAllAuthRole"}, method = RequestMethod.GET)
        public List<AuthRole> index(){
            List<AuthRole> authRoles = authRoleService.getAllAuthRole();
            return authRoles;
        }
}
