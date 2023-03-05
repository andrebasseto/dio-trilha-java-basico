public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // tipos primitivos

        byte idade = 123;
        short ano = 2023;
        int cep = 19900123; //se começar com 0 pode ser necesario alterar o tipo
        long cpf = 98765432109L; //tipo long deve ser encerrado com L
        float pi = 3.14F; //tipo floar deve ser encerrado com F
        double salario = 1275.33;


        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //cast

        // Constante final
        final double VALOR_DE_PI = 3.14;
    }
}

/*
 * Variaveis
 * 
 * Tipos primitivos
 * byte
 * short
 * int
 * long
 * float
 * double
 */

 /*
  * Constantes, valores que não podem ser alterados durante a execução
  * final
  * deve ser escrita em caixa alta
  */