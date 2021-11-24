package com.company;

public class Main {

    public static void main(String[] args) {
	Capitao capitao = new Capitao("Débora","Figueiró",1562);

    Iate iate1 = new Iate(2000,500,2021,10,
            4);
    Iate iate2 = new Iate(2000,500,2000,10,
                2);
    Veleiro veleiro1 = new Veleiro(1500,400,2014,5,
            3);
    Veleiro veleiro2 = new Veleiro(1500,400,2021,8,
                5);

    Empresa empresa = new Empresa("Navitur");


    empresa.adcIate(iate1);
    empresa.adcIate(iate2);
    empresa.adcVeleiro(veleiro1);
    empresa.adcVeleiro(veleiro2);

    empresa.mostrarIates();
    empresa.mostrarVeleiros();

    System.out.println( "O valor do aluguel do Iate1 é: R$" + iate1.calcularValorAluguel());
    System.out.println( "O valor do aluguel do Iate2 é: R$" + iate2.calcularValorAluguel());
    System.out.println( "O valor do aluguel do Veleiro1 é: R$" + veleiro1.calcularValorAluguel());
    System.out.println( "O valor do aluguel do Veleiro2 é: R$" + veleiro2.calcularValorAluguel());

    veleiro1.verificarTamanho();
    veleiro2.verificarTamanho();

    System.out.println(iate1.compareTo(iate2));
    System.out.println(iate2.compareTo(iate1));
    }
}
