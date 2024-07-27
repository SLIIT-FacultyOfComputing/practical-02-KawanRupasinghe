import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(lastName).append(" ").append(firstName).append(" ").append(middleName);
        String fullName = sb.toString();

        System.out.println("Your full name is: " + fullName);

        System.out.print("\nEnter another full name: ");
        String secondFullName = sc.nextLine();

        if (secondFullName.equalsIgnoreCase(fullName)) {
            System.out.println("The two names are the same.");
        } else {
            System.out.println("The two names are different.");
        }

        // Part 03
        System.out.println("\n** Replacing 'a' with '@' and 'e' with '3' **\n");
        String replacedName = fullName.replace('a', '@').replace('e', '3');
        System.out.printf("Name after replacement: %s\n", replacedName);

        System.out.println("\n** Converting to upper case **\n");
        String upperCaseName = fullName.toUpperCase();
        System.out.println("Your full name in upper case is: " + upperCaseName);

        // Part 04
        System.out.println("\n** Splitting the name **");
        String[] parts = fullName.split(" ");
        System.out.printf("\n\t%s\n\t%s\n\t%s", parts[0], parts[1], parts[2]);

        // Part 05
        System.out.println("\n\n** Trimming spaces **");
        System.out.print("Enter a string with leading and trailing spaces: ");
        String str2 = sc.nextLine();
        String trimmedStr2 = str2.trim();
        System.out.println("Trimmed string is: " + trimmedStr2);

        sc.close();
    }
}

