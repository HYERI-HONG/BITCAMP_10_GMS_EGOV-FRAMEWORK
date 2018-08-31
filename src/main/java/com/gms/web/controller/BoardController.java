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
import com.gms.web.service.BoardService;


@Controller
@RequestMapping("/board")
public class BoardController {
	static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired BoardService boardservice;
	@Autowired ArticleDTO articleDTO;
	
	@RequestMapping(value="/add")
	public void add() {}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	@RequestMapping("/retrieve")
	public void retrieve() {}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping(value="/modify")
	public void modify() {}
	@RequestMapping(value="/remove")
	public void remove() {
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
