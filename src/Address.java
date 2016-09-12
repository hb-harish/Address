import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {
	
	private String name,addr,city,state,zip,phone,email;
	
	private boolean isEmailValid(String email){  
        boolean isValid = false;  

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
        CharSequence inputStr = email;  
        //Make the comparison case-insensitive.  
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
        Matcher matcher = pattern.matcher(inputStr);  
        if(matcher.matches()){  
            isValid = true;  
        }  
        return isValid;  
    } 
    
    private boolean isPhoneNumberValid(String phoneNumber){  
        boolean isValid = false;  

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";  
        CharSequence inputStr = phoneNumber;  
        Pattern pattern = Pattern.compile(expression);  
        Matcher matcher = pattern.matcher(inputStr);  
        if(matcher.matches()){  
            isValid = true;  
        }  
        return isValid;  
    }
	
	public Address()
	{
		System.out.println("\nEnter Name, Address, City, State, Zip, Phone and email details :  ");
	}
	
	public void setName(String a)
	{
		name = a;
	}
	
	public void setAddress(String a)
	{
		addr = a;
	}
	public void setCity(String a)
	{
		city = a;
	}
	public void setState(String a)
	{
		state = a;
	}
	public void setZip(String a)
	{
		zip = a;
	}
	public void setPhone(String a)
	{
		if (isPhoneNumberValid(a)) 
			phone = a;
		else phone = "invalid";
	}
	public void setEmail(String a)
	{
		if (isEmailValid(a)) 
			email = a;
		else email = "invalid";
	}
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return addr;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public String getZip()
	{
		return zip ;
	}
	public String getPhone()
	{
		return phone;
	}
	public String getEmail()
	{
		return email;
	}
	public String getMailaddress()
	{
		return String.format(name + "\n" + addr + "\n" + city + ", " + state + " " + zip);
	}

}
