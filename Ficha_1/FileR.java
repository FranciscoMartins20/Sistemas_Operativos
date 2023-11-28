package Ficha_1;
import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;


public class FileR {
    public static void main(String[] args) {
        try {
            Charset ENCONDING = StandardCharsets.UTF_8;
            Path path = Paths.get("fich.txt");
            List<String> linhas = Files.readAllLines(path , ENCONDING);
            for(int i = 0; i < linhas.size(); i++) 
                System.err.println("Linha_n."+i+":"+linhas.get(i));

            } catch (IOException ex) {
                System.out.println("Erro no acesso do ficheiro");
            }
            }
        }
        
    
    

