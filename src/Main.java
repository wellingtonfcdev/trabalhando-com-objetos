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

        // Double soma = Matematica.soma(90, 2);
        // Double somaNaoEstatica = new Matematica().somaNaoEstatica(90, 2);
        // System.out.println(soma);
        // System.out.println(somaNaoEstatica);
        
      Usuario u1 = new Usuario();
      u1.username = "u1";
      Usuario u2 = new Usuario();
      u2.username = "u1";

      System.out.println(u1.equals(u2));
    //   System.out.println(u1);
    //   System.out.println(u2);
    }
}
