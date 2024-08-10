package com.contabancaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
try{

    writer.write("Digite a Agência:");
    writer.flush();
    String agencia = reader.readLine();




    writer.write("Digite o número da conta:");
    writer.flush();
    int num = Integer.parseInt(reader.readLine());

    writer.write("Digite o nome do cliente:");
    writer.flush();
    String nome = reader.readLine();


    writer.write("Digite o saldo da conta:");
    writer.flush();
    double saldo = Double.parseDouble(reader.readLine());


    ContaTerminal conta = new ContaTerminal(num, agencia, nome, saldo);

    writer.write("\nConta criada com sucesso!\n");
    writer.write("Número da Conta: " + conta.getNumero() + "\n");
    writer.write("Agência: " + conta.getAgencia() + "\n");
    writer.write("Nome do Cliente: " + conta.getNomeCliente() + "\n");
    writer.write("Saldo: " + conta.getSaldo() + "\n");
    writer.flush();  // Flush para garantir que todos os dados sejam exibidos

} catch (IOException e) {
    System.out.println("Erro de I/O: " + e.getMessage());
} catch (NumberFormatException e) {
    System.out.println("Erro: Entrada inválida. Por favor, insira valores numéricos onde aplicável.");
} catch (Exception e) {
    System.out.println("Erro: " + e.getMessage());
} finally {
    try {
        // Fechando os recursos
        reader.close();
        writer.close();
    } catch (IOException e) {
        System.out.println("Erro ao fechar os recursos: " + e.getMessage());
    }
    
}
}
}