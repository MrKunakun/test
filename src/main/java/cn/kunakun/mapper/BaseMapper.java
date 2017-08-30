package cn.kunakun.mapper;

import static org.springframework.util.Assert.notNull;

import java.util.List;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Component;

@Component
public class BaseMapper extends DaoSupport {
	private static final Logger logger = LoggerFactory
			.getLogger(BaseMapper.class);

	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;


	public int insert(String key, Object object) {
		return sqlSession.insert(key, object);
	}

	public int delete(String key, Object object) {
		return sqlSession.delete(key, object);
	}

	public int update(String key, Object object) {
		return sqlSession.update(key, object);
	}

	@SuppressWarnings("unchecked")
	public Object get(String key, Object object) {
		return sqlSession.selectOne(key, object);
	}

	public int count(String key, Object object) {
		return (Integer) sqlSession.selectOne(key, object);
	}

	public List getList(String key) {
		return sqlSession.selectList(key);
	}

	public List getList(String key, Object object) {
		return sqlSession.selectList(key, object);
	}

	/**
	 * 批量插入
	 */
	public boolean batchInsert(String key, List<?> objList) {
		SqlSession session = this.sqlSessionFactory.openSession(
				ExecutorType.BATCH, false);
		int i = 0;
		for (; i < objList.size(); i++) {
			session.insert(key, objList.get(i));
		}
		session.flushStatements();
		if (i == objList.size()) {
			return true;
		}
		return false;
	}

	@Override
	protected void checkDaoConfig() throws IllegalArgumentException {
		notNull(this.sqlSession,
				"Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required");
	}
	

}
