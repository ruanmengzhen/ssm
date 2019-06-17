package cn.itcast.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//获取sqlsession对象的工具类
public class MybatisUtils {

        private static SqlSession sqlSession;

        static {
            try {
                //加载mybatis配置文件
                InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
                //获取sqlsession工厂类
                sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    //定义方法获取sqlsessionn对象
    public static SqlSession getSqlSession(){
            return sqlSession;
    }
}
