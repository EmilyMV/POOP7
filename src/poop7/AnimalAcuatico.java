package poop7;

/**
 * @author EIMV
 */

public class AnimalAcuatico extends Animal{
    
    private int numAletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(int numAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numAletas = numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    public int getNumAletas() {
        return numAletas;
    }
    
    public void nadar(){
        System.out.println("Estoy nadando");
    }
    
    @Override
    public void comer() {
        System.out.println("Estoy comiendo crill");
    }
    
    @Override
    public String toString() {
        return "AnimalAcuatico{" + "Num-Aletas=" + numAletas +" "+ super.toString() +'}';
    }
    
}
