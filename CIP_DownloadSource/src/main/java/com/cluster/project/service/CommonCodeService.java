package com.cluster.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cluster.project.db.CommonCodeDao;
import com.cluster.project.db.MemberDao;

@Service
public class CommonCodeService {
	@Autowired 
	private CommonCodeDao dao; 
	public Object getObject(Object dataMap) {
		Object resultObject = dao.getObject(dataMap);
		return resultObject; 
		}
	public List<Object> getList(String sqlMapId, Object dataMap) {
		Object resultObject = dao.getList(dataMap);
		return (List<Object>) resultObject; 
	}
	}