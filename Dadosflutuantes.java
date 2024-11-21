package w2;

public class Dadosflutuantes {
    public static void main(String args[]){
        float y = 0.023f;
        float a = 1.1f;

        //Calculadora Flutuante
        float soma = a + y;
        System.out.println("Soma  : " + soma);
        float subtracao = a - y;
        System.out.println("Subtracao  : "  + subtracao);
        float multiplicacao = a * y;
        System.out.println("Multiplicacao  : "  + multiplicacao);
        float divisao = a / y;
        System.out.println("Divisao  :  "  + divisao);
        float resto = a % y;
        System.out.println("Resto  :   " + resto);
    }
}
