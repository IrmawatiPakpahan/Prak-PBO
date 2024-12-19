public class Library {
      static{
        System.out.println("Library System Initialized");
      }
      public static String convertToUpperCase(String str){
        return str.toUpperCase();
      }
      public static void main(String[] args) {
        System.out.println(Library.convertToUpperCase("hello"));
      }
}
