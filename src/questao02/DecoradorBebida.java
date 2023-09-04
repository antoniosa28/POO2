package questao02;

public abstract class DecoradorBebida implements Bebida{
    protected Bebida bebidaDecorada;

    public DecoradorBebida(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public double calculaCusto() {
        return bebidaDecorada.calculaCusto();
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao();
    }
}
