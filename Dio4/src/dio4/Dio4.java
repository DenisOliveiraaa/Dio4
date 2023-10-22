package dio4;

public class Dio4 {

    public static void main(String[] args) {
        
        ComportamentoDenfensivo defensivo = new ComportamentoDenfensivo();
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoSgressivo agressivo = new ComportamentoSgressivo();
        ComportamentoRapido rapido = new ComportamentoRapido();

        Robo robo;
        robo = new Robo();
        
        //normal
        robo.setComportamento(normal);
        robo.mover();
        
        //defensivo
        robo.setComportamento(defensivo);
        robo.mover(); 
        
        //agressivo
        robo.setComportamento(agressivo);
        robo.mover(); 
        
        //rapido
        robo.setComportamento(rapido);
        robo.mover();
        
    }

}
