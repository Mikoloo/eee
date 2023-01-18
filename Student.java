package S28677;

public class Student {

    public String name = "default name";
    public int StudentNumber = 0;

    Student(String name,int StudentNumber){
        this.name=name;
        this.StudentNumber=StudentNumber;
    }
    Student(){
        this.name=name;
        this.StudentNumber=StudentNumber;
    }

    public void show(){
        System.out.println(name +" "+"S"+StudentNumber);
    }

}
