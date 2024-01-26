package calculator;

import operations.IOperable;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private boolean isExit;
    public final String[] operators = { "+", "-", "*", "/", "%" };
    public final String operatorsToString = this.getOperatorsToString();
    private ArrayList<String> operationsHistory;

    public Calculator() throws Exception {
        System.out.println("Welcome to the calculator");
        this.isExit = false;
        this.operationsHistory = new ArrayList<>();
    }

    private float getNumInput(String numOrder, Scanner scanner) {
        String exampleNumbersString = "(float format, for example: 3.14 ; 1 ;  -2.5 ; etc)";

        // Scanner error workaround: https://stackoverflow.com/a/60422240
        // my own workaround now:
        System.out.println("Please input the " + numOrder + " number " + exampleNumbersString + ":");

        // TODO 2 (optionnal): if num is not valid (example: 's', 'abcd', etc.) reloop ratehr than crash
        // into an exception, would allow to save history even though the history is still acessible
        // for now via the public method showPublicOperationsHistory

        return Float.parseFloat(scanner.next());
    }

    public String getOperatorsToString() {
        StringBuilder operatorsToString = new StringBuilder();

        for (int i = 0; i < this.operators.length; ++i) {
            if (i < this.operators.length - 1) {
                operatorsToString.append(this.operators[i]).append(", ");
            }
        }

        return operatorsToString.toString();
    }

    private boolean checkIsValidOperator(String operator) {
        for (String o : this.operators) {
            if (o.equals(operator)) {
                return true;
            }
        }

        System.out.println("Unknown operator, operators are " + this.operatorsToString +
                ", please start again.");
        return false;
    }

    private String getInputtedOperator(Scanner scanner) {
        System.out.println("Please input operator type " + this.operatorsToString + ".");
        return scanner.next();
    }

    private boolean checkIsValidF2(float f2, String operator) {
        if (f2 == 0 && (operator.equals("/") || operator.equals("%"))) {
            System.out.println("Error: cannot divide by 0. Please start again.");
            return false;
        }
        return true;
    }

    private float getResult(float f1, float f2, String operator) {
        if (operator.equals("+")) {
            return (new Addition().getCalculateResult(f1, f2));
        } else if (operator.equals("-")) {
            return (new Substraction().getCalculateResult(f1, f2));
        } else if (operator.equals("*")) {
            return (new Multiplication().getCalculateResult(f1, f2));
        } else if (operator.equals("/")) {
            // note: wanted to put the divide by 0 check in interface or division class but too complicated
            // because it would require to exit the function hence not returning expected float so the logic
            // should be put above for now or in another layer of abstraction of methods, so this (the not
            // dividable by zero error message) then only implement the check in the calculator and do
            // calculations as per interface specification assuming numbers are valid (ex: num2 is != 0).
            return (new Division().getCalculateResult(f1, f2));
        } else {
            return (new Modulo().getCalculateResult(f1, f2));
        }
    }

    private String getOperationLine(float f1, float f2, String operator, float result) {
        return (f1 + " " + operator + " " + f2 + " = " + result);
    }

    private void outputOperationLine(String operationLine) {
        System.out.println(operationLine);
    }
    private void storeOperationLineToHistory(String operationLine) {
        this.operationsHistory.add(operationLine);
    }

    private void showOperationsHistory() {
        for (int i = 0; i < this.operationsHistory.size(); ++i) {
            if (i < this.operationsHistory.size() - 1) {
                System.out.println(this.operationsHistory.get(i));
            } else {
                System.out.println(this.operationsHistory.get(i) + ("."));
            }
        }
    }

    private void handleEndOfLoopCommand(Scanner scanner) {
        System.out.println("Exit? input:\n- 'exit' to exit,\n- 'show' to show all history,\n"
                + "- or any other key to continue.");

        //TODO: fix scanner needing to skip line twice after a show command in order to continue
        // to next  operation loop cycle

        // reset scanner workaround, details in: https://stackoverflow.com/a/13102066
        scanner.nextLine();
        // also include ENTER key in skippable characters.
        // btw (someone had same ida as me which si very very cool!!
        // https://stackoverflow.com/questions/39729423/how-to-read-and-get-enter-key-by-scaner
        String isExitString = scanner.nextLine();
        // if not "true" anything else is assumed false, easier than typing false
        // every single time.
        //return (Boolean.parseBoolean(isExitString));

        if (isExitString.equals("exit")) {
            this.isExit = true;
        } else if (isExitString.equals("show")) {
            this.showOperationsHistory();
            // recursive call so no need to output again new nubmers if want to exit after this:
            handleEndOfLoopCommand(scanner);
        }
        // else this.isExit is false : continue onto next loop again
    }

    // for security in a  separate method
    public void showPublicOperationsHistory() {
        // for now no security restriction so these are same
        this.showOperationsHistory();
    }

    public void run(Scanner scanner) {
        while (!this.isExit) {
            float f1 = this.getNumInput("first", scanner);

            String currOperator = this.getInputtedOperator(scanner);
            if (!this.checkIsValidOperator(currOperator)) continue;

            float f2 = this.getNumInput("second", scanner);
            if (!this.checkIsValidF2(f2, currOperator)) continue;

            float result = getResult(f1, f2, currOperator);

            String operationLine = getOperationLine(f1, f2, currOperator, result);
            this.outputOperationLine(operationLine);
            this.storeOperationLineToHistory(operationLine);

            this.handleEndOfLoopCommand(scanner);
        }
    }
}
