// 4. Orientação a Objetos:

// JavaScript (Prototipagem e Flexibilidade): JavaScript permite criar objetos sem classes, usando protótipos ou a palavra-chave class.

class Pessoa_POO {
    constructor(nome) {
        this.nome = nome;
    } saudacao() {
        console.log("Olá,meu nome é " + this.nome);
    }
}
const pessoa = new Pessoa_POO("Carlos");
pessoa.saudacao();