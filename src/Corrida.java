/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Samuelson
 */
public class Corrida {
    
    private int carro;
    private String tempo_v1;
    private String tempo_v2;
    private String tempo_Total;

    public int getCarro() {
        return carro;
    }

    public void setCarro(int carro) {
        this.carro = carro;
    }

    public String getTempo_v1() {
        return tempo_v1;
    }

    public void setTempo_v1(String tempo_v1) {
        this.tempo_v1 = tempo_v1;
    }

    public String getTempo_v2() {
        return tempo_v2;
    }

    public void setTempo_v2(String tempo_v2) {
        this.tempo_v2 = tempo_v2;
    }

    public String getTempo_Total() {
        return tempo_Total;
    }

    public void setTempo_Total(String tempo_Total) {
        this.tempo_Total = tempo_Total;
    }
    
    @Override
    public String toString() {
        return getTempo_v1(); //To change body of generated methods, choose Tools | Templates.
    }
      
    
    
}
