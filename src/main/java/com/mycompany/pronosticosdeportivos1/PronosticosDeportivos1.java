package com.mycompany.pronosticosdeportivos1;

//import java.io.*;  //  Paquete de acceso a datos.

import java.util.ArrayList;

/*import java.io.File;  // operaciones con archivos. Version mas moderna java.nio
//java.io.readLine() está deprecado
import java.io.FileNotFoundException;
import java.util.Scanner; // lectura de archivos de texto
import java.util.ArrayList; */


/**
 * Pronosticos Deportivos - Entrega 1
 * @author dd
 * Java 11 (LTS)
 * Suposiciones:
 * - Se supone que el orden en que se indican los dos equipos en un partido es el mismo tanto para los resultados de ese partido como para el pronóstico (condición local-visitante). 
 * - En la siguiente etapa tendré en cuenta una cantidad fija de partidos por ronda. En esta etapa supongo que cada archivo completo corresponde a una ronda.
 */
public class PronosticosDeportivos1 {
    
    enum ResultadoEnum{
        GANADO,
        EMPATADO,
        PERDIDO
    }
    
    //En Netbeans, los valores de los argumentos se colocan en File---Project Properties --- Categories: Run ---- Arguments  y van separados por espacios
    public static void main(String[] args) {
        
        //Crea objeto ronda con todos los partidos jugados, leidos de archivo
        Ronda ronda = new Ronda("1", args[0]);
        //ronda.leerRonda(args[0]);
        //##seria mejor pasar la ruta al constructor de Ronda
        
        //Crea objeto pronosticos con todos los ponosticos, leidos de archivo
        Pronosticos pronosticos = new Pronosticos("Mariana", args[1]);
        //pronosticos.leerPronosticos(args[1]);
        //##seria mejor pasar la ruta al constructor de Pronosticos
        
        //Determina el puntaje correspondiente a esta ronda y estos pronosticos de una ronda
        int puntos = ronda.evaluarPronosticos (pronosticos);
        
        System.out.println("Participante: " + pronosticos.getParticipante());
        System.out.println("Puntos: " + puntos);
        /*LectorArchivos lectorArchivos = new LectorArchivos();
        
        ArrayList<String[]> renglonesParseados;
        renglonesParseados = lectorArchivos.leerArchivo( args[0]);
        
        for (String[] i : renglonesParseados){
            //System.out.println(i.toString() + "\n");
            for (String j : i){
                System.out.println(j + "\t");
            }
            System.out.println("\n");
        } */
        
        /*//Se supone que el orden de los distintos items en cada resultado de partidos y de pronósticos es fijo y no variará nunca.
        
        //Leer archivo
        ArrayList<String> renglones = new ArrayList<String>();
        try {
            //  Al instanciar o crear el objeto, abrimos el archivo.
            File objetoMiArchivo = new File( args[0] );
            Scanner miLector = new Scanner(objetoMiArchivo);
            //FileInputStream fis; //  La clase "FileInputStream" sirve para
                                 //referir a archivos.
            //DataInputStream Datos; //  La clase "DataInputStream" sirve para
                                   //leer independientemente del hardware,
                                   //tipos de datos de una "corriente" o
                                   //"stream" que en nuestro caso es un archivo.
            //String renglon = null;
            String renglon;

            //  Al instanciar o crear el objeto, abrimos el archivo.
            //fis = new FileInputStream( args[0] );
            //Datos = new DataInputStream( fis );

            //renglon = Datos.readLine();
            //while ( renglon != null ) { //  Es "null" si encuentra fin del archivo.
            //   System.out.println( renglon + "\n" );
            //   renglon = Datos.readLine();
            //}
            while (miLector.hasNextLine()) {
                renglon = miLector.nextLine();
                renglones.add(renglon);
                //System.out.println(renglon + "\n" );
            }

            //  Cerramos el archivo.
            //fis.close();
            miLector.close();
            
            for( String i : renglones){
                System.out.println( i + "\n");
            }
          } //end try

          catch ( FileNotFoundException e ) {
            System.out.println( "Archivo inexistente."
                              + "\nEl programa se cancela." );
          }

          //catch ( IOException e ) {
          //  System.out.println( "Error en el uso o cierre del archivo"
          //                    + "\nEl programa se cancela." );
          //}

          //todo otro tipo de error
          catch ( Exception e ) {
            System.out.println( "Error: " + e
                              + "\nEl programa se cancela." );
          } */
        
    } //end main
}
