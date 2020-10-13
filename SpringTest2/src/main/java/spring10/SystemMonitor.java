package spring10;

//has a 관계
public class SystemMonitor {
	/*
	 * (1) byType
	private PhoneCall call; //byType : PhoneCall과 같은 자료형의 객체를 찾아와서 멤버변수에 저장한다.
	public void setCall(PhoneCall call) {
		this.call=call;
		System.out.println("setCall()호출(call)="+call);
	}
	*/
	
	//(2)byName => @Resource
	private PhoneCall phonecall; //type과 이름을 같게 준다.(멤버변수명)

	public void setPhonecall(PhoneCall phonecall) {
		this.phonecall = phonecall;
		System.out.println("setPhonecall(phonecall)호출"+phonecall);
	}


	public String toString() {
		return "SystemMonitor[phonecall="+phonecall+"]";
	}
	
}
