package com.info.sw.ms.bean;

public class FilmBean {
	
	private Integer id;
	private String title;
	
	public FilmBean(Integer id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	public FilmBean() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
