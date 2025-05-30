package car;

public class Car {
   private String brand;
   private String model;
   private int year;

   public void setBrand(String a) {
       brand = a;
   }
   public void setModel(String b) {
       model = b;
   }
   public void setYear( int c) {
       year = c;
   }

   public String getBrand() {
       return brand;
   }

   public String getModel() {
       return model;
   }
   public int getYear() {
       return year;
   }

}
