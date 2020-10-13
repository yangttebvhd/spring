package spring8;

import java.util.Properties;

//서버에 접속해서 ip주소, 접속시간 제한 정보저장을 properties형으로 저장
public class BookClient {
	private Properties prop;

	public void setProp(Properties prop) {
		this.prop = prop;
		System.out.println("setProp() 호출됨"+prop);
	}
	
}
