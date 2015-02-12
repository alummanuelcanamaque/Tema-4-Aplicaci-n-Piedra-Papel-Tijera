
import java.awt.Color;
import java.util.Random;


/**
 * Clase Juego que simula el juego piedra, papel, tijera.
 * 
 * @author Manuel Cañamaque
 */
public class Juego {
    /**
     * Constante para jugar a Piedra
     */
    public static final int PIEDRA = 1;
    
    /**
     * Constante para jugar a Papel
     */
    public static final int PAPEL = 2;
    
    /**
     * Constante para jugar a Tijera
     */
    public static final int TIJERA = 3;
    
    /**
     * Constante para jugar a Lagarto
     */
    public static final int LAGARTO = 4;
    
    /**
     * Constante para jugar a Spock
     */
    public static final int SPOCK = 5;
    
    private static int estilo_Juego;   
    private static int numero_Partidas = 1;
    private static int partidas_Ganadas = 0;
    private static int partidas_Perdidas = 0;    
    private static String nombre = "Jugador";
    private static Color color;      
    private static int movimiento_Jugador;
    private static int movimiento_Maquina;    
    
    /**
     * Método para establecer el nombre del jugador.
     * @param nombre El nombre del jugador.
     */
    public static void setNombre(String nombre) {
        Juego.nombre = nombre;
    }

    /**
     * Método para obtener el nombre del jugador.
     * @return El nombre del jugador
     */
    public static String getNombre() {
        return nombre;
    }

    /**
     * Método para estrablecer el color del jugador.
     * @param color El color deseado.
     */
    public static void setColor(Color color) {
        Juego.color = color;
    }

    /**
     * Método para obtener el color del jugador.
     * @return El color del jugador.
     */
    public static Color getColor(){
        return color;
    }

    /**
     * Método para elegir el movimiento que realizará el jugador.
     * @param movimiento Movimiento a realizar, PIEDRA=1, PAPEL=2, TIJERA=3,
     * LAGARTO=4, SPOCK=5.
     */
    public static void setMovimientoJugador(int movimiento){
        movimiento_Jugador=movimiento;
    }

    /**
     * Método para obtener un int con el movimiento del jugador.
     * @return El movimiento del jugador, PIEDRA=1, PAPEL=2, TIJERA=3,
     * LAGARTO=4, SPOCK=5.
     */
    public static int getMovimientoJugador(){
        return movimiento_Jugador;
    } 
    
    /**
     * Método para obtener el movimiento del jugador como String.
     * @return String con el movimiento del jugador.
     */
    public static String getMovimientoJugadorToString(){
        String movimiento="";
        switch(movimiento_Jugador){
            case 1:               
                
                movimiento = "Piedra";
                break;
            case 2:
                movimiento = "Papel";
                break;
            case 3: 
                movimiento = "Tijera";
                break;
            case 4:
                movimiento = "Lagarto";
                break;
            case 5:
                movimiento = "Spock";
                break;            
        }
        return movimiento;
    }
    /**
     * Método para elegir el movimiento que realizará la maquina aleatoriamente,
     * en función del estilo de juego.
     * @param estilo_Juego Estilo de juego, 0=PIEDRA, PAPEL, TIJERA.
     * 1=PIEDRA, PAPEL, TIJERA, LAGARTO, SPOCK.
     */
    public static void setMovimientoMaquina(int estilo_Juego){
        if(estilo_Juego==0){
            movimiento_Maquina=new Random().nextInt(3)+1;
        }else{
            movimiento_Maquina=new Random().nextInt(5)+1;            
        }
    }
    
    /**
     * Método para obtener un int con el movimiento de la maquina.
     * @return El movimiento de la maquina, PIEDRA=1, PAPEL=2, TIJERA=3,
     * LAGARTO=4, SPOCK=5.
     */
    public static int getMovimientoMaquina(){
        return movimiento_Maquina;
    }
    
    /**
     * Método para obtener el movimiento de la maquina como String.
     * @return String con el movimiento de la maquina.
     */
    public static String getMovimientoMaquinaToString(){
        String movimiento="";
        switch(movimiento_Maquina){
            case 1: 
                movimiento = "Piedra";
                break;
            case 2:
                movimiento = "Papel";
                break;
            case 3: 
                movimiento = "Tijera";
                break;
            case 4:
                movimiento = "Lagarto";
                break;
            case 5:
                movimiento = "Spock";
                break;            
        }
        return movimiento;
    }
    
    /**
     * Método para establecer el estilo de juego.
     * @param estilo_Juego Estilo de juego, 0=PIEDRA, PAPEL, TIJERA.
     * 1=PIEDRA, PAPEL, TIJERA, LAGARTO, SPOCK.
     */
    public static void setEstiloJuego(int estilo_Juego) {
        Juego.estilo_Juego = estilo_Juego;
    }
    
    /**
     * Método para obtener un int con el estilo de juego.
     * @return Estilo de juego, 0=PIEDRA, PAPEL, TIJERA.
     * 1=PIEDRA, PAPEL, TIJERA, LAGARTO, SPOCK.
     */
    public static int getEstiloJuego() {
        return estilo_Juego;
    }

    /**
     * Método para establecer el número de partidas, comprobando
     * que sea un número impar.
     * @param numero_Partidas Cantidad de partidas.
     */
    public static void setNumeroPartidas(int numero_Partidas) {
        if(numero_Partidas%2!=0){
            Juego.numero_Partidas = numero_Partidas;
        }else{
            System.out.println("Introduzca un numero de partidas impar");
        }
    }    

    /**
     * Método para obtener el numero de partidas.
     * @return Cantidad de partidas.
     */
    public static int getNumeroPartidas() {
        return numero_Partidas;
    }
     
    /**
     * Método para obtener el numero de partidas ganadas.
     * @return El número de partidas ganadas.
     */
    public static int getPartidasGanadas() {
        return partidas_Ganadas;
    }

    /**
     * Método para obtener el numero de partidas perdidas..
     * @return El número de partidas perdidas.
     */
    public static int getPartidasPerdidas() {
        return partidas_Perdidas;
    }
    
    /**
     * Método para comprobar si ha finalizado el juego..
     * @return "true" si ha acabado el juego o "false" si no se ha acabado.
     */
    public static boolean finJuego(){        
        if(((numero_Partidas+1)/2==partidas_Ganadas)|| ((numero_Partidas+1)/2==partidas_Perdidas)){
            System.out.println(""+numero_Partidas);
            return true;
        }else{
            return false;
        }        
    }
    
    /**
     * Método que reinicia la cantidad de partidas ganadas y perdidas.
     */
    public static void reiniciarJuego(){        
        partidas_Ganadas = 0;
        partidas_Perdidas = 0;
    }
    
    /**
     * Método que compara las partidas ganadas y perdidas.
     * @return String con el ganador.
     */
    public static String ganadorToString(){
        String ganador_String;
        if(partidas_Ganadas>partidas_Perdidas){
            ganador_String = Juego.getNombre();
        }else{
            if(partidas_Ganadas<partidas_Perdidas){
                ganador_String = "Maquina";
            }else{
                ganador_String = "Empate";
            }
        }
        return ganador_String;
    }

    
        
    /**
     * Método que compara los movimientos del jugador y de la maquina,
     * añade la la victoria a las partidas ganadas/perdidas.
     * @return String con el nombre del ganador.
     */
    public static String compararJugadas(){        
        String ganador_String="";
        int ganador = 0;
        setMovimientoMaquina(estilo_Juego);
        switch(getMovimientoJugador()){
            case 1:
                if(getMovimientoMaquina()==3 || getMovimientoMaquina()==4){
                    ganador=1;
                }
                if(getMovimientoMaquina()==2 || getMovimientoMaquina()==5){
                    ganador=2;
                }
                break;
            case 2:
                if(getMovimientoMaquina()==1 || getMovimientoMaquina()==5){
                    ganador=1;
                }
                if(getMovimientoMaquina()==3 || getMovimientoMaquina()==4){
                    ganador=2;
                }
                break;
            case 3:
                if(getMovimientoMaquina()==2 || getMovimientoMaquina()==4){
                    ganador=1;
                }
                if(getMovimientoMaquina()==1 || getMovimientoMaquina()==5){
                    ganador=2;
                }
                break;
            case 4:
                if(getMovimientoMaquina()==2 || getMovimientoMaquina()==5){
                    ganador=1;
                }
                if(getMovimientoMaquina()==1 || getMovimientoMaquina()==3){
                    ganador=2;
                }
                break;
            case 5:
                if(getMovimientoMaquina()==1 || getMovimientoMaquina()==3){
                    ganador=1;
                }
                if(getMovimientoMaquina()==2 || getMovimientoMaquina()==4){
                    ganador=2;
                }
                break;
           }
        
        if(ganador==1){
            partidas_Ganadas=partidas_Ganadas+1;
        }else{
            if(ganador==2){
                partidas_Perdidas=partidas_Perdidas+1; 
            }
        }
        switch(ganador){
            case 0:
                ganador_String = "Empate";
                break;
            case 1:
                ganador_String = "Gana el Jugador";
                break;
            case 2: 
                ganador_String = "Gana la Maquina";
                break;    
        }        
        return ganador_String;
    
    }
}
