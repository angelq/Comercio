package com.example.dominio;

public class Video {
	
	private int id;
	private String link;
	
	public Video(int id, String link) {
		super();
		this.id = id;
		this.link = link;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
		
	
}
