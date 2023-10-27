package com.mycom.mydb.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mycom.mydb.dto.EmpDto;
import com.mycom.mydb.service.EmpService;

// 사원 관리 
@Controller
//@RequestMapping("student")
public class EmpController {

	private final EmpService empService;

	public EmpController(EmpService empService) {
		super();
		this.empService = empService;
	}

	// 사원 상세
	@GetMapping(value = "/empDetail/{employeeId}")
	@ResponseBody
	public EmpDto empDetail(@PathVariable int employeeId) {
		// EmpDto를 리턴 -> json으로 보냄 -> ResponseBody를 붙여주는 것으로 호출한 클라이언트에게 json 보여줌
		System.out.println(employeeId);
		EmpDto empDto = empService.empDetail(employeeId);
		return empDto;
	}

	// 사원 목록
	@GetMapping(value = "/empList")
	@ResponseBody
	public List<EmpDto> empList() {
		List<EmpDto> list = empService.empList();
		return list;
	}

	// 사원 넣기
	@PostMapping(value = "/empInsert")
	@ResponseBody
	public int insertEmp(EmpDto dto) {
		return empService.empInsert(dto);

	}

	// 사원 넣기
	@PostMapping(value = "/empInsertJSON")
	@ResponseBody
	public int insertEmpJSON(@RequestBody EmpDto dto) {
		return empService.empInsert(dto);
	}

	// 사원 수정하기
	@PostMapping(value = "/empUpdate")
	@ResponseBody
	public int updateEmp(EmpDto dto) {
		return empService.empUpdate(dto);
	}

	// 사원 삭제하기
	@GetMapping(value = "/empDelete/{employeeId}")
	@ResponseBody
	public int deleteEmp(@PathVariable int employeeId) {
		return empService.empDelete(employeeId);
	}

	// 사원 상세
	@GetMapping(value = "/empDetailJsp/{employeeId}")
	public String empDetailJsp(@PathVariable int employeeId, Model model) {
		// EmpDto를 리턴 -> json으로 보냄 -> ResponseBody를 붙여주는 것으로 호출한 클라이언트에게 json 보여줌
		System.out.println(employeeId);
		EmpDto empDto = empService.empDetail(employeeId);
		model.addAttribute("empDto", empDto);
		return "empDetail";
	}

	@GetMapping(value = "/empListJsp")
	@ResponseBody
	public ModelAndView empListJsp() {
		List<EmpDto> empList = empService.empList();
		ModelAndView mav = new ModelAndView("empList");
		mav.addObject("empList", empList);
		return mav;
	}
}
