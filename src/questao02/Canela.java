package questao02;

public class Canela extends DecoradorBebida {
    public Canela(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.2;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Canela";
    }
}
