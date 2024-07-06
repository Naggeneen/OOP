public class ResortPlace extends Country {
    private String name;
    private String city;
    private Tourist tourists[] = new Tourist[1000];
    private int touristCount = 0;

    public ResortPlace(){
        this.name = "";
        this.city = "";
    }
    public ResortPlace(String name, String city){
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void add(Tourist tourist){
        tourists[touristCount] = tourist;
        touristCount++;
    }
    public double getTotalIncome(){
        double totalIncome = 0;
        for (int i = 0; i < touristCount; i++) {
            totalIncome += tourists[i].getIncomeMoney();
        }
        return totalIncome;
    }
    public int getTotalTourists(){
        return touristCount;
    }

    public Tourist RichestTouristInResortPlace(){
        Tourist richestTourist = tourists[0];
        for(int i =1; i<touristCount; i++){
            if(tourists[i].getIncomeMoney()>richestTourist.getIncomeMoney()){
                richestTourist = tourists[i];
            }
        }
        return richestTourist;
    }
    @Override
    public String toString(){
        String result ="ResortPlace:" + name + ", City:" + city + "\nTourists:";
        result += "\n" + "----------------------------------------------";
        for(int i=0; i<touristCount; i++){
            result += "\n" + tourists[i];
        }
        result += "\n" + "-----------------------------------------------";
        result += "\n" + "Total Income: " + getTotalIncome();
        return result;
    }
}
