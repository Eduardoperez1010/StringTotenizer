//Pérez Flores Eduardo Vicente
//Ingenieria en Sistemas Computacionales
//Compiladores
//Tematica:Tokenizer
//Uso de tokenizadores delimitadores de palabras
package tokenizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Tokenizer {

    public static BufferedReader archivolectura;

    public static void main(String[] args) {
        try {
            String nombre;
            String edad;
            String sexo;
            String ciudad;
            String lineadelarchivo;
            String encontrado = "";
            archivolectura = new BufferedReader(new FileReader("prueba.txt")); //leemos el archivo
            StringTokenizer token;//importamos Stringtokenizer y creamos el objeto llamado token
            while (archivolectura.ready()) {//leemos el archivo de entrada
                lineadelarchivo = archivolectura.readLine();//leer linea a linea el archivo
                token = new StringTokenizer(lineadelarchivo, "_");//tokenizamos 
                nombre = token.nextToken(); 
                edad = token.nextToken();
                sexo = token.nextToken();
                ciudad = token.nextToken();
                if (ciudad.equals("Eduardo")) {//comparamos lo del archivo con el nombre mencionado(Mexico)
                    encontrado = encontrado + " " + nombre + " " + edad + " " + sexo + " " + ciudad + "\n";
                }
            }
            System.out.println(encontrado);//imprime conicidencias
        } catch (IOException errorIO) {
            System.out.println(":(" + errorIO);
        }
    }
}
