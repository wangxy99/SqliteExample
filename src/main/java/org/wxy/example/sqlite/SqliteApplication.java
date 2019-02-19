package org.wxy.example.sqlite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.wxy.example.*.mapper") // 扫描mapper类
public class SqliteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqliteApplication.class, args);
	}

}

