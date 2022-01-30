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

import edu.kosmo.ysy.service.BoardNoticeService;
import edu.kosmo.ysy.vo.BoardNoticeVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/boardNotice/*")
public class BoardController {
	
	@Autowired
	private BoardNoticeService boardNoticeService;
	
	@RequestMapping("/boardNotice/list")
	public String noticeList(BoardNoticeVO boardNoticeVO, Model model) {
		log.info("noticeList()...");
		int boardtype = boardNoticeVO.getBoardtype();
		model.addAttribute("noticeList", boardNoticeService.getList(boardtype));
		return "/boardNotice/list";
	}
	
	@RequestMapping("/boardNotice/content_view")
	public String content_view(BoardNoticeVO boardNoticeVO, Model model) {
		log.info("content_view()...");
		int bid = boardNoticeVO.getBid();
		log.info("* bid:" + bid);
		model.addAttribute("content_view", boardNoticeService.get(bid));
		return "/boardNotice/content_view";
	}
	
	@RequestMapping("/boardNotice/content_view2")
	public String content_view2(BoardNoticeVO boardNoticeVO, Model model) {
		log.info("content_view2()...");
		int bid = boardNoticeVO.getBid();
		model.addAttribute("content_view2", boardNoticeService.get(bid));
		return "/boardNotice/content_view2";
	}	
	
	@RequestMapping("/boardNotice/modify")
	public String modify(BoardNoticeVO boardNoticeVO) {
		log.info("modify()...");
		log.info(boardNoticeVO);
		boardNoticeService.modify(boardNoticeVO);
		
		return "redirect:list";
	}		

	@RequestMapping("/boardNotice/write_view")
	public String write_view() {
		log.info("write_view()...");
		return "/boardNotice/write_view";
	}
	
	@RequestMapping("/boardNotice/write")
	public String write(BoardNoticeVO boardNoticeVO) {
		log.info("write()...");
		boardNoticeService.register(boardNoticeVO);
		return "redirect:list";
	}
	
	@RequestMapping("/boardNotice/delete")
	public String delete(BoardNoticeVO boardNoticeVO) {
		log.info("delete()...");
		boardNoticeService.remove(boardNoticeVO);
		return "redirect:list";
	}

	
}
