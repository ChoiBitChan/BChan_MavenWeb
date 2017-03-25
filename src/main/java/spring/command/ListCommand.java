package spring.command;

import java.util.List;

public class ListCommand {
	
	private List<ContentCommand> contentList;
	private int pageTotalNum;
	private int startPage;
	private int endPage;
	
	public List<ContentCommand> getContentList() {
		return contentList;
	}
	public void setContentList(List<ContentCommand> contentList) {
		this.contentList = contentList;
	}
	public int getPageTotalNum() {
		return pageTotalNum;
	}
	public void setPageTotalNum(int pageTotalNum) {
		this.pageTotalNum = pageTotalNum;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
}
