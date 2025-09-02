package org.example;

public class ConvertBinarioToDecimal {
    public static void main(String[] args) {


        if (args.length != 5) {
            System.out.println("Argumentos incorretos. Forneça exatamente 5 dígitos binários (0 ou 1).");
            System.out.println("Exemplo de uso: java ConvertBinarioToDecimal 1 0 1 0 1");
            return;
        }



                for (int i = 0; i < args.length; i++) {
                    if (!args[i].equals("0") && !args[i].equals("1")) {
                        System.err.println("Erro: Argumento inválido na posição " + (i + 1) +
                                ": '" + args[i] + "'. Deve ser 0 ou 1.");
                        System.exit(1);
                    }
                }

               
                int decimal = 0;
                for (int i = 0; i < args.length; i++) {
                    int bit = Integer.parseInt(args[i]);
                    // O bit mais significativo está na posição 0 (esquerda)
                    // Potência = 4 - i (pois temos 5 bits: 2^4, 2^3, 2^2, 2^1, 2^0)
                    int potencia = 4 - i;
                    decimal += bit * Math.pow(2, potencia);
                }

                // Exibe o resultado
                System.out.println(decimal);
            }
        }





