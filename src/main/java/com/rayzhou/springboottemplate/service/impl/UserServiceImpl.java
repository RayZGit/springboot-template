package com.rayzhou.springboottemplate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rayzhou.springboottemplate.model.dto.User;
import com.rayzhou.springboottemplate.service.UserService;
import com.rayzhou.springboottemplate.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Ray
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2024-03-20 00:43:40
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




