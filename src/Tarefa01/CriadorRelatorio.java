package Tarefa01;

public abstract class CriadorRelatorio {

    public abstract Relatorio criarRelatorio();

    public void gerar() {
        Relatorio relatorio = criarRelatorio();
        relatorio.preparar();
    }

}

