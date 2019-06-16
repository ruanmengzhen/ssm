package cn.itcast.mapper;

import cn.itcast.domain.Items;

//操作数据库
public interface ItemsMapper {

    //根据 id 展示商品信息

    public Items findById(int id);

}
