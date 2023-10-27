package com.mycom.mydb.dao;

import java.util.List;

import com.mycom.mydb.dto.EmpDto;
import com.mycom.mydb.dto.StudentDto;

public interface EmpDao {
	// mybatis를 쓰면 이러한 함수 하나하나에 대응됨
	// mybatis를 쓰면 @mapper를 붙여야함 -> impl이 아니라 Dao에 ! (impl은 사라지니까 interface인 dao에
	// 붙여줌)

	
	// mybatis를 쓰면 이러한 함수 하나하나에 대응됨 
		// mybatis를 쓰면 @mapper를 붙여야함 -> impl이 아니라 Dao에 ! (impl은 사라지니까 interface인 dao에 붙여줌)

		EmpDto empDetail(int employeeId); // 사원 상세 정보 
		List<EmpDto> empList(); // 사원 리스트(목록)
		int empInsert(EmpDto dto); // 사원 등록
		int empUpdate(EmpDto dto); // 사원 수정
		int empDelete(int employeeId); // 사원 삭제
}
