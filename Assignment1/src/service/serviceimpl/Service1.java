package service.serviceimpl;

import java.util.List;

import entity.BookStore;

public interface Service1 {
void addBook(List<BookStore> book,String name,int id, String author,double price, int quantity); 
String purchase(List<entity.BookStore> book, int quantity, String name);

}