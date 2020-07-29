package book.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import book.domain.BookVO;

@Repository
public class BookDaoMybatis implements BookDao {

	private SqlSessionTemplate sqlSessionTemplate;

	public BookDaoMybatis(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public void setSqlmapclient(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<BookVO> list() {
		return sqlSessionTemplate.selectList("list");
	}

	@Override
	public void insert(BookVO bookVO) {
		sqlSessionTemplate.insert("insert", bookVO);
	}

	@Override
	public BookVO select(int seq) {
		BookVO vo = (BookVO) sqlSessionTemplate.selectOne("select", seq);
		return vo;
	}

}
