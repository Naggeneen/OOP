public class Teacher extends Worker{
    private double tiredness;

    public Teacher() {
        super();
        this.tiredness = 0.01;
    }

    public Teacher(String fullName, double energy, double power, double efficiency, double tiredness) {
        super(fullName, energy, power, efficiency);
        this.tiredness = tiredness;
    }

    public double getTiredness(){
        return tiredness;
    }
    public void setTiredness(double tiredness){
        this.tiredness = tiredness;
    }
    @Override
    public String toString(){
        return "Teacher{" + "fullName=" + getFullName() +
                ", energy=" + getEnergy() +
                ", power=" + getPower() +
                ", efficiency=" + getEfficiency() +
                "}";
    }
    @Override
    public double toWork(int time){
        double energy = getEnergy() - tiredness;
        if(energy ==0){
            return 0;
        }
        double workPerHour;
        double workTotal = 0;
        for(int i=0; i<time; i++){
            workPerHour = getPower()*getEfficiency();
            energy -= workPerHour;
            workTotal += workPerHour;
        }
        return workTotal;
    }
}
