import java.util.Random;



public class random {
    public static void main(String[] args)
    {
Random random=new Random();

int num;
int no;
double numb;
boolean coin;


num=random.nextInt(1,7);
        no=random.nextInt(1,7);
numb= random.nextDouble(38,97);
coin= random.nextBoolean();


        System.out.println(num);
        System.out.println(no);
        System.out.println(numb);

        if(coin){
            System.out.println("heads");
        }
        else{
            System.out.println("tails");
        }

    }
}
