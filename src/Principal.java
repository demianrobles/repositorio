import javax.swing.JOptionPane;


public class Principal {
    
    public static void main (String[] args){
            
        Peliculas pelicula1 = new Peliculas ();
        
        //OBJETO1
        pelicula1.id = 1;
        pelicula1.titulo = "Educacion Rural";
        pelicula1.año = 2018;
        pelicula1.duracion = 63;
        pelicula1.premios = true;
        pelicula1.origen = "Argentina";
        pelicula1.genero = "Documental";
        pelicula1.director = "Federico García Bedoya";
        pelicula1.asistdireccion = "Belén Ortiz";
        pelicula1.guion = "Garcia Bedoya, Cacciato, Ortiz";
        pelicula1.produccion = "Adriel Cacciato";
        pelicula1.asistproduccion = "Camila Moccia";
        pelicula1.fotografia = "Damián Ezequiel Robles";
        pelicula1.sonido = "Maria Luz Morera";
        pelicula1.montaje = "Camila Mercado";
        
        //OBJETO2
        Peliculas pelicula2 = new Peliculas ();
        
        pelicula2.id = 3;
        pelicula2.titulo = "Flip";
        pelicula2.año = 2016;
        pelicula2.duracion = 63;
        pelicula2.premios = false;
         pelicula1.origen = "Argentina";
        pelicula2.genero = "Ficcion";
        pelicula2.director = "Damian Ezequiel Robles";
        pelicula2.asistdireccion = "Luciana Rudelli";
        pelicula2.guion = "Robles, Figuerero,  Ventura";
        pelicula2.produccion = "Sergio Cruz Pedraza";
        pelicula2.asistproduccion = "Camila Moccia";
        pelicula2.fotografia = "Julieta Figuerero";
        pelicula2.sonido = "David Sanabria";
        pelicula2.montaje = "Michelle Peroneille";
        
        //LLAMADOS
        pelicula1.mostraPeliculas ();
        pelicula2.mostraPeliculas ();
        pelicula1.finprograma ();
      
                
    }   
}
