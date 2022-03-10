package com.tisproject.view.userView;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tisproject.biz.user.DTO.UserVO;
import com.tisproject.biz.user.Service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/main.do")
	public String mainDo() {
		return "main";
	}
	

    @RequestMapping(value="/profile.do")
    public String seleteOne(Model model, HttpServletRequest request) throws Exception{
        
    	String userid = "testuser";
        UserVO userVO = userService.selectOne(userid);
        model.addAttribute("vo", userVO);
        
        
        return "profile";
    }
    
    
    @RequestMapping(value="/profileupdate.do") 
    public String profileupdate(@ModelAttribute("userVO")UserVO userVO) throws Exception{
	 System.out.println("controller");
	 System.out.println(userVO.getUserid()+userVO.getEmail());
	 userService.profileupdate(userVO);
	 return "redirect:profile.do?userid="+userVO.getUserid();
    }
}
	/*
	 * @RequestMapping(value="/testRegister.do") public String testRegisterDo(){
	 * 
	 * return "test/testRegister"; }
	 * 
	 * @RequestMapping(value="/insert.do") public String
	 * insertTest(@ModelAttribute("testVO") TestVO testVO) throws Exception{
	 * 
	 * testService.insertTest(testVO);
	 * 
	 * return "redirect:testList.do"; }
	 * 
	 * @RequestMapping(value="/update.do") public String
	 * updateTest(@ModelAttribute("testVO")TestVO testVO) throws Exception{
	 * 
	 * testService.updateTest(testVO);
	 * 
	 * return "redirect:selectOne.do?testId="+testVO.getTestId(); }
	 * 
	 * @RequestMapping(value="/delete.do") public String
	 * deleteTest(HttpServletRequest request) throws Exception{
	 * 
	 * int testId = Integer.parseInt(request.getParameter("testId"));
	 * testService.deleteTest(testId);
	 * 
	 * 
	 * return "redirect:testList.do"; }
	 */



