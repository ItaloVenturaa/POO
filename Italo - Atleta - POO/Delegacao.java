//Nome: Italo Pereira Ventura -  RA: 2467259

public class Delegacao {

    private String rua;
    private int numcasa;
    private int idatleta;
    private int telresponsavel;

    public Delegacao() { // Default
        rua = "";
        numcasa = 0;
        idatleta = 0;
        telresponsavel = 0;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(int numcasa) {
        this.numcasa = numcasa;
    }

    public int getIdatleta() {
        return idatleta;
    }

    public void setIdatleta(int idatleta) {
        this.idatleta = idatleta;
    }

    public int getTelresponsavel() {
        return telresponsavel;
    }

    public void setTelresponsavel(int telresponsavel) {
        this.telresponsavel = telresponsavel;
    }

}
