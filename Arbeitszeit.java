import java.util.Scanner;

public class Arbeitszeit {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Uhrzeit eingeben: ");
        double uhrzeit = scan.nextDouble();
        scan.close();


        if (uhrzeit >= 8.0 && uhrzeit < 12.0) {
            System.out.println("Arbeitszeit");
        }
        else if
            (uhrzeit >= 12.0 && uhrzeit < 13.0){
            System.out.println("Mittagspause");
        }
        else if
            (uhrzeit >= 13.0 && uhrzeit<= 16.0){
            System.out.println("Arbeitszeit");
        }
        else {
            System.out.println("Freizeit");
        }

    }
}
