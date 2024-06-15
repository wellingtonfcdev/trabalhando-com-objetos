package br.com.wellingtondev.curriculo;

import java.util.Arrays;

public class Curriculo {
    
    public String nome = "Wellington Feijó da Costa";
    public int idade = 39;
    public String[] competencias = { "Java" };
    public String[] experiencias = { "Desenvolvedor Java"};

    public String sobreMin(){
        return "Olá, eu sou " + nome + ", tenho " + idade + " anos, trabalho com "+ Arrays.toString(competencias) +
        ", e minhas experiências foram " + Arrays.toString(experiencias);
    }
}
