package com.example.demo.mappers;


import com.example.demo.bean.AuthRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther Lee53
 * @Date 2019-12-01 16:03
 */
@Repository
public interface AuthRoleMapper {

    List<AuthRole> selectAll();

}
