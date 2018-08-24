package thai.dev;

import thai.dev.models.Person;

public class MainApp {
	
	public static void main(String[]args) {
		
		final String arrname[] = {"Bao","Tu","Tap","Teo","Nam"};
		final int arrOId[] = { 21,25,26,15,16};
		
		Person arrPerson [] = new Person [arrname.length];
		for (int i=0;i < arrPerson.length;i++) {
			Person p = new Person (arrname[i],arrOId[i]);
			arrPerson[i]=p;
		}
	
		for (int i=0;i < arrPerson.length;i++) {
			arrPerson[i].show();
		}
	}
}