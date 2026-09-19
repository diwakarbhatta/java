import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main{

    public static void main(String[] args){
   System.out.println("Berserk");
        System.out.println("Vagabond");
        System.out.print("Kingdom\n");
        System.out.println("Vinland saga");


        int goalkeepers = 4;
        System.out.println("there are "+ goalkeepers + " goalkeepes in liverpool") ;

        char alison = 's';
        System.out.println("alison is "+alison);

        boolean isthegreatestenglishteam = true;
        if(isthegreatestenglishteam){
            System.out.println("liverpool is the greatest english team");
        }
        else{
            System.out.println("you have zero ball knowledge");
        }

String club = "livepool";
        System.out.println(club);


Scanner scanner = new Scanner(System.in);



        System.out.print("Your favourite player :");
        scanner.nextLine();
        String player = scanner.nextLine();
        System.out.println(player + " is alison");

        String age = scanner.nextLine();
        System.out.println(age + " greatest manager");

        int x=3;
        int y=5;
        int a;
        a= y - x;
        System.out.println(a);


        String  sports= "football";
        int t= 6;
                double fs= 2.3;
char s='s';
boolean truefan=true;

        System.out.printf("hello %s\n",sports);
        System.out.printf("you r %c\n",s);
        System.out.printf("your GPA is %f\n",fs);
        System.out.printf("you r %d\n",t);
        System.out.printf("liverpool is the gratest club%b\n",truefan);

        System.out.printf("%s is %c\n",sports,s);



        String forwards="isak";
        String midfield="macca";
        String defender="van dijik";


        System.out.printf("%s\n",forwards);
        System.out.printf("%s",midfield);
        System.out.printf("%s",defender);


        double marks=32.32;
        System.out.printf("%.3f\n",marks);


        int sd=3;
        int as=34;
        int fd=92;
//0=padding

        System.out.printf("%2d\n",sd);
        System.out.printf("%2d\n",as);
        System.out.printf("%2d\n",fd);

        //string//
        String ad = "liverpool";
                int length=ad.length();
                char letter=ad.charAt(4);
                ad=ad.replace("e","a");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(ad);


//substring= A method used to extract a portion of string.substring(start ,end)

        System.out.println("enter your email");
        String mail;
        mail=scanner.nextLine();
        String name=mail.substring(0,7);

        System.out.println(name);

scanner.close();


    }
}