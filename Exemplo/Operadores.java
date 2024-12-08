public class Operadores {

    public static void main(String args[]) {
        operadocoesAritmeticas();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
    }

    public static void  operacoesIncrementoDecremento() {
        int num1 = 10;
        System.out.println(num1);
        num1++;
        System.out.println(num1);

        num1--;
        System.out.println(num1);
    }

    private static void operacoesAtribuicoes() {
        System.out.println("****operacoesAtribuicoes****");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3;
        System.out.println(numero3);
    }

    public static void operadocoesAritmeticas() {
        
            int num1 = 10;
            int num2 = 20;
    
            int num3 = num1 + num2;
    
            System.out.println(num3);
    }  
}


