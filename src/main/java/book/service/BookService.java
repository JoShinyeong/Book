package book.service;

import java.util.List;

import book.domain.BookVO;

public interface BookService {

	public abstract List<BookVO> list();
	public abstract BookVO read(int seq);
	public abstract void write(BookVO bookVO);
}
