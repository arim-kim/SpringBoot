package com.mycom.mybatis.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.mycom.mybatis.dto.EmpDto;

public interface EmpService {

	EmpDto empDetail(int employeeId); // 사원 상세 정보

	List<EmpDto> empList(); // 사원 리스트(목록)

	int empInsert(EmpDto dto); // 사원 등록

	int empUpdate(EmpDto dto); // 사원 수정

	int empDelete(int employeeId); // 사원 삭제

	List<EmpDto> empListLike(String searchWord);

	List<EmpDto> empListResultMap(String searchWord);

	List<EmpDto> empListParameterMap(Map<String, String> map); // 사원 목록을 like 검색하기

	List<EmpDto> empListParameterMap2(String firstName, String lastName);

	List<EmpDto> empListParameterMap3(EmpDto dto);

	List<EmpDto> empListWhereIf(@Param("firstName") String firstName, @Param("lastName") String lastNames,
			@Param("email") String email);

}
