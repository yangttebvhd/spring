package spring4;

//문자를 전송해줄 때 기간을 정하는 등
public class SystemMonitor {
	//멤버변수 정의
	private long periodTime; //기간
	//연관이 있으므로 has a 관계를 사용해서
	private SmsSender sender;
	
	//생성자를 이용 >>> c네임스페이스를 이용해서 설정 가능
	public SystemMonitor(long periodTime, SmsSender sender) {
		this.periodTime = periodTime;
		this.sender = sender;
		System.out.println("SystemMonitor()호출됨");
	}

	public String toString() {
		return "SystemMonitor[peridTime="+periodTime+", sender="+sender+"]";
	}
}
