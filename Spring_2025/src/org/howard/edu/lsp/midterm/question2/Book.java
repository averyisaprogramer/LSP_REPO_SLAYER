package org.howard.edu.lsp.midterm.question2;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	private String title;
	private String author;
	private String ISBN; 
	private int yearPublished;
	
	public Book(String title, String author, String ISBN, int yearPublished) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.yearPublished = yearPublished;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Book book = (Book) obj;
		return ISBN.equals(book.ISBN) && author.equals(book.author);
	}
	@Override 
	
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
	}
}
