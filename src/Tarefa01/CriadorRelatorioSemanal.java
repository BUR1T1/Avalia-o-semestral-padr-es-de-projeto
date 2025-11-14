package Tarefa01;

public class CriadorRelatorioSemanal extends CriadorRelatorio {

    
    @Override public Relatorio criarRelatorio() {
         return new RelatorioSemanal();
        }
     }
    