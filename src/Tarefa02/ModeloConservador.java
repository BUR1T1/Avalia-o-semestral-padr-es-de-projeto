package Tarefa02;

public class ModeloConservador implements EstrategiaRisco {
 
    @Override
    public double calcular(double patrimonio, double rendaMensal, int idade){

        return (patrimonio * 0.2)+(rendaMensal * 0.1)+(idade * 0.5);
    }
}
