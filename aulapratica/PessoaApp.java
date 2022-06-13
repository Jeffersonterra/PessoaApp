package aulapratica;

public class PessoaApp {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Jefferson");
        Pessoa pessoa2 = new Pessoa(2, "Serena");
        System.out.println("O nome da pessoa eh: " + pessoa1.getNome());
        System.out.println("O nome da pessoa dois eh: " + pessoa2.getNome());
    }

}
