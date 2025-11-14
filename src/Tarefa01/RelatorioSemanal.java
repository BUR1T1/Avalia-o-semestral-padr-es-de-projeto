package Tarefa01;

public class RelatorioSemanal extends Relatorio {

    @Override
    public void coletarDados() {
        System.out.println("Coletando dados semanais...");
    }

    @Override
    public void processarDados() {
        System.out.println("Processando tendências da semana...");
    }

    @Override
    public void gerarArquivo() {
        System.out.println("Gerando relatório semanal em Excel...");
    }

}
