package com.mycom.myapp;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycom.myapp.dto.CarDto;

@Controller
public class ParamController {

	@GetMapping("/param1")
	public void m1(HttpServletRequest request) {
		// 직접 request객체 사용
		String seq = request.getParameter("seq");
		System.out.println(seq);
	}

	@PostMapping("/param1")
	public void m2(HttpServletRequest request) {
		// 직접 request객체 사용
		String seq = request.getParameter("seq");
		System.out.println(seq);
	}

	@GetMapping("/param2")
	public void m3(String seq) {
		System.out.println(seq);
	}

	@GetMapping("/param2_2")
	public void m4(String seq, String msg) {
		System.out.println(seq);
		System.out.println(msg);
	}

	// 기본 타입의 경우 들어오지 않았을때 에러
	// wrapper class 의 경우 들어오지 않아도 에러가 나지 않음 -> null
	@GetMapping("/param2_3")
	public void m5(String seq, Integer num) {
		System.out.println(seq);
		System.out.println(num);
	}

	// required의 default는 true -> 무조건 필요하다는 뜻이므로 해당 값이 없으면 warning
	// required의 값이 false 이면 무조건 필요하지 않다는 것이므로 그냥 null로 처리해줌
	@GetMapping("/param3")
	public void m6(@RequestParam(name = "seq", required = false) String seq) {
		System.out.println(seq);
	}

	// 변수 이름을 마음대로 정해서 사용할 수 있음
	@GetMapping("/param3_2")
	public void m7(@RequestParam(name = "seq") String newSeq) {
		System.out.println(newSeq);
	}

	// 변수 이름을 마음대로 정해서 사용할 수 있음
	@GetMapping("/car1")
	public void car1(String name, int price) {
		CarDto dto = new CarDto();
//		dto.setName2(name);
//		dto.setPrice(price);
		System.out.println(dto);
	}

	// setter를 이용해서 프로퍼티에 값을 할당해줌
	// 프로퍼티 이름이 아닌 setter 이름을 주의하자
	// @ModelAttribute는 생략가능
	@GetMapping("/car2")
	public void car1(@ModelAttribute CarDto dto) {
		System.out.println(dto);
	}

	// Map으로도 받을 수 있음
	@GetMapping("/map")
	public void map(@RequestParam Map<String, String> params) {
		System.out.println(params.get("price"));
		System.out.println(params.get("name"));
		System.out.println(params);
	}
	
	// accept 헤더를 읽겠다는 
	@GetMapping("/header")
	public void m7(@RequestHeader("Accept") String accept, @RequestHeader("Host") String host) {
		System.out.println(accept);
		System.out.println(host);
	}
	
	@GetMapping("/logout")
	public void logout(HttpSession session) {
		System.out.println("logout");
		session.invalidate();
	}
	

}
