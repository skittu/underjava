public class exception_handling {
    public static void main(String[] args) {
        // example for try catch block
        trycatch tr = new trycatch();
        try {
            tr.divide(5, 0);
        }
        catch(Exception e)
        {
            System.out.println("caught in main "+e);
        }

        // throws keyword
        try {
            tr.substr("", 4);

        }
        catch(Exception e)
        {
            System.out.println("Caught in main came from trycatch substr func"+e);
        }
    }

}

class trycatch
{
    int divide(int a,int b)
    {
        try {
            return a/b;
        }
        catch(ArithmeticException ar)
        {
            System.out.println("Caught in divide function");
            // rethrowing
            throw ar;
        }

    }
    String substr(String s,int index) throws StringIndexOutOfBoundsException{

        return s.substring(index);
}
}


