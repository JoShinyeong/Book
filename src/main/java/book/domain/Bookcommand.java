package book.domain;

import org.springframework.web.multipart.MultipartFile;

public class Bookcommand {
	
	private int seq;
	private int bookisbn; // 책 번호
	private String book; // 책 제목
	private String writer; // 저자
	private String publisher; // 출판사
	private int price; // 가격
	private String content; // 책 소개 
	private MultipartFile image; // 이미지 

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getBookisbn() {
		return bookisbn;
	}
	public void setBookisbn(int bookisbn) {
		this.bookisbn = bookisbn;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
