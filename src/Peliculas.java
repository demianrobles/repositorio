
import javax.swing.JOptionPane;

public class Peliculas {

    int id;
    String titulo;
    int año;
    int duracion;
    boolean premios;
    String origen;
    String genero;
    String director;
    String asistdireccion;
    String guion;
    String produccion;
    String asistproduccion;
    String fotografia;
    String sonido;
    String montaje;

    public void mostraPeliculas(){
        
        if (this.premios == true) {
        
        JOptionPane.showMessageDialog(null, "PELICULA: " +
                        "\nID: " + this.id +
                        "\nTITULO: " + this.titulo +
                        "\nAÑO: " + this.año +
                        "\nDURACIÓN: " + this.duracion +
                        "\nPREMIOS: "  + this.premios +
                        "\nORIGEN: " + this.origen + 
                        "\nGENERO: " + this.genero +
                        "\nDIRECTOR: " + this.director +
                        "\nASIST. DE DIRECCIÓN: " + this.asistdireccion +
                        "\nGUION: " + this.guion +
                        "\nPRODUCCIÓN: " + this.produccion + 
                        "\nASIST. DE PRODUCCIÓN: " + this.asistproduccion +
                        "\nFOTOGRAFÍA: " + this.fotografia +
                        "\nSONIDO: " + this.sonido +
                        "\nMONTAJE: " +this.montaje ,"Peliculas", JOptionPane.WARNING_MESSAGE);
        }
        else{
        
        JOptionPane.showMessageDialog(null, "PELICULA: " +
                        "\nID: " + this.id +
                        "\nTITULO: " + this.titulo +
                        "\nAÑO: " + this.año +
                        "\nDURACIÓN: " + this.duracion +
                        "\nPREMIOS: "  + this.premios +
                        "\nORIGEN: " + this.origen + 
                        "\nGENERO: " + this.genero +
                        "\nDIRECTOR: " + this.director +
                        "\nASIST. DE DIRECCIÓN: " + this.asistdireccion +
                        "\nGUION: " + this.guion +
                        "\nPRODUCCIÓN: " + this.produccion + 
                        "\nASIST. DE PRODUCCIÓN: " + this.asistproduccion +
                        "\nFOTOGRAFÍA: " + this.fotografia +
                        "\nSONIDO: " + this.sonido +
                        "\nMONTAJE: " +this.montaje , "Peliculas", JOptionPane.WARNING_MESSAGE);
        }
    
    }

    
    public void finprograma(){
        
       JOptionPane.showMessageDialog(null, "No hay más peliculas registradas." , "Finalizar", JOptionPane.WARNING_MESSAGE);
    
    
    }

}
