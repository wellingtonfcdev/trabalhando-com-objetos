import br.com.wellingtondev.moradias.Casa;

public class Main {
    public static void main(String[] args) {
        
        // Casa casa1 = new Casa(false);
        // Casa casa2 = new Casa(true);
        // Casa casa3 = new Casa();

        // casa1.acenderLuz();
        // casa2.acenderLuz();
        // casa3.acenderLuz();

        

        // casa3.nome = "Minha casa";
        // System.out.println(casa3.nome);

        Double soma = Matematica.soma(90, 2);
        Double somaNaoEstatica = new Matematica().somaNaoEstatica(90, 2);
        System.out.println(soma);
        System.out.println(somaNaoEstatica);

    }
}
