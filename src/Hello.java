public class Hello {

    public static boolean getBitches(int a) {
        if (a < 65){
            return true;
        }
        return false;
    }

    public static String Bastiaan() {
        return "Bastiaan heeft geen bitches";
    }

    public static void main (String[] args){
        System.out.println("Hello World");
        System.out.println(Bastiaan());
        System.out.println(getBitches(5));
    }


}
