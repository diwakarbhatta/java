import java.util.Scanner;

public class weight {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        double kg;
        double pound;
        int opt;

        System.out.println("choose your option");
        System.out.println("press 1 to convert kg into pound");
        System.out.println("press 2 to convert pound into kg");

        System.out.println("weight");
        opt=scanner.nextInt();

        if(opt==1) {
            System.out.println("in kg");
            kg = scanner.nextDouble();
            pound = kg / 0.453592;
            System.out.printf("in pound %.2f " , pound);
        }
        else if (opt==2){
            System.out.println("in pound");
            kg = scanner.nextDouble();
            pound = kg *0.453592;
            System.out.println("in kg : " + pound);
        }
        else{
            System.out.println("no a valid option");
        }

scanner.close();
    }

}
