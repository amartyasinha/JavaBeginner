package calculator;

public class MyException extends Exception{
    public MyException(){
        super("There are some error in the Program");
    }
}

class DivideByZero extends Exception{
    public DivideByZero(){
        super("Cannot Divide by Zero\n");
    }
}

class DivideByNeg extends Exception{
    public DivideByNeg(){
        super("Cannot Divide by Negative num\n");
    }
}

class BadOperator extends Exception{
    public BadOperator(){
        super("Wrong Operator Choice\n");
    }
}
