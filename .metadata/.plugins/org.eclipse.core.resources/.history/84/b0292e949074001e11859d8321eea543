package com.mycom.myapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycom.myapp.dto.EmpDto;

@Controller
public class JsonController {

	@PostMapping("/emp")
	public void m1(@RequestBody EmpDto dto) {
		System.out.println(dto);
	}

	@PostMapping("/empList")
	public void m2(@RequestBody List<EmpDto> dtoList) {
		for (EmpDto dto : dtoList) {
			System.out.println(dto);
		}
	}

	@GetMapping("/empDetail/{employeeId}")
	@ResponseBody
	public EmpDto m3(@PathVariable int employeeId) {
		System.out.println(employeeId);
		return new EmpDto(3, "길동", "삼", "sam@gildong.com", "2023-03-03");
	}
	
	@GetMapping("/empDetailList")
	@ResponseBody // 리턴값에 맞게 알아서 json으로 내려감 
	public List<EmpDto> m4() {
		System.out.println("/empList");
		List<EmpDto> list = new ArrayList<EmpDto>();
		list.add(new EmpDto(3, "길동", "삼", "sam@gildong.com", "2023-03-03"));
		list.add(new EmpDto(2, "길동", "이", "sam@gildong.com", "2023-03-03"));
		list.add(new EmpDto(4, "길동", "사", "sam@gildong.com", "2023-03-03"));
		list.add(new EmpDto(1, "길동", "일", "sam@gildong.com", "2023-03-03"));
		return list;
	}
}
