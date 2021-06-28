package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library_Model 
{
	@Id
	private String bookId;
	private String quantity;
	private String bookName;
	private String genre;
	
	public Library_Model() 
	{
		super();
	}

	public Library_Model(String bookId, String quantity, String bookName, String genre) 
	{
		super();
		this.bookId = bookId;
		this.quantity = quantity;
		this.bookName = bookName;
		this.genre = genre;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	
}
