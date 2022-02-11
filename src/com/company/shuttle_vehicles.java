package com.company;

public class shuttle_vehicles extends spacecraft implements Ifuel{
    private int weight;

    /**
     *Constructor de la clase vehiculo lanzadera
     * @param model modelo de la nave
     * @param fuel tipo de gasolina de la nave
     * @param weight peso de la nave
     */
    public shuttle_vehicles(String model, String fuel, int weight) {
        super(model, fuel);
        this.weight=weight;
    }

    public int getweight(){
        return weight;
    }


    @Override
    public void full() {
        System.out.println("the spacecraft can take off because the fuel is full");
    }
    @Override
    public void empty() {
        System.out.println("the spacecraft cannot take off because the fuel is empty");
    }

    @Override
    public String show(){
        return "model: "+model+ "\nfuel: "+fuel+"\nweight: "+weight+" Toneladas";

    }

}
