package S28677;

import java.util.Scanner;

public class SecretStudent {
    private String name = "This is Secret";
    private String nazwisko = "This is Secret too";
    private int numerStudenta = 0;

    SecretStudent(){
        this.name=name;
        this.nazwisko=nazwisko;
        this.numerStudenta=numerStudenta;
    }
    public void Setter(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }

    public int getNumerStudenta(){
        return this.numerStudenta;
    }
    public void readFromScanner(){
        Scanner s = new Scanner(System.in);
        System.out.println("podaj imię");
        String name = s.next();
        this.name = name;
        System.out.println("podaj nazwisko");
        String nazwisko = s.next();
        this.nazwisko=nazwisko;
        System.out.println("podaj numer studenta");
        int numerstudenta = s.nextInt();
        this.numerStudenta=numerstudenta;
    }
    public void print(){
        System.out.println(name);
        System.out.println(nazwisko);
        System.out.println(numerStudenta);
    }

}
