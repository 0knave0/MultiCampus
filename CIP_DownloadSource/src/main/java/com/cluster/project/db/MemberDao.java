package com.cluster.project.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	public Object getObject(Object dataMap) {
		Map<String, Object> resultObject = new HashMap<String, Object>();
		resultObject.put("NAME", "name 02");
		resultObject.put("PASSWORD", "q1w2e3r4");
		resultObject.put("MEMBER_ID", "293029301202");
		resultObject.put("CELLPHONE", "010-5678-5678");
		resultObject.put("EMAIL", "qwe@abc.com");
		return resultObject;
	}
	public Object getList(Object dataMap) {
		List<Object> resultObject = new ArrayList<Object>();
		Map<String, Object> data01 = new HashMap<String, Object>();
		Map<String, Object> data02 = new HashMap<String, Object>();
		Map<String, Object> data03 = new HashMap<String, Object>();
		data01.put("NAME", "name 01");
		data01.put("MEMBER_ID", "490293232849");
		data01.put("CELLPHONE", "010-1234-1234");
		data01.put("EMAIL", "abc@abc.com");
		resultObject.add(data01);			/*→ HashMap 3개 이상 */
		data02.put("NAME", "name 02");
		data02.put("MEMBER_ID", "256988475256");
		data02.put("CELLPHONE", "010-5678-5678");
		data02.put("EMAIL", "qwe@abc.com");
		resultObject.add(data02);				
		data03.put("NAME", "name 03");
		data03.put("MEMBER_ID", "465248426578");
		data03.put("CELLPHONE", "010-1234-5678");
		data03.put("EMAIL", "zxc@abc.com");
		resultObject.add(data03);				
		return resultObject; 
	}
}
