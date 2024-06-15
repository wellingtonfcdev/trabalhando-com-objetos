public class Matematica {

    public static final Double LIMITE_OPERACA_DOUBLE = 100.0; //SNAKE_CASE

  
    
    public static Double soma(double n1, double n2){
        double soma = n1 + n2;
        if (soma > LIMITE_OPERACA_DOUBLE)
            return LIMITE_OPERACA_DOUBLE;
        else return soma;
    }

    public Double somaNaoEstatica(double n1, double n2){
        double soma = n1 + n2;
        if(soma > LIMITE_OPERACA_DOUBLE)
            return LIMITE_OPERACA_DOUBLE;
        else return soma;
    }
}
