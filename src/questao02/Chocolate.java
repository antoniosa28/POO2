package questao02;

public class Chocolate extends DecoradorBebida{
    public Chocolate(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.7;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Chocolate";
    }
}
