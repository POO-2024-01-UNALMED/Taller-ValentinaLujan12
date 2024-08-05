package comunicacion;

import java.util.Arrays;

public class Alfabeto extends Pictograma {
    //Atributos
    private String[] letras;
    private String interpretacion;


    //Constructor
    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }


    // Metodos
    public int cantidadLetras() {
        return letras.length;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        String mensaje = "";
		
        for(String letra:letras) {
			mensaje += letra + ", "; 
		}
		
        return mensaje;
    }


    // Getters y setters
    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
