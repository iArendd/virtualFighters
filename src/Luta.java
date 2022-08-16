import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    //METHODS

    public void marcarLuta(Lutador L1, Lutador L2){

        if(L1.getCategoria().equals(L2.getCategoria()) && L1 != L2){
            
            this.setAprovada(true);
            this.setDesafiado(L1);
            this.setDesafiante(L2);

        }else{

            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);

        }

    }

    public void lutar(){

       if(this.getAprovada()){

            System.out.println("---DESAFIADO---");
            this.desafiado.apresentar();
            System.out.println("---DESAFIANTE---");
            this.desafiante.apresentar();

            Random aleatorio = new Random();

            int vencedor = aleatorio.nextInt(3);

            System.out.println("====RESULTADO DA LUTA====");

            switch(vencedor){

                case 0: //Empate

                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();

                break;

                case 1: //Desafiado vence

                    System.out.println("O lutador " + this.desafiado.getNome() + " venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    
                break;

                case 2: //Desafiante vence

                    System.out.println("O lutador " + this.desafiante.getNome() + " venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();

                break;

            }

            System.out.println("================");

       }else{

            System.out.println("A luta não está aprovada.");
       
        } 


    }

    //GETTERS N SETTERS

    public Lutador getDasafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    


}
