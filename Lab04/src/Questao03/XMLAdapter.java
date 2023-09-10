package Questao03;

public class XMLAdapter implements TimeFutebolAdapter {
    private TimeFutebolXML timeXML;

    public XMLAdapter(TimeFutebolXML timeXML) {
        this.timeXML = timeXML;
    }

    @Override
    public String getNome() {
        return timeXML.getNome();
    }

    @Override
    public int getAnoFundacao() {
        return timeXML.getFundacaoAno();
    }
}
