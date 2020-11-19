public class ArchitectureCacheLineCalculator {
    public static double calculate(int value, int bits){
        double cacheLine = value/Math.pow(2, bits);
        double noTag = cacheLine - Math.floor(cacheLine);
        double close = noTag * 2048;
        return Math.floor(close/16);
    }

    public static void main(String[] args) {
        System.out.println(calculate(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
}