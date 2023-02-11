package oop;

import javax.xml.namespace.QName;


public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();
        double salario = folha.calcularSalario(160, 20, 10, 15);
        System.out.println("Salário: " + salario);
    }
}
