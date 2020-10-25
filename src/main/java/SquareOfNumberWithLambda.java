import java.util.function.*;
public class SquareOfNumberWithLambda {
   public static void main(String args[]){
      Function<Integer, Integer> square = i->i*i;
      System.out.println("square of 4 "+square.apply(4));
      Function<Integer, Integer> cube = i->i*i*i;
      System.out.println("cube of 4 "+cube.apply(4));
   }
}
