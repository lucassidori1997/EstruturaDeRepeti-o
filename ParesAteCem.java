public class ParesAteCem{
   public static void main(String ... args){
      
      int home = 1;
      int end = 100;
      
      while(home <= end){
      
         if(home % 2 == 0){
         
            System.out.println(home);
         }
         home = home + 1;
      }
   }
}