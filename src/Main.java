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
            }
        }
    }

    private static void CPU(){
        System.out.println("Processors           : " + Runtime.getRuntime().availableProcessors());
    }
    private static void mem(){
        System.out.println("Free Memory  :     " + NumberFormat.getNumberInstance(Locale.US).format(Runtime.getRuntime().freeMemory()));
        System.out.println("Total Memory :    " + NumberFormat.getNumberInstance(Locale.US).format(Runtime.getRuntime().totalMemory()));
        System.out.println("Max Memory   :    " + NumberFormat.getNumberInstance(Locale.US).format(Runtime.getRuntime().maxMemory()));

    }
    private static void dirs(){
        Properties properties = new Properties();
        System.out.println("Working Directory    : " + System.getProperty("user.dir"));
        System.out.println("User Home Directory  : " + System.getProperty("user.home"));
    }
    private static void java(){
        System.out.println("Java Vendor          :  " + System.getProperty("java.vendor"));
        System.out.println("Java Runtime         :  " + System.getProperty("java.runtime.name"));
        System.out.println("Java Version         :  " + System.getProperty("java.version"));
        System.out.println("Java VM Version      :  " + System.getProperty("java.vm.version"));
        System.out.println("Java VM Name         :  " + System.getProperty("java.vm.name"));

    }
    private static void os(){
        System.out.println("OS Name        : " + System.getProperty("os.name"));
        System.out.println("OS Version     : " + System.getProperty("os.version"));
    }
}
