import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class goalkeeper {

    public static void main(String[] args) {

        double power;
        Scanner scanner = new Scanner(System.in);



        // area of rectangle//

        int length ;
        int bre ;
        int area ;

        System.out.println("enter the length of the rectangle");
        length = scanner.nextInt();
        System.out.println("enter the breath of rectangle");
        bre = scanner.nextInt();

        area = length * bre;

        System.out.println("the area of the rectangle is "+area);





        //area of circle//

        double radius;
        double a;

        System.out.println("enter the radius of circle");
radius=scanner.nextDouble();

        a=Math.PI *radius*radius;
        System.out.println("the area of circle is "+a);



        power=Math.pow(2,4);
        power=Math.abs(-5);
        power=Math.sqrt(9);
        power=Math.round(2.43);
        power=Math.ceil(3.7);
        power=Math.floor(34.2);
        power=Math.max(3,45);
        power=Math.min(3,45);


        System.out.println(power);
        System.out.println(power);



       // System.out.println(Math.PI);//


        int test;




        //hypotenuse  //

double x;
double y;
double z;

        System.out.println("enter the base of triangle");
x=scanner.nextDouble();

        System.out.println("enter the perpendicular of triangle");
y=scanner.nextDouble();

z=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

        System.out.println("the hypoteneuse is "+z);



        scanner.close();
    }
}