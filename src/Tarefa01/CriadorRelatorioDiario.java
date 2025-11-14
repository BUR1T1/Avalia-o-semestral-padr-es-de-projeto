package Tarefa01;

public class CriadorRelatorioDiario extends CriadorRelatorio { 
   
    
    @Override
    public Relatorio criarRelatorio() { 
        return new RelatorioDiario(); 
    } 
}

