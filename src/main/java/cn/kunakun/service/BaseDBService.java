package cn.kunakun.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kunakun.mapper.BaseMapper;

@Service
public class BaseDBService {

	protected static final Logger logger = LoggerFactory.getLogger(BaseDBService.class);

	@Autowired
	protected BaseMapper oracleDAO;


	
	public Object getObject(String statment, Object obj) {

		return oracleDAO.get(statment, obj);

	}

	
	public List list(String statement, Object obj) {

		return oracleDAO.getList(statement, obj);

	}
	
	
	public int count(String statment, Object obj) {

		return oracleDAO.count(statment, obj);

	}

	



}
