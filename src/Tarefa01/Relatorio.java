package Tarefa01;

public abstract class Relatorio { 
    
    public abstract void coletarDados();
    public abstract void processarDados(); 
    public abstract void gerarArquivo();
    
        public final void preparar() {
            coletarDados();
            processarDados();
            gerarArquivo();
        }
    
    }
    