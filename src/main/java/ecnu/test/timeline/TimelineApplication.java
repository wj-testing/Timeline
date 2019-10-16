package ecnu.test.timeline;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("ecnu.test.timeline")
public class TimelineApplication {

    public static void main(String[] args) {

        SpringApplication.run(TimelineApplication.class, args);
    }

}
