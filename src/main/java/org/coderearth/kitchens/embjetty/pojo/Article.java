package org.coderearth.kitchens.embjetty.pojo;

/**
 * Created by kunal_patel on 09/02/16.
 */
public class Article {

	private String title;
	private String path;
	private String id;
	private String content;
	private int pageNumber;

	public Article() {
	}

	public Article(String title, String path, String id, String content, int pageNumber) {
		this.title = title;
		this.path = path;
		this.id = id;
		this.content = content;
		this.pageNumber = pageNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
}
