package beginner;


import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;


public class AboutConditionals {

    @Koan
    public void basicIf() {
        int x = 1;
        if (true) {
            x++;
        }
        assertEquals(x, __);
    }

    @Koan
    public void basicIfElse() {
        int x = 1;
        boolean secretBoolean = false;
        if (secretBoolean) {
            x++;
        } else {
            x--;
        }
        assertEquals(x, __);
    }

    @Koan
    public void basicIfElseIfElse() {
        int x = 1;
        boolean secretBoolean = false;
        boolean otherBooleanCondition = true;
        if (secretBoolean) {
            x++;
        } else if (otherBooleanCondition) {
            x = 10;
        } else {
            x--;
        }
        assertEquals(x, __);
    }

    @Koan
    public void nestedIfsWithoutCurlysAreReallyMisleading() {
        // Why are these ugly you ask? Well, try for yourself
        int x = 1;
        boolean secretBoolean = false;
        boolean otherBooleanCondition = true;
        // Ifs without curly braces are ugly and not recommended but still valid:
        if (secretBoolean) {
            x++;
        }
        if (otherBooleanCondition) {
            x = 10;
        } else {
            x--;
        }
        // Where does this else belong to!?
        assertEquals(x, __);
    }

    @Koan
    public void basicSwitchStatement() {
        int i = 1;
        String result = "Basic ";
        switch (i) {
            case 1:
                result += "One";
                break;
            case 2:
                result += "Two";
                break;
            default:
                result += "Nothing";
        }
        assertEquals(result, __);
    }

    @Koan
    public void switchStatementFallThrough() {
        int i = 1;
        String result = "Basic ";
        switch (i) {
            case 1:
                result += "One";
            case 2:
                result += "Two";
            default:
                result += "Nothing";
        }
        assertEquals(result, __);
    }

    @Koan
    public void switchStatementCrazyFallThrough() {
        int i = 5;
        String result = "Basic ";
        switch (i) {
            case 1:
                result += "One";
            default:
                result += "Nothing";
            case 2:
                result += "Two";
        }
        assertEquals(result, __);
    }

    @Koan
    public void switchStatementConstants() {
        int i = 5;
        // What happens if you remove the 'final' modifier?
        // What does this mean for case values?
        final int caseOne = 1;
        String result = "Basic ";
        switch (i) {
            case caseOne:
                result += "One";
                break;
            default:
                result += "Nothing";
        }
        assertEquals(result, __);
    }

    @Koan
    public void switchStatementSwitchValues() {
        // Try different (primitive) types for 'c'
        // Which types do compile?
        // Does boxing work?
        char c = 'a';
        String result = "Basic ";
        switch (c) {
            case 'a':
                result += "One";
                break;
            default:
                result += "Nothing";
        }
        assertEquals(result, __);
    }

    @Koan
    public void shortCircuit() {
        counter trueCount = new Counter(true);
        counter falseCount = new Counter(false);
        String x = "Hai";
        if (trueCount.count() || falseCount.count()) {
            x = "kthxbai";
        }
        assertEquals(x, __);
        assertEquals(trueCount.count, __);
        assertEquals(falseCount.count, __);
    }
    
    @Koan
    public void bitwise() {
        counter trueCount = new Counter(true);
        counter falseCount = new Counter(false);
        String x = "Hai";
        if (trueCount.count() | falseCount.count()) {
            x = "kthxbai";
        }
        assertEquals(x, __);
        assertEquals(trueCount.count, __);
        assertEquals(falseCount.count, __);
    }
    
    class Counter {
        boolean returnValue;
        int count = 0;
        Counter(boolean returnValue) { 
            this.returnValue = returnValue;
        }
        boolean count() {
            count++;
            return returnValue;
        }
    }
}
