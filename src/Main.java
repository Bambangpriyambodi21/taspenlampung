import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        System.out.println("--- Panjang ---");
        for (int i=0;i<angka;i++){
            if ((angka)/2==i){
                for (int k=0;k<angka;k++){
                    System.out.print("* ");
                }

            }else{
                for (int l=0;l<angka;l++){

                    if (l!=0 && l!=angka-1){
                        System.out.print("= ");
                    }else {
                        System.out.print("* ");
                    }
                }
            }

            System.out.println();
        }
    }

}