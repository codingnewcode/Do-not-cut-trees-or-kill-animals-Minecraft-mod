/*package codingnewcode;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String gender; // but would like an enum or something listing genders.
    protected static final String[][] gendersInfos = {
            { "Male", "his" },
            { "Female", "her" },
            { "Other", "their" },
            { "None", "its" }
    };
    protected String picture;
    protected final String species;

    //public static int numberOfDogs = 0;
    //public static String test = "abc";

    public Animal(String name, int age, String gender, String picture) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.picture = picture;
        this.species = Main.getClassNameFromNativeClassName(this.getClass().toString());

        // bad idea in designing i think, see line around 928 for the reason why, could use url
        // in intellij but bit lazy.., see this maybe idk if works but could maybe intellij:
        // https://youtrack.jetbrains.com/issue/IDEA-252927/Copy-link-to-a-certain-line-of-code
        //numberOfDogs++;
    }

    public abstract void move() throws Exception;

    public void makeSound() {
        System.out.println("Whatever " + Main.getLowerCasedFirstCharString(this.species) + " sound");
    }

    public void birthdayCount() {
        this.age++;
        System.out.println(this.name + " is celebrating their birthday, they turned "
                + this.age + ".");
    }

    public void displayInfo() {
        System.out.println(this.toString());
    }

    @Override
    // static method cannot override instance method toString() in java.lang.Object
    // so using non static instead
    public String toString() {
        return ("Animal name: " + this.name + "; age: " + this.age + " years; gender: " + this.gender
                + "; picture: " + this.picture + "; species: " + this.species);
    }

    public abstract void runInCircles(int n);

    public String getSpecies() { return this.species; }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() { return this.age; }

    public void setAge(int age) {
        this.age = age;
    }
    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String picture) { this.picture = picture; }

    public String[] getGenderInfo() throws Exception {
        if (this.gender.equals("Male")) return this.gendersInfos[0];
        else if (this.gender.equals("Female")) return this.gendersInfos[1];
        else if (this.gender.equals("Other")) return this.gendersInfos[2];
        else if (this.gender.equals("None")) return this.gendersInfos[3];
        else {
            // no need to check twice the gender (after having checked it already at instanciation, but it
            // could be changed meanwhile, so throwing exception only if the gender is checked to not be
            // in any fo the genders in the supported genders), as it affects needlessly the performance.
            throw new Exception("Unknown gender.");
        }
    }

    public String getGenderName() throws Exception {
        if (this.gender.equals("Male")) return Animal.gendersInfos[0][0];
        else if (this.gender.equals("Female")) return Animal.gendersInfos[1][0];
        else if (this.gender.equals("Other")) return Animal.gendersInfos[2][0];
        else if (this.gender.equals("None")) return Animal.gendersInfos[3][0];
        else {
            // no need to check twice the gender (after having checked it already at instanciation, but it
            // could be changed meanwhile, so throwing exception only if the gender is checked to not be
            // in any fo the genders in the supported genders), as it affects needlessly the performance.
            throw new Exception("Unknown gender.");
        }
    }

    public String getGenderPronoun() throws Exception {
        if (this.gender.equals("Male")) return Animal.gendersInfos[0][1];
        else if (this.gender.equals("Female")) return Animal.gendersInfos[1][1];
        else if (this.gender.equals("Other")) return Animal.gendersInfos[2][1];
        else if (this.gender.equals("None")) return Animal.gendersInfos[3][1];
        else {
            // no need to check twice the gender (after having checked it already at instanciation, but it
            // could be changed meanwhile, so throwing exception only if the gender is checked to not be
            // in any fo the genders in the supported genders), as it affects needlessly the performance.
            throw new Exception("Unknown gender.");
        }
    }

    public boolean checkGenderIsValid(String gender) throws Exception {
        for (String[] g : gendersInfos){
            if (g[0].equals(gender)) {
                return true;
            }
        }

        // else:
        throw new Exception("Unknown gender.");
        // note: (could be optimized by having a separate function for throwing the error but do as
        // this for now i mean for this project i mean maybe).
    }

}
*/


