public class JavaSamples {

    public static void main(String[] args){
        Functions f = new Functions();

        String returnFromFunc = f.abc.apply("hii hii hii from main");
        System.out.println(returnFromFunc);
    }
}
