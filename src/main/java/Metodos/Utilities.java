/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Luis
 */
public class Utilities {

    public static void main(String[] args) {
        System.out.println(getResume("Temor intenso! irracional:( de carácter enfermizo hacia una persona,"
                + " una cosa o una situación"));
        String texto = "Dicen que la suerte surge proporcionalmente a tu sudor cuanto más sudes más suerte tendrás";
        System.out.println(capitalizar(texto));
        System.out.print(contarCoincidencias("Pablito clavó un clavito, ¿qué clavito clavó Pablito?, "
                + "el clavito que Pablito clavó, era el clavito de Pablito.", "Pablito"));
    }

    /**
     *
     * @param texto Es un string que contiene una cadena de texto.
     * @return Este metodo retorna una cadena de texto, donde cuentas las
     * primeras 30 caracteres.
     */
    public static String getResume(String texto) {
        char caracter = ' ';
        String frase = "";
        int contador = 30;

        for (int i = 0; i < contador; i++) {
            caracter = texto.charAt(i);
            frase += caracter;
        }
        return frase;
    }

    /**
     *
     * @param texto Es una variable String donde va una cadena de texto.
     * @return Este metodo consiste en que cada letra inicial de una palabra la
     * convierte en mayuscula.
     */
    public static String capitalizar(String texto) {
        char[] caracteres = texto.toCharArray();

        for (int i = 0; i < texto.length(); i++) {
            caracteres[0] = Character.toUpperCase(caracteres[0]);
            if (caracteres[i] == ' ') {
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
            }
        }
        texto = String.valueOf(caracteres);
        texto = (texto.replace("  ", " "));
        return texto;
    }

    /**
     *
     * @param frase Es una variable tipo String que guarda una palabra la cual
     * se acumula.
     * @param texto Es una variable tipo String donde debe contener uan cadena
     * de texto.
     * @return Este metodo retorno el numero de las letras que se repiten en un
     * texto.
     */
    public static int contarCoincidencias(String frase, String texto) {
        int contador = 0;

        while (frase.indexOf(texto) > -1) { //indexof devuelve el primer indice de la posicion del caracter o cadena buscar
            frase = frase.substring(frase.indexOf(texto) + texto.length(), frase.length()); //substring devuelve una cadena de texto
            contador++;
        }
        return contador;
    }
}

