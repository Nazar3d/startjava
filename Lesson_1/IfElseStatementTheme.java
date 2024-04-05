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

        int deposit = 300001;
        int percDeposit = 0;
        
        System.out.println("Сумма вклада: " + deposit);
        if(deposit < 100000) {
            percDeposit = 5;
        } else if(100000 <= deposit & deposit <= 300000) {
            percDeposit = 7;
        } else if(300000 < deposit) {
            percDeposit = 10;
        }
        percDeposit = deposit / 100 * percDeposit;
        deposit = deposit + percDeposit;

        System.out.println("сумма начисленного %: " + percDeposit);
        System.out.println("Итоговая сумма с %: " + deposit + "\n");

        //7. Определение оценки по предметам
        System.out.println("7. Определение оценки по предметам\n");
        int precHistory = 59;
        int precProgramming = 92;

        float percentageSubject = (precProgramming + precHistory) / 2F;

        if (precHistory <= 60) {
            precHistory = 2;
        } else if(precHistory > 60 & precHistory <= 73) {
            precHistory = 3;
        } else if(precHistory > 73 & precHistory <= 91) {
            precHistory = 4;
        } else {
            precHistory = 5;
        }
    
        if (precProgramming <= 60) {
            precProgramming = 2;
        } else if(precProgramming > 60 & precProgramming <= 73) {
            precProgramming = 3;
        } else if(precProgramming > 73 & precProgramming <= 91) {
            precProgramming = 4;
        } else {
            precProgramming = 5;
        }
        float gradeSubjects = (precProgramming + precHistory) / 2F;

        System.out.print("История - " + precHistory + ", ");
        System.out.println("программирование - " + precProgramming);
        System.out.println("Средний балл оценок по предметам - " + gradeSubjects);
        System.out.println("средний % по предметам - " + percentageSubject + "\n");

        //8. Расчет годовой прибыли
        System.out.println("8. Расчет годовой прибыли\n");

        int monthlySaleGoods = 13000;
        int rentRoom = 5000;
        int costProduct = 9000;
        int profitForYear = (monthlySaleGoods - rentRoom - costProduct) * 12;
        
        if(profitForYear > 0) {
            System.out.println("Прибыль за год: +" + profitForYear + " руб.");
        } else if(profitForYear <= 0) {
            System.out.println("Прибыль за год: " + profitForYear + " руб.");
        }
    }
}