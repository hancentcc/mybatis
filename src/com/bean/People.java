package com.bean;

/**
 * 实体类
 * @author 无情
 *
 */
public class People {

	/**
	 * 主键
	 */
	String id;
	
	/**
	 * 名称
	 */
	String name;
	
	/**
	 * 性别
	 */
	String sex;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public People(String id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	public People() {
		super();
	}
}
