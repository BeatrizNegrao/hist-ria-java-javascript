// 4. Orientação a Objetos:

// Java (Classes e Objetos): Java usa classes e objetos para orientação a objetos de forma mais rígida.

public class Pessoa_POO {
    String nome;

    public Pessoa_POO(String nome) {
        this.nome = nome;
    }

    public void saudacao() {
        System.out.println("Olá, meu nome é " + nome);
    }

    public static void main(String[] args) {
        Pessoa_POO pessoa = new Pessoa_POO("Carlos");
        pessoa.saudacao();
    }
}
