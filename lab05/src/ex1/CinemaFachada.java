package ex1;

public class CinemaFachada {
    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaDePipoca maquinaDePipoca;
    private Projetor projetor;
    private Streaming streaming;
    private Telao telao;

    public CinemaFachada(Amplificador amplificador, Luzes luzes, MaquinaDePipoca maquinaDePipoca,
                        Projetor projetor, Streaming streaming, Telao telao) {
        this.amplificador = amplificador;
        this.luzes = luzes;
        this.maquinaDePipoca = maquinaDePipoca;
        this.projetor = projetor;
        this.streaming = streaming;
        this.telao = telao;
    }

    public void assistirFilme(String filme) {
        ligarMaquinaDePipoca();
        estourarPipoca();
        desligarLuzes();
        ligarProjetor();
        ligarAmplificador();
        ajustarVolumeDoSom();
        ligarPlayer(filme);
    }

    public void fimDoFilme() {
        desligarPlayer();
        desligarProjetor();
        desligarAmplificador();
        ligarLuzes();
        recolherTelao();
    }

    private void ligarMaquinaDePipoca() {
        maquinaDePipoca.ligar();
    }

    private void estourarPipoca() {
        maquinaDePipoca.arrebentarPipoca();
    }

    private void desligarLuzes() {
        luzes.desligar();
    }

    private void ligarProjetor() {
        projetor.ligar();
    }

    private void ligarAmplificador() {
        amplificador.ligar();
    }

    private void ajustarVolumeDoSom() {
        amplificador.ajustarVolume(10);
    }

    private void ligarPlayer(String filme) {
        streaming.ligar();
        streaming.play(filme);
    }

    private void desligarPlayer() {
        streaming.desligar();
    }

    private void recolherTelao() {
        telao.abaixar();
    }

    private void desligarProjetor(){
        projetor.desligar();
    }
    private void desligarAmplificador(){
        amplificador.desligar();
    }
    private void ligarLuzes(){
        luzes.ligar();
    }
}

