package com.mycom.mybatis.cotroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mycom.mybatis.dto.EmpDto;
import com.mycom.mybatis.service.EmpService;

// 사원 관리 
@Controller
//@RequestMapping("student")
public class EmpController {

	private final EmpService empService;

	public EmpController(EmpService empService) {
		super();
		this.empService = empService;
	}

	// 메인 화면 정리
	@GetMapping(value = "/empMain")
	public String home() {
		return "empMain";
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

	// 사원 목록
	@GetMapping(value = "/empListLike")
	@ResponseBody
	public List<EmpDto> empListLike(String searchWord) {
		List<EmpDto> list = empService.empListLike(searchWord);
		return list;
	}

	// 사원 목록
	@GetMapping(value = "/empListResultMap")
	@ResponseBody
	public List<EmpDto> empListResultMap(String searchWord) {
		List<EmpDto> list = empService.empListResultMap(searchWord);
		return list;
	}

	// 사원 목록 Parameter 복수개
	@GetMapping(value = "/empListParameterMap")
	@ResponseBody
	public List<EmpDto> empListParameterMap(String firstName, String lastName) {
		Map<String, String> map = new HashMap<>();
		map.put("firstName", firstName);
		map.put("lastName", lastName);
		List<EmpDto> list = empService.empListParameterMap(map);
		return list;
	}

	// 사원 목록 Parameter 복수개
	@GetMapping(value = "/empListParameterMap2")
	@ResponseBody
	public List<EmpDto> empListParameterMap2(String firstName, String lastName) {
		List<EmpDto> list = empService.empListParameterMap2(firstName, lastName);
		return list;
	}

	// 사원 목록 Parameter 복수개
	@GetMapping(value = "/empListParameterMap3")
	@ResponseBody
	public List<EmpDto> empListParameterMap3(EmpDto dto) {
		List<EmpDto> list = empService.empListParameterMap3(dto);
		return list;
	}

	// 사원 목록 Parameter 복수개
	@GetMapping(value = "/empListWhereIf")
	@ResponseBody
	public List<EmpDto> empListWhereIf(String firstName, String lastNames, String email) {
		List<EmpDto> list = empService.empListWhereIf( firstName,lastNames, email);
		return list;
	}
}
