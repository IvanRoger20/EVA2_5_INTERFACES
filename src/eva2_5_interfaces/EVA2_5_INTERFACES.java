/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_interfaces;

/**
 *
 * @author IvanTron
 */
public class EVA2_5_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona yo = new Persona();
        yo.setNombre("Ivan");
        yo.setEdad(22);
        yo.imprimirDatos();
        
        Vehiculo miCarro = new Vehiculo();
        miCarro.setMarca("Nissan");
        miCarro.setModelo("Aprio");
        miCarro.imprimirDatos();
        miCarro.mostrarMensaje();
    }
    
}

class Persona implements MuestraDatos{
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    
    
}

class Vehiculo implements MuestraDatos,Mensaje {
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void imprimirDatos() {
        System.out.println("Marca: " +  this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
    
    @Override
    public void mostrarMensaje() {
        System.out.println("Hola Mundo");
    }
    
    
}

interface MuestraDatos {
    public void imprimirDatos();
}

interface Mensaje {
    public void mostrarMensaje();
}