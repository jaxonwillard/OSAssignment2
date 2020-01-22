import java.text.NumberFormat;
import java.util.Locale;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        for (String arg : args){
            switch (arg){
                case "-cpu":
                    CPU();
                    break;
                case "-mem":
                    mem();
                    break;
                case "-dirs":
                    dirs();
                    break;
                case "-os":
                    os();
                    break;
                case "-java":
                    java();
                    break;
                default:
                    System.out.println("Incorrect argument: " + arg);
                    usage();
                    break;
            }
        }
    }
    public static void usage(){
    }
    public static void CPU(){
        System.out.println();
    }
    public static void mem(){
        System.out.println("Free Memory:     " + NumberFormat.getNumberInstance(Locale.US).format(Runtime.getRuntime().freeMemory()));
        System.out.println("Total Memory:    " + NumberFormat.getNumberInstance(Locale.US).format(Runtime.getRuntime().totalMemory()));
        System.out.println("Total Memory:    " + NumberFormat.getNumberInstance(Locale.US).format(Runtime.getRuntime().maxMemory()));

    }
    public static void dirs(){

    }
    public static void os(){

    }
    public static void java(){

    }
}
