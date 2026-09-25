import java.util.Scanner;
public class conditional
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);


String name;
int age;

        System.out.println("enter your name");
name=scanner.nextLine();

        System.out.println("enter your age");
        age=scanner.nextInt();

                if(age>=20)
        System.out.println(name+" you r a adult");
                else{
                    System.out.println(name+" you r a child");
                }

                int no;
        System.out.println("enter the number");
        no=scanner.nextInt();
        if(no%2==0)
            System.out.println("the no is even");
             else System.out.println("the no is odd");

             //ternary operator variable=(conditional)? iftrue: iffalse:
        System.out.println("enter your club champion league");
int champ ;
champ= scanner.nextInt();
String club=(champ>=6)? "great club": "plastic club";
        System.out.println(club);
scanner.close();
    }
}