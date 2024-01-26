package codingnewcode;

//import java.text.DecimalFormat;
//import java.lang.reflect.Array;
//import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    //public static void main(String[] args) throws Exception {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, this is my mod xd");

        /*int testNum;
        testNum = 10;

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;

        boolean isMod = true;

        char firstLetter = 'e';
        String firstSentence = "Hello world";

        System.out.println(a);
        System.out.println('a');

        System.out.println("numbers: " + a + ", " + b + ", " + c + ", " + d + ".");

        Scanner myScanner = new Scanner(System.in);
        int myNum = myScanner.nextInt();
        System.out.println("You just typed: " + myNum + ".");

        // skip line to reset scanner:
        myScanner.nextLine();
        // now new input
        String myString = myScanner.nextLine();
        myScanner.close();
        System.out.println("You just typed: " + myString);
         */

        /*int a = 100;
        int b = 200;

        // addition
        int mySum = a + b;
        System.out.println("Sum: " + mySum);

        // substraction
        int mySubstr = a - b;
        System.out.println("Substraction: " + mySubstr);

        // multiplication
        int myMultipl = a * b;
        System.out.println("Mutliplication: " + myMultipl);

        // division
        int myDivis = a / b;
        System.out.println("Division: " + myDivis);
        float myDivisCast = (float) (a / b);
        System.out.println("Division with cast to float: " + myDivisCast);
        float myDivisCast2 = (float) ( ((float) (a)) / ((float) (b)) );
        System.out.println("Division with cast (2) to float: " + myDivisCast2);

        // modulo
        int myModulo = a % b;
        System.out.println("Modulo: " + myModulo);

        // math method
        float c = -107.5F;

        float myMath1 = Math.abs(c);
        System.out.println("Absolute: " + myMath1);
        */

        // doesnt work:
        // source for truncate: https://stackoverflow.com/a/1977039
        /*DecimalFormat myDf = new DecimalFormat();
        myDf.setMaximumFractionDigits(0);
        String myMath30String = myDf.format(c);
        float myMath30 = Float.parseFloat(myMath30String);
        System.out.println("Truncate: " + myMath30);*/

        // but an alternative way would work:
        // combination of ceil and round:
        // if num < 0 then trunc is Math.ceil (ex: -107.5 -> -107.0)
        // if num >= 0 then trunc is Math.floor (ex: 107.5 -> 107.0)
        // then before that just cast type to int
        // more details and perhaps ideas different way bit or not here:
        // https://stackoverflow.com/a/58630877

        /*float myMath2 = (float) Math.ceil(c); // rounding up
        System.out.println("Ceil: " + myMath2);

        float myMath3 = Math.round(c); // rounding
        System.out.println("Round: " + myMath3);

        float myMath4 = (float) Math.floor(c); // rounding down
        System.out.println("Floor: " + myMath4);

        float myMathMin = Math.min(c, a);
        System.out.println("Minimum: " + myMathMin);

        float myMathMax = Math.max(c, b);
        System.out.println("Maximum: " + myMathMax);
        */

        /*boolean isGoodVideo = true;
        boolean isSubsrcibed = false;
        System.out.println("This is a video " + isGoodVideo
                + ".\n subsribed status: " + isSubsrcibed + ".");

        boolean isCreative = false;
        System.out.println("Player is in creative mode: " + isCreative);

        // comparisons
        int points = 76;
        int pointsToPass = 55;

        if (points >= pointsToPass) {
            System.out.println("Congratulations ! you have passed");
        } else {
            System.out.println("Unfortunately, you have not passed.");
        }

        boolean isNotEqual = (100 != 101);
        System.out.println("is not equal: " + isNotEqual);

        boolean passedTest1 = true;
        boolean passedTest2 = true;
        boolean hasHonors = (passedTest1 && passedTest2);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int userAge = myScanner.nextInt();
        System.out.println("Your age is: " + userAge + " years.");

        System.out.println("Are you from Europe?");
        boolean isEuropean = myScanner.nextBoolean();

        int euDrinkingAge = 18;
        int usDrinkingAge = 21;

        boolean canDrink = ((isEuropean && userAge >= euDrinkingAge) ||
        (!isEuropean && userAge >= usDrinkingAge));
        boolean shouldNotDrink = true;

        System.out.println("Can you drink: " + canDrink);
        System.out.println("(but maybe you should not drink..:" + shouldNotDrink + ".)");
        */

        /*
        // assignment
        int mana = 100;
        System.out.println("Mana: " + mana);

        // addition
        mana += 20;
        System.out.println("Mana: " + mana);

        mana++;
        System.out.println("Mana: " + mana);

        mana += 1;
        System.out.println("Mana: " + mana);

        mana = mana + 1;
        System.out.println("Mana: " + mana);

        ++mana;
        System.out.println("Mana: " + mana);

        // substraction
        mana -= 20;
        System.out.println("Mana: " + mana);

        mana--;
        System.out.println("Mana: " + mana);

        mana -= 1;
        System.out.println("Mana: " + mana);

        mana = mana - 1;
        System.out.println("Mana: " + mana);

        --mana;
        System.out.println("Mana: " + mana);

        // multiply
        mana *= mana;
        System.out.println("Mana: " + mana);

        mana = mana * mana;
        System.out.println("Mana: " + mana);

        // divide
        mana = mana / mana;
        System.out.println("Mana: " + mana);

        mana /= mana;
        System.out.println("Mana: " + mana);

        // modulo
        int manaCopy = mana;
        mana %= mana;
        System.out.println("Mana: " + mana);

        mana = manaCopy;
        mana = mana % mana;
        System.out.println("Mana: " + mana);
        */

        // control flow (if and switch)
        /*
        // if
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How much health do you have?");
        int userHealth = myScanner.nextInt();
        boolean isAlive = (userHealth > 0);

        if (isAlive) {
            System.out.println("You are still alive!");

            int userPoints = 0;
            int highWinThreshold = 100;
            int passThreshold = 50;

            while (userPoints < passThreshold) {
                System.out.println("How many points do you have?");
                userPoints = myScanner.nextInt();

                if (userPoints < passThreshold) {
                    System.out.println("Win condition(s) not fulfilled, resuming game.");
                }
            }

            if (userPoints >= highWinThreshold) {
                System.out.println("Congratulations!! You reach the high win condition!!");
            } else if (userPoints >= passThreshold) {
                System.out.println("Congratulations, you reach the conditions to win.");
            } else {
                System.out.println("Unknown error. Please report to devs.");
            }
        } else {
            System.out.println("You have lost the game.");
        }
        */

        /*
        // switch
        int x = 0;

        switch (x) {
            case 0: System.out.println("x is 0"); break;
            case 1: System.out.println("x is 1"); break;
            case 2: System.out.println("x is 2"); break;
            case 3: System.out.println("x is 3"); break;
            default: System.out.println("x is unknown."); break;
        }
        */

        // loops (for and while)
        // Outputting all numbers from 0 to 99:

        /*
        int x = 0;
        while (x <= 99) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }
        */


        /*for (int i = 0; i <= 99; ++i) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }*/


        /*// output years between 1000 and 2000, only leap years, using the for loop:
        // definition found by myself in: https://fr.wikipedia.org/wiki/Ann%C3%A9e_bissextile#:~:text=C'est%20ainsi%20que%20les,%2C%202100%2C%202200%20et%202300.
        for (int i = 1000; i <= 2000; i++) {
            if (i % 4 == 0) {
                if (i % 100 == 0) {
                    if (i % 400 == 0) {
                        System.out.println(i);
                    } //else {
                       // continue;
                    //}
                } else {
                    System.out.println(i);
                }
            }
        }
        */

        /*
        int playerHealth = 10;
        while (playerHealth > 0) {
            System.out.println("Player is alive, with " + playerHealth + " HP.");

            if (playerHealth == 2) {
                System.out.println("Critical health reached, exiting..");
                break;
            }

            playerHealth--;
        }
        */

        /*
        // exercise: calculator
        System.out.println("Welcome to the calculator");
        boolean isExit = false;
        Scanner myScanner = new Scanner(System.in);
        float num1;
        float num2;
        String operator; // "+", "-", "*", "/", "="
        float result;
        String operatorsString = "(+, -, *, /, %)";
        String exampleNumbersString = "(float format, for example: 3,14 ; 1 ;  -2,5 ; etc)";

        while (!isExit) {
            System.out.println("Please input the first number " + exampleNumbersString + ":");
            num1 = myScanner.nextFloat();

            System.out.println("Please input operator type " + operatorsString + ".");
            operator = myScanner.next();
            if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*")
                && !operator.equals("/") && !operator.equals("%")) {
                System.out.println("Unknown operator, operators are " + operatorsString +
                        ", please start again.");
                continue;
            }

            System.out.println("Please input the second number" + exampleNumbersString + ":");
            num2 = myScanner.nextFloat();
            if (num2 == 0 && (operator.equals("/") || operator.equals("%"))) {
                System.out.println("Error: cannot divide by 0. Please start again.");
                continue;
            }

            if (operator.equals("+")) {
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result + ".");
            } else if (operator.equals("-")) {
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result + ".");
            }
            else if (operator.equals("*")) {
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result + ".");
            } else if (operator.equals("/")) {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result + ".");
            } else if (operator.equals("%")) {
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result + ".");
            } else {
                System.out.println("Unknown error, please report to devs.");
            }

            System.out.println("Exit? (input: true or false)");
            isExit = myScanner.nextBoolean();
        }
        */

        /*
        // ternary operator:
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How much Health points do you have?");
        int userHealth = myScanner.nextInt();
        int deathThreshold = 0;

        String userStatus = ((userHealth > deathThreshold) ? "alive"
                : ((userHealth == deathThreshold) ? "dead" : "very dead"));
        System.out.println("You are " + userStatus + ".");
        */

        /*
        // casting

        // turning one data type into another
        int userHealth = 10;
        float enemyDamage = 1.5f;

        // int resultHealth = userHealth - enemyDamage;
        float resultHealthFloat = userHealth - enemyDamage; // Implicit cast: float to int
        System.out.println("Result Float: " + resultHealthFloat);

        int resultHealthInteger = userHealth - (int) enemyDamage; // Explicit cast: float to int
        System.out.println("Result Integer: " + resultHealthInteger);

        int resultHealthInteger2 = (int) (userHealth - enemyDamage); // Explicit cast: float to int(2)
        System.out.println("Result Integer 2: " + resultHealthInteger2);

        int resultHealthInteger3 = (int) ((float) userHealth - enemyDamage); // Explicit cast: float to int(2)
        System.out.println("Result Integer 3: " + resultHealthInteger3);

        String userPoint = "100";
        int resultStringToInt = Integer.parseInt(userPoint) + 5;
        System.out.println(resultStringToInt);

        System.out.println(userPoint + 5);
        */

        /*
        // String and String methods
        String userName = "userTestName";
        String userOccupation = "(Watching video tutorial(s), etc)";
        userOccupation += "r";
        System.out.println("User " + userName + " has occupation: " + userOccupation);

        String mySentence = "Hello world, today, world.";
        System.out.println(mySentence);

        // First char (index = 0) is always in Caps
        StringBuilder mySentenceBuilderInCaps = new StringBuilder()
                .append(Character.toUpperCase(mySentence.charAt(0)));

        // hence the loop starts at index i = 1
        for (int i = 1; i < mySentence.length(); ++i) {
            // if last index is a space, next word starts with a caps (uppercase),
            // else do not upper case
            if (mySentence.charAt(i - 1) == ' ') {
                mySentenceBuilderInCaps.append(Character.toUpperCase(mySentence.charAt(i)));
            } else {
                mySentenceBuilderInCaps.append(mySentence.charAt(i));
            }
        }

        System.out.println(mySentenceBuilderInCaps.toString());

        System.out.println(mySentence.toUpperCase());
        System.out.println(mySentence.toLowerCase());
        System.out.println(mySentence.getClass().toString());

        // contain
        String myStringToSearch = "world".toLowerCase();
        System.out.println("Does it contain \"" + myStringToSearch + "\": " +
                (mySentence.toLowerCase().contains(myStringToSearch) ? "yes" : "no"));

        // replaceAll (takes regExp as input (= parameters))
        //String mySentenceReplacedAll = mySentence.replaceAll("world", "universe");
        //System.out.println(mySentenceReplacedAll);

        // replace
        String mySentenceReplaced = mySentence.replace("world", "universe");
        System.out.println(mySentenceReplaced);
        // note: original string is not replaced, .replace method returns a new one:
        System.out.println(mySentence);

        // charAt
        System.out.println(mySentence.charAt(0));

        // compare
        Scanner myScanner = new Scanner(System.in);
        String inputtedString = myScanner.next();
        // "==" for strings does not compare string character content but soemthing else
        // (pointers?), so inputted "Hello" via scanner == "Hello" 's test is false, but
        // "Hello" ==  "Hello" variables is true, to avoid that issue use preferably .equals
        // method of the String class when comparing strings.
        //System.out.println(inputtedString == "Hello");
        System.out.println(inputtedString.equals("Hello"));
        */

        // string arrays
        // note: could use LinkedHashSet to avoid repetition of species "Apple" twice
        // by calling species[4] = myLinkedHashSet[0].
        // but after further research better to make a list of elements only once and then
        // a list that may call it once or more
        //int n = 5;

        /*
        String[] species = new String[4];
        species[0] = "Apple";
        species[1] = "Banana";
        species[2] = "Squash";
        species[3] = "Olive";

        // num of mySpecies and myCultivars is the same so make it into one variable easier to
        // manage
        int n = 5;

        // note : could make an array of unique cultivar names but for this exercise its
        // species that may appear several times (example: several kinds(=cultivars) of apples
        // such as Golden Delicious and Chantereine but not several kinds of species into the
        // same cultivar (example seveal kinds of Apple species into the same Golden Delicious
        // cultivar" does not make sense, so no need to create a unique array of cultivars
//        String[] myCultivars = new String[n];
//        myCultivars[0] = "Golden Delicious";
//        myCultivars[1] = "Cavendish";
//        myCultivars[2] = "Butternut";
//        myCultivars[3] = "Nyons";
//        myCultivars[4] = "Chantereine";
//
//        String[] mySpecies = new String[n];
//        mySpecies[0] = species[0];
//        mySpecies[1] = species[1];
//        mySpecies[2] = species[2];
//        mySpecies[3] = species[3];
//        mySpecies[4] = species[0];

        String[][] myFruits = new String[n][n];
        myFruits[0][0] = "Golden Delicious";
        myFruits[1][0] = "Cavendish";
        myFruits[2][0] = "Butternut";
        myFruits[3][0] = "Nyons";
        myFruits[4][0] = "Chantereine";

        myFruits[0][1] = species[0];
        myFruits[1][1] = species[1];
        myFruits[2][1] = species[2];
        myFruits[3][1] = species[3];
        myFruits[4][1] = species[0];

        // int currentIndex = 0;
        // System.out.println("Fruit species: \"" + mySpecies[currentIndex] + "\", and cultivar: \"" +
        //        myCultivars[currentIndex] + "\".");

        // note: in this case n is already defined so could use it as Array length is not changed
        // by adding extra elements or removing existing ones.
        // It also serves as a safety measure in case array length is changed without knowing
        // (unlikely), but would produce an error in this case at least.
        // But actually after second thought.. it is possible to allow such changes but just put
        // .length of the array and then everyone is happy hopefully, is what i hope i mean peace
        // in world.
        // But there is a new problem, if mySpecies and myCultivar number is not synchronized,
        // then throw error, ideally would put this error at myCultivars append of a new element
        // to similarly make sure it is also added a corresponding mySpecies element, else throw error,
        // this could be wrapped in a function, or using more advanced types such as two-dimensional
        // arrays or i forgot the name but is as is, so just putting it as a note here.
        // now to improve this after creating the myFruits variable is to make sure we or the user
        // doesnt mix the order of species vs cultivar order with a function for example
        // (input cultivar name, then select one of the following species, if species is not listed here,
        // press key to create a new one the reloop through the entry creation!!
        // and
        // for (int i = 0; i < n; ++i) {

        //for (int i = 0; i < myFruits.length; ++i) {
        //    System.out.println("Fruit species: \"" + myFruits[i][0] + "\", and cultivar: \"" +
        //            myFruits[i][1] + "\".");

        // with an enhanced for/ = foreach loop
        // more details in, for example: https://www.data-transitionnumerique.com/foreach-java/
        // from what i understand idea i got, could in asynchronous context reduce errors,
        // for example an entry is added or removed in asynchronous mode while array is navigated
        // in the for .length loop, maybe this would avoid the error? or better performance as
        // they say maybe to not increment index each time in thousands or millions etc of data
        // nums? edit it seems this (adding or removing entries sin an array) requires to create a
        // new array so nvm maybe or not sure but use foreach maybe.
        // more details in (copyOf old arrya to new array +1 or if delete navigate one by one to
        // remove selected index(ex) create your own method maybe or use library or something or
        // own method.
        // or better, use ArrayList, more dynamic usage etc but slower so consider which
        // depending on case, in:
        // very nice read of all options possible:
        // https://ioflood.com/blog/java-add-to-array/

        //for (int i = 0; i < 5; ++i) {
        //    for (String[] myFruit : myFruits) {
        //        System.out.println("Fruit species: \"" + myFruit[0] + "\", and cultivar: \"" +
        //                myFruit[1] + "\".");
        //    }
        //}

        // methods
        System.out.println(sum(3, 5));

        //outputFruitsInfoExtractedMethodXTimes(5, myFruits);
        //System.out.println("---------------");
        //outputFruitsInfoExtractedMethodXTimes(2, myFruits);
        //System.out.println("---------------");
        //outputFruitsInfoExtractedMethodXTimes(3, myFruits);
        //System.out.println("---------------");
        //outputFruitsInfoExtractedMethodXTimes(8, myFruits);
        //System.out.println("---------------");
        //outputFruitsInfoExtractedMethodXTimes(6, myFruits);

        // fill arrayList
        // instanciate only once, even if cleared later object id is sitll same one
        // in memory.
        ArrayList<ArrayList<String>> myFruitsArrayList = new ArrayList<>();
        // could write a method for that as it is used twice but simpler:
        for (String[] myFruit : myFruits) {
            myFruitsArrayList.add(getMyFruitFromMyFruitArray(myFruit));
        }
        //displayFruitsArrayList(myFruitsArrayList);
        // simpler
        System.out.println(getMyFruitsArrayListToString(myFruitsArrayList));

        // remove
        myFruitsArrayList.remove(1);
        //displayFruitsArrayList(myFruitsArrayList);
        // simpler
        System.out.println(getMyFruitsArrayListToString(myFruitsArrayList));

        // clear
        myFruitsArrayList.clear();
        //displayFruitsArrayList(myFruitsArrayList);
        // simpler
        System.out.println(getMyFruitsArrayListToString(myFruitsArrayList));

        // fill arrayList
        // could write a method for that as it is used twice but simpler:
        for (String[] myFruit : myFruits) {
            myFruitsArrayList.add(getMyFruitFromMyFruitArray(myFruit));
        }
        //displayFruitsArrayList(myFruitsArrayList);
        // simpler
        System.out.println(getMyFruitsArrayListToString(myFruitsArrayList));

        // fill again arrayList
        // could write a method for that as it is used twice but simpler:
        for (String[] myFruit : myFruits) {
            myFruitsArrayList.add(getMyFruitFromMyFruitArray(myFruit));
        }
        //displayFruitsArrayList(myFruitsArrayList);
        // simpler
        System.out.println(getMyFruitsArrayListToString(myFruitsArrayList));

        // remove again
        myFruitsArrayList.remove(1);
        //displayFruitsArrayList(myFruitsArrayList);
        // simpler
        System.out.println(getMyFruitsArrayListToString(myFruitsArrayList));

        // fill again again arrayList
        // could write a method for that as it is used twice but simpler:
        for (String[] myFruit : myFruits) {
            myFruitsArrayList.add(getMyFruitFromMyFruitArray(myFruit));
        }
        //displayFruitsArrayList(myFruitsArrayList);
        // simpler
        System.out.println(getMyFruitsArrayListToString(myFruitsArrayList));

        // test count of ArrayList element: <"Apple", "Golden Delicious">
        // is it equal to 3 ?
        // use Collections method betetr easier fgaster (but could) than rewrite all
        // https://stackoverflow.com/a/2459753
        // temp first arrayList element
        //ArrayList<String> tempArrayList = new ArrayList<>();
        //tempArrayList.add(myFruits[0][0]);
        //tempArrayList.add(myFruits[0][1]);
        //ArrayList<ArrayList<String>> testFirstArrayList = new ArrayList<>();
        //testFirstArrayList.add(tempArrayList);
        // should be <"Apple", "Golden Delicious"> arrayList for example first element
        // in myFruits.
        //note: this seems to not work so comapring species or cultivar coutn rather, could
        //rewrite all but long and maybe not ideal, anyways, method easier hope helps solve:
        int countApple = 0;
        String testFruitString = myFruits[0][1]; // "Apple" for example in this test
        for (ArrayList<String> myFruitArrayList : myFruitsArrayList) {
            // works but test variable "Apple" externally from constant source.
            // myFruit.contains(myFruit.get(0))
            for (String s : myFruitArrayList) {
                if (s.equals(testFruitString)) {
                    countApple++;
                }
            }
            //Collections.frequency(myFruitsArrayList, testFruitString);
        }
        System.out.println(countApple);

        // get
        System.out.println(myFruitsArrayList.get(1)); // "Apple"
        System.out.println(myFruitsArrayList.get(0).get(1)); // "Apple"
        System.out.println(myFruitsArrayList.get(0).get(0)); // "Golden Delicious"

        // contains
        //myFruitsArrayList.contains("Apple"); // is false but ignored by compielr because an
        // arrayList cant contain a String different types.
        // so try the Collections.frequency method of in https://stackoverflow.com/a/2459753 :
        // same error a string is not counted among arrayList elements, so navigate first
        // element as an example, or use loop as i did before with count using the frequency
        // method this time:

        System.out.println(Collections.frequency(myFruitsArrayList, myFruits[0][1]));
        System.out.println(myFruitsArrayList.get(0).contains(myFruits[0][1]));
        System.out.println(myFruitsArrayList.get(0).contains("Apple"));

        int countApple2 = 0;
        //String testFruitString = myFruits[0][1]; // "Apple" for example in this test
        for (ArrayList<String> myFruitArrayList : myFruitsArrayList) {
            // works but test variable "Apple" externally from constant source.
            // myFruit.contains(myFruit.get(0))
            //for (String s : myFruitArrayList) {
                //if (s.equals(testFruitString)) {
                //    countApple++;
                //}
            //}
            countApple2 += Collections.frequency(myFruitArrayList, testFruitString);
        }

        System.out.println(countApple2);

        ArrayList<Integer> myArrayListInts = new ArrayList<>();
        myArrayListInts.add(1);
        myArrayListInts.add(2);
        System.out.println(myArrayListInts.toString());

        HashSet<Integer> myHashSetInts = new HashSet<>();
        myHashSetInts.add(1);
        myHashSetInts.add(2);
        myHashSetInts.add(4);
        myHashSetInts.add(5);
        myHashSetInts.add(2);
        myHashSetInts.remove(1);
        myHashSetInts.add(4);
        myHashSetInts.add(0);
        myHashSetInts.add(-1);
        myHashSetInts.add(100);
        System.out.println(myHashSetInts);

        HashSet<String> myHashSetCountries = new HashSet<>();
        myHashSetCountries.add("France");
        myHashSetCountries.add("United States");
        myHashSetCountries.add("Japan");
        System.out.println(myHashSetCountries);

        // HashSet of arrays:
        // as explained in https://stackoverflow.com/a/7488153, HashSet use arrays as hashCode
        // so cant use that inside, use a List instead such as ArrayList in method 3:
        // method 1
        //HashSet<String[]> myHashSetCountries2 = new HashSet<>();
        //String[] tempStringArray = new String[2];
        //tempStringArray[0] = "France";
        //tempStringArray[1] = "Europe (Western)";
        // return the full array returned in one string, then display it:
        // System.out.println(Arrays.toString(tempStringArray));
        // method 2 of adding element
        //System.out.println(Arrays.toString(new String[]{ "France", "Western" }));
        //myHashSetCountries2.add(tempStringArray);
        //myHashSetCountries2.add(new String[] { "United States", "America (North)" });
        //myHashSetCountries2.add(new String[] { "Japan", "Asia (South-East)" });
        //System.out.println(myHashSetCountries2.toString());
        // method 3:
        HashSet<ArrayList<String>> myHashSetCountries3 = new HashSet<>();

        // code below commented out doesnt work due to using List instead of ArrayList
        //myHashSetCountries3.add(Arrays.asList("a", "b", "c"));
        // so coding it ourselves faster easier rather and done :
        //ArrayList<String> tempArrayList = new ArrayList<>();

        //tempArrayList.add("France");
        //tempArrayList.add("Europe (Western)");
        //System.out.println(tempArrayList);
        //myHashSetCountries3.add(tempArrayList);
        //tempArrayList.clear();

        //tempArrayList.add("United States");
        //tempArrayList.add("America (North)");
        //System.out.println(myHashSetCountries3);
        //myHashSetCountries3.add(tempArrayList);
        //tempArrayList.clear();

        //tempArrayList.add("Japan");
        //tempArrayList.add("Asia (South-East)");
        //System.out.println(myHashSetCountries3);
        //myHashSetCountries3.add(tempArrayList);
        //tempArrayList.clear();

        // could improve the spaghetti work with a method for example but works for now..
        //System.out.println(myHashSetCountries3);
        // edit: doesnt work... ArrayLists are no good so use Lists as they said..

        HashSet<List<String>> testList = new HashSet<>();
        testList.add(Arrays.asList("France", "Europe (Western)"));
        testList.add(Arrays.asList("United States", "America (North)"));
        testList.add(Arrays.asList("Japan", "Asia (South-East)"));
        System.out.println(testList);

        // tada!!! and works!! in your face zamaaaamiro!!!! as they said in aniem xd
        // but also cheh xd... xd i am on edge xd or not anyways..
        // it works.. lets move on now on the tutorial.. phew xd anyways lets move on
        // on the tutorial..

        // Map
        HashMap<String, String> myFruitsHashMap = new HashMap<>();
        for (ArrayList<String> myFruitArrayList : myFruitsArrayList) {
            myFruitsHashMap.put(myFruitArrayList.get(0), myFruitArrayList.get(1));
        }

        System.out.println(myFruitsHashMap);
        System.out.println(myFruitsHashMap.keySet());
        System.out.println(myFruitsHashMap.entrySet());
        System.out.println(myFruitsHashMap.values());

        // containsKey, containsValue
        System.out.println(myFruitsHashMap.containsKey("Apple"));
        System.out.println(myFruitsHashMap.containsValue("Apple"));
        System.out.println(myFruitsHashMap.containsKey(myFruits[0][1])); // "Apple" -> false
        System.out.println(myFruitsHashMap.containsValue(myFruits[0][1])); // "Apple" -> true
        System.out.println(myFruitsHashMap.containsKey(myFruits[0][0])); // "Golden Delicious"
        // -> true
        System.out.println(myFruitsHashMap.containsValue(myFruits[0][0])); // "Golden Delicious"
        // -> false

        // get
        System.out.println(myFruitsHashMap.get(myFruits[0][1])); // "Apple" -> null
        System.out.println(myFruitsHashMap.get(myFruits[0][0])); // "Golden Delicious"
        // -> "Apple"
        // get keys frm value is more complicated but could work as explained here for example:
        // https://stackoverflow.com/a/35763323
        // by navigating the map as a loop, very very cool anyways lets move on on the
        // tutorial..

        // HashMap<Integer, String>
        HashMap<Integer, String> miniAlphabet = new HashMap<>();
        miniAlphabet.put(0, "a");
        miniAlphabet.put(1, "b");
        miniAlphabet.put(2, "c");
        miniAlphabet.put(3, "d");
        miniAlphabet.put(4, "e");
        miniAlphabet.put(5, "f");
        miniAlphabet.put(1, "bb");
        miniAlphabet.remove(1);
        System.out.println(miniAlphabet);

        // but actually in tutorial too.. iterate over a Map:
        for (Map.Entry<Integer, String> e : miniAlphabet.entrySet()) {
            System.out.println(e.getValue() + " is the value, and " + e.getKey() + " is the key.");
        }

        //
        // iterate over a set:
        // with the enhanced loop for as suggested in: https://stackoverflow.com/a/12455755
        for (String s : myHashSetCountries) {
            System.out.println(s);
        }
        */

        /*
        // exercise 2: calculator
        // (slightly updated from first old code):
        System.out.println("Welcome to the calculator");
        boolean isExit = false;
        Scanner myScanner = new Scanner(System.in);
        float num1;
        float num2;
        String myOperator;
        String[] operators = { "+", "-", "*", "/", "%" };
        String operatorsDescription = "(+, -, *, /, %)";
        String exampleNumbersString = "(float format, for example: 3,14 ; 1 ;  -2,5 ; etc)";

        while (!isExit) {
            System.out.println("Please input the first number " + exampleNumbersString + ":");
            // Scanner error workaround: https://stackoverflow.com/a/60422240
            // my own workaround now:
            num1 = Float.parseFloat(myScanner.next());

            System.out.println("Please input operator type " + operatorsDescription + ".");
            myOperator = myScanner.next();
            boolean isContainOperator = false;
            for (String o : operators) {
                if (o.equals(myOperator)) {
                    // operator is indeed among listed allowed ones, can continue the operation.
                    isContainOperator = true;
                    System.out.println("ok");
                    break;
                }
            }
            if (!isContainOperator) {
                System.out.println("Unknown operator, operators are " + operatorsDescription +
                        ", please start again.");
                continue;
            }

            System.out.println("Please input the second number" + exampleNumbersString + ":");
            //num2 = myScanner.nextFloat();
            //my workaround:
            num2 = Float.parseFloat(myScanner.next());
            if (num2 == 0 && (myOperator.equals("/") || myOperator.equals("%"))) {
                System.out.println("Error: cannot divide by 0. Please start again.");
                continue;
            }

            float myResult = getResult(num1, num2, myOperator);
            outputResult(num1, num2, myResult, myOperator);

            isExit = checkExit(myScanner);
        }*/

        // classes and objects
        //Dog myDog1 = new Dog("bensonDarr", 10,"BensonDarr.jpg");
        /*
        Dog myDog1 = new Dog("BensonDarr", 10, "Male", "BensonDarr.jpg");
        Dog myDog2 = new Dog("Woof", 5, "Female", "Waouh.jpg");

        ArrayList<Dog> myDogs = new ArrayList<>();
        myDogs.add(myDog1);
        myDogs.add(myDog2);

        System.out.println(myDog1);
        System.out.println(myDog2);

        myDog1.birthdayCount();

        System.out.println(myDog1);
        System.out.println(myDog2);

        myDog1.birthdayCount();
        myDog2.birthdayCount();

        System.out.println(myDog1);
        System.out.println(myDog2);
        */
        // see if changed in array:
        // (result: it is the same linked object in arrayList and variable, same memory address
        // i think anyways same object in memory of arrayList myDogs.get(1) and local variable
        // myDog2 in main.
        /*System.out.println(myDogs.get(0));
        System.out.println(myDogs.get(1));*/

        // access modifiers

        //System.out.println("numberOfDogs: " + Dog.numberOfDogs);
        //System.out.println(myDog1.numberOfDogs);
        //System.out.println(myDog2.numberOfDogs);

        //Dog myDog3 = new Dog("WoofWoof", 15, "WoofWoof.jpg");
        //System.out.println(myDog3.numberOfDogs);
        //System.out.println("numberOfDogs: " + Dog.numberOfDogs);
        //System.out.println(myDog1.numberOfDogs);
        //System.out.println(myDog2.numberOfDogs);
        // but is bad idea i think because when a dog is destructed/ removed there are
        // no  destructors in java (unless workaorund finalize method) so easiest owuld be to
        // find another way to count dogs maybe that is not inherent into all dogs properties,
        // in real life too all dogs each dog doesnt carry in his/her dna identity the nubmer
        // of total dogs

        //System.out.println(Dog.test);
        //Dog.test += "d";
        //myDog1.test += "e";
        //myDog2.test += "f";
        //myDog3.test += "g";
        //System.out.println(Dog.test);
        //System.out.println(myDog1.test);
        //System.out.println(myDog2.test);
        //System.out.println(myDog3.test);

        // inheritance and polymorphism

        // weird but works Animal new vairable into Cat class instantiation
        //Animal myCat1 = new Cat("Meowie", 15, "Meowie.jpg");
        // same for Dog class too
        // note that in these cases (Cat/Dog coming from Animal), species is still Cat/Dog as
        // intended and not Animal
        //Animal myDog4 = new Dog("WoofWoofWoof", 18, "WoofWoofWoof.jpg");
        //Animal myCat1 = new Cat("Meowie", 15, "Meowie.jpg");
        //Dog myDog4 = new Dog("WoofWoofWoof", 18, "WoofWoofWoof.jpg");
        //Cat myCat1 = new Cat("meowie", 15, "Meowie.jpg");
        /*Cat myCat1 = new Cat("Meowie", 15, "Male", "Meowie.jpg");*/
        //bit weird so stick to stricter Class design maybe ad in my case abstract maybe.

        /*
        // swithching to displayInfo method indeed easier as in tutorial
        // note 2: but indeed as tutorial says as extension of note 1 arround line 950 = note,
        // i mean additionnally to this note indeed even though both as created as ANimals (myDog4
        // and myCat1), in fact they are both the child method repsectively of Dog and Cat
        // makeSound() "Woof" or "Meow", but keep as Dog or Cat instanciation raher than Animal,
        // and in my case making abstract too.
        myCat1.makeSound();
        myDog1.makeSound();
        myDog2.makeSound();
        //myDog4.makeSound();
        myDog2.makeSound();
        myCat1.displayInfo();
        myDog1.displayInfo();
        //myDog4.displayInfo();

        // making Animal class abstract so cannot instantiate from it anymore, use subclasses
        // if need
        //Animal myAnimal1 = new Animal("a", 1, "a.jpg");
        //myAnimal1.makeSound();
        //myAnimal1.displayInfo();

        // interfaces and abstract classes
        myDog1.move();
        myDog2.move();
        myCat1.move();
        */

        // creating Animal type needs a cast to Bird later so creating a Bird to see as i did first but
        // anyways to see:
        //Animal myBird1 = new Bird("Thunderbird", 20, "None", "thunderbird.jpg");
        /*Bird myBird1 = new Bird("Thunderbird", 20, "None", "thunderbird.jpg");
        myBird1.displayInfo();
        myBird1.move();
        //((Bird) myBird1).fly();
        myBird1.fly();

        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(myDog1);
        myAnimals.add(myDog2);
        myAnimals.add(myCat1);
        myAnimals.add(myBird1);

        System.out.println(myAnimals);
        */

        //ArrayList<IFlyable> myFlyingAnimals = new ArrayList<>();
        //for (Animal a : myAnimals) {
        //    if (a.getName().equals("Thunderbird")) {
        //        myFlyingAnimals.add((IFlyable) a);
        //    }
        //}
        //System.out.println(myFlyingAnimals);

        /*ArrayList<IFlyable> myFlyables = new ArrayList<>();
        myFlyables.add(myBird1);
        myFlyables.add(new Aeroplane());

        System.out.println(myFlyables);

        for (Animal a : myAnimals) {
            a.move();
            a.makeSound();
        }

        for (IFlyable myI : myFlyables) {
            myI.fly();
        }

        // anonymous classes

        // does not work to instantiate from abstract class as shown in tutorial too.
        //Animal myAnimal1 = new Animal("SomeAnimal", 15, "Male", "SomeAnimal.jpg");
        // note: way of doing it below (anonymous = +/- local classes) is a subclass (extends = inheritance),
        // this is why Animal class's methods are called via super, i mean it seems i think that this anonymous
        // class is inherited from Animal but anonymous (in the local scope only (i think)) based on what i
        // understand from the tutorial, anyways..
        Animal myAnimal1 = new Animal("SomeAnimal", 15, "Male", "someAnimal.jpg") {

            @Override
            public void move() throws Exception {
                System.out.println(this.name + " is running in " + this.getGenderPronoun() + " wheel.");
            }

            @Override
            public void makeSound() {
                System.out.println("Qweeek!");
            }

            @Override
            public void runInCircles(int n) {};
        };

        myAnimal1.move();
        myAnimal1.makeSound();
        myAnimal1.runInCircles(1);

        myAnimals.add(myAnimal1);

        System.out.println(myAnimals);

        // anonymous class can be from non abstract (base) classes too, for example:
        Bird myBird2 = new Bird("Weekie", 7, "Other", "weekie.jpg") {
            // no need to implement the abstract method move because already done in the parent class of
            // Bird: Animal, so Bird has the non abstract ready to use/be instantiated method move(), hence
            // the subclass of Bird (which is the class of myBird2) has this method too so no need to re declare
            // it..

            // for the need of this method, creating a method (else no purpose to create a new class if not
            // different from Bird).
            public void runInCircles(int n) {
                for (int i = 0; i < n; ++i) {
                    System.out.println(this.name + " has made a lap! Total number of laps in a row: " +
                            (i + 1) + ".");
                }
            }

            //test to override fly() ethod to see if Bird is parent = superclass relative to class of myBird2
            // (which is anonymous one, which i think extends myBird2).
            // result: indeed myBird2's class is a subclass (extends, inherits) the class Bird (which is the
            // parent = superclass) of myBird2's class indeed, because fly() method of Bird class can indeed be
            // called with super.fly() from myBird2's instance, so myBird2's class is indeed a subclass of Bird.
            @Override
            public void fly() throws Exception {
                super.fly();
                System.out.println(this.name + " is using " + this.getGenderPronoun() + " wings to fly!!");
            }
        };

        myBird2.fly();
        myBird2.makeSound();
        myBird2.runInCircles(1);
        */

        // enums and advanced enums
        /*Difficulty gameDifficulty = Difficulty.HARD;
        System.out.println("Game difficulty is: " + gameDifficulty + ".");

        ToolMaterial myToolMaterialAxe = ToolMaterial.STONE;
        ToolMaterial myToolMaterialShovel = ToolMaterial.IRON;

        System.out.println("My axe is made of " + myToolMaterialAxe.getDisplayName()
                + ", has a durability of " +  myToolMaterialAxe.getDurability()
                + ", and a mining speed of: " + myToolMaterialAxe.getMiningSpeed() + ".");

        System.out.println("My shovel is made of " + myToolMaterialShovel.getDisplayName()
                + ", has a durability of " +  myToolMaterialShovel.getDurability()
                + ", and a mining speed of: " + myToolMaterialShovel.getMiningSpeed() + ".");
         */

        // exceptions, and try and catch:
        /*int x = 10;
        try {
            System.out.println("test21.");
            x = 100 / 0;
            System.out.println("test2.");
        } catch(Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("test3.");

        }

        System.out.println("test.");

        if (x < 100) {
            throw new Exception("Test throw of an exception");
        }
        */

        // generics
        /*
        BlockStorage<Block> myBlockStorage = new BlockStorage<>();

        myBlockStorage.addBlock(new StoneBlock());
        myBlockStorage.addBlock(new StoneBlock());
        myBlockStorage.addBlock(new WoodBlock());
        myBlockStorage.addBlock(new StoneBlock());

        myBlockStorage.displayBlocks();

        BlockStorage<WoodBlock> myWoodBlockStorage = new BlockStorage<>();

        myWoodBlockStorage.addBlock(new WoodBlock());
        // does not work adding stone block into wood block storage
        // myBlockStorage.addBlock(new StoneBlock());
        // but can add a sub class of wood block such as wood log block, for example i mean.
        myWoodBlockStorage.addBlock(new WoodLogBlock());

        myWoodBlockStorage.displayBlocks();
         */

        // lambda expressions
        /*helloWord();
        test();

        Runnable myRunnable = () -> {
            System.out.println("Hello World2");
        };
        myRunnable.run();
        test(myRunnable);
        test(Main::helloWord);

        System.out.println(getSS());
        Supplier<String> mySupplier = () -> ("s" + "s" + "0");
        System.out.println(mySupplier.get());
        System.out.println(getSS(mySupplier));

        Consumer<Runnable> test2 = runnable -> {
            runnable.run();
        };
        test2.accept(myRunnable);

        Runnable myMethod = Main::helloWord;
        myMethod.run();

        Runnable myMethod2 = Main::test;
        myMethod2.run();

        // impossible to consumer a supplier causez  aconsuemr takes one pârater in and returns nothing so only runnable
        // i think
        //Consumer<Supplier> test3 = test3;
        */

        // streams
        /*
        ArrayList<String> myFruits = new ArrayList<>();
        myFruits.addAll(Arrays.asList("Apple", "Banana", "Orange", "Mango", "Pineapple", "Mandarin"));
        myFruits.stream()
                .filter(fruit -> fruit.startsWith("M"))
                .forEach(fruit -> System.out.println(fruit + "1"))
        ;
        */

        // records
        /*Player steve = new Player("Steve", 15);
        System.out.println("Player Steve: " + steve.playerName() + ", Level: " + steve.experienceLevel() + ".");
        System.out.println(steve);
         */

        // JSON files
        /*
        */

        //last tutorial
        //final int x = 30;
        //not possible atfer final assign:
        // x = 5;

        // not possible to get element from null object not assigned:
        //ArrayList<String> names = null;
        //names.get(0);

        // all type auto find:
        // var y = "abcdefg";

        //design patterns for java
        //singleton pattern

    }

    /*public static void helloWord() {
        System.out.println("Hello world.");
    }

    public static void test() {
        helloWord();
    }
    public static void test(Runnable runnable) {
        helloWord();
        runnable.run();
    }

    public static String getSS() {
        return "s" + "s" + "1";
    }

    public static String getSS(Supplier<String> supplier) {
        return supplier.get();
    }
    */

    // since animal name always starts with first letter this method is not needed in this case,
    // but is interesting to know how to make, bit help from stackoverflow sub comment too of -1
    // public static String getCapitalizedString(String s) {
    //    return (s.substring(0, 1).toUpperCase() + s.substring(1));
    //}

    /*
    public static String getLowerCasedFirstCharString(String s) {
        return (s.substring(0, 0).toLowerCase() + s.substring(1));
    }

    public static String getClassNameFromNativeClassName(String nativeClassName) {
        // my custom awesome method to get Class name (in case package or other folders/repos
        // have a '.' in their name ruining the split, then it is fixed and happy hopefully..
        // takes into parameter the result of a .getClass().toString() call
        // note: .toString() is redundant indeed as intellij says but keep for clarity maybe idk
        //maybe.

        String classNameTempString =  nativeClassName.toString();
        String[] classNameTempArray = classNameTempString.split("\\.");
        return classNameTempArray[classNameTempArray.length - 1].toLowerCase();
    }
    */

    /*public static float getResult(float a, float b, String operator) throws Exception {
        if (operator.equals("+"))  return a + b;
        else if (operator.equals("-")) return a - b;
        else if (operator.equals("*")) return a * b;
        else if (operator.equals("/")) return a / b;
        else if (operator.equals("%")) return a % b;
        else {
            throw(new Exception("Unknown operator or error in calculating, please " +
                    "report to devs."));
        }
    }

    public static void outputResult(float a, float b, float result, String operator) throws Exception {
        if (operator.equals("+")) {
            System.out.println(a + " + " + b + " = " + result + ".");
        } else if (operator.equals("-")) {
            System.out.println(a + " - " + b + " = " + result + ".");
        } else if (operator.equals("*")) {
            System.out.println(a + " * " + b + " = " + result + ".");
        } else if (operator.equals("/")) {
            System.out.println(a + " / " + b + " = " + result + ".");
        } else if (operator.equals("%")) {
            System.out.println(a + " % " + b + " = " + result + ".");
        } else {
            throw(new Exception("Unknown operator or error in outputting, please " +
                    "report to devs."));
        }
    }

    public static boolean checkExit(Scanner scanner) {
        System.out.println("Exit? (input:  'exit' to exit, or any other key to continue)");
        // reset scanner workaround, details in: https://stackoverflow.com/a/13102066
        scanner.nextLine();
        // also include ENTER key in skippable characters.
        // btw (someone had same ida as me which si very very cool!!
        // https://stackoverflow.com/questions/39729423/how-to-read-and-get-enter-key-by-scaner
        String isExitString = scanner.nextLine();
        // if not "true" anything else is assumed false, easier than typing false
        // every single time.
        //return (Boolean.parseBoolean(isExitString));
        return isExitString.equals("exit");
    }

    private static void outputFruitsInfoExtractedMethodXTimes(int x, String[][] myFruits) {
        for (int i = 0; i < x; ++i) {
            outputFruitsInfo(myFruits);
        }
    }

    public static void outputFruitsInfo(String[][] fruits) {
        for (String[] fruit : fruits) {
            System.out.println("Fruit species: \"" + fruit[0] + "\", and cultivar: \"" +
                    fruit[1] + "\".");
        }
    }

    public static ArrayList<String> getMyFruitFromMyFruitArray(String[] fruitArray) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add(fruitArray[0]);
        fruit.add(fruitArray[1]);
        return fruit;
    }

    public static String getMyFruitsArrayListToString(ArrayList<ArrayList<String>> fruitsArrayList) {
        // template literal not supproted in jdk 17.. until jdk 21.
        // return "Number of elements: {fruitsArrayList.length}, List: {fruitsArrayList.toString()}";
        // so: (for comaptibility too maybe):
        return "Number of elements: " + fruitsArrayList.size()+ ", List: " +
                fruitsArrayList.toString() + ".";
    }

    //public static void displayFruitsArrayList(ArrayList<ArrayList<String>> fruitsArrayList) {
    //    System.out.println(getMyFruitsArrayListToString(fruitsArrayList));
    //}

    public static int sum(int a, int b) {
        return (a + b);
    }
    */
}