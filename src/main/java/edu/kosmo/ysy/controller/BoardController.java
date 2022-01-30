package edu.kosmo.ysy.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.kosmo.ysy.service.BoardService;
import edu.kosmo.ysy.vo.BoardVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/board/list")
	public String list(BoardVO boardVO, Model model) {
		log.info("list()...");
		int boardtype = boardVO.getBoardtype();
		model.addAttribute("getList", boardService.getList(boardVO));
		return "/board/list";
	}
	
	@RequestMapping("/board/listAll")
	public String listAll(Model model) {
		log.info("listAll()...");
		model.addAttribute("getListAll", boardService.getListAll());
		return "/board/listAll";
	}
	
	
	@RequestMapping("/board/content_view")
	public String content_view(BoardVO boardVO, Model model) {
		log.info("content_view()...");
		int bid = boardVO.getBid();
		log.info("* bid:" + bid);
		model.addAttribute("content_view", boardService.get(bid));
		return "/board/content_view";
	}
	
	@RequestMapping("/board/content_view2")
	public String content_view2(BoardVO boardVO, Model model) {
		log.info("content_view2()...");
		int bid = boardVO.getBid();
		model.addAttribute("content_view2", boardService.get(bid));
		return "/board/content_view2";
	}	
	
	@RequestMapping("/board/modify")
	public String modify(BoardVO boardVO) {
		log.info("modify()...");
		log.info(boardVO);
		boardService.modify(boardVO);
		
		return "redirect:list";
	}		

	@RequestMapping("/board/write_view")
	public String write_view() {
		log.info("write_view()...");
		return "/board/write_view";
	}
	
	@RequestMapping("/board/write")
	public String write(BoardVO boardVO) {
		log.info("write()...");
		boardService.register(boardVO);
		int boardtype = boardVO.getBoardtype();
		return "redirect:listAll";
	}
	

	@RequestMapping("/board/delete")
	public String delete(BoardVO boardVO) {
		log.info("delete()...");
		boardService.remove(boardVO);
		return "redirect:list";
	}

	
}
