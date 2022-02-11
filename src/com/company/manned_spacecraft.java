package com.company;

public class manned_spacecraft extends spacecraft implements Ifuel {
    protected boolean crew ;

    /**
     * @param model Modelo de la nave
     * @param fuel Tipo de gasolina de la nave
     * @param crew Tirpulacion variable tipo booleano: false si no hay true si hay tripulacion
     */
    public manned_spacecraft(String model, String fuel, boolean crew) {
        super(model, fuel);
        this.crew=crew;
    }
    /**
     * @return retorna el valor ingreasado para saber si hay o no tripulacion
     */
    public boolean isCrew(){
        return crew;
    }

    /*se sobrescribe el comportamiento de la gasolina si esta lleno o vacio*/
    @Override
    public void full() {
        System.out.println("the spacecraft can take off because the fuel is full");
    }

    @Override
    public void empty() {
        System.out.println("the spacecraft cannot take off because the fuel is empty");
    }
    /*imprime los valores creados por el usuario*/
    @Override
    public String show(){
        return "model: "+model+ "\nfuel: "+fuel+"\ncrew: "+crew;

    }
}
