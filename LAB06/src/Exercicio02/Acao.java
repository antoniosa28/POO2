package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Acao {
    private String nome;
    private double preco;
    private List<Investidor> investidores = new ArrayList<>();

    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        notificarInvestidores();
    }

    public void adicionarInvestidor(Investidor investidor) {
        investidores.add(investidor);
    }

    public void removerInvestidor(Investidor investidor) {
        investidores.remove(investidor);
    }

    private void notificarInvestidores() {
        for (Investidor investidor : investidores) {
            investidor.atualizar(this);
        }
    }
}