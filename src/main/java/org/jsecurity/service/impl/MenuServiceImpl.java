package org.jsecurity.service.impl;

import org.jsecurity.dao.MenuDao;
import org.jsecurity.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xiaojianyu on 16/9/6.
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Resource
    public MenuDao menuDao;


}
