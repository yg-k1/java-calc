public class Calc {
    private static int result;
    int a;
    int b;
    char operationType;

    public static void main(String[] args) {
        doCalc(250, 2, '*');
        System.out.println(result);
    }
    public static void doCalc(int a, int b, char operationType) {
        switch (operationType){
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '/':
                result=a/b;
                break;
            default:
                System.out.println("Нет такой функции. Повторите ввод.");
        }
}

    }
