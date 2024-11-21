package w2;

 class Condicionais3 {
     public static void main(String args[]){
         String pin_cel = "00000AAAABBBBB35@@@@";


         if (pin_cel.equals("00000AAAABBBBB35@@@@")){
             System.out.println("O pin do celular do Pericles esta correto : " + pin_cel);

         } else if (pin_cel.equals("000AAAAABBBB")) {
             System.out.println("O pin do celular do Pericles esta correto : " + pin_cel);

         } else {
             System.out.println("O pin do celular do Pericles nao esta correto");
         }
     }
}
