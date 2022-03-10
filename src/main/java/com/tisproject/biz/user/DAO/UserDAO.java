package com.tisproject.biz.user.DAO;

import com.tisproject.biz.user.DTO.UserVO;

public interface UserDAO {
	

	public UserVO selectOne(String userid) throws Exception;
	
	public void profileupdate(UserVO userVO) throws Exception;
}
