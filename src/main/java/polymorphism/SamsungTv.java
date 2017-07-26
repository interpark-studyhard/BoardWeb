package polymorphism;

public class SamsungTv implements TV {
	public void powerOn() {
		System.out.println("SamsungTv power on");
	}
	
	public void powerOff() {
		System.out.println("SamsungTv power off");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTv volume Up");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTv volume Down");
	}
}
