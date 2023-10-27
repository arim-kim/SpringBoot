package com.mycom.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UrlMappingController {

	@RequestMapping(value = "hello")
	public void m0() {
		System.out.println("hello");
	}

	// 하나의 메서드에 두개의 url이 들어오는건 가능
	// 하나의 url에 두개의 메서드가 호출되면 그건 안됨
	@RequestMapping(value = { "/hello1", "/hello2" })
	public void m0_2() {
		System.out.println("hello");
	}

	@RequestMapping(value = "/hello/ssafy")
	public void m1() {
		System.out.println("hello");
	}

	@RequestMapping(value = "/method", method = RequestMethod.GET)
	public void m2() {
		System.out.println("/method get");
	}

	@RequestMapping(value = "/method", method = RequestMethod.POST)
	public void m3() {
		System.out.println("/method post");
	}

	// PUT + http : ... / myapp/method/1
	@RequestMapping(value = "/method/{num}", method = RequestMethod.PUT)
	public void m4(@PathVariable int num) {
		System.out.println("/method put : " + num);
	}

	// PUT + http : ... / myapp/method/1/and/hello
	@RequestMapping(value = "/method/{num}/and/{str}", method = RequestMethod.PUT)
	public void m5(@PathVariable int num, @PathVariable String str) {
		System.out.println("/method put : " + num + ", " + str);
	}

	@GetMapping(value = "/getmapping")
	public void m6() {
		System.out.println("hello getmapping ");
	}
	
	// 하나의 메서드에 두개의 url이 들어오는건 가능
	// 하나의 url에 두개의 메서드가 호출되면 그건 안됨
	@PostMapping(value = "/postmapping")
	public void m7() {
		System.out.println("hello postmapping ");
	}
	
	// 하위 폴더 하나만 범위로 잡으면 * 
	// 하위 폴더 모두를 범위로 잡으려면 ** 
	@RequestMapping(value = "/subset/**")
	public void m8() {
		System.out.println("/subset/**");
	}
}
