package com.ischoolbar.programmer.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.dao.StudentDao;
import com.ischoolbar.programmer.entity.Student;
import com.ischoolbar.programmer.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao StudentDao;
	@Override
	public int add(Student student) {
		// TODO Auto-generated method stub
		return StudentDao.add(student);
	}

	@Override
	public int edit(Student student) {
		// TODO Auto-generated method stub
		return StudentDao.edit(student);
	}

	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		return StudentDao.delete(ids);
	}

	@Override
	public List<Student> findList(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return StudentDao.findList(queryMap);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return StudentDao.findAll();
	}

	@Override
	public int getTotal(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return StudentDao.getTotal(queryMap);
	}

	@Override
	public Student findByUserName(String username) {
		// TODO Auto-generated method stub
		return StudentDao.findByUserName(username);
	}

}
