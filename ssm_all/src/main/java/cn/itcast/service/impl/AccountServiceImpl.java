package cn.itcast.service.impl;

import cn.itcast.domain.Account;
import cn.itcast.mapper.AccountMapper;
import cn.itcast.service.AccountService;
import cn.itcast.util.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
//业务逻辑操作
@Service
public class AccountServiceImpl implements AccountService {

    //使用spring容器注入accountMapper对象
    @Autowired
    private AccountMapper accountMapper;

    //添加数据
    public void save(Account account) {

       /*// 使用工具类获取sqlsession对象执行sql语句
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        mapper.save(account);*/

      //将mybatis的配置文件整合到spring中，注入accountMapper对象来调用方法
      accountMapper.save(account);

    }
    //查询所有
    public List<Account> findAll() {

        /*// 使用工具类获取sqlsession对象执行sql语句
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        List<Account> accountList = sqlSession.getMapper(AccountMapper.class).findAll();
        return accountList;*/

        //将mybatis的配置文件整合到spring中，注入accountMapper对象来调用方法
        List<Account> accountList = accountMapper.findAll();
        return accountList;
    }
}
