package com.mycom.mybatis.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mycom.mybatis.dao.EmpDao;
import com.mycom.mybatis.dto.EmpDto;

@Service
public class EmpServiceImpl implements EmpService {

	EmpDao empDao;

	// 생성자로 DI
	public EmpServiceImpl(EmpDao empDao) {
		super();
		this.empDao = empDao;
	}

	@Override
	public EmpDto empDetail(int employeeId) {
		return empDao.empDetail(employeeId);
	}

	@Override
	public List<EmpDto> empList() {
		return empDao.empList();
	}

	@Override
	public int empInsert(EmpDto dto) {
		// TODO Auto-generated method stub
		return empDao.empInsert(dto);
	}

	@Override
	public int empUpdate(EmpDto dto) {
		return empDao.empUpdate(dto);
	}

	@Override
	public int empDelete(int employeeId) {
		return empDao.empDelete(employeeId);
	}

	@Override
	public List<EmpDto> empListLike(String searchWord) {
		return empDao.empListLike(searchWord);
	}

	@Override
	public List<EmpDto> empListResultMap(String searchWord) {
		return empDao.empListResultMap(searchWord);
	}

	@Override
	public List<EmpDto> empListParameterMap(Map<String, String> map) {
		return empDao.empListParameterMap(map);
	}

	@Override
	public List<EmpDto> empListParameterMap2(String firstName, String lastName) {
		return empDao.empListParameterMap2(firstName, lastName);
	}

	@Override
	public List<EmpDto> empListParameterMap3(EmpDto dto) {
		return empDao.empListParameterMap3(dto);
	}

	@Override
	public List<EmpDto> empListWhereIf(String firstName, String lastNames, String email) {
		return empDao.empListWhereIf(firstName, lastNames, email);
	}
}
