package spring.DAO;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import spring.command.ContentCommand;

public class ListDao extends SqlSessionDaoSupport {
	
	public List<ContentCommand> getList() {
		
		List<ContentCommand> contentList = getSqlSession().selectList("list.getList");
		
		return contentList;
		
	}

}
