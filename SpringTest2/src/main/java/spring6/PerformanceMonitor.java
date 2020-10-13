package spring6;

import java.util.List;

public class PerformanceMonitor {
	private List<Double> number;

	public void setNumber(List<Double> number) {
		this.number = number;
		System.out.println("setNumber()호출=>"+number);
	}
}