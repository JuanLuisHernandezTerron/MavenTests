public class Contacto {
    private Integer id;
    private String Nombre;
    private String Email;
    private Integer edad;

    public Contacto(Integer id, String Nombre, String Email, Integer edad){
        this.id = id;
        this.Nombre = Nombre;
        this.Email=Email;
        this.edad=edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "Nombre='" + Nombre + '\'' +
                ", Email='" + Email + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
