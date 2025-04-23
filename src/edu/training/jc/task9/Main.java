package edu.training.jc.task9;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();

		library.add(new Book(1, "Java", "Ekkel", "Ekkel", 1996, 300, 310, "hardcover"));
		library.add(new Book(2, "Java2", "Ek", "Ekkel", 1997, 350, 500, "hardcover"));
		library.add(new Book(3, "JJ", "Ek", "Ekkel", 1997, 350, 600, "hardcover"));
		library.add(new Book(4, "SW", "SW", "SW", 1985, 500, 700, "hardcover"));

		System.out.println("----------------All books in library---------------");
		library.print();
		System.out.println();

		System.out.println("----------------Find book by title-----------------");
		Book foundByTitle = library.findByTitle("JJ");
		if (foundByTitle != null) {
			System.out.println(foundByTitle);
		} else {
			System.out.println("Book not found.");
		}
		System.out.println();

		System.out.println("----------------Find book by author-----------------");
		List<Book> foundByAuthor = library.findByAuthor("Ek");
		if (foundByAuthor != null) {
			System.out.println(foundByAuthor);
		} else {
			System.out.println("Books not found.");
		}
		System.out.println();

		System.out.println("---------------Find book by publisher---------------");
		List<Book> foundByPublisher = library.findByPublisher("Ekkel");
		if (foundByPublisher != null) {
			System.out.println(foundByPublisher);
		} else {
			System.out.println("Books not found.");
		}
		System.out.println();
		
		System.out.println("-----------------Find book by year------------------");
		List<Book> foundByYear = library.findByYear(1950);
		if (foundByYear != null) {
			System.out.println(foundByYear);
		} else {
			System.out.println("Books not found.");
		}
		System.out.println();
		
		System.out.println("----------------Is book in library------------------");
		Book bookCheeck = new Book(4, "SW", "SW", "SW", 1985, 500, 700, "hardcover"); 
		System.out.println("Is book in library? " + library.isInLibrary(bookCheeck));
		System.out.println();
		
		System.out.println("--------------Delete book in library----------------");
		library.delete(4); 
		library.print();
		

	}

}
