package com.aboyoooo.service.impl;

import com.aboyoooo.entity.Blog;
import com.aboyoooo.mapper.BlogMapper;
import com.aboyoooo.service.IBlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
