import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		truck nissan = new truck();
		
		System.out.println("Truck 1 Spec :");
		nissan.printSpecScanner();
		nissan.fueltank();
		nissan.storage();
		nissan.engine();
		
		System.out.println();
		
		truck toyota = new truck();
		System.out.println("Truck 2 Spec :");
		toyota.printSpecScanner();
		toyota.fueltank();
		toyota.storage();
		toyota.engine();
	}

}
