package com.paulofilipe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Util util = new Util();

        System.out.println("Digite o CPF: ");
        String cpfStr = scanner.nextLine();

        cpfStr = cpfStr.replace(".", "");
        cpfStr = cpfStr.replace("-", "");

        //long cpf = Long.parseLong(cpfStr);

        if(util.validarCpf(cpfStr)){
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }
    }
}