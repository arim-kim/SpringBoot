package com.mycom.mydb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycom.mydb.dao.EmpDao;
import com.mycom.mydb.dao.StudentDao;
import com.mycom.mydb.dto.EmpDto;
import com.mycom.mydb.dto.StudentDto;

@Service
public class StudentServiceImpl implements StudentService {

	StudentDao dao;

	public StudentServiceImpl(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public StudentDto studentDetail(int studentId) {
		return dao.studentDetail(studentId);
	}

	@Override
	public List<StudentDto> studentList() {
		System.out.println(dao.studentList());
		return dao.studentList();
	}

	@Override
	public int studentInsert(StudentDto dto) {
		return dao.studentInsert(dto);
	}

	@Override
	public int studentUpdate(StudentDto dto) {
		// TODO Auto-generated method stub
		return dao.studentUpdate(dto);
	}

	@Override
	public int studentDelete(int studentId) {
		// TODO Auto-generated method stub
		return dao.studentDelete(studentId);
	}

}
