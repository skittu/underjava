import java.util.*;

// object of a class referenced by interface
public class lambda_expression{

    public static void main(String[] args){

        List<Integer> list = List.of(1,2,3,4,5);
        //lambda function
        list.forEach(i->System.out.println(i));

    }
}
interface kartik{
    void abc();
    void kkd();
}
interface singhal extends kartik{
    void dj();
}

abstract class baba implements singhal{
    public void abc() {

    }
    public void kkd(){

    }
    public void dj(){

    }
}


