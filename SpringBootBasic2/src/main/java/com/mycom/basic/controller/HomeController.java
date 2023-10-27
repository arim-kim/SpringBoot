package com.mycom.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "/home.html";
	}

	@RequestMapping("/user/createAccount")
	public String createAccount() {
		System.out.println("user aacount ");
		return "/user/createAccount.html";
	}

	@RequestMapping("/user/userDashboard")
	public String userDashboard() {
		return "/user/userDashboard.html";
	}

	@RequestMapping("/user/modifyAccount")
	public String user() {
		return "/user/modifyAccount.html";
	}

	@RequestMapping("/board/articleDetail")
	public String articleDetail() {
		return "/board/articleDetail.html";
	}

	@RequestMapping("/board/articleList")
	public String articleList() {
		return "/board/articleList.html";
	}

	@RequestMapping("/board/searchContentId")
	public String board() {
		return "/board/searchContentId.html";
	}

	@RequestMapping("/board/writeArticle")
	public String writeArticle() {
		return "/board/writeArticle.html";
	}
}
