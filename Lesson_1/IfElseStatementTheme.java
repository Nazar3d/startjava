public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java\n");

        boolean maleGender = true;

        if(!maleGender) {
            System.out.println("Пол - Женский");
        } else {
            System.out.println("Пол - Мужской");
        }

        int age = 20;

        if(age > 18) {
            System.out.println("Как учёба?");
        } else {
            System.out.println("Как работа?");
        }

        float height = 1.72F;

        if(height < 1.8) {
            System.out.println("Вы ниже 15.7% мужчин в России");
        } else {
            System.out.println("Вы выше 84.3% мужчин в России");
        }

        char firstLetterName = "Имя".charAt(0);

        if(firstLetterName == 'M') {
            System.out.println("Ваше имя начинается на букву - M\n");
        } else if(firstLetterName == 'I') {
            System.out.println("Ваше имя начинается на букву - I\n");
        } else {
            System.out.println("Ваше имя не начинается на букву - M или I\n");
        }

        //2. Поиск большего числа
        System.out.println("2. Поиск большего числа\n");

        int a = 94;
        int b = 106;

        if(a > b) {
            System.out.println("число " + a + " больше числа " + b + "\n");
        } else if(a < b) {
            System.out.println("число " + b + " больше числа " + a + "\n");
        } else {
            System.out.println("число " + a + " = " + b + "\n");
        }

        //3. Проверка числа
        System.out.println("3. Проверка числа\n");

        int c = -957;

        if(c == 0) {
            System.out.println("число " + c + " = 0\n");
        } else {
            if(c > 0) {
                System.out.print(c + " является положительным и ");
            } else {
                System.out.print(c + " является отрицательным и ");
            }
            if(c % 2 == 0) {
                System.out.println("четным\n");
            } else {
                System.out.println("нечетным\n");
            }
        }

        //4. Поиск одинаковых цифр в числах
        System.out.println("4. Поиск одинаковых цифр в числах\n");

        a = 123;
        b = 223;

        int numberOnesA = a % 10;
        int numberTensA = (a / 10) % 10;
        int numberHundredsA = (a / 100) % 10;

        int numberOnesB = b % 10;
        int numberTensB = (b / 10) % 10;
        int numberHundredsB = (b / 100) % 10;

        System.out.println("В числах " + a + " и " + b );

        if (numberHundredsA != numberHundredsB && numberTensA != numberTensB && numberOnesA != numberOnesB) {
            System.out.println(" разряды не совпадают\n");
        } else if(numberHundredsA == numberHundredsB && numberTensA == numberTensB && numberOnesA == numberOnesB){
                System.out.println(" все разряды совпадают\n");
        } else {
            if(numberHundredsA == numberHundredsB) {
                System.out.print("Разряд 100 (" + numberHundredsA + ") совпадает\n");
            }
            if(numberTensA == numberTensB) {
                System.out.print("Pазряд 10 (" + numberTensA + ") совпадает\n");
            }
            if(numberOnesA == numberOnesB) {
                System.out.print("Pазряд 1 (" + numberOnesA + ") совпадает\n");
            }
        }

        //5. Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду\n");

        char symbol = '\u0031';

        if(symbol >= 'A' && symbol <= 'Z') {
            System.out.println("символ " + symbol + " является большой буквой\n");
        } else if(symbol >= 'a' && symbol <= 'z') {
            System.out.println("символ " + symbol + " является маленькой буквой\n");
        } else if(symbol >= '0' && symbol <= '9') {
            System.out.println("символ " + symbol + " является цифрой\n");
        } else {
            System.out.println("символ " + symbol + " не буква и не цифра\n");
        }

        //6. Подсчет суммы вклада и начисленных банком %
        System.out.println("6. Подсчет суммы вклада и начисленных банком %\n");

        int deposit = 300000;
        
        int rate = 5;
        if(deposit >= 100000 && deposit <= 300000) {
            rate = 7;
        } else if(300000 < deposit) {
            rate = 10;
        }
        int percent = deposit / 100 * rate;
        rate = deposit + percent;

        System.out.println("Сумма вклада: " + deposit);
        System.out.println("сумма начисленного %: " + percent);
        System.out.println("Итоговая сумма с %: " + rate + "\n");

        //7. Определение оценки по предметам
        System.out.println("7. Определение оценки по предметам\n");
        int historyPercentage = 59;
        int programmingPercentage = 92;
        
        int history = 2;
        if(historyPercentage > 60 && historyPercentage <= 73) {
            history = 3;
        } else if(historyPercentage > 73 && historyPercentage <= 91) {
            history = 4;
        } else if(historyPercentage > 91 && historyPercentage <= 100) {
            history = 5;
        }
        int programming = 2;
        if(programmingPercentage > 60 && programmingPercentage <= 73) {
            programming = 3;
        } else if(programmingPercentage > 73 && programmingPercentage <= 91) {
            programming = 4;
        } else if(programmingPercentage > 91 && programmingPercentage <= 100) {
            programming = 5;
        }
        float gpa = (programming + history) / 2F;
        float avgPercentage = (programmingPercentage + historyPercentage) / 2F;

        System.out.print("История - " + history + ", ");
        System.out.println("программирование - " + programming);
        System.out.println("Средний балл оценок по предметам - " + gpa);
        System.out.println("средний % по предметам - " + avgPercentage + "\n");

        //8. Расчет годовой прибыли
        System.out.println("8. Расчет годовой прибыли\n");

        int monthlySaleGoods = 13000;
        int rentRoom = 5000;
        int costProduct = 9000;
        int profitForYear = (monthlySaleGoods - rentRoom - costProduct) * 12;
        
        if(profitForYear > 0) {
            System.out.println("Прибыль за год: +" + profitForYear + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profitForYear + " руб.");
        }
    }
}