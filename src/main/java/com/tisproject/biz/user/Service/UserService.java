package com.tisproject.biz.user.Service;

import com.tisproject.biz.user.DTO.UserVO;

public interface UserService {

	
	public UserVO selectOne(String userid) throws Exception;
	
	public void profileupdate(UserVO userVO) throws Exception;
}
