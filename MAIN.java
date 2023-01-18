package S28677;

public class MAIN {
    public static void main(String[] args) {
        Student student1 = new Student ("Michał Przygoda",28677);
        Student student2 = new Student();
        student1.show();
        student2.show();
        SecretStudent sstudent1 = new SecretStudent();
        System.out.println(sstudent1.getName());
        System.out.println(sstudent1.getNazwisko());
        System.out.println(sstudent1.getNumerStudenta());
        SecretStudent sstudent2 = new SecretStudent();
        sstudent2.Setter("Michał");
        System.out.println(sstudent2.getName());
        SecretStudent sstudent3 = new SecretStudent();
        sstudent3.readFromScanner();
        sstudent3.print();
        SecretStudent sstudent4 = new SecretStudent();
        sstudent4.readFromScanner();
        sstudent4.print();
    }
}