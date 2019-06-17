package cn.itcast.mapper;

import cn.itcast.domain.Account;

import java.util.List;

//对数据库做操作
public interface AccountMapper {
    //添加数据
    public void save(Account account);
    //查询所有
    public List<Account> findAll();
}
