package cn.itcast.seervice;

import cn.itcast.domain.Items;

//业务逻辑层
public interface ItemsService {
    public Items findById(int id);
}
