package artikyil;
import java.util.Scanner;
import java.math.*;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Yıl giriniz:");
        year=input.nextInt();
        
        if(year%100==0){
            if(year%400==0){
                System.out.println(year+" "+"Artık yıldır");
            }
            else{
                System.out.println(year+" "+"bir artık yıl değildir!");
            }
            
        }
        else{
            if(year%4==0){
                System.out.println(year+" "+"Artık yıldır");
            }
            else{
                System.out.println(year+" "+"bir artık yıl değildir!");
            }
        }   
    }
    
}
