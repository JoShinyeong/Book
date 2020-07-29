package book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import book.dao.BookDao;
import book.domain.BookVO;

@Service
public class BookServiceImpl implements BookService {
	private BookDao bookDao;

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<BookVO> list() {
		return bookDao.list();
	}

	@Override
	public BookVO read(int seq) {

		return bookDao.select(seq);
	}

	@Override
	public void write(BookVO bookVO) {
		bookDao.insert(bookVO);
	}

}
