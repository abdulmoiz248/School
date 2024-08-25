import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static Student students[];
    static int size=40;
    static int year= 24;
    static char section='A';


    public static void main(String[] args) {
//        students=new Student[100];
//
//        registerStudent();
//        students[0].printAllFees();
//        students[0].setFees("August",9000);
//        students[0].printAllFees();
//        //students[0].setFees("sept",11000);
//        System.out.println("Current month fees="+students[0].getCurrentMonthFees("sept"));

        Admin admin=new Admin();
       students[size]=admin.registerStudent();
    }

    //add year
    // if 40 students are added move to next section (use size to change section)






}