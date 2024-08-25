import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Person{

    private static int count=0;

    private static int year= 24;
    private static char section='A';



    public Student registerStudent(){
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
        String section=assignSection(month);
        System.out.println("Enter Student Total Quiz to be Taken: ");
        int totalQuiz=sc1.nextInt();

        Student student =new Student(id,name,age,fees,month,gender,section,totalQuiz);
        student.setRollNumber(assignRollno(section));

        System.out.println("Student Registered");
        return student;
    }


    public String assignSection(String month){
        String sec="";
        if(checkSpring(month.toLowerCase())){

            sec+="SP"+year;
        }else{
            sec+="FA"+year;
        }

        if(this.count==40){
            section++;
            count=0;
        }
        sec+="-"+section;
        System.out.println(sec);
        return sec;
    }


    private static boolean checkSpring(String month){
        ArrayList<String> spring=new ArrayList<>();
        spring.add("january");
        spring.add("february");
        spring.add("march");
        spring.add("april");
        spring.add("may");
        spring.add("june");

        if(spring.contains(month)){
            return true;
        }
        return false;
    }

    public String assignRollno(String section){
        return section+"-"+(++count);
    }
}
