import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Sicaklik Degerini Giriniz (C) : ");
            double heat=input.nextDouble();
            if(heat<5){
                System.out.println("Kayak yapabilirsiniz.");}
                else {if(heat>25){
                    System.out.println("Yuzmeye gidebilirsiniz.");}else{
                        if(heat<10){
                            System.out.println("Sinemaya gidenilirsiniz.");}else{if(heat>15){
                                System.out.println("Piknige gidebilirsiniz.");}else{System.out.println("Sinemaya ya da piknige gidebilirsiniz.");}
                            }
                    }
                }
        }
                
    }
}
