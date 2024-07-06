public class Tourist extends ResortPlace {
    private String name;
    private double incomeMoney;

    public Tourist(){
        this.name ="";
        this.incomeMoney =0;
    }
    public Tourist(String name, double incomeMoney){
        this.name = name;
        this.incomeMoney = incomeMoney;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getIncomeMoney(){
        return incomeMoney;
    }
    public void setIncomeMoney(double incomeMoney){
        this.incomeMoney = incomeMoney;
    }

    @Override
    public String toString(){
        return "Tourist{" + "name=" + name +
                ", income=" + incomeMoney + "}";
    }
}
