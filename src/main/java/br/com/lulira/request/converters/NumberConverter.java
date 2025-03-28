package br.com.lulira.request.converters;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) throw new UnsupportedOperationException("pleas set a numeric value!");
        String number = strNumber.replace(",", "."); // troca a virgula das casas decimais pelo ponto, padrão americano.

        return Double.parseDouble(number);

    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", "."); // troca a virgula das casas decimais pelo ponto, padrão americano.
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }
}
