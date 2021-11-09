import java.util.Scanner;
public class year {
    public static void main(String[] args) {
        int yil;
        Scanner scn = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        yil = scn.nextInt();
        if((yil%4==0) || (yil%400==0)){
            System.out.println(yil+ " bir artık yıldır.");}
    else{
            System.out.println(yil+ " bir artık yıl değildir.");
        }
    }
}
