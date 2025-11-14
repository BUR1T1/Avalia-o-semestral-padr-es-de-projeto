package Tarefa02;

public class ModeloAgressivo implements EstrategiaRisco {

    @Override
    public double calcular(double patrimonio, double rendaMensal, int idade) {
        
        return (patrimonio * 0.7) + (rendaMensal * 0.5) - (idade * 0.2);
    }
}