package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.DAO.ContentDao;
import spring.command.CommentCommand;

@Controller
@RequestMapping("/comment.do")
public class CommentController {
	
	@Autowired
	ContentDao contentDao;

	public void setContentDao(ContentDao contentDao) {
		this.contentDao = contentDao;
	}
	
	@ModelAttribute("commentCommand")
	public CommentCommand formBacking() {
		System.out.println("formBacking");
		return new CommentCommand();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String test(Model model) {
		
		return "test";
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("commentCommand") CommentCommand commentCommand) {
		System.out.println("writeComment");
		contentDao.writeComment(commentCommand);
		
		return "redirect:list.do";
		
	}

}
