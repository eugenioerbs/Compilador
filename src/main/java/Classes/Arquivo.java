/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

    public Arquivo() {

    }// construtor

    //recebe o caminho do arquivo que será lido
    public String ler(String caminho) throws Exception {
        //local onde será guardado o conteúdo linha por linha do arquivo
        StringBuilder conteudo = new StringBuilder();
//bufferReader lê o arquivo linha por linha              -> fileReader abre o arquivo
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {
            //possuí o conteúdo da linha atual
            String linha;
            
            //coloca o conteúdo lido na variável criada
            //enquanto ela NÃO FOR nula, executa a leitura da próxima
            while ((linha = leitor.readLine()) != null) {
                //adiciona a linha lida no StringBuilder e no final pula p/ de baixo \n
                conteudo.append(linha).append("\n");
            }
        }
       
        //transforma em string normal e retorna
        return conteudo.toString();
    }
    

    public void salvar(String caminho, String conteudo) throws IOException {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho))) {
            escritor.write(conteudo);
        } catch (IOException erro) {
            throw erro;
        }
    }

}// class
