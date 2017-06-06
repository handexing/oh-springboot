package com.pinkylam.boot.controller;

import com.pinkylam.boot.exception.MyException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月6日 下午1:23:52
 */

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}

	@RequestMapping("/json")
	public String json() throws MyException {
		throw new MyException("发生错误2");
	}
}
