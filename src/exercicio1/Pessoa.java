package exercicio1;

public class Pessoa {
    private String nome;
    private String  altura;
    private int anoNascimento;


    public String getNome(){
        return this.nome;
    }
    public void setNome (String Nome){
        this.nome = Nome;
    }

    public String getAltura(){
        return this.altura;
    }
    public void setAltura (String Altura){
        this.altura = Altura;
    }


    public int getAno(){
        int anoNascimento = this.anoNascimento;
        return this.anoNascimento;
    }

    public void setAnoNascimento(double Ano){
        this.anoNascimento = (int) Ano;
    }


}








   