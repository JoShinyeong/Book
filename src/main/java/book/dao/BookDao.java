package book.dao;

import java.util.List;

import book.domain.BookVO;

public interface BookDao {

	public abstract List<BookVO> list();

	public abstract void insert(BookVO bookVO);

	public abstract BookVO select(int seq);

	
}
