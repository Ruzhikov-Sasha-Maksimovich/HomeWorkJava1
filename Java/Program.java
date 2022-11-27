public class Program{
    public static void main(String[] args) throws IOException {
        int result = showTotalAmount(5);
    }

    public static int showTotalAmount(int value) {
        int result = 0;
        for (int i = 0; i <= value; i++) {
            result += i;
        }
        return result;
    }
}