package br.com.alexandre.blog.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "POS_POST")
public class Post{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "POS_TITLE")
	private String title;
	
	@Column(name = "POS_TEXT_BODY")
	private String textBody;
	
	@Column(name = "AUT_AUTHOR")
	private Author author;
	
	@Column(name = "POS_DATE_POST")
	private Date datePost;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTextBody() {
		return textBody;
	}
	public void setTextBody(String textBody) {
		this.textBody = textBody;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Date getDatePost() {
		return datePost;
	}
	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(author, datePost, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(author, other.author) && Objects.equals(datePost, other.datePost)
				&& Objects.equals(title, other.title);
	}
	
}
