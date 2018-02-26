package com.wangyonglin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carousel {
	
	 @Id
    @GeneratedValue
    private Integer id; 
	 private String title;
	 private String imgsrc;
	 private String href;
	 public Integer category; 
	 public Carousel() {		 
	 }
	
	public Integer getId() {
		return id;
	}
	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
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
	public String getImgsrc() {
		return imgsrc;
	}
	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
}
