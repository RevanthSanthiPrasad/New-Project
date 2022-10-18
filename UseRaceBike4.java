package OOPS_2;

public class UseRaceBike4 {
	public static void main(String[]args) {
		// method overRiding 
		RaceBike rc = new RaceBike();
		System.out.println(rc.speed()+" "+rc.name());
	}
}

class RaceBike extends Bike{
	public int speed() {
		// method over riding
		return 150;
	}
}

class Bike {
	// method over riding
	public int speed() {
		return 110;
	}
	public String name() {
		return "Pulsar";
	}
}