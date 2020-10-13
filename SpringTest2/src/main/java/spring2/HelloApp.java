package spring2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//자바코드 > 미리 객체를 만들어서 관리(=컨테이너) > 환경설정파일을 통해서 불러와서 작업
//외부 패키지를 가져올 수 있도록 처리
public class HelloApp {
	public static void main(String[] args) {
		//1.xml파일의 위치를 불러오는 방법 두가지 > 절대경로
		//Resource resource=new FileSystemResource("C:/webtest/4.jsp/sou2/SpringTest/src/spring/applicationContext.xml");
		Resource resource=new ClassPathResource("/spring2/initContext.xml");
		//2.빈즈 공장을 불러와서 객체를 생성
		BeanFactory factory=new XmlBeanFactory(resource); //xml을 메모리에 올린다
		//3.factory에서 getBean("불러올 객체를 가져올 id값을 지정")
		spring2.MessageBeanDI bean=(spring2.MessageBeanDI)factory.getBean("mBean");
		bean.sayHello(); //out()에서 파일을 생성 > 메세지 내용을 출력함
	}
}