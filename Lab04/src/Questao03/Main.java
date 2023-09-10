package Questao03;

public class Main {
    public static void main(String[] args) {
        // Suponha que você tenha informações em JSON e XML
        TimeFutebolJSON timeJSON = new TimeFutebolJSON("Cruzeiro", 1921);
        TimeFutebolXML timeXML = new TimeFutebolXML("Internacional", 1909);

        // Crie adaptadores para as fontes de informações
        TimeFutebolAdapter adapterJSON = new JSONAdapter(timeJSON);
        TimeFutebolAdapter adapterXML = new XMLAdapter(timeXML);

        // Use os adaptadores para obter informações dos times
        System.out.println("Nome do Time JSON: " + adapterJSON.getNome());
        System.out.println("Ano de Fundacao do Time JSON: " + adapterJSON.getAnoFundacao());

        System.out.println("Nome do Time XML: " + adapterXML.getNome());
        System.out.println("Ano de Fundacao do Time XML: " + adapterXML.getAnoFundacao());
    }
}
