package spring9;

import java.util.Map;

class RestHandler {
	//new RestHandler() 면 public RestHandler() {} 기본생성자가 형성되어 객체 생성이 가능하다.
}

class SoapHandler {}

public class ProtocolHanderFactory {
//Map 객체 > HashMap, Hashtable
	private Map<String,Object> map;

	public void setMap(Map<String, Object> map) {
		this.map = map;
		System.out.println("setMap()호출(map)=>"+map);
	}
}
