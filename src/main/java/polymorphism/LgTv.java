package polymorphism;

public class LgTv implements TV{
	public void powerOn() {
		System.out.println("LgTv turn on");
	}
	
	public void powerOff() {
		System.out.println("LgTv turn off");
	}
	
	public void volumeUp() {
		System.out.println("LgTv sound Up");
	}
	
	public void volumeDown() {
		System.out.println("LgTv sound Down");
	}
}
