package cat.com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * className:SpringBootApplicationTest
 * discription:
 * author:王震涛
 * createTime:2018-12-04 19:45
 */
@SpringBootApplication
@MapperScan("cat.com.dao")
public class SpringBootApplicationTest {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationTest.class);
    }
}
