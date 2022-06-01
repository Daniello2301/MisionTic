public class Paciente {

    private String nombre;
    private String cedula;
    private int edad;
    private String ciudad;
    private String EPS;
    private String enfermedad;

    public Paciente(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String clasificarEdad(){

        if(this.edad >= 21 && this.edad <= 30){
            return "Joven adulto";

        } else if (this.edad > 30 && this.edad <= 60)  {

            return "Adulto";
        }else{
            return "Tercera edad";
        }

    }
}
