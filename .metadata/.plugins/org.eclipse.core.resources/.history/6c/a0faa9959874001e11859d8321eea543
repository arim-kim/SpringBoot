package com.mycom.mydb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mycom.mydb.dto.StudentDto;

@Mapper
public interface StudentDao {
	StudentDto studentDetail(int studentId); // 사원 상세

	List<StudentDto> studentList(); // 사원 리스트(목록)

	int studentInsert(StudentDto dto); // 사원 등록

	int studentUpdate(StudentDto dto); // 사원 수정

	int studentDelete(int studentId); // 사원 삭제

}
