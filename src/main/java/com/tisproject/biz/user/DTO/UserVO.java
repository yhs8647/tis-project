package com.tisproject.biz.user.DTO;

import java.sql.Date;


public class UserVO {
	private int id;
	private String userid;
	private String password;
	private String email;
	private String nickname;
	private Date birthday;
	private int gender;
	private int Favorite_Genre1;
	private int Favorite_Genre2;
	private int Favorite_Genre3;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getFavorite_Genre1() {
		return Favorite_Genre1;
	}
	public void setFavorite_Genre1(int favorite_Genre1) {
		Favorite_Genre1 = favorite_Genre1;
	}
	public int getFavorite_Genre2() {
		return Favorite_Genre2;
	}
	public void setFavorite_Genre2(int favorite_Genre2) {
		Favorite_Genre2 = favorite_Genre2;
	}
	public int getFavorite_Genre3() {
		return Favorite_Genre3;
	}
	public void setFavorite_Genre3(int favorite_Genre3) {
		Favorite_Genre3 = favorite_Genre3;
	}
	
	
	
	
}