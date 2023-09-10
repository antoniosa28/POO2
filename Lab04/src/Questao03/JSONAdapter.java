package Questao03;

public class JSONAdapter implements TimeFutebolAdapter {
    private TimeFutebolJSON timeJSON;

    public JSONAdapter(TimeFutebolJSON timeJSON) {
        this.timeJSON = timeJSON;
    }

    @Override
    public String getNome() {
        return timeJSON.getNome();
    }

    @Override
    public int getAnoFundacao() {
        return timeJSON.getAnoFundacao();
    }
}
