package questao02;

public class Expresso implements Bebida{
    @Override
    public double calculaCusto() {
        return 2.0;
    }

    @Override
    public String getDescricao() {
        return "Expresso";
    }
}
