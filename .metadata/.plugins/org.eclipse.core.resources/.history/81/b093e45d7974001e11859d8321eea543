package com.mycom.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mycom.mybatis.dto.EmpDto;

@Mapper
public interface EmpDao {
	// mybatis를 쓰면 이러한 함수 하나하나에 대응됨
	// mybatis를 쓰면 @mapper를 붙여야함 -> impl이 아니라 Dao에 ! (impl은 사라지니까 interface인 dao에
	// 붙여줌)

	EmpDto empDetail(int employeeId); // 사원 상세 정보

	List<EmpDto> empList(); // 사원 리스트(목록)

	int empInsert(EmpDto dto); // 사원 등록

	int empUpdate(EmpDto dto); // 사원 수정

	int empDelete(int employeeId); // 사원 삭제

	// mybatis 추가 연습
	List<EmpDto> empListLike(String searchWord); // 사원 목록을 like 검색하기

	List<EmpDto> empListResultMap(String searchWord); // 사원 목록을 like 검색하기

	// 복수개의 파라미터 처리 firstName, lastName
	List<EmpDto> empListParameterMap(Map<String, String> map);

	List<EmpDto> empListParameterMap2(@Param("firstName") String firstName, @Param("lastName") String lastName);

	List<EmpDto> empListParameterMap3(EmpDto dto);

	// 다이나믹 sql
	// 값이 있으면 ~ 없으면 ~ if else 처럼 처리하기 
	List<EmpDto> empListWhereIf(@Param("firstName") String firstName, @Param("lastName") String lastNames, @Param("email") String email);

}
