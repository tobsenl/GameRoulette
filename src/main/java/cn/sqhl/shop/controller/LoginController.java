package cn.sqhl.shop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("Login")
public class LoginController extends ContextInfo {
	
	@ResponseBody
	@RequestMapping("/vip")
	public String VipAuthentication(Model model, HttpServletRequest request){
		request.getAttribute("");
		
		
		return "";
	}
	
	
	@ResponseBody
	@RequestMapping("/member")
	public String MemberAuthentication(Model model, HttpServletRequest request){
		request.getAttribute("");
		
		
		return "";
	}
	
	
	@ResponseBody
	@RequestMapping("/demo")
	public String DemnAuthentication(Model model, HttpServletRequest request){
		request.getAttribute("");
		
		
		return "";
	}
}
