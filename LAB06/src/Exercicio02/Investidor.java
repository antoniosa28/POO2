package Exercicio02;

public class Investidor {
    private String nome;
    private AcaoBroker corretor;
    private double precoMinimo;
    private double precoMaximo;

    public Investidor(String nome, AcaoBroker corretor, double precoMinimo, double precoMaximo) {
        this.nome = nome;
        this.corretor = corretor;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
        corretor.adicionarInvestidor(this);
    }

    public String getNome() {
        return nome;
    }

    public void atualizar(Acao acao) {
        if (acao.getPreco() >= precoMaximo) {
            System.out.println(nome + " vendeu acao " + acao.getNome() + " a " + acao.getPreco());
            corretor.venderAcao(this, acao);
        }
    }

    public void definirLimites(double precoMinimo, double precoMaximo) {
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
    }
}
