import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class AddressApp {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Address a = new Address();
		String x = sc.nextLine();
		a.setName(x);
		x = sc.nextLine();
		a.setAddress(x);
		x = sc.next();
		a.setCity(x);
		x = sc.next();
		a.setState(x);
		x = sc.next();
		a.setZip(x);
		do 
		{		x = sc.next();
				a.setPhone(x);
				if(a.getPhone().equals("invalid"))
					System.out.println("Phone number is invalid - enter in  \"(XXX)-XXX-XXXX\" format");
		}while(a.getPhone().equals("invalid"));
		
		do 
		{
				x = sc.next();
				a.setEmail(x);
				if(a.getEmail().equals("invalid"))
					System.out.println("Email is invalid - enter in \"name@domain.com\" format ");
		}while(a.getEmail().equals("invalid"));
		
		System.out.println("\n The deatils of the address are as follows : \n");
		System.out.println(a.getName() + " " + a.getAddress() + " " + a.getCity() + 
				" " + a.getState() + " " + a.getZip() + " " + a.getPhone() + " " + a.getEmail());
		System.out.println("\n" + a.getMailaddress());
		// TODO Auto-generated method stub

	}

}
