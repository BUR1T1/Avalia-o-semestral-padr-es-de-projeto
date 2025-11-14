package Tarefa02;

public class ModeloModerado implements EstrategiaRisco{
    
    @Override
    public double calcular(double patrimonio, double rendaMensal, int idade){

    return (patrimonio * 0.5) + (rendaMensal * 0.3) + (idade * 2);
    }
}