public class Lorry extends Car{

   public Lorry(String license, int power){
      super(license, power);
   }
   
   public void freight(){
      System.out.println("Varer leveret!");
   }

   public void checkLicense(){
      System.out.println("LKW");
      super.checkLicense();
   }
}