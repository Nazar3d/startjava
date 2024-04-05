public class VariableTheme {
    public static void main(String[] args) {
        //1. вывод характеристик компьютера
        System.out.println("1. вывод характеристик компьютера\n");

        byte vRam = 4;
        short ddrRam = 16;
        int cpuSeries = 11;
        long hdd = 930;
        float ramFrequency = 2.666F;
        double cpuFrequency = 2.70;
        char smile = 0001;
        boolean isNvidiaSli = false;

        System.out.println("видеопамять - " + vRam + "гб");
        System.out.println("оперативная память - " + ddrRam + "гб");
        System.out.println("серия процессора - " + cpuSeries);
        System.out.println("постоянная память - " + hdd + "гб");
        System.out.println("частота оперативной памяти - " + ramFrequency + "гГц");
        System.out.println("частота процессора - " + cpuFrequency + "гГц");
        System.out.println("загоузка ПК - " + smile);
        System.out.println("Nvidia SLI - " + isNvidiaSli + "\n\n");

        //2. Расчет стоимости товара со скидкой
        System.out.println("2. Расчет стоимости товара со скидкой\n");

        int pricePen = 100;
        int priceBook = 200;
        int products = priceBook + pricePen;
        int discountAmount = products / 100 * 11;
        int discountPrice = products - discountAmount;

        System.out.println("общая стоимость товаров без скидки - " + products + " руб.");
        System.out.println("сумма скидки - " + discountAmount + " руб.");
        System.out.println("общая стоимость товаров со скидкой - " + discountPrice + " руб.\n\n");

        //3. Вывод слова JAVA
        System.out.println("3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n\n");

        //4. Вывод min и max значений целых числовых типов
        System.out.println("4. Вывод min и max значений целых числовых типов\n");

        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt =  2147483647;
        long maxLong = 9223372036854775807L;

        //byte
        System.out.println("тип - byte\n");
        System.out.println("первоначальное значение - " + maxByte++);
        System.out.println("значение после инкремента на единицу - " + maxByte--);
        //maxByte--;
        System.out.println("значение после декремента на единицу - " + --maxByte + "\n");

        //short
        System.out.println("тип - short\n");
        System.out.println("первоначальное значение - " + maxShort++);
        System.out.println("значение после инкремента на единицу - " + maxShort--);
        //maxShort--;
        System.out.println("значение после декремента на единицу - " + --maxShort + "\n");

        //int
        System.out.println("тип - int\n");
        System.out.println("первоначальное значение - " + maxInt++);
        System.out.println("значение после инкремента на единицу - " + maxInt--);
        //maxInt--;
        System.out.println("значение после декремента на единицу - " + --maxInt + "\n");;

        //long
        System.out.println("тип - long\n");
        System.out.println("первоначальное значение - " + maxLong++);
        System.out.println("значение после инкремента на единицу - " + maxLong--);
        //maxLong--;
        System.out.println("значение после декремента на единицу - " + --maxLong + "\n\n");

        //5. Перестановка значений переменных
        System.out.println("5. Перестановка значений переменных\n");

        int a = 2;
        int b = 5;

        System.out.println("исходные данные a = " + a + "; b = " + b);

        System.out.println("с помощью третьей переменной");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + "; b = " + b);

        System.out.println("с помощью арифметических операций");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + "; b = " + b);

        System.out.println("с помощью побитовой операции ^");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a + "; b = " + b + "\n");

        //6. Вывод символов и их кодов
        System.out.println("6. Вывод символов и их кодов\n");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println("Значение кодов ASCII для символов:");
        System.out.println(dollar + " - " + (int) dollar);
        System.out.println(asterisk + " - " + (int) asterisk);
        System.out.println(atSign + " - " + (int) atSign);
        System.out.println(verticalBar + " - " + (int) verticalBar);
        System.out.println(tilde + " - " + (int) tilde + "\n\n");
        
        //7. Вывод в консоль ASCII-арт Дюка
        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("     " + slash + backslash);
        System.out.println("    " + slash + "  " + backslash);
        System.out.println("   " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println("  " + slash + "      " + backslash);
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + slash + backslash
                + underscore + underscore + backslash + "\n\n");

        //8. Вывод количества сотен, десятков и единиц числа
        System.out.println("8. Вывод количества сотен, десятков и единиц числа\n");;

        int number = 123;
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100) % 10;
        int productNumbers = ones * tens * hundreds;
        int sumNumbers = ones + tens + hundreds;

        System.out.println("Число " + number + " содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + ones);
        System.out.println("Сумма его цифр = " + sumNumbers);
        System.out.println("Произведение = " + productNumbers + "\n\n");

        //9. Вывод времени
        System.out.println("9. Вывод времени\n");

        int time = 86399;
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}