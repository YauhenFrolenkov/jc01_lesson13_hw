package edu.training.jc.task9;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books = new ArrayList<>();

	public Library() {

	}

	public Library(List<Book> books) {
		this.books = books;
	}

	public boolean add(Book b) {
		return books.add(b);
	}

	public boolean delete(int idBook) {
		int deleteIndex = -1;

		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == idBook) {
				deleteIndex = i;
				break;
			}
		}

		if (deleteIndex < 0) {
			return false;
		}

		books.remove(deleteIndex);
		return true;
	}

	public Book findByTitle(String title) {

		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}

		return null;
	}

	public List<Book> findByAuthor(String author) {
		List<Book> result = new ArrayList<>();
		for (Book book : books) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				result.add(book);
			}
		}
		return result;
	}

	public List<Book> findByPublisher(String publisher) {
		List<Book> result = new ArrayList<>();

		for (Book book : books) {
			if (book.getPublisher().equalsIgnoreCase(publisher)) {
				result.add(book);
			}
		}
		return result;
	}

	public List<Book> findByYear(int year) {
		List<Book> result = new ArrayList<>();

		for (Book book : books) {
			if (book.getYearOfPublication() > year) {
				result.add(book);
			}
		}
		return result;
	}

	public boolean isInLibrary(Book book) {
		return books.contains(book);
	}

	public void print() {
		System.out.println("----------------------Library----------------------");
		for (int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			System.out.println("Book:  id: " + b.getId());
			System.out.println("\t title: " + b.getTitle());
			System.out.println("\t author: " + b.getAuthor());
			System.out.println("\t publisher: " + b.getPublisher());
			System.out.println("\t yearOfPublication: " + b.getYearOfPublication());
			System.out.println("\t numberOfPages: " + b.getNumberOfPages());
			System.out.println("\t price: " + b.getPrice());
			System.out.println("\t binding: " + b.getBinding());
			System.out.println("-------------------------------------------------");
		}
		System.out.println("-------------------------------------------------");
	}

}
