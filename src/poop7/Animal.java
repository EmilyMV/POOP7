package poop7;

/**
 * @author EIMV
 * Es un animal con nombre, lugar de origen y color
 */

public class Animal {
    /**
     * @param nombre: el nombre del animal
     * @param lugarOrigen: lugar de origen del animal
     * @param color: color del animal
     */
    private String nombre, lugarOrigen,color;
    
    public Animal(){
    }

    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    
    /**
     * metodo get
     * @return nombre: el nombre del animal
     */   
    public String getNombre(){
        return nombre;
    }
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @param lugarOrigen 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /**
     * 
     * @return lugarOrigen
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * 
     * @param sonido 
     */
    public void hacerSonido(String sonido){
        System.out.println("Sonido: "+sonido);
    }
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
    
}
