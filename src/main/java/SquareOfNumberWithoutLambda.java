public class SquareOfNumberWithoutLambda {
   public static void main(String args[]){
      System.out.println("square of 4 "+square(4));
      System.out.println("cube of 4 "+cube(4));
   }
   public static int square(int number){
      return number*number;
   }
   public static int cube(int number){
      return number*number*number;
   }
}
