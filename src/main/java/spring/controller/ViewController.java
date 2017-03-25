package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.DAO.ContentDao;
import spring.command.CommentCommand;
import spring.command.ContentCommand;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@Autowired
	ContentDao contentDao;

	public void setContentDao(ContentDao contentDao) {
		this.contentDao = contentDao;
	}
	
	@RequestMapping("/contentView.do")
	public String viewContent(@RequestParam("num") int num, Model model) {
		System.out.println("viewContent");
		ContentCommand contentCommand = new ContentCommand();
		CommentCommand commentCommand = new CommentCommand();
		
		contentCommand = contentDao.getContent(num);
		
		model.addAttribute("content", contentCommand);
		model.addAttribute("commentCommand", commentCommand);
		
		return "content";
	}
	
}
