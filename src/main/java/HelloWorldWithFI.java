public class HelloWorldWithFI {
   public static void main(String args[]){
      HelloWorldFI helloWorld = ()->System.out.println("Hello World");
      helloWorld.method();
   }
}

interface HelloWorldFI{
   public void method();
}
