package com.mycompany.pronosticosdeportivos1;

import com.mycompany.pronosticosdeportivos1.PronosticosDeportivos1.ResultadoEnum;

/**
 *
 * @author jul
 */
public class PartidoJugado {
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    private ResultadoEnum resultadoEquipo1;
    private ResultadoEnum resultadoEquipo2;
    
    PartidoJugado(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2)     {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
        
        if( golesEquipo1 == golesEquipo2 ){
            resultadoEquipo1= ResultadoEnum.EMPATADO;
            resultadoEquipo2= ResultadoEnum.EMPATADO;
            } else if  (golesEquipo1 > golesEquipo2){
                resultadoEquipo1= ResultadoEnum.GANADO;
                resultadoEquipo2= ResultadoEnum.PERDIDO;
            } else{  
                resultadoEquipo1= ResultadoEnum.PERDIDO;
                resultadoEquipo1= ResultadoEnum.GANADO;
            }
        }
    
    public ResultadoEnum resultado(Equipo equipo){
        if( equipo.getNombre() == this.equipo1.getNombre() ){
            return resultadoEquipo1;
        } else {
            return resultadoEquipo2;
        }
    }
    //alternativa: método al que pasándole un equipo y un resultado de este partido, responda verdadero o falso.
}
