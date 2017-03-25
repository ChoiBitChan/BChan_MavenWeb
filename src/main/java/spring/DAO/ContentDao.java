package spring.DAO;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import spring.command.CommentCommand;
import spring.command.ContentCommand;

public class ContentDao extends SqlSessionDaoSupport {
	
	public int writeContent(ContentCommand contentCommand) {
		
		int check = getSqlSession().insert("content.writeContent", contentCommand);
		
		return check;
		
	}
	
	public ContentCommand getContent(int num) {
		
		ContentCommand content = getSqlSession().selectOne("content.getContent", num);
		
		return content;
		
	}
	
	public int writeComment(CommentCommand commentCommand) {
		
		int check = getSqlSession().insert("comment.writeComment", commentCommand);
		
		return check;
	}

}
