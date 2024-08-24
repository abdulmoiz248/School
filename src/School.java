public class School {
    private String name;
    private String number;
    private String Address;

    Class classes[];


    public School(String name,String number,String address,int totalClasses) {
        this.name = name;
        this.number = number;
        this.Address = address;
        classes = new Class[totalClasses];
        for (int i = 0; i < totalClasses; i++) {
            classes[i] = new Class();
        }

    }

}
