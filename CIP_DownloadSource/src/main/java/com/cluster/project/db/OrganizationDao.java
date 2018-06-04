package com.cluster.project.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class OrganizationDao {
	public Object getObject(Object dataMap) {
		Map<String, Object> resultObject = new HashMap<String, Object>();
		resultObject.put("NAME", "name 01");
		resultObject.put("ORGANIZATION_SEQ", "293029301202");
		resultObject.put("TELEPHONE", "010-1234-1234");
		resultObject.put("ORDER_NUMBER", "1234");
		return resultObject;
	}
	public Object getList(Object dataMap) {
		List<Object> resultObject = new ArrayList<Object>();
		Map<String, Object> data01 = new HashMap<String, Object>();
		data01.put("NAME", "name 01");
		data01.put("ORGANIZATION_SEQ", "490293232849");
		data01.put("TELEPHONE", "010-1234-1234");
		data01.put("ORDER_NUMBER", "1234");
		resultObject.add(data01);			/*→ HashMap 3개 이상 */
		Map<String, Object> data02 = new HashMap<String, Object>();
		data02.put("NAME", "name 02");
		data02.put("ORGANIZATION_SEQ", "256988475256");
		data02.put("TELEPHONE", "010-5678-5678");
		data02.put("ORDER_NUMBER", "1739");
		resultObject.add(data02);				
		Map<String, Object> data03 = new HashMap<String, Object>();
		data03.put("NAME", "name 03");
		data03.put("ORGANIZATION_SEQ", "465248426578");
		data03.put("TELEPHONE", "010-1234-5678");
		data03.put("ORDER_NUMBER", "5678");
		resultObject.add(data03);				
		return resultObject; 
	}
}
