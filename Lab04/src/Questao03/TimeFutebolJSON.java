package Questao03;

public class TimeFutebolJSON {
    private String nome;
    private int anoFundacao;

    public TimeFutebolJSON(String nome, int anoFundacao) {
        this.nome = nome;
        this.anoFundacao = anoFundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
}
