package comunicacion;

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
		for (int i = 0; i < letras.length; i++) {
		    if (i < letras.length - 1) {
		        mensaje += letras[i] + ", ";
		    }else{
                mensaje += letras[i];
            }
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
