public class IsEvenWithoutLambda {
   public static void main(String args[]){
      System.out.println("is 4 even "+isEven(4));
      System.out.println("is 5 even "+isEven(5));
   }
   public static boolean isEven(int number){
      if(number%2 == 0){
         return true;
      }
      return false;
   }
}
