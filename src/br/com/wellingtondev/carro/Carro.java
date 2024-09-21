package br.com.wellingtondev.carro;
public class Carro {
    
    public String modelo = "Fiat Idea";
    public Integer ano = 2010;
    public String cor = "Prata";
    public Integer velocidade = 10;
    public Carro(String modelo, Integer ano, String cor, Integer velocidade) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public String getDetalhes(){
        return "Carro: " + modelo + ", ano: " + ano + ", cor: " + cor + ", velocidade: " + velocidade;
    }
}
