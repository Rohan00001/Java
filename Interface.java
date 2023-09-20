public class Interface {
    public static void main(String arg[]) {
        Planet[] planets = { new Earth(), new Jupiter(), new Saturn() };

        for (Planet planet : planets) {
            boolean hasMoon = planet.hasMoon();
            String planetName = planet.getClass().getSimpleName();
            System.out.println("Does " + planetName + " have a moon? " + hasMoon);
        }
    }
}

interface Planet {
    boolean hasMoon();
}

class Earth implements Planet {
    int roche_limit = 173;
    int moon_distance = 238855;

    @Override
    public boolean hasMoon() {
        return moon_distance > roche_limit;
    }
}

class Jupiter implements Planet {
    int roche_limit = 147000;
    int moon_distance = 421600;

    @Override
    public boolean hasMoon() {
        return moon_distance > roche_limit;
    }
}

class Saturn implements Planet {
    int roche_limit = 147000;
    int moon_distance = 140600;

    @Override
    public boolean hasMoon() {
        return moon_distance > roche_limit;
    }
}
