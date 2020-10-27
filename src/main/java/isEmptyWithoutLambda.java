public class isEmptyWithoutLambda {
   public static void main(String args[]){
      System.out.println("is emtpy "+isEmptyString(""));
      System.out.println("is empty "+isEmptyString("not empty"));
   }

   public static boolean isEmptyString(String input){
      if(input.isEmpty()){
         return true;
      }
      return false;
   }
}
