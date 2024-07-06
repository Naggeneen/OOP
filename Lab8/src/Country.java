public class Country {
    private String name;
    private ResortPlace resortPlaces[] = new ResortPlace[1000];
    private int resortCount = 0;

    public Country(){
        this.name = "";
    }
    public Country(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addResort(ResortPlace resort){
        resortPlaces[resortCount] = resort;
        resortCount++;
    }
    public void printAllResorts(){
        for (int i = 0; i < resortCount; i++) {
            System.out.println(resortPlaces[i]);
        }
    }
    public double getTotalIncome(){
        double totalIncome = 0;
        for (int i = 0; i < resortCount; i++) {
            totalIncome += resortPlaces[i].getTotalIncome();
        }
        return totalIncome;
    }
    public int getTotalTourists() {
        int totalTourists = 0;
        for (int i = 0; i < resortCount; i++) {
            totalTourists += resortPlaces[i].getTotalTourists();
        }
        return totalTourists;
    }
    public ResortPlace maxIncomeResort(){
        ResortPlace maxIncomeResort = null;
        double maxIncome = 0;
        for(int i=0; i<resortCount; i++){
            if(resortPlaces[i].getTotalIncome()>maxIncome){
                maxIncome = resortPlaces[i].getTotalIncome();
                maxIncomeResort = resortPlaces[i];
            }
        }
        return maxIncomeResort;
    }

    public Tourist findRichestTouristInCountry() {
        Tourist richestTourist = null;
        double maxIncome = 0;

        for (int i = 0; i < resortCount; i++) {
            Tourist currentRichestTourist = resortPlaces[i].RichestTouristInResortPlace();
            if (currentRichestTourist.getIncomeMoney() > maxIncome) {
                maxIncome = currentRichestTourist.getIncomeMoney();
                richestTourist = currentRichestTourist;
            }
        }
        return richestTourist;
    }
    @Override
    public String toString(){
        return "Country{Name: " + name + "}";
    }
}
