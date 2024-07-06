public class Programmer extends Worker{
    private double moralMotivation;

    public Programmer() {
        super();
        this.moralMotivation = 0.5;
    }

    public Programmer(String fullName, double energy, double power, double efficiency, double moralMotivation) {
        super(fullName, energy, power, efficiency);
        this.moralMotivation = moralMotivation;
    }
    public double getMoralMotivation() {
        return moralMotivation;
    }
    public void setMoralMotivation(double moralMotivation) {
        this.moralMotivation = moralMotivation;
    }

    @Override
    public String toString(){
        return "Programmer{" + "fullName=" + getFullName() +
                ", energy=" + getEnergy() +
                ", power=" + getPower() +
                ", efficiency=" + getEfficiency() +
                "}";
    }
    @Override
    public double toWork(int time){
        double energy = getEnergy();
        if(energy ==0){
            return 0;
        }
        double workPerHour;
        double workTotal = 0;
        for(int i=0; i<time; i++){
            workPerHour = getPower()*getEfficiency()*moralMotivation;
            energy -= workPerHour;
            workTotal += workPerHour;
        }
        return workTotal;
    }
}
