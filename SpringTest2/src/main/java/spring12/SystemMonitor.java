package spring12;

import javax.inject.Inject; //@Inject와 연관이 있는 클래스를 불러옴

//문자를 전송해줄 때 기간을 정하는 등
public class SystemMonitor {
	//멤버변수 정의
	private long periodTime; //기간
	//연관이 있으므로 has a 관계를 사용해서
	@Inject 
	private SmsSender sender;
	
	/*byType, byName을 사용해도 Setter Method를 호출해야한다.
	
	//객체 가져오는 방법 두가지 1)setter메서드 2)생성자통해서
	public void setPeriodTime(long periodTime) {
		this.periodTime = periodTime; //this.periodTime=10
		System.out.println("setPeriodTime()호출됨"+periodTime);
	}
	
	public void setSender(SmsSender sender) {
		this.sender = sender;
		System.out.println("SmsSender()호출됨"+sender); //sender.toString();
	}
	*/
	public String toString() {
		return "SystemMonitor[periodTime="+periodTime+", sender="+sender+"]";
	}
}
