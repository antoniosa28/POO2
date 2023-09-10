package Questao03;

public class TimeFutebolXML {
    private String nome;
    private int fundacaoAno;

    public TimeFutebolXML(String nome, int fundacaoAno) {
        this.nome = nome;
        this.fundacaoAno = fundacaoAno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFundacaoAno() {
        return fundacaoAno;
    }

    public void setFundacaoAno(int fundacaoAno) {
        this.fundacaoAno = fundacaoAno;
    }
}
