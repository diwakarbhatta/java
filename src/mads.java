import java.util.Scanner;
public class mads  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ad1;
        System.out.println("enter the name of the crew");
        ad1 = scanner.nextLine();
        String verb;
        System.out.println("enter the name of the person");
        verb = scanner.nextLine();
        String ad2;
        System.out.println("enter the work of the nami");
        ad2 = scanner.nextLine();
        String noun;
        System.out.println("enter the work of the sanji");
        noun = scanner.nextLine();

        System.out.println("luffy is the captain of" +ad1);
        System.out.println("his first mate is" + verb);
        System.out.println("nami is the"+ad2 +" of the crew");
        System.out.println("and sanji is the"+noun);


    }

}
