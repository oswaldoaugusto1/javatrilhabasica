package exercicio1;

public class Dadospessoais {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Oswaldo");
        System.out.println(pessoa1.getNome());
        pessoa1.setAltura("1,95");
        System.out.println(pessoa1.getAltura());
        pessoa1.setAnoNascimento(1995);
        System.out.println(pessoa1.getAno());

        int idade = 2021 - pessoa1.getAno();

        System.out.println(idade);

    }
}
