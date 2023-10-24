package src.main.java.com.paulofilipe;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<Double> ins = new ArrayList<>();
        ArrayList<Double> outs = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int testToBeExecuted = scanner.nextInt();

        switch (testToBeExecuted) {
            case 1 -> {
                System.out.println("Teste 1");
                ins.add(1.0);
                ins.add(3.0);
                ins.add(5.0);
                outs.add(1.0);
                outs.add(3.0);
                outs.add(5.0);
                MinhaClasse mc = new MinhaClasse();
                Dupla<Double, Double> result = mc.metodo(ins, outs);
                // Print w1 and w0 with 3 decimal places
                System.out.printf("%.3f %.3f", result.getPrimeiro(), result.getSegundo());
            }
            case 2 -> {
                ins.add(1.0);
                ins.add(3.0);
                ins.add(5.0);
                outs.add(2.0);
                outs.add(4.0);
                outs.add(6.0);
                MinhaClasse mc2 = new MinhaClasse();
                Dupla<Double, Double> result2 = mc2.metodo(ins, outs);
                // Print w1 and w0 with 3 decimal places
                System.out.printf("%.3f %.3f", result2.getPrimeiro(), result2.getSegundo());
            }
            case 3 -> {
                ins.add(1.0);
                ins.add(3.0);
                ins.add(5.0);
                outs.add(3.0);
                outs.add(7.0);
                outs.add(11.0);
                MinhaClasse mc3 = new MinhaClasse();
                Dupla<Double, Double> result3 = mc3.metodo(ins, outs);
                // Print w1 and w0 with 3 decimal places
                System.out.printf("%.3f %.3f", result3.getPrimeiro(), result3.getSegundo());
            }
            case 4 -> {
                ins.add(1.0);
                ins.add(3.0);
                ins.add(5.0);
                outs.add(4.5);
                outs.add(12.5);
                outs.add(20.5);
                MinhaClasse mc4 = new MinhaClasse();
                Dupla<Double, Double> result4 = mc4.metodo(ins, outs);
                // Print w1 and w0 with 3 decimal places
                System.out.printf("%.3f %.3f", result4.getPrimeiro(), result4.getSegundo());
            }
            case 5 -> {
                ins.add(2.900000095);
                ins.add(6.699999809);
                ins.add(4.900000095);
                ins.add(7.900000095);
                ins.add(9.800000191);
                ins.add(6.900000095);
                ins.add(6.099999905);
                ins.add(6.199999809);
                ins.add(6.0);
                ins.add(5.099999905);
                ins.add(4.699999809);
                ins.add(4.400000095);
                ins.add(5.800000191);
                outs.add(4.0);
                outs.add(7.400000095);
                outs.add(5.0);
                outs.add(7.199999809);
                outs.add(7.900000095);
                outs.add(6.099999905);
                outs.add(6.0);
                outs.add(5.800000191);
                outs.add(5.199999809);
                outs.add(4.199999809);
                outs.add(4.0);
                outs.add(4.400000095);
                outs.add(5.199999809);
                MinhaClasse mc5 = new MinhaClasse();
                Dupla<Double, Double> result5 = mc5.metodo(ins, outs);
                // Print w1 and w0 with 3 decimal places
                System.out.printf("%.3f %.3f", result5.getPrimeiro(), result5.getSegundo());
            }
        }

    }
}