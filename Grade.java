import java.util.Scanner;

public class Grade {
    private static int[][] studentMarks = new int[100][3]; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add student marks: add [studentID]");
            System.out.println("2. Update student mark: update [studentID] [subjectID] [mark]");
            System.out.println("3. Get the average for a student: average [studentID]");
            System.out.println("4. Get the average for a subject: average_s [subjectID]");
            System.out.println("5. Get the total mark of a student: total [studentID]");
            System.out.println("6. Exit");
            System.out.print("Enter your command: ");
            String command = sc.nextLine().trim();
            if (command.equalsIgnoreCase("exit")) break;
            processCommand(command);
        }
        sc.close();
    }

    private static void processCommand(String command) {
        String[] parts = command.split(" ");
        try {
            int studentID = Integer.parseInt(parts[1]);
            switch (parts[0].toLowerCase()) {
                case "add":
                    addStudentMarks(studentID);
                    break;
                case "update":
                    int subjectID = Integer.parseInt(parts[2]);
                    int mark = Integer.parseInt(parts[3]);
                    updateStudentMark(studentID, subjectID, mark);
                    break;
                case "average":
                    printStudentAverage(studentID);
                    break;
                case "average_s":
                    printSubjectAverage(Integer.parseInt(parts[1]));
                    break;
                case "total":
                    printStudentTotal(studentID);
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        } catch (Exception e) {
            System.out.println("Error processing command. Please ensure the format is correct.");
        }
    }

    private static void addStudentMarks(int studentID) {
        if (studentID >= 1 && studentID <= 100) {
            studentMarks[studentID - 1] = new int[]{0, 0, 0};
            System.out.println("Student " + studentID + " has been added.");
        } else {
            System.out.println("Invalid student ID. Please enter a value between 1 and 100.");
        }
    }

    private static void updateStudentMark(int studentID, int subjectID, int mark) {
        if (studentID >= 1 && studentID <= 100 && subjectID >= 1 && subjectID <= 3) {
            studentMarks[studentID - 1][subjectID - 1] = mark;
            System.out.println("Student " + studentID + "'s marks for subject " + subjectID + " was updated to " + mark + ".");
        } else {
            System.out.println("Invalid student ID or subject ID.");
        }
    }

    private static void printStudentAverage(int studentID) {
        if (studentID >= 1 && studentID <= 100) {
            int[] marks = studentMarks[studentID - 1];
            double average = (marks[0] + marks[1] + marks[2]) / 3.0;
            System.out.println("Student " + studentID + " has an average of " + average + ".");
        } else {
            System.out.println("Invalid student ID.");
        }
    }

    private static void printSubjectAverage(int subjectID) {
        if (subjectID >= 1 && subjectID <= 3) {
            double total = 0;
            int count = 0;
            for (int[] marks : studentMarks) {
                if (marks != null) {
                    total += marks[subjectID - 1];
                    count++;
                }
            }
            if (count > 0) {
                double average = total / count;
                System.out.println("The average mark for subject " + subjectID + " is " + average + ".");
            } else {
                System.out.println("No marks available for this subject.");
            }
        } else {
            System.out.println("Invalid subject ID. Please enter a value between 1 and 3.");
        }
    }

    private static void printStudentTotal(int studentID) {
        if (studentID >= 1 && studentID <= 100) {
            int[] marks = studentMarks[studentID - 1];
            int total = marks[0] + marks[1] + marks[2];
            System.out.println("Student " + studentID + " has a total mark of " + total + ".");
        } else {
            System.out.println("Invalid student ID.");
        }
    }
}


