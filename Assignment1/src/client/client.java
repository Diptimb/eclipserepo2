package client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CustomExceptions.InputMismatch;
import service.serviceimpl.Service1;
import service.serviceimpl.serviceimpl2.Service2;
import entity.BookStore;

public class client {
	public static void main(String[] args) throws InputMismatch {
		Scanner in = new Scanner(System.in);
		Service2 service = new Service2();
		int flag=1;
		List<BookStore> bookStore = new ArrayList<BookStore>();
		do {
			try{
		System.out.println("enter one choice");
		System.out.println("1.Add book\n2.Display book detials\n3.Purchase\n4.Exit");
		int choice = in.nextInt();
		in.nextLine();
		switch (choice) {
		case 1:
			System.out.println("enter book naem:");
			String name = in.nextLine();
			System.out.println("enter author name");
			String author = in.nextLine();
			System.out.println("enter Book Id");
			int id = in.nextInt();
			System.out.println("enter book price");
			double price = in.nextDouble();
			System.out.println("enter the quantity of book");
			int quantity = in.nextInt();
			service.addBook(bookStore, name, id, author, price, quantity);
			System.out.println(bookStore.toString());
			break;
		case 2:
			System.out.println("enter the book name you want details for");
			String name1 = in.nextLine();
			for (int i = 0; i < bookStore.size(); i++) {
				if (bookStore.get(i).getBookName().equals(name1)) {
					if (bookStore.get(i).getQuantity() > 0) {
						System.out.println("Book Name -" + bookStore.get(i).getBookName());
						System.out.println("Book Id -" + bookStore.get(i).getBookId());
						System.out.println("Book Price -" + bookStore.get(i).getPrice());
					} else {
						System.out.println("We dont have the book");
					}
				} else {
					System.out.println("no book with such name");
				}
			}
			break;
		case 3:
			System.out.println("enter book name to be purchased");
			String name2=in.nextLine();
			System.out.println("enter the quantity to be bought");
			int quantity1=in.nextInt();
			System.out.println(service.purchase(bookStore, quantity1, name2));
			break;
		case 4:flag=0;
		default:
			System.out.println("oops invalid choice");
		}
			}
			catch(Exception e) {
				System.out.println("Please enter a digit but not any other character");
				in.nextLine();
				//flag=1;
		}}while(flag!=0);}
}
