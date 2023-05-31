public class Main {
    public static void main(String[] args) {

      RWOnly obj=new RWOnly();
      obj.setName("Bhushank");
      String name = obj.getName();
      System.out.println(name);
    }
}