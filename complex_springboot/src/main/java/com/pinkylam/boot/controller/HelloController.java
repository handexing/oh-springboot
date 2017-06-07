package com.pinkylam.boot.controller;

import com.pinkylam.boot.exception.MyException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月6日 下午1:23:52
 */

@Controller
public class HelloController {

	@RequestMapping(value = "/hey", method = RequestMethod.GET)
	@ResponseBody
	public String hey(@RequestParam String name) {
		return "Hello " + name;
	}

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}

	@RequestMapping("/json")
	public String json() throws MyException {
		throw new MyException("发生错误2");
	}

}
