/**
 * Created by cristian on 17/06/17.
 */
public class Medico {
    private String nombre;
    private int edad;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;

    public Medico() {
        this.nombre = "";
        this.edad = -1;
        this.dni = -1;
        this.sexo = "";
        this.peso = -1;
        this.altura = -1;
    }

    public Medico(String nombre, int edad, int dni, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Medico(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }



    public float calcularIMC(Paciente pPaciente){
        float IMC = pPaciente.getPeso()/(pPaciente.getAltura()*pPaciente.getAltura());
        return IMC;
    }

    public float calcularIMC(float pAltura, float pPeso){
        float IMC = pPeso/(pAltura*pAltura);
        return IMC;
    }

    public void esMayorDeEdad(){
        if (edad >= 18){
            System.out.println("Es Mayor de Edad");
        }else{}
    }

    public void comprobarSexo(char sexo){
        if (sexo == 'M'|| sexo == 'F'){
            System.out.println();
        }
    }

    public String toString(){
        return null;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }


}
