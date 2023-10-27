package com.mycom.mydb.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.mydb.dto.StudentDto;
import com.mycom.mydb.service.StudentService;

// 학생 관리 
@RestController
public class StudentController {

	private final StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	// 학생 상세
	@GetMapping(value = "/studentDetail/{studentId}")
	public StudentDto studentDetail(@PathVariable int studentId) {
		System.out.println("studentId " + studentId);
		StudentDto empDto = service.studentDetail(studentId);
		System.out.println(empDto);
		return empDto;
	}

	@GetMapping(value = "/studentList")
	public List<StudentDto> empList() {
		List<StudentDto> list = service.studentList();
		System.out.println(list);
		return list;
	}

	@PostMapping(value = "/studentUpdate")
	public Map<String, String> updateStudent(StudentDto dto) {
		Map<String, String> map = new HashMap<>();
		int ret = service.studentUpdate(dto);
		if (ret == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}
		return map;
	}

	@GetMapping(value = "/studentDelete/{studentId}")
	public Map<String, String> deleteEmp(@PathVariable int studentId) {
		Map<String, String> map = new HashMap<>();
		int ret = service.studentDelete(studentId);
		if (ret == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}
		return map;
	}

	// 학생 등록
	@PostMapping(value = "/studentInsert")
	public Map<String, String> studentInsert(StudentDto studentDto) {
		Map<String, String> map = new HashMap<>();
		int ret = service.studentInsert(studentDto);
		if (ret == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}
		return map;
	}
}
