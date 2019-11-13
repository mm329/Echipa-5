
package cabinetmedicalpsbd;

class Medici {
    private String specializare, nume, titulatura;
    private int durata;
    
    public Medici(String specializare, String nume, String titulatura, int durata){
        this.specializare=specializare;
        this.nume=nume;
        this.titulatura=titulatura;
        this.durata=durata;
    }

    Medici(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSpecializare() {
        return specializare;
    }

    public String getNume() {
        return nume;
    }

    public String getTitulatura() {
        return titulatura;
    }

    public int getDurata() {
        return durata;
    }
    

}
