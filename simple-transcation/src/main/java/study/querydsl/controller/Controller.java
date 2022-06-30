package study.querydsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.querydsl.service.MemberService;

@RestController
public class Controller {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/insert")
	public void insert(@RequestParam String name) {
		service.insertService(name);
	}
	

}
