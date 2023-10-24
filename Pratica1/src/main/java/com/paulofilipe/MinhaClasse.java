package src.main.java.com.paulofilipe;

import java.util.ArrayList;

public class MinhaClasse {
    public Dupla<Double, Double> metodo(ArrayList<Double> ins, ArrayList<Double> outs) {
        Integer e = 2000;
        Double lr = 0.025;

        return metodo(ins, outs, e, lr);
    }

    public Dupla<Double, Double> metodo(ArrayList<Double> ins, ArrayList<Double> outs, Integer e) {
        Double lr = 0.025;

        return metodo(ins, outs, e, lr);
    }

    public Dupla<Double, Double> metodo(ArrayList<Double> ins, ArrayList<Double> outs, Integer e, Double lr) {
        double w0 = 0.0;
        double w1 = 0.0;
        Double p;
        Double dif;

        for (int i = 0; i < e; i++) {
            for (int j = 0; j < ins.size(); j++) {
                p = w1 * ins.get(j) + w0;
                dif = outs.get(j) - p;
                w0 += dif * lr;
                w1 += dif * lr * ins.get(j);
            }
            if (i % 10 == 0) {
                System.out.println("e: " + i + " w1: " + w1 + " w0: " + w0);
            }
        }

        Dupla<Double, Double> result = new Dupla<>();
        result.setPrimeiro(w1);
        result.setSegundo(w0);
        return result;
    }

}
