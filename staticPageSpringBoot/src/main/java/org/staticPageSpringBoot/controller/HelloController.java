package org.staticPageSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: HelloController
 * @Description: 测试
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月6日 上午10:42:40
 */

@Controller
public class HelloController {

	@RequestMapping("/page")
	public String page3(Model model) {
		return "hello";
	}

}
