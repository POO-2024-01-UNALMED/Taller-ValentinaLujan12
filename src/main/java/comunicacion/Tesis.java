package comunicacion;

public class Tesis extends Escrito{
    // Atributos
    private String idea;
    private ArrayList<String> argumentos;
    private String conclusiones;
    private String referencias;
    private String interpretacion;


    //Constructor
    public Tesis(String origen, String titulo, String autor, int paginas, String interpretacion, String idea, String[] argumentos, String conclusiones, String referencias) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusiones = conclusiones;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }


    // Metodos
    @Override
    public int palabrasTotales(int palabrasPagina) {
        int factor = 5;
        return palabrasPagina * getPaginas() * factor;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + idea + "\n" + argumentos + "\n" + conclusiones + "\n" + referencias;
    }


    //Getters y setters 
    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusiones() {
        return conclusiones;
    }

    public void setConclusiones(String conclusiones) {
        this.conclusiones = conclusiones;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
