package com.mycompany.pronosticosdeportivos1;

import java.io.File;  // operaciones con archivos. Version mas moderna java.nio
//java.io.readLine() visto en teoría Carlos está deprecado
import java.io.FileNotFoundException;
import java.util.Scanner; // lectura de archivos de texto
import java.util.ArrayList;

/**
 *
 * @author jul
 */
public class LectorArchivos {
           
    //private ArrayList<String[]> renglones = new ArrayList<String[]>();
    
    public LectorArchivos(){        
    }

    public ArrayList<String[]> leerArchivo(String ruta){
        
        ArrayList<String[]> renglonesParseados = new ArrayList();
        
        try {
            //  Al instanciar o crear el objeto, abrimos el archivo.
            //File objetoMiArchivo = new File( args[0] );
            File objetoMiArchivo = new File( ruta );
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
                //parsea los campos de un renglon y los guarda
                renglonesParseados.add(renglon.split(","));
                //System.out.println(renglon + "\n" );
            }

            //  Cerramos el archivo.
            //fis.close();
            miLector.close();

            //for( String i : getRenglones()){
            //    System.out.println( i + "\n");
            //}
            
            return renglonesParseados;
            
          } //end try

          catch ( FileNotFoundException e ) {
            System.out.println( "Archivo inexistente."
                              + "\nEl programa se cancela." );
          }

          /*catch ( IOException e ) {
            System.out.println( "Error en el uso o cierre del archivo"
                              + "\nEl programa se cancela." );
          }*/

          //todo otro tipo de error
          catch ( Exception e ) {
            System.out.println( "Error: " + e
                              + "\nEl programa se cancela." );
          }
        return renglonesParseados;
        
    } //end leerArchivo

    
}
