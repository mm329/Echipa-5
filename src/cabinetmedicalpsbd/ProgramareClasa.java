
package cabinetmedicalpsbd;

class ProgramareClasa{
    private String medic, pacient,data;
    private int achitata;
    
    public ProgramareClasa(String medic, String pacient, String data, int achitata){
        this.medic=medic;
        this.pacient=pacient;
        this.data=data;
        this.achitata=achitata;
    }

    public String getMedic() {
        return medic;
    }

    public String getPacient() {
        return pacient;
    }

    public String getData() {
        return data;
    }

    public int getAchitata() {
        return achitata;
    }

   
    

}

