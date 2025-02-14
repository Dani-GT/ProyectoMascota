public class Perro {
    private String nombre;
    private int edad;
    private int nivelEnergia;
    private int nivelHambre;
    private String estadoAnimo;

    public Perro(String nombre, int edad, int nivelEnergia, int nivelHambre, String estadoAnimo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelEnergia = nivelEnergia;
        this.nivelHambre = nivelHambre;
        this.estadoAnimo = estadoAnimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public int getNivelHambre() {
        return nivelHambre;
    }

    public void setNivelHambre(int nivelHambre) {
        this.nivelHambre = nivelHambre;
    }

    public String getEstadoAnimo() {
        return estadoAnimo;
    }

    public void setEstadoAnimo(String estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }

    public void comer () {

        if(this.nivelHambre<=0){
            System.out.println ("No tengo hambre cansino");
            this.estadoAnimo = "Molesto";
        } else {
            this.setNivelHambre(this.nivelHambre-20);
            this.setNivelEnergia(+10);
            if(this.nivelHambre<0)
            {this.nivelHambre=0;}
    }

    public void jugar () {
        this.nivelHambre += 10;
        this.nivelEnergia -= 10;
        this.estadoAnimo = "Feliz";
    }

    public void dormir () {
        this.nivelEnergia = 100;
        this.estadoAnimo = "Feliz";
    }

    }