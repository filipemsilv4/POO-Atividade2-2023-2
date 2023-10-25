package com.paulofilipe;

public class Util {
    public int obterDigito(long cpf, int posicao){
        String cpfStr = String.valueOf(cpf);
        try {
            return Integer.parseInt(String.valueOf(cpfStr.charAt(posicao)));
        } catch (Exception e) {
            return 0;
        }
    }

    public boolean validarCpf(String cpf) {

        int soma = 0;
        int digito1 = 0;
        int digito2 = 0;

        for(int i = 0; i < 9; i++){
            soma += obterDigito(Long.parseLong(cpf), i) * (10 - i);
        }

        digito1 = 11 - (soma % 11);

        if(digito1 > 9){
            digito1 = 0;
        }

        soma = 0;

        for(int i = 0; i < 10; i++){
            soma += obterDigito(Long.parseLong(cpf), i) * (11 - i);
        }

        digito2 = 11 - (soma % 11);

        if(digito2 > 9){
            digito2 = 0;
        }

        return digito1 == obterDigito(Long.parseLong(cpf), 9) && digito2 == obterDigito(Long.parseLong(cpf), 10);
    }

    public boolean validarCpf(long cpf) {
        return validarCpf(String.valueOf(cpf));
    }
}
