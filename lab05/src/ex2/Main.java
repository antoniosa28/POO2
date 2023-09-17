package ex2;

public class Main {
    public static void main(String[] args) {
        CarroFachada carro = new CarroFachada();

        // Inicia uma corrida
        carro.dirigir();

        // Simula a corrida
        try {
            Thread.sleep(5000); // Simula a corrida por 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Finaliza a corrida
        carro.finalizarCorrida();
    }
}
