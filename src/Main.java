public class Main {
    public static void main(String[] args) {

      RWOnly obj=new RWOnly();
      obj.setName("Bhushan");
      String name = obj.getName();
      System.out.println(name);
    }
}