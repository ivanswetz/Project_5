public class Part_1 {
    public static void main(String[] args) {
        print();
        int a = 2;
        int b = 5;
        int sum = count(a, b);
    }
    public static void print() {
        System.out.println("Hello world");
    }
    public static void printInt(int num){
        System.out.println(num);
    }
    public static int count(int num_1, int num_2){
        int sum = num_1 + num_2;
        printInt(sum);
        return sum;
    }
}