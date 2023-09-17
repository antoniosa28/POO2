package ex2;

public class CarroFachada {
    private Motor motor;
    private CintoDeSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFachada() {
        motor = new Motor();
        cinto = new CintoDeSeguranca();
        porta = new Porta();
        farol = new Farol();
        radio = new Radio();
    }

    public void dirigir() {
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizarEstacaoPreferida();
    }

    public void finalizarCorrida() {
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}
