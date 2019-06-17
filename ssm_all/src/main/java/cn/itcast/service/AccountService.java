package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

//业务逻辑操作
public interface AccountService {

    //添加数据
    public void save(Account account);

    //查询所有
    public List<Account> findAll();

}

