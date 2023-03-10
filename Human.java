public class Human extends Sportsman {
    public static final String OBJCLASS = "Human";
    public static final String SUCCESSFULRUNRESULT = " successfully ran the distance";
    public static final String BADRUNRESULT = "couldn't do it today, so we're saying goodbye to him.";
    public static final String SUCCESSFULJUMPRESULT = "freely overcame the wall height";
    public static final String BADJUMPRESULT = "hung on the wall and can't continue to compete.";

    public Human(String name, int maxdistance, double maxheight) {
        super(name, maxdistance, maxheight);
        super.info = OBJCLASS + " by name" + name;
        super.successfulrunresult = SUCCESSFULRUNRESULT;
        super.badrunresult = BADRUNRESULT;
        super.successfuljumpresult = SUCCESSFULJUMPRESULT;
        super.badjumpresult = BADJUMPRESULT;
    }
}