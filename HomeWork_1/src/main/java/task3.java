import java.util.Scanner;


public class task3 {

    public static float getNumbers(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        float a = scanner.nextFloat();
        return a;
    }

    public static void main (String[] ars) {
    Scanner scanner = new Scanner(System.in);

    boolean getChoice = true;
    while (getChoice){
        System.out.println(
                "Меню калькулятора: " + "\n" +
                "1. Сложение"  + "\n" +
                "2. Вычитание" + "\n" +
                "3. Умножение" + "\n" +
                "4. Деление" + "\n" +
                "5. Выход"
        );

        System.out.print("Выберите действие: ");
        int choice = scanner.nextInt();
        if(choice<1 || choice >5){
            System.out.println("Данного действия не сужествует, попробуйте снова!");
        }

        switch (choice){

            case 1:
                float a = getNumbers("Введите первое значение: ");
                float b = getNumbers("Введите второе значение: ");
                float s = a+b;
                System.out.println("Сумма чисел: " + s);
                break;
            case 2:
                float c = getNumbers("Введите первое значение: ");
                float d = getNumbers("Введите второе значение: ");
                float r = c-d;
                System.out.println("Разность чисел: " + r);
                break;
            case 3:
                float f = getNumbers("Введите первое значение: ");
                float g = getNumbers("Введите второе значение: ");
                float p = f*g;
                System.out.println("Произведение чисел: " + p);
                break;
            case 4:
                float k = getNumbers("Введите первое значение: ");
                float l = getNumbers("Введите второе значение: ");
                if (l == 0){
                    System.out.println("На ноль делить нельзя!!");
                }
                else {
                    float t = k/l;
                    System.out.println("Частное чисел: " + t);
                }
                break;
            case 5:
                getChoice = false;
        }
    }
    }

}
