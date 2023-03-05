import java.util.Date;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Operadores {
    public static void main(String[] args) {
        // concatecacao
        String nomeCompleto = "Linguagem" + "Java";

        String concatecacao = 1 + 1 + 1 + "1";

        concatecacao = 1 + "1" + 1 + 1;

        
        
        // atribuição
        String nome = "André";
        int idade = 22;
        double peso = 68.2;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNacimento = new Date();

        // adição
        double soma = 10.5 + 15.7;

        // subtração
        int subtacao = 113 - 25;

        // multiplicacao
        int multiplicacao = 20 * 7;

        // divisao
        int divisao = 15 / 3;

        // modulo
        int modulo = 18 % 3;

        double resultado = (10 * 7) + (20 / 4);

        
        
        // Operador unario
        int numero = 5;
        numero = -numero;
        //System.out.println(numero);

        numero = numero * -1;
        //System.out.println(numero);

        
        
        //incremento
        numero = 5;
        System.out.println(numero++); //incrementa após a exibir
        numero = 5;
        System.out.println(++numero); //incrementa anstes de exibir

        
        
        // negar expressoes booleanas
        boolean variavel = true;
        System.out.println(!variavel);

        
        
        //operador ternario
        int a, b;
        a = 5;
        b = 6;
        String resultado2 = "";

        //exemplo utilizando estrutura condicional
        if (a == b){
            resultado2 = "verdadeiro";
        }
        else {
            resultado2 = "falso";
        }
        System.out.println(resultado2);

        //exemplo utilizando operador ternario
        a = 6;
        b = 6;

        resultado2 = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado2);



        /*
         * Operadores relacionais
         * == igualdade
         * != diferente
         * > maior
         * < menor
         * >= maior igual
         * <= menor igual
         */
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente numeroDois? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numeroUm é menor que numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);



        //Operadores lógicos
        // && "E"
        // || "OU"
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("As duas condições sao verdadeiras");
        }
        if (condicao1 || condicao2) {
        System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("Fim");
    }
}
