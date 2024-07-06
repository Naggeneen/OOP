public class DuracellBattery extends Battery{
    private double voltage;
    private double current;
    private double energy;
    private double internalVoltage;

    public DuracellBattery(double voltage, double current, double energy, double internalVoltage) {
        this.voltage = voltage;
        this.current = current;
        this.energy = energy;
        this.internalVoltage = internalVoltage;
    }
    @Override
    public double getEnergy(){
        return energy;
    }

    //P=epsilon*current - current^2*resistance
    @Override
    public double getPower(){
        return internalVoltage*current;
    }
    @Override
    public double getLifeTime(){
        return energy/getPower();
    }


}
