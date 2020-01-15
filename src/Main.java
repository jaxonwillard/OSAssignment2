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

    }
    public static void mem(){

    }
    public static void dirs(){

    }
    public static void os(){

    }
    public static void java(){

    }
}
