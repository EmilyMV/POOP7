package poop7;

import transportes.MediosDeTransportes;

/**
 * @author EIMV
 */

public class POOP7 {
    public static void main(String[] args) {
        Animal animal = new Animal("Max","Mexico","Cafe");
        Animal animal2 = new Animal();
        animal2.setNombre("Alicia");
        animal2.setLugarOrigen("Africa");
        animal2.setColor("amarilla con manchas cafe");
        
        System.out.println(animal.toString());
        System.out.println(animal2);
        
        AnimalAcuatico animalAcuatico = new AnimalAcuatico();
        animalAcuatico.setNombre("Leo");
        animalAcuatico.setLugarOrigen("Oceano Pacifico");
        animalAcuatico.setColor("Azul");
        animalAcuatico.setNumAletas(2);
        System.out.println(animalAcuatico.toString());
        
        Ballena ballena = new Ballena(30,2,"Willy","México","Gris");
        System.out.println(ballena);
        
        MediosDeTransportes mdt = new MediosDeTransportes();
        
        
    }
    
}
