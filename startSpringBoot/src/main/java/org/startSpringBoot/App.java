package org.startSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: App
 * @Description: http://projects.spring.io/spring-boot/ 官方案例
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月5日 下午3:54:41
 */

// @EnableAutoConfiguration”注解就可以启用自动配置。
@RestController
@EnableAutoConfiguration
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
