package com.tisproject.biz.user.DAO.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tisproject.biz.user.DAO.UserDAO;
import com.tisproject.biz.user.DTO.UserVO;
import com.tisproject.user.mapper.UserMapper;


@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SqlSession sqlSession;
	


	
	@Override
	public UserVO selectOne(String userid) throws Exception {
		// TODO Auto-generated method stub
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		return mapper.selectOne(userid);
	}



	@Override
	public void profileupdate(UserVO vo) throws Exception {
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		mapper.profileupdate(vo);
	}

}
