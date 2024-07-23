import java.util.Scanner;

public class StringMani {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

	System.out.print("Enter first name: ");
	String firstName = sc.nextLine();

	System.out.print("Enter middle name: ");
	String middleName = sc.nextLine();

	System.out.print("Enter last name: ");
	String lastName = sc.nextLine();

	String fullName = firstName + " " + middleName+ " " + lastName;

	System.out.println("Your full name is: " + fullName);

	sc.close();
    }
}
