package Ficha_1.Exercicio_1_2_3;
import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;

public class FileW{
    public static void main(String[] args){
        try {
            Charset ENCONDING = StandardCharsets.UTF_8;
            Path path = Paths.get("linhas.txt");
            String linha =  "Exemplo de linha";
            List <String> linhas = new ArrayList<String>();
            for (int i = 0; i < 10 ; i++)
            linhas.add(""+i+":"+linha);
            Files.write(path, linhas, ENCONDING);
        }
        catch (IOException ex){
            System.out.println("Erro no Acesso do Ficheiro.");
        }
    }
}