import Lab2.*;
public class Main{
	public static void main(String[] args){
		Lamp myLamp = new Lamp();
		System.out.println("This is my LAMP!");
		
		myLamp.setColor("white");
		myLamp.setWatts(45);
		myLamp.turnOn();
		
		String myStatus = myLamp.showStatus();
		System.out.println(myStatus);
		
		/*System.out.println("My lamp is: " + myLamp.isOn() +
			" and is color " + myLamp.getColor() +
			" and is wattage " + myLamp.getWatts());*/
		
		Lamp yourLamp = new Lamp();
		System.out.println("this is yours lamp");
		//Lab2.Yours.print();
		yourLamp.setColor("red");
		yourLamp.setWatts(60);
		yourLamp.turnOn();
		
		String yourStatus = yourLamp.showStatus();
		System.out.println(yourStatus);
		
		Lamp othersLamp = new Lamp();
		System.out.println("This is others lamp");
		//Lab2.Others.print();
		othersLamp.setColor("blue");
		othersLamp.setWatts(55);
		othersLamp.turnOn();
		
		String othersStatus = othersLamp.showStatus();
		System.out.println(othersStatus);
		
		
	}
}