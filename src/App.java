public class App {
    public static void main(String[] args){

        //DEFININDO LUTADORES

            Lutador L[] = new Lutador[6];
            
            L[0] = new Lutador(
                
                "Pretty Boy", 
                "França", 
                31, 
                1.75f, 
                68.9f, 
                11, 
                2, 
                1
                
            );

            L[1] = new Lutador(
                
                "Putscript", 
                "Brasil", 
                29, 
                1.68f, 
                57.8f, 
                14, 
                2, 
                3
                
            );

            L[2] = new Lutador(
                
                "Snapshadow", 
                "EUA", 
                35, 
                1.65f, 
                80.9f, 
                12,
                2, 
                1
                
            );
            
            L[3] = new Lutador(
                
                "Dead Code", 
                "Austrália", 
                28, 
                1.93f, 
                81.6f, 
                13, 
                0, 
                2
                
            );
            
            L[4] = new Lutador(
                
                "UFOCobol", 
                "Brasil", 
                37, 
                1.70f, 
                119.2f, 
                5, 
                4, 
                3
                
            );
            
            L[5] = new Lutador(
                
                "Nerdaart", 
                "EUA",  
                30, 
                1.81f, 
                105.7f, 
                12, 
                2, 
                4
                
            );

        //INICIAR LUTA
            
            Luta UEC01 = new Luta();
            
            UEC01.marcarLuta(L[0], L[1]);
            UEC01.lutar();
            L[0].status();
            L[1].status();
        
    }

}
