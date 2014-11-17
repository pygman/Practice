public class Main {

    public static void main(String[] args) {
        System.out.println(jc(10));
    }
    public static int jc(int j){
        if (j>1)
            return j*jc(j-1);
        return 1;
    }
}
