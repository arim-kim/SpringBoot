package com.mycom.mydb.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mycom.mydb.dto.StudentDto;
import com.mycom.mydb.service.StudentService;

// 학생 관리 
@Controller
public class StudentController {

	private final StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping(value = "/studentMain")
	public String gomain() {
		return "studentMain";
	}

	@GetMapping(value = "/studentListJsp")
	@ResponseBody
	public ModelAndView empListJsp() {
		List<StudentDto> empList = service.studentList();
		ModelAndView mav = new ModelAndView("studentList");
		mav.addObject("studentList", empList);
		return mav;
	}

	@GetMapping(value = "/studentList")
	@ResponseBody
	public List<StudentDto> empList() {
		List<StudentDto> list = service.studentList();
		System.out.println(list);
		return list;
	}

	@PostMapping(value = "/studentUpdate")
	@ResponseBody
	public int updateStudent(StudentDto dto) {
		return service.studentUpdate(dto);
	}

	@GetMapping(value = "/studentDelete/{studentId}")
	@ResponseBody
	public int deleteEmp(@PathVariable int studentId) {
		return service.studentDelete(studentId);
	}

	// 학생 상세
	@GetMapping(value = "/studentDetail/{studentId}")
	@ResponseBody
	public StudentDto studentDetail(@PathVariable int studentId) {
		System.out.println("studentId " + studentId);
		StudentDto empDto = service.studentDetail(studentId);
		System.out.println(empDto);
		return empDto;
	}

	// 학생 상세 JSP 페이지
	@GetMapping(value = "/studentDetailJsp/{studentId}")
	public String empDetailJsp(@PathVariable int studentId, Model model) {
		System.out.println(studentId);
		StudentDto studentDto = service.studentDetail(studentId);
		model.addAttribute("studentDto", studentDto);
		return "studentDetail";
	}

	// 학생 등록
	@PostMapping(value = "/studentInsert")
	@ResponseBody
	public int studentInsert(StudentDto studentDto) {
		return service.studentInsert(studentDto);
	}
}
