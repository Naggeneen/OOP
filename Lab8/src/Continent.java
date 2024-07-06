public class Continent extends Country {
    private String name;
    private Country countries[] = new Country[50];
    private int countryCount = 0;

    public Continent(){
        this.name = "";
    }
    public Continent(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void addCountry(Country country){
        countries[countryCount] = country;
        countryCount++;
    }
    public double getTotalIncomeOfAllResorts(){
        double totalIncome = 0;
        for(int i=0; i<countryCount; i++){
            totalIncome += countries[i].getTotalIncome();
        }
        return totalIncome;
    }
    public Country getTheMostProfitableCountry(){
        Country bestCountry = null;
        double bestIncome = 0;
        for(int i =0; i<countryCount; i++){
            if(countries[i].getTotalIncome()>bestIncome){
                bestIncome = countries[i].getTotalIncome();
                bestCountry = countries[i];
            }
        }
        return bestCountry;
    }
}
