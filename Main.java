package untitled;
import java.util.*;
public class Main {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Customer Id");
	String customerId = sc.next();
	System.out.println("Enter Customer Name");
	String customerName = sc.next();
	System.out.println("Enter Phone Number");
	long phoneNumber = sc.nextLong();
	System.out.println("Enter City");
	String city = sc.next();
	System.out.println("Enter Units Consumed");
	double UnitsConsumed = sc.nextDouble();
	System.out.println("Enter Cost per Unit");
	double CostPerUnit = Double.parseDouble(sc.next());
	
	CustomerDetails s = new  CustomerDetails(customerId, customerName, phoneNumber, city, UnitsConsumed,CostPerUnit);
	double amount = s.calculateElectricityBill();
	
	System.out.printf("Amount to be paid is Rs.%.2f",amount);
	sc.close();
}
}