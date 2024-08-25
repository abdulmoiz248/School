import java.util.ArrayList;

public class Student extends Person{

    private ArrayList<Fees> fees;
    private Fees admissionFees;
    public  static int studentCount=0;
    private String section;
    private String rollNumber;
    private int[] marks;
    private int markSize=0;


    //Marks functions

    public int getMarks(int QuizNumber) { //index
        if(QuizNumber>0 && QuizNumber<markSize)   //0<2
            return marks[QuizNumber-1];

        System.out.println("Invalid Index");
        return 0;
    }

    public void setMarks(int marks) {
        if(markSize>=this.marks.length){
            System.out.println("Array is Already full");
            return;
        }
        if(marks<=10)
            this.marks[this.markSize++]=marks;
        else
            System.out.println("Invalid Marks");

    }

    public double getAvg(){
        int avg=0;
        for (int i = 0; i < markSize; i++) {
            avg+=marks[i];
        }
        return avg/markSize;
    }
    public int totalQuizTaken(){
        return this.markSize;
    }

    public void allMarks(){
        for (int i = 0; i < markSize; i++) {
            System.out.println("Quiz Number "+(i+1)+" : "+marks[i]+"/10");
        }
    }

    public int highestMark(){
        if(markSize==0)
        {
            System.out.println("Enter Marks First..!!");
            return 0;
        }
        int highest=marks[0]; // element at zero is of max value
        for (int i = 1; i < markSize; i++) {
            if(marks[i]>highest)  highest=marks[i];
        }

        return highest;

    }

    public int lowestMark(){
        if(markSize==0)
        {
            System.out.println("Enter Marks First..!!");
            return 0;
        }
        int lowest=marks[0];
        for (int i = 1; i < markSize; i++) {
            if(marks[i]<lowest) lowest=marks[i];
        }

        return lowest;

    }

    public void updateMarks(int index,int newNumber){
        if(markSize!=0 && index<markSize && index>0)
            marks[index-1]=newNumber;
        else
            System.out.println("Invalid Index");
    }

    //index
    //certain number delete
    public void deleteMarks(int index){
        if (markSize==0){
            System.out.println("Invalid Index!");
        } else if (index>markSize) {
            System.out.println("Invalid Index!!!");

        }
        else{
            marks[index-1]=0;
            markSize--;
            for(int j=index;j<markSize;j++){
                marks[j]=marks[j+1];
            }
        }


    }

    public void DeleteAllMarks(int number){// specific number from all indexes
        // first find index
        for(int i=0;i<markSize;i++){
            // check if the number== the number given by user
            if (number==marks[i]){
                deleteMarks(i+1);
            }
        }

    }

    public void DeleteFirstMarks(int number){// specific number from one place
        // first find index
        for(int i=0;i<markSize;i++){
            // check if the number== the number given by user
            if (number==marks[i]){
                deleteMarks(i+1);
                break;// as soon as it will find the index on for eg 8
            }
        }

    }


    // Total Students Count

    public static int getStudentCount() {
        return studentCount;
    }

    //roll number

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }


    //Fees Functions

    //composition
    public void setFees(String month,int totalFees) {
       Fees fees=new Fees(totalFees,month);
       this.fees.add(fees);
    }

    //aggregation
    public void setFees(Fees fees) {
        this.fees.add(fees);
    }

    public void printAllFees(){
        System.out.println("Admission Fees="+this.admissionFees);
        for (int i = 0; i < fees.size(); i++) {
            System.out.println(fees.get(i));
        }
    }

    public String monthOfAdmission(){
        return admissionFees.getMonth();
    }

    public int getCurrentMonthFees(String month){
        Fees f=this.fees.get(this.fees.size()-1);
        if(f.getMonth().equals(month)){
            System.out.println("Fees is already Submitted");
            return 0;
        }
        return Fees.getTotalFees()+f.getArreas();
    }

    public void printFeesOfCertainMonth(String month){
        if(fees.size()==0){
            System.out.println("Submit fees first!!");
            return;
        }
        for (int i = 0; i < fees.size(); i++) {
            Fees f=fees.get(i);
            if(f.getMonth().equals(month)){
                System.out.println(f);
            }
        }

    }

    public void printRange(String Smonth,String Emonth){
        boolean found=false;
        for(int i=0;i<fees.size();i++){
            Fees f=fees.get(i);
            if(f.getMonth().equals(Smonth))
                found=true;

            if(found){
                System.out.println(f);

            }

            if(f.getMonth().equals(Emonth)){
                return;
            }
        }
    }





    //Section

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }


   //TO String

    @Override
    public String toString() {
        return getName()+" "+getGender();
    }

    // Constructors

    public Student(String ID,String name, int age  , int admissionFees,String monthOfAdmission, String gender, String section, int totalQuiz) {

        super(name,age,gender,ID);
        fees=new ArrayList<>();
        this.admissionFees=new Fees(admissionFees,monthOfAdmission);
        this.section = section;
        marks = new int[totalQuiz];
    }



    public Student() {

    }

    public Student(Student s) {
        setName(s.getName());
        setAge(s.getAge());
        this.fees=s.fees;
        setGender(s.getGender());


    }


    //Blocks

    {

        studentCount++;

    }



}