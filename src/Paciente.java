/**
 * Created by cristian on 17/06/17.
 */
public class Paciente {
    private String nombre;
    private float peso;
    private float altura;

    public Paciente(String nombre, float peso, float altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}

