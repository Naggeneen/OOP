public class FlashLight {
    private Battery batteries[];
    public FlashLight(){
        this.batteries = new Battery[0];
    }

    public FlashLight(Battery[] batteries){
        this.batteries = batteries;
    }
    public Battery[] getBatteries(){
        return batteries;
    }
    public void setBatteries(Battery[] batteries){
        this.batteries = batteries;
    }

    public double getTotalPower() {
        double totalPower = 0;
        for (int i =0; i<batteries.length; i++) {
            totalPower += batteries[i].getPower();
        }
        return totalPower;
    }

    public double getTotalEnergy() {
        double totalEnergy = 0;
        for (int i=0; i<batteries.length; i++) {
            totalEnergy+= batteries[i].getEnergy();
        }
        return totalEnergy;
    }

    public double getTotalLifeTime() {
        return getTotalEnergy() / getTotalPower();
    }
}
