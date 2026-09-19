import java.util.Scanner;
public class compound  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


double pricipal;
double amt;
double rate;
int years;
int times;

        System.out.println("enter the total principal");
        pricipal=scanner.nextDouble();

        System.out.println("enter the rate");
        rate=scanner.nextDouble()/100;

        System.out.println("how many times compound per year");
        times=scanner.nextInt();

        System.out.println("total year");
        years=scanner.nextInt();


        amt=pricipal*Math.pow(1+rate/times,times*years);

        System.out.println("the total amount is"+amt);









        scanner.close();}}

