import java.util.function.Function;

public class Functions {

    Function<String,String> abc = (s) -> {
        System.out.println("inside function"+ s);
        return "return from function";
    };
}
