package spring5;

//문자 전송 시스템
public class SmsSender {
	boolean flag; //문자가 제대로 전달됐는지 체크해주는 멤버변수
	//--constructor-arg이용
	public SmsSender(boolean flag) { //<constructor-arg>
		this.flag=flag;
	}
	//-----------------------
	@Override
	public String toString() {
		return "SmsSender를 호출";
	}
}
