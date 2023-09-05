import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

class Start {
	public static void main(String[] data) {
		ApplicationContext context;
		context = new FileSystemXmlApplicationContext
						("active.xml");
		Stadium s = context.getBean("main", Stadium.class);
		System.out.println(s.name);
		System.out.println(s.price);
	}
}

class Stadium {
	String name;
	double price;
	public void setName(String value) { name = value; }
	public void setTicketPrice(double value) { price = value; }
}

/*
import java.util.Scanner;
class Start {
	public static void main(String[] data) {
		System.out.print("Enter Price: ");
		Scanner input = new Scanner(System.in);
		double price = input.nextDouble();
		Cashier c = new Cashier();
		double t = c.getTotal(price);
		System.out.printf("Total is %.2f\n", t);
	}
}
*/
class Cashier {
	double getTotal(double price) {
		if (price < 0) return 0;
		if (price >= 100.0) {
			return price * 0.95;
		} else {
			return price;
		}
	}
}