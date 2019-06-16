package cn.itcast.seervice.Impl;

import cn.itcast.domain.Items;
import cn.itcast.mapper.ItemsMapper;
import cn.itcast.seervice.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    ItemsMapper itemsMapper;

    @Override
    public Items findById(int id) {
        //调用mapper接口的方法
        Items items = itemsMapper.findById(id);
        return items;
    }


}
