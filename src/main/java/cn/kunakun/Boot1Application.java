package cn.kunakun;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
/*
 * @ComponentScannner
 * @EnableAutoConfig
 * @Configuration
 */
@SpringBootApplication
@MapperScan("cn.kunakun.service")
public class Boot1Application {
    


	public static void main(String[] args) {
	    SpringApplication.run(Boot1Application.class, args);
	}
}
