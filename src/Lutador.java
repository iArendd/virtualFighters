public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;


    //CONSTRUCTOR

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {

        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    
    }


    //METHODS 

    public void apresentar(){

        System.out.println("-------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());        
        System.out.println("Com idade de " + this.getIdade() + " anos");       
        System.out.println("Com altura de " + this.getAltura() + " metros");        
        System.out.println("Com peso de " + this.getPeso() + " Kg");          
        System.out.println("Com " + this.getVitorias() + " vitorias");         
        System.out.println("Com " + this.getDerrotas() + " derrotas");
        System.out.println("Com " + this.getEmpates() + " empates");

    }

    public void status(){

        System.out.println(this.getNome());
        System.out.println("Categoria: Peso "   +  this.getCategoria());        
        System.out.println(this.getVitorias()   + " vitorias");         
        System.out.println(this.getDerrotas()   + " derrotas");
        System.out.println(this.getEmpates()    + " empates");

    }

    public void ganharLuta(){

        this.setVitorias(this.getVitorias() + 1);

    }

    public void perderLuta(){

        this.setDerrotas(this.getDerrotas() + 1);

    }

    public void empatarLuta(){

        this.setEmpates(this.getEmpates() + 1);

    }


    //GETTERS N SETTERS

    public String getNome() {

        return nome;

    }

    public void setNome(String no) {

        this.nome = no;

    }


    public String getNacionalidade() {

        return nacionalidade;

    }

    public void setNacionalidade(String na) {

        this.nacionalidade = na;

    }


    public int getIdade() {
        
        return idade;

    }

    public void setIdade(int id) {

        this.idade = id;

    }


    public float getAltura() {

        return altura;

    }

    public void setAltura(float al) {

        this.altura = al;

    }


    public float getPeso() {

        return peso;

    }

    public void setPeso(float pe) {

        this.peso = pe;

        setCategoria();

    }


    public String getCategoria() {

        return categoria;

    }

    private void setCategoria() {

        if(this.getPeso() < 52.2){

            this.categoria = "Invalido, peso abaixo do permitido";

        }else if(this.getPeso() <= 70.3){

                this.categoria = "Leve";

            }else if(this.getPeso() <= 83.9){

                    this.categoria = "Media";

                }else if(this.getPeso() <= 120.2){

                        this.categoria = "Pesado";

                    }else{

                        this.categoria = "Invalido, peso acima do permitido";

                    }
    }


    public int getVitorias() {

        return vitorias;

    }

    public void setVitorias(int vi) {

        this.vitorias = vi;

    }


    public int getDerrotas() {

        return derrotas;

    }

    public void setDerrotas(int de) {

        this.derrotas = de;

    }


    public int getEmpates() {

        return empates;

    }

    public void setEmpates(int em) {

        this.empates = em;

    }

    


}
