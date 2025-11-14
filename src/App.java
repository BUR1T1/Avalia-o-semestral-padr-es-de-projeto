import Tarefa01.CriadorRelatorio;
import Tarefa01.CriadorRelatorioDiario;
import Tarefa01.CriadorRelatorioSemanal;
import Tarefa02.CalculadoraRisco;
import Tarefa02.ModeloAgressivo;
import Tarefa02.ModeloConservador;
import Tarefa02.ModeloModerado;

public class App {
    public static void main(String[] args) throws Exception {

    /* 
        CriadorRelatorio criadorDiario = new CriadorRelatorioDiario();
        CriadorRelatorio criadorSemanal = new CriadorRelatorioSemanal();

        System.out.println("--- Relatório Diário ---");
        criadorDiario.gerar();

        System.out.println("\n--- Relatório Semanal ---");
        criadorSemanal.gerar();*/

        CalculadoraRisco calculadora = new CalculadoraRisco();

        calculadora.setEstrategia(new ModeloAgressivo());
        System.out.println("Risco (Agressivo): " +
                calculadora.calcular(200000, 8000, 30));

        calculadora.setEstrategia(new ModeloModerado());
        System.out.println("Risco (Moderado): " +
                calculadora.calcular(200000, 8000, 30));

        calculadora.setEstrategia(new ModeloConservador());
        System.out.println("Risco (Conservador): " +
                calculadora.calcular(200000, 8000, 30));
    }

}

