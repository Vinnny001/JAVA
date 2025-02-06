import java.util.Random;
public class random_numbers {
    public static void main(String [] args){
        Random random= new Random();
        for(int i=0; i<5; i++){
            int luck= random.nextInt(10)+1;

            System.out.println(luck);

        }
    }
}
