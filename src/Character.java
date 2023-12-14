public class Character {
    private String name;
    private boolean isFiveStar;
    private String element;
    private int cons;
    private int lvl;

    private static int charNum;

    // constructors
    public Character() {
        name = "";
        isFiveStar = false;
        element = "";
        cons = 0;
        lvl = 0;
        charNum++;
    }

    public Character(String name, boolean isFiveStar, String element, int cons, int lvl) {
        this.name = name;
        this.isFiveStar = isFiveStar;
        this.element = element;
        this.cons = cons;
        this.lvl = lvl;
        charNum++;
    }

    // getter
    public String getName() {
        return name;
    }

    public boolean getIsFiveStar() {
        return isFiveStar;
    }

    public String getElement() {
        return element;
    }

    public int getCons() {
        return cons;
    }

    public int getLvl() {
        return lvl;
    }

    public static int getCharNum() {
        return charNum;
    }

    // setters
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }

    // brain method
    public String charInfo() {
        String info = "" + name;
        return info + ": " + element + " " + cons + " " + lvl;
    }

    public static String wishSim() {
        int pity = 0;
        int randomize = 1;
        boolean fiftyWon = false;

        while (pity <= 75) {
            if ((Math.random() * 100) == randomize) // checks if roll goes to early pity
            {
                if ((Math.random() * 100) > 50) // check if win 50/50 also resets pity
                {
                    pity = 0;
                    return "you did not win your 50/50";
                } else {
                    pity = 0;
                    return "you won your 50/50";
                }
            } // end first if
            else // if roll does not go to early pity adds 10 to pity
                pity += 10;

            System.out.println("your pity is: " + pity);
        }

        ////////////////////////////////////////////////////////// complex if above
        ////////////////////////////////////////////////////////// simple if below

        if ((Math.random() * 10) > 5 || fiftyWon) // check if 50/50 won also resets pity
        {
            pity = 0;
            fiftyWon = false;
            return "you won your 50/50!! yipeeee";
        } else {
            pity = 0;
            fiftyWon = true;
            return "5 star pulled but you did not win your 50/50 :( ";

        }

    }

    // toString
    public String toString() {
        return "Name: " + name + "\n" +
                "Is 5 Star: " + isFiveStar +
                "\n" + "Element: " + element +
                "\n" + "Cons: " + cons +
                "\n" + "Level: " + lvl;
    }

}
