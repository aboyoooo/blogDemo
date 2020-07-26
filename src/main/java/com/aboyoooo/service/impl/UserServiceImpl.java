package com.aboyoooo.service.impl;

import com.aboyoooo.entity.User;
import com.aboyoooo.mapper.UserMapper;
import com.aboyoooo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author aboyoooo
 * @since 2020-07-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
