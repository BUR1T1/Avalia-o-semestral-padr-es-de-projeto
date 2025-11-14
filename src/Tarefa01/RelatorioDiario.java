package Tarefa01;

public class RelatorioDiario extends Relatorio {
    
    @Override
    public void coletarDados() {
        System.out.println("Coletando dados diários...");
    }

    @Override
    public void processarDados() {
        System.out.println("Processando métricas de operação diária...");
    }

    @Override
    public void gerarArquivo() {
        System.out.println("Gerando relatório diário em PDF...");
    }

}
