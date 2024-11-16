// 5. Execução Assíncrona:

// Java (Threads): Java lida com tarefas assíncronas principalmente através de threads.

public class Execucao_Assincrona extends Thread {
    public void run() {
        System.out.println("Tarefa emsegundo plano em Java!");
    }

    public static void main(String[] args) {
        Execucao_Assincrona tarefa = new Execucao_Assincrona();
        tarefa.start(); // Inicia a thread
    }
}
