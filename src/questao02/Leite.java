package questao02;

public class Leite extends DecoradorBebida{
    public Leite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.5;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Leite";
    }
}
