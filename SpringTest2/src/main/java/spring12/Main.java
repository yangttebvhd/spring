package spring12;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//자바코드 > 미리 객체를 만들어서 관리(=컨테이너) > 환경설정파일을 통해서 불러와서 작업
//외부 패키지를 가져올 수 있도록 처리
public class Main {
	public static void main(String[] args) {
		//1.xml파일이 여러개 존재할 경우 > 배열로 관리하여 파일명을 부여한다.
		String[] configLocation=new String[] {"app.xml"};
		//2.xml파일을 메모리에 올려줄 수 있는 클래스를 통해서 객체를 생성한다. 49p
		AbstractApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
		//3.자바프로그램이 종료되면 자동적으로 context도 같이 종료될 수 있도록 처리한다.
		context.registerShutdownHook();
		//4.xml에서 만들어진 객체를 가져와서 처리한다.
		SystemMonitor monitor=context.getBean("monitor",SystemMonitor.class);
		System.out.println("monitor=>"+monitor);
		//5.context도 종료(메모리 해제)
		context.close(); //메모리에 올려놓은 모든 빈즈객체들을 모두 메모리해제하라.
	}
}