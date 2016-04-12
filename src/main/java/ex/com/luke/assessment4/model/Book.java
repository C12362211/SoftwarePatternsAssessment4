package ex.com.luke.assessment4.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	private Long id;
	private String title;
	private String author;
	private String price;
	private String category;
	private String image;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	@Column(nullable = false)
	public String getTitle() {
		return title;
	}

	@Column(length = 15, nullable = false)
	public String getAuthor() {
		return author;
	}

	@Column(length = 10)
	public String getPrice() {
		return price;
	}

	@Column(nullable = false)
	public String getCategory() {
		return category;
	}

	@Column
	public String getImage() {
		return image;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setImage(String image) {
		this.image = image;
	}


}
