public class Person {
    private String name;
    private int age;
    private char gender;
    private String ID;

    public Person(String name, int age, String  gender, String ID) {
        this.name = name;
        this.age = age;
      setGender(gender);
        this.ID = ID;
    }

    public Person() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        if(this.gender=='M')
            return "Male";
        return "Female";
    }

    public void setGender(String gender) { //male ,m
        if(gender.equals("Male") || gender.equals("M") || gender.equals("m") || gender.equals("male"))
            this.gender = 'M';
        else this.gender = 'F';
    }

}
