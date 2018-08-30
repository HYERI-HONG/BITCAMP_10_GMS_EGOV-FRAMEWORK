package com.gms.web.controller;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gms.web.domain.MemberDTO;
import com.gms.web.service.MemberService;

@Controller
@RequestMapping("/member")
@SessionAttributes("user")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired MemberService memberService;
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST) //post방식
	public String add(@ModelAttribute("member") MemberDTO member) {
		logger.info("MemberController ::: add(){}");
		memberService.add(member);
		return "redirect:/move/member/login/off";
	}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	
	@RequestMapping("/retrieve")
	public String retrieve( Model model) {
		logger.info("MemberController ::: retrieve(){}");
		return "private:member/retrieve.tiles";
	}
	@RequestMapping("/count")
	public void count() {}
	
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(@RequestParam Map<String,String> map , Model model) {
		logger.info("MemberController ::: modify(){}");
		map.put("userid", "");
		memberService.modify(map);
		model.addAttribute("user", memberService.retrieve(map.get("userid")));
		return "private:member/retrieve.tiles";
	}
	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String remove(@ModelAttribute MemberDTO member) {
		logger.info("MemberController ::: remove(){}");
		logger.info("password :"+member.getPassword());
		logger.info("userid :"+member.getUserid());
		memberService.remove(member);
		return "redirect:/";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST )
	public String login(@ModelAttribute("member") MemberDTO member, Model model) {
		logger.info("MemberController ::: login(){}");
		String rs ="log:member/retrieve.tiles";
		if(memberService.login(member)) {
			model.addAttribute("user", memberService.retrieve(member.getUserid()));
		}else {
			rs="redirect:/move/member/login/off";
		}	
		return rs;
	}
	@RequestMapping("/logout")
	public String logout() {
		logger.info("MemberController ::: logout(){}");
		return "log:common/content.tiles";
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
