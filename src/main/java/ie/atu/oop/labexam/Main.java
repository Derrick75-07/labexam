package ie.atu.oop.labexam;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        String studentName;
        int numberOfStudents;
        WORKSHOP workshop1= new WORKSHOP("ROBOTICS",3);
        System.out.print("workshop name:"+ workshop1.getWorkshopName());
        System.out.println("\n");
        System.out.print("capacity:"+ workshop1.getCapacity());
        System.out.println("\n");
        System.out.println("ENTER NO 0F ATTEMPTS");
        Scanner number = new Scanner(System.in);
        numberOfStudents = Integer.parseInt(number.nextLine());
        for(int i=0;i<numberOfStudents;i++) {
            System.out.println("enter student name:");
            Scanner input = new Scanner(System.in);
            studentName = input.nextLine();

        }
        Set<String> studentSet = new HashSet<>();
        System.out.println(studentSet.size());
        System.out.println(studentSet.getClass());
    }
    }