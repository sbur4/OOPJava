
abstract class Print {
    abstract void printCity();
}

interface PrintLocation {
    public void location();
}

class City1 extends Print {
    void printCity() {
        System.out.println("Lviv");
    };
}

class City2 extends Print {
    void printCity() {
        System.out.println("Kyev");
    };
}

class City3 extends Print {
    void printCity() {
        System.out.println("Dnipro");
    };
}

class Country implements PrintLocation {
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void location() {
        System.out.println("I'm from Dnipro");
    }
}

public class Main {

    public static void main(String[] args) {

        Print print = new City1();
        print.printCity();
        Print print2 = new City2();
        print2.printCity();
        Print print3 = new City3();
        print3.printCity();

        Country c = new Country();
        c.setCountry("Ukraine");
        System.out.println(c.getCountry());
        c.location();
    }
}