import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class OnlineAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentId = 1000; // Starting ID for students

        System.out.println("Welcome to the Online Academy!");
        System.out.print("Do you want to enroll? (Y/N): ");
        String enrollChoice;
        enrollChoice= scanner.nextLine();
        if (enrollChoice.equalsIgnoreCase("Y")) {

            System.out.print("Enter your name: ");
            String studentName = scanner.nextLine();

            // Generate unique ID for the student
            studentId++;

            System.out.println("Congratulations, " + studentName + "! You have successfully enrolled.");
            System.out.println("Your student ID is: " + studentId);
        } else if (enrollChoice.equalsIgnoreCase("N")){
            System.out.println("Thank you for considering our academy. Have a great day!");
        }
        else{
            System.out.println("You have entered an invalid character. Please enter the valid character.");
            System.out.print("Do you want to enroll? (Y/N): ");
             enrollChoice = scanner.nextLine();
            if (enrollChoice.equalsIgnoreCase("Y")) {
                System.out.print("Enter your name: ");
                String studentName = scanner.nextLine();

                // Generate unique ID for the student
                studentId++;

                System.out.println("Congratulations, " + studentName + "! You have successfully enrolled.");
                System.out.println("Your student ID is: " + studentId);
            } else if (enrollChoice.equalsIgnoreCase("N")){
                System.out.println("Thank you for considering our academy. Have a great day!");
            }
        }


        // Display the available courses
        System.out.println("Welcome to our Online Academy!");
        System.out.println("We offer the following courses:");
        System.out.println("1. Java Programming");
        System.out.println("2. Web Development");
        System.out.println("3. Data Science");
        System.out.println("4. Mobile App Development");

        // Prompt the user for their choice
        System.out.print("Which course do you want to enroll in? Please enter the course number: ");

        // Read user input
        Scanner scan = new Scanner(System.in);
        int courseChoice = scan.nextInt();

        // Process the user's choice
        switch (courseChoice) {
            case 1:
                System.out.println("You have enrolled in Java Programming. Do you want to start this course now (Y/N)?");
                Scanner s = new Scanner(System.in);
                String enroll = s.nextLine();
                if (enroll.equalsIgnoreCase("Y")) {
                    String path = "C:\\Users\\HP\\Documents\\java.txt";
                    System.out.println("Read this course carefully, After that there is a short quiz on the basis of which you get your course completion certificate. ");

                    try {
                        File file = new File(path);
                        if (!Desktop.isDesktopSupported()) {
                            System.out.println("desktop not supported.");

                        }

                        Desktop desktop = Desktop.getDesktop();
                        if (file.exists()) {
                            desktop.open(file);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Quiz quiz = new Quiz();
                    quiz.logic();

                } else if(enroll.equalsIgnoreCase("N")){
                    System.out.println("Enjoy your learning!");
                } else{
                    System.out.println("You have entered an invalid character.");}
                break;
            case 2:
                System.out.println("You have enrolled in Web Development. Do you want to start this course now (Y/N)?");
                Scanner sc = new Scanner(System.in);
                String en = sc.nextLine();
                if (en.equalsIgnoreCase("Y")) {
                    String path = "C:\\Users\\HP\\Documents\\webdevelopment.txt";

                    try {
                        File file = new File(path);
                        if (!Desktop.isDesktopSupported()) {
                            System.out.println("desktop not supported.");
                            return;
                        }
                        Desktop desktop = Desktop.getDesktop();
                        if (file.exists()) {
                            desktop.open(file);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Quiz quiz = new Quiz();
                    quiz.web();
                } else if(en.equalsIgnoreCase("N")){
                    System.out.println("Enjoy your learning!");
                } else{
                    System.out.println("You have entered an invalid character.");
                }

                break;
            case 3:
                System.out.println("You have enrolled in Data Science. Do you want to start this course now (Y/N)?");
                Scanner sca = new Scanner(System.in);
                String enr = sca.nextLine();
                if (enr.equalsIgnoreCase("Y")) {
                    String path = "C:\\Users\\HP\\Documents\\datascience.txt";

                    try {
                        File file = new File(path);
                        if (!Desktop.isDesktopSupported()) {
                            System.out.println("desktop not supported.");
                            return;
                        }
                        Desktop desktop = Desktop.getDesktop();
                        if (file.exists()) {
                            desktop.open(file);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Quiz quiz = new Quiz();
                    quiz.data();
                } else if(enr.equalsIgnoreCase("N")){
                    System.out.println("Enjoy your learning!");
                } else{
                    System.out.println("You have entered an invalid character.");}
                break;
            case 4:
                System.out.println("You have enrolled in Mobile App Development. Do you want to start this course now (Y/N)?");
                Scanner c = new Scanner(System.in);
                String eno = c.nextLine();
                if (eno.equalsIgnoreCase("Y")) {
                    String path = "C:\\Users\\HP\\Documents\\mobileappdevelopment.txt";

                    try {
                        File file = new File(path);
                        if (!Desktop.isDesktopSupported()) {
                            System.out.println("desktop not supported.");
                            return;
                        }
                        Desktop desktop = Desktop.getDesktop();
                        if (file.exists()) {
                            desktop.open(file);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Quiz quiz = new Quiz();
                    quiz.mobile();
                } else if(eno.equalsIgnoreCase("N")){
                    System.out.println("Enjoy your learning!");
                } else{
                    System.out.println("You have entered an invalid character.");}
                break;
            default:
                System.out.println("Invalid course choice. Please try again.");
                break;
        }

    }
}
 


