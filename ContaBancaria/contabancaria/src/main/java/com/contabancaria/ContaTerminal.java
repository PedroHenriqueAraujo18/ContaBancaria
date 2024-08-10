package com.contabancaria;

public class ContaTerminal  {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;


    public ContaTerminal(int numero,String agencia, String nomeCliente, double saldo) throws Exception{
        if(numero <= 0){
            throw new Exception("Valor inválido para o tipo de conta!");
        }
        if( agencia.equals("")){
            throw new Exception("Não pode deixa o nome da agência vazio!");
        }
        if(nomeCliente.equals("")){
            throw new Exception("Não pode deixa o nome do cliente vazio!");
        }
        if(saldo < 0 ){
            throw new Exception("Não pode deixar o saldo menor que zero!");
        }
        this.agencia =agencia;
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.saldo = saldo;
        
    }

    public int getNumero(){
        return this.numero;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public double getSaldo(){
        return this.saldo;
    }


    public  int setNumero(int numero){
        this.numero = numero;
        return numero;
    }


    public  double setDouble(double saldo){
        this.saldo=saldo;
        return saldo;
    }

    public String setNomeCliente(String nomeCliente){
        this.nomeCliente=nomeCliente;
        return nomeCliente;
    }
    public String setAgencia(String agencia){
        this.agencia=agencia;
        return agencia;
    }

}
