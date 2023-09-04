package questao02;

public class Cafeteria {
    public static void main(String[] args) {

        Bebida beb = new Expresso();

        beb = new Leite(beb);
        beb = new Canela(beb);
        beb = new Chocolate(beb);

        System.out.println("Descrição: " + beb.getDescricao());
        System.out.println("Custo total: $" + beb.calculaCusto());
    }
}
