package entity;

public class BookStore {
private String bookName;
private int bookId;
private String Author;
private double price;
private int quantity;
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public BookStore(String bookName, int bookId, String author, double price, int quantity) {
	super();
	this.bookName = bookName;
	this.bookId = bookId;
	Author = author;
	this.price = price;
	this.quantity = quantity;
}
@Override
public String toString() {
	return "BookStore [bookName=" + bookName + ", bookId=" + bookId + ", Author=" + Author + ", price=" + price
			+ ", quantity=" + quantity + "]";
}


}
