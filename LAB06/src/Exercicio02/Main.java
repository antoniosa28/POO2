package Exercicio02;

public class Main {
    public static void main(String[] args) {
        Acao acaoMeta = new Acao("Meta", 175.0);
        Acao acaoTwitter = new Acao("Twitter", 210.0);

        AcaoBroker corretor = new AcaoBroker();

        Investidor investidor1 = new Investidor("Investidor 1", corretor, 150.0, 230.0);
        Investidor investidor2 = new Investidor("Investidor 2", corretor, 170.0, 231.0);

        acaoMeta.adicionarInvestidor(investidor1);
        acaoMeta.adicionarInvestidor(investidor2);

        acaoTwitter.adicionarInvestidor(investidor2);

        acaoMeta.setPreco(230.0);
        acaoMeta.setPreco(140.0);
        acaoTwitter.setPreco(260.0);
    }
}

