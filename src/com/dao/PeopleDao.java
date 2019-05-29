package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.bean.People;
import com.util.MybatisUtil;

/**
 * 数据交互/持久层
 * @author 无情
 *
 */
public class PeopleDao {
	public void add(People people) {
		SqlSession ss = null;
		
		ss = MybatisUtil.getSqlSession();
		ss.insert("peopleSpace.addPeople",people);
		ss.commit();
		MybatisUtil.closeSqlSession();;
	}
	
	public static void main(String[] args) {
		People p = new People("a","b","c");
		PeopleDao pb = new PeopleDao();
		pb.add(p);
	}
}
