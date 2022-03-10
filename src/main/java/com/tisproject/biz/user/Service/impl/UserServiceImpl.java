package com.tisproject.biz.user.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tisproject.biz.user.DAO.UserDAO;
import com.tisproject.biz.user.DTO.UserVO;
import com.tisproject.biz.user.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public UserVO selectOne(String userid) throws Exception {
		// TODO Auto-generated method stub
		return userDAO.selectOne(userid);
	}
	
	
	@Override
	public void profileupdate(UserVO userVO) throws Exception{
		userDAO.profileupdate(userVO);
	}



	
	/*
	 * @Override public List<UserVO> selectTest(UserVO testVO) throws Exception {
	 * 
	 * return testDAO.selectTest(testVO); }
	 * 
	 * @Override public void insertTest(UserVO testVO) throws Exception {
	 * 
	 * testDAO.insertTest(testVO); }
	 * 
	 * @Override public void deleteTest(int testId) throws Exception {
	 * 
	 * testDAO.deleteTest(testId); }
	 * 
	 * @Override public void updateTest(UserVO testVO) throws Exception {
	 * 
	 * testDAO.updateTest(testVO); }
	 * 
	 * @Override public UserVO selectOne(int testId) throws Exception {
	 * 
	 * return testDAO.selectOne(testId); }
	 */


	

}
