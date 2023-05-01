package com.mycompany.pronosticosdeportivos1;

import java.util.ArrayList;

/**
 *
 * @author jul
 */
public class Pronosticos {
    
    private String participante;
    private ArrayList<UnPronostico> pronosticos;
    
    Pronosticos (String participante){
        this.participante = participante;
        this.pronosticos = new ArrayList();
    }
            
    //Se supone que el orden de los distintos items en cada resultado de partidos y de pronósticos es fijo y no variará nunca y que la primera fila son titulos.
    public void leerPronosticos(String ruta){
        
        LectorArchivos lectorArchivos = new LectorArchivos();
        
        ArrayList<String[]> renglonesParseados;
        renglonesParseados = lectorArchivos.leerArchivo(ruta);
        
        //Equipo equipo1;
        //Equipo equipo2;
        
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
            //          equipo1 = new Equipo(i[1], i[2]);
            //System.out.println("i[6]: "+i[6]);
            //System.out.println("i[7]: "+i[7]);
            //         equipo2 = new Equipo(i[6], i[7]);
//UnPronostico (Equipo equipo1, Equipo equipo2, String gana, String empata, String pierde)
            UnPronostico unPronostico = new UnPronostico(i[0], i[4], i[1], i[2], i[3]);
            //PartidoJugado partidoJugado = new PartidoJugado(equipo1,equipo2,Integer.parseInt(i[3]),Integer.parseInt(i[4]));
            this.pronosticos.add(unPronostico);
            //this.partidos.add(partidoJugado);
            //System.out.println(this.partidos.toString() + "\n");
        }
        
    }

    
    //public int puntos()

    /**
     * @return the participante
     */
    public String getParticipante() {
        return participante;
    }

    /**
     * @param participante the participante to set
     */
    public void setParticipante(String participante) {
        this.participante = participante;
    }

    /**
     * @return the pronosticos
     */
    public ArrayList<UnPronostico> getPronosticos() {
        return pronosticos;
    }

    /**
     * @param pronosticos the pronosticos to set
     */
    public void setPronosticos(ArrayList<UnPronostico> pronosticos) {
        this.pronosticos = pronosticos;
    }

}
