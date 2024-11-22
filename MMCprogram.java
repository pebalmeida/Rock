package w2;

import java.util.Scanner;

class MMCprogram {
     public  static  void main(String args[]){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Digite o primeiro numero : ");
         int num1 = scanner.nextInt();
         System.out.print("Digite o segundo numero : ");
         int num2 = scanner.nextInt();
         int maiorNumero = Math.max(num1, num2);
         int mmc = maiorNumero;
         while (mmc % num1 != 0 || mmc % num2 != 0){
             mmc += maiorNumero;

         }

         System.out.println("O MMC de  " + num1 + "  eh  "  + num2 + "  eh  : "  + mmc);

     }
}
