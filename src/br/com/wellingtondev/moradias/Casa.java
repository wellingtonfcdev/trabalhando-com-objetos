package br.com.wellingtondev.moradias;
public class Casa {
    
    public boolean inteligente;
    public String nome;

    public Casa(){

    }

    //construtor com parametros
    public Casa(boolean inteligente){
        this.inteligente = inteligente;
    }
    public void acenderLuz(){
        if(inteligente)
            System.out.println("Comando de voz");
        else    
            System.out.println("Pressionar interruptor");
    }
}
