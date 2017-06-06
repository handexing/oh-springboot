package com.pinkylam.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月6日 下午1:23:52
 */

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
}
