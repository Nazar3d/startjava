public class VariableTheme {
    public static void main(String[] args) {
        //1. вывод характеристик компьютера
        System.out.println("1. вывод характеристик компьютера\n");

        byte videoMemory = 4;
        short ram = 16;
        int processorSeries = 11400;
        long rom = 930;
        float frequencyRam = 2.666F;
        double processorFrequency = 2.70;
        char smile = 0001;
        boolean nvidiaSli = false;

        System.out.println("видеопамять - " + videoMemory + "гб");
        System.out.println("оперативная память - " + ram + "гб");
        System.out.println("постоянная память - " + rom + "гб");
        System.out.println("частота оперативной памяти - " + frequencyRam + "гГц");
        System.out.println("частота процессора - " + processorFrequency + "гГц");
        System.out.println("загоузка ПК - " + smile);
        System.out.println("Nvidia SLI - " + nvidiaSli + "\n\n");

        //2. Расчет стоимости товара со скидкой
        System.out.println("2. Расчет стоимости товара со скидкой\n");

        int pricePen = 100;
        int priceBook = 200;
        int priceBookAndPen = priceBook + pricePen;
        int discountAmount = priceBookAndPen / 100 * 11;
        int theCostOfDiscountedGoods = priceBookAndPen - discountAmount;

        System.out.println("общая стоимость товаров без скидки - " + priceBookAndPen + " руб.");
        System.out.println("сумма скидки - " + discountAmount + " руб.");
        System.out.println("общая стоимость товаров со скидкой - " + theCostOfDiscountedGoods + " руб.\n\n");

        //3. Вывод слова JAVA
        System.out.println("3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n\n");

        //4. Вывод min и max значений целых числовых типов
        System.out.println("4. Вывод min и max значений целых числовых типов\n");

        byte typeByte = 127;
        short typeShort = 32767;
        int typeInt =  2147483647;
        long typeLong = 9223372036854775807L;

        //byte
        System.out.println("тип - byte\n");
        System.out.println("первоначальное значение - " + typeByte);
        typeByte++;
        System.out.println("значение после инкремента на единицу - " + typeByte);
        typeByte--;
        System.out.println("значение после декремента на единицу - " + typeByte + "\n");

        //short
        System.out.println("тип - short\n");
        System.out.println("первоначальное значение - " + typeShort);
        typeShort++;
        System.out.println("значение после инкремента на единицу - " + typeShort);
        typeShort--;
        System.out.println("значение после декремента на единицу - " + typeShort + "\n");

        //int
        System.out.println("тип - int\n");
        System.out.println("первоначальное значение - " + typeInt);
        typeInt++;
        System.out.println("значение после инкремента на единицу - " + typeInt);
        typeInt--;
        System.out.println("значение после декремента на единицу - " + typeInt + "\n");;

        //long
        System.out.println("тип - long\n");
        System.out.println("первоначальное значение - " + typeLong);
        typeLong++;
        System.out.println("значение после инкремента на единицу - " + typeLong);
        typeLong--;
        System.out.println("значение после декремента на единицу - " + typeLong + "\n\n");

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
        System.out.println(dollar + " - " + (int)dollar);
        System.out.println(asterisk + " - " + (int)asterisk);
        System.out.println(atSign + " - " + (int)atSign);
        System.out.println(verticalBar + " - " + (int)verticalBar);
        System.out.println(tilde + " - " + (int)tilde + "\n\n");
        
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
        System.out.println("  " + slash + "      " + backslash + " ");
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash + "\n\n");

        //8. Вывод количества сотен, десятков и единиц числа
        System.out.println("8. Вывод количества сотен, десятков и единиц числа\n");;

        int n = 123;
        int numberOnes = ( n / 1 ) % 10;
        int numberTens = ( n / 10 ) % 10;
        int numberHundreds = ( n / 100 ) % 10;
        int productNumbers = numberOnes * numberTens * numberHundreds;
        int sumNumbers = numberOnes + numberTens + numberHundreds;

        System.out.println("Число " + n + " содержит:");
        System.out.println("  сотен - " + numberHundreds);
        System.out.println("  десятков - " + numberTens);
        System.out.println("  единиц - " + numberOnes);
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