package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class AcaoBroker {
    private List<Investidor> investidores = new ArrayList<>();

    public void adicionarInvestidor(Investidor investidor) {
        investidores.add(investidor);
    }

    public void venderAcao(Investidor investidor, Acao acao) {
        System.out.println("Corretor vendeu acao " + acao.getNome() + " a " + investidor.getNome());
        investidores.remove(investidor);
    }

    public void comprarAcao(Acao acao, double precoCompra) {
        System.out.println("Corretor comprou acao " + acao.getNome() + " por " + precoCompra);
    }
}