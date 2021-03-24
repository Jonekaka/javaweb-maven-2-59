package com.learnCCC.service.impl;

import com.learnCCC.dao.ItemsDao;
import com.learnCCC.domain.Items;
import com.learnCCC.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
