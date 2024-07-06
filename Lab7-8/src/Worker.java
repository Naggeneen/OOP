public class Worker {
    private String fullName;
    private double energy;
    private double power;
    private double efficiency;

    public Worker(){
        this.fullName = "";
        this.energy = 0;
        this.power = 0;
        this.efficiency = 0.1;
    }

    public Worker(String fullName, double energy, double power, double efficiency){
        this.fullName = fullName;
        this.energy = energy;
        this.power = power;
        this.efficiency = efficiency;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public double getEnergy(){
        return energy;
    }

    public void setEnergy(double energy){
        this.energy = energy;
    }

    public double getPower(){
        return power;
    }

    public void setPower(double power){
        this.power = power;
    }

    public double getEfficiency(){
        return efficiency;
    }
    public void setEfficiency(double efficiency){
        this.efficiency = efficiency;
    }
    public String toString(){
        return "Worker{" + "fullName=" + fullName +
                ", energy=" + energy +
                ", power=" + power +
                ", efficiency=" + efficiency +
                "}";
    }
    public double toWork(int time){
        if(energy == 0){
            return 0;
        }
        double workPerHour;
        double workTotal =0;
        for(int i=0; i<time; i++){
            workPerHour = power*efficiency;
            energy -= workPerHour;
            workTotal += workPerHour;
        }
        return workTotal;
    }
}
