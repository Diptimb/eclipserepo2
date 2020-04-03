package service.serviceimpl.serviceimpl2;

import java.util.List;

import entity.BookStore;
import service.serviceimpl.Service1;

public class Service2 implements Service1{

	@Override
	public  void addBook(List<BookStore> book, String name, int id, String author, double price, int quantity) {
		book.add(new BookStore(name, id, author,price, quantity));
	}
	@Override
	public String purchase(List<BookStore> book, int quantity, String name) {
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getBookName().equals(name)) {
				int diff = (book.get(i).getQuantity()) - quantity;
				// System.out.println(diff);
				if (diff >= 0) {
					// int diff = furniture[i].getQuantity() - quantity;
					book.get(i).setQuantity(diff);
					System.out.println("The bill amount is: " + (book.get(i).getPrice() * quantity));
					System.out.println("total pieces left: " + book.get(i).getQuantity());
					System.out.println("------");
					return book.get(i).toString();

				} else if (book.get(i).getQuantity() < quantity) {
					return "we do not have sufficient quantity";
				}
			}

		}
		return "No such book in store";
	}
}
