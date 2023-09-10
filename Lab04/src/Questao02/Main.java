package Questao02;

public class Main {
    public static void main(String[] args) {
        CalculadoraBinariaExistente calculadoraBinariaExistente = new CalculadoraBinariaExistente();

        CalculadoraAdapter calculadoraAdapter = new CalculadoraAdapter(calculadoraBinariaExistente);

        String resultadoSomaBinaria = calculadoraAdapter.somar("1010", "1100");
        String resultadoSubtracaoBinaria = calculadoraAdapter.subtrair("1100", "101");
        String resultadoMutltiplicacaoBinaria = calculadoraAdapter.multiplicar("111", "1001");


        System.out.println("Resultado da soma binaria: " + resultadoSomaBinaria);
        System.out.println("Resultado da subtracao binaria: " + resultadoSubtracaoBinaria);
        System.out.println("Resultado da multiplicacao binaria: " + resultadoMutltiplicacaoBinaria);


        int resultadoSomaDecimal = calculadoraAdapter.somar(9, 5);
        int resultadoSubtracaoDecimal = calculadoraAdapter.subtrair(25, 36);
        int resultadoMultiplicacaoDecimal = calculadoraAdapter.multiplicar(5, 6);

        System.out.println("Resultado da soma decimal: " + resultadoSomaDecimal);
        System.out.println("Resultado da subtracao decimal: " + resultadoSubtracaoDecimal);
        System.out.println("Resultado da multiplicacao decimal: " + resultadoMultiplicacaoDecimal);
    }
}
