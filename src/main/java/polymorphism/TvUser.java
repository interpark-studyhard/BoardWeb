package polymorphism;

public class TvUser {

	public static void main(String[] args) {
/*		
		SamsungTv tvS = new SamsungTv();	
		tvS.powerOn();
		tvS.volumeUp();
		tvS.volumeDown();
		tvS.powerOff();
		
		LgTv tvL = new LgTv();		
		tvL.powerOn();
		tvL.volumeUp();
		tvL.volumeDown();
		tvL.powerOff();		
*/
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();		
	}
}
