public abstract class Sportsman {
    protected String info;
    protected int maxdistance;
    protected double maxheight;
    protected String successfulrunresult;
    protected String badrunresult;
    protected String successfuljumpresult;
    protected String badjumpresult;
    private boolean condition;
    private IMotion motion;

    Sportsman(String name, int maxdistance, double maxheight) {
        this.info = "";
        this.maxdistance = maxdistance;
        this.maxheight = maxheight;
        this.successfulrunresult = "";
        this.badrunresult = "";
        this.successfuljumpresult = "";
        this.badjumpresult = "";
        this.condition = true;
        this.motion = new Motion();
    }

    public String getInfo() {
        return info;
    }

    public String getRunResult(int distance) {
        if (motion.run(distance, maxdistance) && condition) {
            return info + successfulrunresult + distance + " m";
        }
        condition = false;
        return info + badrunresult;
    }

    public String getJumpResult(double height) {
        if (motion.jump(height, maxheight) && condition) {
            return info + successfuljumpresult + height + " m";
        }
        condition = false;
        return info + badjumpresult;
    }

    public boolean getCondition() {
        return condition;
    }
}
