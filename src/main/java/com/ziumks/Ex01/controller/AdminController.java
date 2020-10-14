package com.ziumks.Ex01.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ziumks.Ex01.domain.Admin;
import com.ziumks.Ex01.mapper.AdminMapper;

@Controller
public class AdminController {
	@Autowired
	private AdminMapper mapper;
	
	@RequestMapping("/")
	public String list(Model model) {
		model.addAttribute("list", mapper.listAdmin());
		return "index";
	}
	@GetMapping("/user")
	public String insert() {
		return "user";
	}
	@PostMapping("/user")
	public int insertPro(HttpServletRequest request) throws Exception{
		Admin admin = (Admin) request.getParameterMap();
		return mapper.insertAdmin(admin);
	}
//	@PostMapping("/user")
//	public String insert(Admin admin,RedirectAttributes rttr) {
//		int row = mapper.insertAdmin(admin);
//		rttr.addFlashAttribute("row", row);
//		return "index";
	}