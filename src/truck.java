import java.util.Scanner;
public class truck {

	String model;
	String color;
	String size;
	int maxSpeed;
	int acc;
	double price;
	
	    Scanner s=new Scanner(System.in);
	
	    void printSpecScanner() {
		System.out.println("Enter Model,Color,tire size,max speed");
		String a=s.nextLine();
		String b=s.nextLine();
		String c=s.nextLine();
		int d=s.nextInt();
		
		System.out.println("Model :"+a);
		System.out.println("Color :"+b);
		System.out.println("Tire Size :"+c);
		System.out.println("Max Speed :"+d);
		
		acceleration(d);
	    }
	
	    void fueltank() {
		 
		System.out.println("Enter amount of fuel in L: ");
		int a=s.nextInt();
		price=1.50*a;
			
		System.out.println("Price of fuel is "+price);
		}
	
	    void acceleration(int d){
		System.out.println("Enter acceleration: ");
		int p=s.nextInt();
		acc=d-p;
		System.out.println("acceleration full storage: "+acc+" km/h");
			
		}
	
	    void storage() {
		System.out.println("Enter storage max 200kg: ");
		int c=s.nextInt();
		int AvailableStrorage=200-c;
		System.out.println("Available storage : "+AvailableStrorage+" KG");
	   }
	    
       void engine() {
       System.out.println("Chooce Engine Type:\n 1.Diesel \n 2.Electric \n 3.Hybrid");
       int e=s.nextInt();
       if (e == 1) {
       System.out.print("You chooce Diesel");
       }
       else if(e == 2) {
       System.out.print("You chooce Electric");
       }
       else
       System.out.print("You chooce Hybrid");
       }
}
	
	
	
	
	
	
