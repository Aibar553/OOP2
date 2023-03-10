public class Cat extends Sportsman {
    public static final String OBJCLASS = "Cat";
    public static final String SUCCESSFULRUNRESULT = " rapidly overcame";
    public static final String BADRUNRESULT = " did not crawl to the finish line and does not participate further";
    public static final String SUCCESSFULJUMPRESULT = " does not consider the wall height as an obstacle";
    public static final String BADJUMPRESULT = " couldn't jump that high and goes to train on cats.";

    public Cat(String name, int maxdistance, double maxheight) {
        super(name, maxdistance, maxheight);
        super.info = OBJCLASS + " nickname" + name;
        super.successfulrunresult = SUCCESSFULRUNRESULT;
        super.badrunresult = BADRUNRESULT;
        super.successfuljumpresult = SUCCESSFULJUMPRESULT;
        super.badjumpresult = BADJUMPRESULT;
    }
}
