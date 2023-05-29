//Nome: Italo Pereira Ventura -  RA: 2467259

public abstract class Atleta {

    private String nome;
    private String sobrenome;
    private int idade;
    private int rg;

    Delegacao d1 = new Delegacao();

    public Atleta() {
        nome = "";
        sobrenome = "";
        idade = 0;
        rg = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public Delegacao getD1() {
        return d1;
    }

    public final void setD1(Delegacao d1) {
        this.d1 = d1;
    }

}