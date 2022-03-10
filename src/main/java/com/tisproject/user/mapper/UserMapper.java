package com.tisproject.user.mapper;

import com.tisproject.biz.user.DTO.UserVO;

public interface UserMapper {

	
	public UserVO selectOne(String userid) throws Exception;
	
	public void profileupdate(UserVO userVO) throws Exception;
}
