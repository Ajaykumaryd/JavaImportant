package EqualsHashcode;

public class Student {

    private Integer roll;
    private String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    //create a contact that when name and roll number of student will same then equals returns true

    @Override
    public boolean equals(Object o){
        if(o==this){
            return true;
        }
        if(o.getClass()!=this.getClass())return false;
        Student s=(Student) o;
        if(s.getName().equals(this.getName()) && s.getRoll()==this.getRoll())return true;
        return false;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode()+this.roll.hashCode();
    }



    public static void main(String[] args) {
        Student s1=new Student(21,"Ajay");
        Student s2=new Student(3,"Ayush");
        Student s3=s1;//->pointing to same memory address
        System.out.println("s1 hashcode->"+s1.hashCode() +" and s3 hashcode->"+s3.hashCode());
        System.out.println(s3.equals(s1));  //true because it returns equal hashcode ie from memory address from heap both point to same location
        System.out.println(s2.equals(s1));//false->hashcode return differentvalues

        //created a custom equals method to check equals
        Student s5=new Student(1,"Ajay");
        Student s4=new Student(1,"Ajay");
        System.out.println(s4.equals(s5));
    }
}
