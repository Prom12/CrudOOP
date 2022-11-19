public class  Person {
   public String  name = "";
   public int age = 1;
   public char gender = 'z';
   public boolean eat = true;

   Person(String name, int b){
        this.name = name;
        age = b;
   }


   public void eat(){
      if (eat)
      System.out.println( "All humans can eat");
   }

   public void eat(boolean eat){
      if (eat)
      System.out.println( "All humans can eat");
      else
      System.out.println( "All humans cannot eat");
   }
}
