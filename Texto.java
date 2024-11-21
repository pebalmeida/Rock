package w2;

 class Texto {
     public static void main(String args[]){
         String name = " Pericles Belo Geraldez";
         char caracter = name.charAt(8);
          String first_name_second_name = name.substring(8);
          System.out.println(first_name_second_name);
         String first_name = name.substring(0,7);
         System.out.println(first_name);
         String second_name = name.substring(9,14);
         System.out.println(second_name);
         String text_substitute = "Geraldez";
         System.out.println(text_substitute);
         name = name.replace("Pericles ", text_substitute);
         System.out.println(name);

         int quantidade = name.length();
         name = name.toUpperCase();
         System.out.println(name);
         name = name.toLowerCase();
         System.out.println(name);
       System.out.println(name.indexOf("b"));

         name = name.concat("das neves");
         System.out.println(name);
         System.out.println(name.equals("Belo"));
         System.out.println(name.equals("geraldezbelo geraldezdas neves"));
         System.out.println("".isEmpty());
         System.out.println("  ".isBlank());

         for(int i = 0; i < name.length(); i++){
             System.out.println(name.charAt(i));
         }
     }
}
