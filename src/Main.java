import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variable
        double side1 = 0;
        double side2 = 0;
        double area = 0;
        double perim = 0;
        double diag = 0;
        double side1Pow = 0;
        double side2Pow = 0;
        boolean done = false;

        do{
            System.out.println("Enter the length of side 1: ");
            if(scan.hasNextDouble()){
                side1 = scan.nextDouble();
                if(side1 > 0){
                    System.out.println("Enter the length of side 2: ");
                    if(scan.hasNextDouble()){
                        side2 = scan.nextDouble();
                        if(side2 > 0){

                            area = side1 * side2;
                            perim = (side1 * 2) + (side2 * 2);
                            side1Pow = Math.pow(side1, 2);
                            side2Pow = Math.pow(side2, 2);
                            diag = Math.sqrt(side1Pow + side2Pow);

                            System.out.printf("%-10s%6.2f", "Side 1:", side1);
                            System.out.printf("\n%-10s%6.2f", "Side 2:", side2);
                            System.out.printf("\n%-10s%6.2f", "Area:", area);
                            System.out.printf("\n%-10s%6.2f", "Perimeter:", perim);
                            System.out.printf("\n%-10s%6.2f", "Diagonal:", diag);

                            done = true;

                        }else{
                            System.out.println("Your input was invalid. Try Again.");
                        }
                    }else{
                        System.out.println("Your input was invalid. Try Again.");
                    }
                }else{
                    scan.nextLine();
                    System.out.println("Your input was invalid. Try Again.");
                }
            }else{
                scan.nextLine();
                System.out.println("Your input was invalid. Try Again.");
            }

        }while(!done);

    }
}