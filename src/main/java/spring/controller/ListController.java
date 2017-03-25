package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.DAO.ListDao;
import spring.command.ListCommand;

@Controller
@RequestMapping("/list.do")
public class ListController {
	
	@Autowired
	ListDao listDao;

	public void setListDao(ListDao listDao) {
		this.listDao = listDao;
	}
	
	@ModelAttribute("list")
	public ListCommand formBacking() {
		
		return new ListCommand();
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		
		ListCommand listCommand = new ListCommand();
		listCommand.setContentList(listDao.getList());
		listCommand.setStartPage(1);
		listCommand.setEndPage(3);
		listCommand.setPageTotalNum(10);
		
		model.addAttribute("list", listCommand);
		
		return "list";
		
	}

}
