package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {

	@ResponseBody
	@RequestMapping("/sis")
	public String getBall() {
		return "sis makeup";
	}
}
