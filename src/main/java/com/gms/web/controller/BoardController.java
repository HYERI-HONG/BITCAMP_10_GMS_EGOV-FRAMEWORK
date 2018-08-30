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

import com.gms.web.domain.ArticleDTO;
import com.gms.web.domain.MemberDTO;
import com.gms.web.service.MemberService;

@Controller
@RequestMapping("/board")
public class BoardController {
	static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired MemberService memberService;
	@Autowired ArticleDTO articleDTO;
	
	@RequestMapping(value="/add", method=RequestMethod.POST) //post방식
	public String add(@ModelAttribute("member") MemberDTO member) {
		logger.info("BoardController ::: add(){}");
		memberService.add(member);
		return "redirect:/move/member/login/off";
	}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	
	@RequestMapping("/retrieve/{userid}")
	public String retrieve( Model model, 
			@PathVariable String userid) {
		logger.info("BoardController ::: retrieve(){}");
		model.addAttribute("user", memberService.retrieve(userid));
		return "private:member/retrieve.tiles";
	}
	@RequestMapping("/count")
	public void count() {}
	
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(@RequestParam Map<String,String> map , Model model) {
		logger.info("BoardController ::: modify(){}");
		logger.info("userid"+map.get("userid"));
		memberService.modify(map);
		model.addAttribute("user", memberService.retrieve(map.get("userid")));
		return "private:member/retrieve.tiles";
	}
	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String remove(@ModelAttribute MemberDTO member) {
		logger.info("BoardController ::: remove(){}");
		logger.info("password :"+member.getPassword());
		logger.info("userid :"+member.getUserid());
		memberService.remove(member);
		return "redirect:/";
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
