public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("Kazakhstan");
        //Kazakhstan ResortPlaces
        ResortPlace resort1 = new ResortPlace("East Palace Hotel", "Almaty");
        ResortPlace resort2 = new ResortPlace("Astana Hotel", "Astana");
        ResortPlace resort3 = new ResortPlace("Interhouse Almaty", "Almaty");
        ResortPlace resort4 = new ResortPlace("CAPS LOCK Future Hotel", "Astana");
        ResortPlace resort5 = new ResortPlace("Barhat Hotel", "Shymkents");

        Tourist tourist1 = new Tourist("Almas", 500);
        Tourist tourist2 = new Tourist("Amir", 730);
        Tourist tourist3 = new Tourist("Alen", 930);
        Tourist tourist4 = new Tourist("Arman", 195);
        Tourist tourist5 = new Tourist("Ayazhan", 690);
        Tourist tourist6 = new Tourist("Aruzhan", 700);
        Tourist tourist7 = new Tourist("Mahabbat", 800);
        Tourist tourist8 = new Tourist("Alikhan", 900);
        Tourist tourist9 = new Tourist("Bakhitzhan", 300);
        Tourist tourist10 = new Tourist("Vlad", 100);
        Tourist tourist11 = new Tourist("Timur", 820);
        Tourist tourist12 = new Tourist("Arsen", 360);
        Tourist tourist13 = new Tourist("Ruslan", 1040);
        Tourist tourist14 = new Tourist("Alina", 450);
        Tourist tourist15 = new Tourist("Karina", 1080);
        Tourist tourist16 = new Tourist("Firuza", 740);
        Tourist tourist17 = new Tourist("Masha", 900);
        Tourist tourist18 = new Tourist("Angelina", 880);
        Tourist tourist19 = new Tourist("Diana", 670);
        Tourist tourist20 = new Tourist("George", 330);
        Tourist tourist21 = new Tourist("Temirlan", 580);
        Tourist tourist22 = new Tourist("Andrew", 400);
        Tourist tourist23 = new Tourist("Ivan", 650);
        Tourist tourist24 = new Tourist("Nursultan", 5000);
        Tourist tourist25 = new Tourist("Vladimir", 5000);

        resort1.add(tourist1);
        resort1.add(tourist2);
        resort1.add(tourist3);
        resort1.add(tourist4);
        resort1.add(tourist5);

        resort2.add(tourist6);
        resort2.add(tourist7);
        resort2.add(tourist8);
        resort2.add(tourist9);
        resort2.add(tourist10);

        resort3.add(tourist11);
        resort3.add(tourist12);
        resort3.add(tourist13);
        resort3.add(tourist14);
        resort3.add(tourist15);

        resort4.add(tourist16);
        resort4.add(tourist17);
        resort4.add(tourist18);
        resort4.add(tourist19);
        resort4.add(tourist20);

        resort5.add(tourist21);
        resort5.add(tourist22);
        resort5.add(tourist23);
        resort5.add(tourist24);
        resort5.add(tourist25);

        country1.addResort(resort1);
        country1.addResort(resort2);
        country1.addResort(resort3);
        country1.addResort(resort4);
        country1.addResort(resort5);

        System.out.println("All resorts in a country: ");
        country1.printAllResorts();

        System.out.println("Total Amount of Tourists in the Country: " + country1.getTotalTourists());

        System.out.println("Total Sum of Incomes in the Country: " + country1.getTotalIncome());

        System.out.println("Resort with Maximum Total Income: ");
        System.out.println(country1.maxIncomeResort());

        System.out.println("Richest Tourist in the Country: ");
        System.out.println(country1.findRichestTouristInCountry());

        Continent continent = new Continent("Asia");

        Country country2 = new Country("Russia");
        Country country3 = new Country("Japan");

        //Russian ResortPlaces
        ResortPlace resort6 = new ResortPlace("Sochi Resort", "Sochi");
        ResortPlace resort7 = new ResortPlace("Krasnaya Polyana Resort", "Krasnaya Polyana");
        ResortPlace resort8 = new ResortPlace("Belokurikha Resort", "Belokurikha");
        ResortPlace resort9 = new ResortPlace("Moscow Resort", "Moscow");
        ResortPlace resort10 = new ResortPlace("Dombay Resort", "Dombay");
        //Japan ResortPlaces
        ResortPlace resort11 = new ResortPlace("Niseko Resort", "Niseko");
        ResortPlace resort12 = new ResortPlace("Hakuba Resort", "Hakuba");
        ResortPlace resort13 = new ResortPlace("Nozawa Onsen Resort", "Nozawa Onsen");
        ResortPlace resort14 = new ResortPlace("Shiga Kogen Resort", "Shiga Kogen");
        ResortPlace resort15 = new ResortPlace("Furano Resort", "Furano");

        Tourist touristRussia1 = new Tourist("Ivan Petrov", 1890);
        Tourist touristRussia2 = new Tourist("Anna Ivanova", 2780);
        Tourist touristRussia3 = new Tourist("Sergey Sokolov", 2320);
        Tourist touristRussia4 = new Tourist("Maria Popova", 560);
        Tourist touristRussia5 = new Tourist("Dmitriy Kuznetsov", 1570);
        Tourist touristRussia6 = new Tourist("Nikolai Smirnov", 1300);
        Tourist touristRussia7 = new Tourist("Olga Fedorova", 2490);
        Tourist touristRussia8 = new Tourist("Alexey Vasiliev", 1750);
        Tourist touristRussia9 = new Tourist("Yulia Voronina", 2890);
        Tourist touristRussia10 = new Tourist("Mikhail Romanov", 1460);
        Tourist touristRussia11 = new Tourist("Pavel Orlov", 990);
        Tourist touristRussia12 = new Tourist("Elena Lebedeva", 2190);
        Tourist touristRussia13 = new Tourist("Andrey Pavlov", 3010);
        Tourist touristRussia14 = new Tourist("Nataly Belova", 1670);
        Tourist touristRussia15 = new Tourist("Vladimir Egorov", 2450);
        Tourist touristRussia16 = new Tourist("Viktor Morozov", 2050);
        Tourist touristRussia17 = new Tourist("Irina Filatova", 930);
        Tourist touristRussia18 = new Tourist("Boris Ivanov", 2750);
        Tourist touristRussia19 = new Tourist("Tatiana Petrova", 1460);
        Tourist touristRussia20 = new Tourist("Alexander Volkov", 1920);
        Tourist touristRussia21 = new Tourist("Yuri Sidorov", 2840);
        Tourist touristRussia22 = new Tourist("Svetlana Mikhailova", 1170);
        Tourist touristRussia23 = new Tourist("Oleg Nikitin", 2170);
        Tourist touristRussia24 = new Tourist("Ekaterina Nikolaeva", 1720);
        Tourist touristRussia25 = new Tourist("Roman Grigorev", 2110);

        Tourist touristJapan1 = new Tourist("Haruno Sakura", 2890);
        Tourist touristJapan2 = new Tourist("Uzumaki Naruto", 1450);
        Tourist touristJapan3 = new Tourist("Uchiha Saske", 1870);
        Tourist touristJapan4 = new Tourist("Uchiha Itachi", 1630);
        Tourist touristJapan5 = new Tourist("Hatake Kakashi", 1010);
        Tourist touristJapan6 = new Tourist("Yamanaka Ino", 2560);
        Tourist touristJapan7 = new Tourist("Nara Shikamaru", 1360);
        Tourist touristJapan8 = new Tourist("Hyuga Hinata", 2220);
        Tourist touristJapan9 = new Tourist("Rock Lee", 1740);
        Tourist touristJapan10 = new Tourist("Sarutobi Asuma", 1990);
        Tourist touristJapan11 = new Tourist("Uchiha Obito", 2840);
        Tourist touristJapan12 = new Tourist("Aburame Shino", 920);
        Tourist touristJapan13 = new Tourist("Yuhi Kurenai", 3010);
        Tourist touristJapan14 = new Tourist("Akimichi Chouji", 1340);
        Tourist touristJapan15 = new Tourist("Hyuga Neji", 2180);
        Tourist touristJapan16 = new Tourist("Namikaze Minato", 1690);
        Tourist touristJapan17 = new Tourist("Sarutobi Hiruzen", 1890);
        Tourist touristJapan18 = new Tourist("Senju Hashirama", 1210);
        Tourist touristJapan19 = new Tourist("Uchiha Madara", 2700);
        Tourist touristJapan20 = new Tourist("Yakushi Kabuto", 940);
        Tourist touristJapan21 = new Tourist("Jiraiya", 1180);
        Tourist touristJapan22 = new Tourist("Tsunade", 1750);
        Tourist touristJapan23 = new Tourist("Orochimaru", 1940);
        Tourist touristJapan24 = new Tourist("Might Guy", 1560);
        Tourist touristJapan25 = new Tourist("Gaara", 1020);

        resort6.add(touristRussia1);
        resort6.add(touristRussia2);
        resort6.add(touristRussia3);
        resort6.add(touristRussia4);
        resort6.add(touristRussia5);
        resort7.add(touristRussia6);
        resort7.add(touristRussia7);
        resort7.add(touristRussia8);
        resort7.add(touristRussia9);
        resort7.add(touristRussia10);
        resort8.add(touristRussia11);
        resort8.add(touristRussia12);
        resort8.add(touristRussia13);
        resort8.add(touristRussia14);
        resort8.add(touristRussia15);
        resort9.add(touristRussia16);
        resort9.add(touristRussia17);
        resort9.add(touristRussia18);
        resort9.add(touristRussia19);
        resort9.add(touristRussia20);
        resort10.add(touristRussia21);
        resort10.add(touristRussia22);
        resort10.add(touristRussia23);
        resort10.add(touristRussia24);
        resort10.add(touristRussia25);

        resort11.add(touristJapan1);
        resort11.add(touristJapan2);
        resort11.add(touristJapan3);
        resort11.add(touristJapan4);
        resort11.add(touristJapan5);
        resort12.add(touristJapan6);
        resort12.add(touristJapan7);
        resort12.add(touristJapan8);
        resort12.add(touristJapan9);
        resort12.add(touristJapan10);
        resort13.add(touristJapan11);
        resort13.add(touristJapan12);
        resort13.add(touristJapan13);
        resort13.add(touristJapan14);
        resort13.add(touristJapan15);
        resort14.add(touristJapan16);
        resort14.add(touristJapan17);
        resort14.add(touristJapan18);
        resort14.add(touristJapan19);
        resort14.add(touristJapan20);
        resort15.add(touristJapan21);
        resort15.add(touristJapan22);
        resort15.add(touristJapan23);
        resort15.add(touristJapan24);
        resort15.add(touristJapan25);

        country2.addResort(resort6);
        country2.addResort(resort7);
        country2.addResort(resort8);
        country2.addResort(resort9);
        country2.addResort(resort10);

        country3.addResort(resort11);
        country3.addResort(resort12);
        country3.addResort(resort13);
        country3.addResort(resort14);
        country3.addResort(resort15);

        continent.addCountry(country1);
        continent.addCountry(country2);
        continent.addCountry(country3);

        System.out.println("Total Income of all countries of our continent: " + continent.getTotalIncomeOfAllResorts());
        Country theMostProfitableCountry = continent.getTheMostProfitableCountry();
        System.out.println("Most profitable country: " + theMostProfitableCountry);

        ResortPlace mostProfitableResortInMostProfitableCountry = theMostProfitableCountry.maxIncomeResort();


    }
}