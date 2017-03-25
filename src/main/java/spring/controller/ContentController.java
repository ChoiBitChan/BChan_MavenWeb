package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.DAO.ContentDao;
import spring.command.CommentCommand;
import spring.command.ContentCommand;

@Controller
@RequestMapping("/writeForm.do")
public class ContentController {
	
	@Autowired
	ContentDao contentDao;

	public void setContentDao(ContentDao contentDao) {
		this.contentDao = contentDao;
	}

	@ModelAttribute("contentCommand")
	public ContentCommand formBacking() {
		
		return new ContentCommand();
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String form(Model model) {
		
		ContentCommand contentCommand = new ContentCommand();
		
		model.addAttribute("contentCommand", contentCommand);
		
		return "writeForm";
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("contentCommand") ContentCommand contentCommand) {
		System.out.println("writeContent");
		contentDao.writeContent(contentCommand);
		
		return "redirect:list.do";
		
	}
	
	

}
