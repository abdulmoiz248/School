import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   static Student students[];
   static int size=0;


    public static void main(String[] args) {
     students=new Student[100];

     registerStudent();
     students[0].printAllFees();
     students[0].setFees("August",9000);
     students[0].printAllFees();
     //students[0].setFees("sept",11000);
     System.out.println("Current month fees="+students[0].getCurrentMonthFees("sept"));

    }

    public static void registerStudent(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Student Age: ");
        int age=sc1.nextInt();
        System.out.println("Enter Student ID: ");
        String id=sc.nextLine();
        System.out.println("Enter Student Gender: ");
        String gender=sc.nextLine();
        System.out.println("Enter Admission Fees: ");
        int fees=sc1.nextInt();
        System.out.println("Enter Month of Admission: ");
        String month=sc.nextLine();
        System.out.println("Enter Student Section: ");
        String section=sc.nextLine();
        System.out.println("Enter Student Total Quiz to be Taken: ");
        int totalQuiz=sc1.nextInt();
        students[size]=new Student(id,name,age,fees,month,gender,section,totalQuiz);
        size++;
        System.out.println("Student Registered");
    }

}