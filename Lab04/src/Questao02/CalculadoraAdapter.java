package Questao02;

public class CalculadoraAdapter implements CalculadoraBinaria{
    private CalculadoraBinariaExistente calculadoraBinariaExistente;

    public CalculadoraAdapter(CalculadoraBinariaExistente calculadoraBinariaExistente) {
        this.calculadoraBinariaExistente = calculadoraBinariaExistente;
    }

    @Override
    public String somar(String x, String y) {
        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);
        int resultado = num1 + num2;
        return Integer.toBinaryString(resultado);
    }

    @Override
    public String subtrair(String x, String y) {
        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);
        int resultado = num1 - num2;
        return Integer.toBinaryString(resultado);
    }

    @Override
    public String multiplicar(String x, String y) {
        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);
        int resultado = num1 * num2;
        return Integer.toBinaryString(resultado);
    }

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
}
