package com.company;

public class Iate extends Embarcacao implements Comparable<Iate> {
    private int qtdCabines;

    public Iate(double preco, double valorAdc, int anoFab,
                int comprimento, int qtdCabines) {
        super(preco, valorAdc, anoFab, comprimento);
        this.qtdCabines = qtdCabines;
    }

    public int getQtdCabines() {
        return qtdCabines;
    }

    @Override
    public int compareTo(Iate o) {
        if (o.qtdCabines == this.qtdCabines){
            return 0;
        } else if (o.qtdCabines < this.qtdCabines){
            return 1;
        } else {
            return -1;
        }
    }


    public double calcularValorAluguel(){
        if (getAnoFab() > 2020) {
            return getPreco() + getValorAdc();
        } else {
            return getPreco();
        }

    }

}
