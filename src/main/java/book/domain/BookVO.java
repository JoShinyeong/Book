package book.domain;


import org.apache.ibatis.type.Alias;


@Alias("BoardVO")
public class BookVO {
	private int seq;

	private int bookisbn; // 책 번호

	private String book; // 책 제목

	private String writer; // 저자

	private String publisher; // 출판사

	private int price; // 가격

	private String image; // 이미지 

	private String content; // 책 소개 
	
	
	public BookVO () { }
	public BookVO (int bookisbn,String book, String writer,
			String publisher, int price, String image, String content) {
		super();
		this.bookisbn =bookisbn;
		this.book =book;
		this.writer = writer;
		this.publisher = publisher;
		this.price=price;
		this.content =content;
		this.image =image;
	}
	
	 public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getBookIsbn() {
		return bookisbn;
	}

	public void setBookIsbn(int bookisbn) {
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

}
