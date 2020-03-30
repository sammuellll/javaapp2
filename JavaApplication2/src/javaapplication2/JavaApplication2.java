package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lutfen yasinizi giriniz: ");
        
        if (scanner.hasNextInt()){
                
            int yas = scanner.nextInt();
            System.out.println("Yasiniz = " + yas);
        }
        else{
            System.out.println("Lutfen bir sayi giriniz...!");
            
        }
        
        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Lutfen Adinizi giriniz: ");
        
        if(scanner1.hasNextLine()){
            
            String ad = scanner1.nextLine();
            
            System.out.println("Adiniz: " + ad);
            
        }
        else{
            System.out.println("Lutfen Adinizi giriniz...!");
        }
                
        Scanner scanner2 = new Scanner(System.in);
        
        System.out.println("Lutfen sayi giriniz: ");
        
        if(scanner2.hasNextDouble()){
        
            double sayi = scanner2.nextDouble();
        
            System.out.println("Sayiniz = " + sayi);
        }
        else{
            
            System.out.println("Lutfen bir sayi giriniz...!");
        }    
    }
}
