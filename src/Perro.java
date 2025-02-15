public class Perro {
    private String nombre;
    private int edad;
    private int nivelEnergia;
    private int nivelHambre;
    private String estadoAnimo;
    public static int contadorPerro = 0;

    public Perro(String nombre) {
        this.nombre = nombre;
        this.edad = 1;
        this.nivelEnergia = 100;
        this.nivelHambre = 0;
        this.estadoAnimo = "Feliz";
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

    public int getContadorPerro() {
        return contadorPerro;
    }

    public void setContadorPerro(int contadorPerro) {
        this.contadorPerro = contadorPerro;
    }

    public void comer () {
        if (this.nivelHambre <= 0) {
            System.out.println("No tengo hambre cansino");
            this.setEstadoAnimo("Molesto");
        } else {
            this.setNivelHambre(this.nivelHambre - 20);
            this.setEstadoAnimo("Feliz, barriguita llena, corazon contento");
            this.setNivelEnergia(+10);
            if (this.nivelHambre < 0) {
                this.nivelHambre = 0;
            }
        }
    }

        public void jugar () {
            if (this.nivelEnergia < 20) {
                System.out.println("Estoy reventado dejame descansar por favor");
                this.setEstadoAnimo("Molesto");
            } else {
                this.setNivelEnergia(this.nivelEnergia - 10);
                if (this.nivelEnergia < 0) {
                    this.nivelEnergia = 0;
                }
                this.setNivelHambre(this.nivelHambre + 10);
                this.setEstadoAnimo("Feliz,me encanta jugar contigo");
            }
        }


        public void dormir () {

            if (this.nivelEnergia == 100) {
                System.out.println("No tengo sueño");
                this.setEstadoAnimo("Molesto");
            } else {
                this.setNivelEnergia(this.nivelEnergia + 20);
                if (this.nivelEnergia > 100) {
                    this.nivelEnergia = 100;
                }
                this.setNivelHambre(this.nivelHambre + 10);
                this.setEstadoAnimo("Pochito, me encanta dormir");
            }
        }

        public String toString () {
            return "Estado de tu mascota{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad + '\'' +
                    ", nivelEnergia=" + nivelEnergia + '\'' +
                    ", nivelHambre=" + nivelHambre + '\'' +
                    ", estadoAnimo='" + estadoAnimo + '\'' +
                    '}';
        }


    }