package poop7;


/**
 * @author EIMV
 * 
 */

public class Ballena extends AnimalAcuatico{
  
    private int largo;

    public Ballena() {
    }

    public Ballena(int largo, int numAletas, String nombre, String lugarOrigen, String color){
        super(numAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void pelearConPinocho(){
        System.out.println("Estoy peleando con Pinocho");
    }

    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + " " + super.toString() +'}';
    }
    
    
}
