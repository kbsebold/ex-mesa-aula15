package com.company;

import java.util.ArrayList;

public class Empresa {
    private String nomeEmpresa;
    private ArrayList<Veleiro> listaVeleiros = new ArrayList<>();
    private ArrayList<Iate> listaIates = new ArrayList<>();

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void adcVeleiro(Veleiro veleiro) {
        listaVeleiros.add(veleiro);
    }

    public void adcIate(Iate iate){
        listaIates.add(iate);
    }

    public void mostrarIates(){
        System.out.println(" ---------- Lista de Iates ----------");
        for (Iate iate: listaIates){
            System.out.println("Ano de Fabricação: " + iate.getAnoFab() + " Comprimento: " + iate.getComprimento() + " metros"
                    + " Quantidade de cabines: "+ iate.getQtdCabines());
        }
    }


    public void mostrarVeleiros(){
        System.out.println(" ---------- Lista de Veleiros ----------");
        for (Veleiro veleiro: listaVeleiros){
            System.out.println("Ano de Fabricação: " + veleiro.getAnoFab() + " Comprimento: " + veleiro.getComprimento() +
                    " metros" + " Quantidade de mastros: "+ veleiro.getQtdMastros());
        }
    }
}
