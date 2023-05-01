package com.mycompany.pronosticosdeportivos1;

import java.util.ArrayList;

/**
 *
 * @author jul
 */
public class Ronda {
    
    private String numero;
    private ArrayList<PartidoJugado> partidos;
    
    Ronda (String numero){
        this.numero = numero;
        this.partidos = new ArrayList();
    }
            
    //Se supone que el orden de los distintos items en cada resultado de partidos y de pronósticos es fijo y no variará nunca y que la primera fila son titulos.
    public void leerRonda(String ruta){
        
        LectorArchivos lectorArchivos = new LectorArchivos();
        
        ArrayList<String[]> renglonesParseados;
        renglonesParseados = lectorArchivos.leerArchivo(ruta);
        
        Equipo equipo1;
        Equipo equipo2;
        
        for (String[] i : renglonesParseados){
            //System.out.println(i.toString() + "\n");
            for (String j : i){
                System.out.print(j + "||");       
            }
            System.out.println("-------");
            
            //para etapa 2: los equipos se crean solo en ronda 1. En rondas siguientes, se obtienen y busccan los existentes para crear el partido.
            /*System.out.println("i: " + i);
            System.out.println("i: " + i.toString());
            System.out.println("i[1]: "+i[1]);
            System.out.println("i[2]: "+i[2]);*/
            equipo1 = new Equipo(i[0], i[1], i[2]);
            //System.out.println("i[6]: "+i[6]);
            //System.out.println("i[7]: "+i[7]);
            equipo2 = new Equipo(i[5], i[6], i[7]);
            
            PartidoJugado partidoJugado = new PartidoJugado(equipo1,equipo2,Integer.parseInt(i[3]),Integer.parseInt(i[4]));
            this.partidos.add(partidoJugado);
            //System.out.println(this.partidos.toString() + "\n");
        }
        
    }

    
    //public int puntos()

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the partidos
     */
    public ArrayList<PartidoJugado> getPartidos() {
        return partidos;
    }

    /**
     * @param partidos the partidos to set
     */
    public void setPartidos(ArrayList<PartidoJugado> partidos) {
        this.partidos = partidos;
    }
}
