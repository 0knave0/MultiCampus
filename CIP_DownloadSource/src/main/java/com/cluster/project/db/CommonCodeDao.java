package com.cluster.project.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CommonCodeDao {
	public Object getObject(Object dataMap) {
		Map<String, Object> resultObject = new HashMap<String, Object>();
		resultObject.put("NAME", "name 02");
		resultObject.put("COMMON_CODE_ID", "490293232849");
		resultObject.put("DESCRIPTION", "anything DESCRIPTION 01");
		resultObject.put("PARENT_COMMON_CODE_ID", "22222-2222-UUID222222222222");
		resultObject.put("ORDER_NUMBER", "1");
		return resultObject;
	}
	public Object getList(Object dataMap) {
		List<Object> resultObject = new ArrayList<Object>();
		Map<String, Object> data01 = new HashMap<String, Object>();
		data01.put("NAME", "name 01");
		data01.put("COMMON_CODE_ID", "490293232849");
		data01.put("DESCRIPTION", "anything DESCRIPTION 01");	
		resultObject.add(data01);			/*→ HashMap 3개 이상 */
		Map<String, Object> data02 = new HashMap<String, Object>();
		data02.put("NAME", "name 02");
		data02.put("COMMON_CODE_ID", "256988475256");
		data02.put("DESCRIPTION", "anything DESCRIPTION 02");	
		resultObject.add(data02);				
		Map<String, Object> data03 = new HashMap<String, Object>();
		data03.put("NAME", "name 03");
		data03.put("COMMON_CODE_ID", "465248426578");
		data03.put("DESCRIPTION", "anything DESCRIPTION 03");	
		resultObject.add(data03);				
		return resultObject; 
	}
}
