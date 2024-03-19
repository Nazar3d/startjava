public class IfElseStatementTheme {
    public static void main(String[] args) {
        
        //1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
        System.out.println("");

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
            System.out.println("Ваше имя начинается на букву - M");
        } else if(firstLetterName == 'I') {
            System.out.println("Ваше имя начинается на букву - I");
        } else {
            System.out.println("Ваше имя не начинается на букву - M или I");
        }
        System.out.println("");

        //2. Поиск большего числа
        System.out.println("2. Поиск большего числа");
        System.out.println("");

        int a = 94;
        int b = 106;

        if(a > b) {
            System.out.println("число " + a + " больше числа " + b);
        } else if(a < b) {
            System.out.println("число " + b + " больше числа " + a);
        } else {
            System.out.println("число " + a + " = " + b);
        }
        System.out.println("");

        //3. Проверка числа
        System.out.println("3. Проверка числа");
        System.out.println("");

        int c = -957;

        if(c == 0) {
            System.out.println("число " + c + " = 0");
        } else {
                if(c % 2 == 0) {
                    if (c > 0) {
                        System.out.println(c + " является положительным и четным");
                    } else {
                        System.out.println(c + " является отрицательным и четным");
                    }
                } else {
                if (c > 0) {
                        System.out.println(c + " является положительным и нечетным");
                    } else {
                        System.out.println(c + " является отрицательным и нечетным");
                    }
                }
        }
        System.out.println("");

        //4. Поиск одинаковых цифр в числах
            System.out.println("4. Поиск одинаковых цифр в числах");
        System.out.println("");

        int d = 123;
        int f = 223;

        int numberOfOnesD = ( d / 1 ) % 10;
        int numberOfTensD = ( d / 10 ) % 10;
        int numberOfHundredsD = ( d / 100 ) % 10;

        int numberOfOnesF = ( f / 1 ) % 10;
        int numberOfTensF = ( f / 10 ) % 10;
        int numberOfHundredsF = ( f / 100 ) % 10;

        if(numberOfHundredsD == numberOfHundredsF) {
            if(numberOfTensD == numberOfTensF) {
                if(numberOfOnesD == numberOfOnesF){
                    System.out.println("В числах " + d + " и " + f + " все разряды совпадают");
                } else {
                    System.out.println("В числах " + d + " и " + f + " разряды 100 (" + numberOfHundredsD + ") и 10 (" + numberOfTensD + ") совпадают");
                }
            } else {
                if(numberOfOnesD == numberOfOnesF){
                    System.out.println("В числах " + d + " и " + f + " разряды 100 (" + numberOfHundredsD + ") и 1 (" + numberOfOnesD + ") совпадают");
                } else {
                    System.out.println("В числах " + d + " и " + f + " разряд 100 (" + numberOfHundredsD + ") совпадает");
                }
            }
        } else {
            if(numberOfTensD == numberOfTensF) {
                if(numberOfOnesD == numberOfOnesF){
                    System.out.println("В числах " + d + " и " + f + " разряды 10 (" + numberOfTensD + ") и 1 (" + numberOfOnesD + ") совпадают");
                } else {
                    System.out.println("В числах " + d + " и " + f + " разряд 10 (" + numberOfTensD + ") совпадает");
                }
            } else {
                if(numberOfOnesD == numberOfOnesF){
                    System.out.println("В числах " + d + " и " + f + " разряд 1 (" + numberOfOnesD + ") совпадает");
                } else {
                    System.out.println("В числах " + d + " и " + f + " разряды не совпадают");

                }
            }
        }
        System.out.println("");

        //5. Определение символа по его коду
        System.out.println("5. Определение символа по его коду");
        System.out.println("");

        char simbol = '\u0031';

        if(simbol >= 'A' & simbol <= 'Z'){
            System.out.println("символ " + simbol + " является большой буквой");
        } else if(simbol >= 'a' & simbol <= 'z'){
            System.out.println("символ " + simbol + " является маленькой буквой");
        } else if(simbol >= '0' & simbol <= '9'){
            System.out.println("символ " + simbol + " является цифрой");
        } else {
            System.out.println("символ " + simbol + " не буква и не цифра");

        }
        System.out.println("");

        //6. Подсчет суммы вклада и начисленных банком %
        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        System.out.println("");

        int bank = 400000;

        if(bank < 100000) {
            System.out.println("Сумма вклада: " + bank);
            bank = bank / 100 * 5;
            System.out.println("сумма начисленного %: " + bank);
            bank = bank / 5 * 100 + bank;
            System.out.println("Итоговая сумма с %: " + bank);
        } else if(100000 <= bank & bank <= 300000){
            System.out.println("Сумма вклада: " + bank);
            bank = bank / 100 * 7;
            System.out.println("сумма начисленного %: " + bank);
            bank = bank / 7 * 100 + bank;
            System.out.println("Итоговая сумма с %: " + bank);
        } else if(300000 < bank){
            System.out.println("Сумма вклада: " + bank);
            bank = bank / 100 * 10;
            System.out.println("сумма начисленного %: " + bank);
            bank = bank / 10 * 100 + bank;
            System.out.println("Итоговая сумма с %: " + bank);
        }
        System.out.println("");

        //7. Определение оценки по предметам
        System.out.println("7. Определение оценки по предметам");
        System.out.println("");

        int history = 59;
        int programming = 92;

        if (history <= 60) {
            System.out.print("История - 2, ");
            if (programming <= 60) {
                System.out.println("программирование - 2");
                System.out.println("Средний балл оценок по предметам - 2");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            } else if (programming > 60 & programming <= 73) {
                System.out.println("программирование - 3");
                System.out.println("Средний балл оценок по предметам - 2.5");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            } else if (programming > 73 & programming <= 91) {
                System.out.println("программирование - 4");
                System.out.println("Средний балл оценок по предметам - 3");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            } else if (programming > 91 & programming <= 100) {
                System.out.println("программирование - 5");
                System.out.println("Средний балл оценок по предметам - 3.5");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            }
        } else if (history > 60 & history <= 73) {
            System.out.print("История - 3, ");
            if (programming <= 60) {
                System.out.println("программирование - 2");
                System.out.println("Средний балл оценок по предметам - 2.5");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            } else if (programming > 60 & programming <= 73) {
                System.out.println("программирование - 3");
                System.out.println("Средний балл оценок по предметам - 3");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            } else if (programming > 73 & programming <= 91) {
                System.out.println("программирование - 4");
                System.out.println("Средний балл оценок по предметам - 3.5");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            } else if (programming > 91 & programming <= 100) {
                System.out.println("программирование - 5");
                System.out.println("Средний балл оценок по предметам - 4");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            }
        } else if (history > 73 & history <= 91) {
            System.out.print("История - 4, ");
            if (programming <= 60) {
                System.out.println("программирование - 2");
                System.out.println("Средний балл оценок по предметам - 3");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            } else if (programming > 60 & programming <= 73) {
                System.out.println("программирование - 3");
                System.out.println("Средний балл оценок по предметам - 3.5");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            } else if (programming > 73 & programming <= 91) {
                System.out.println("программирование - 4");
                System.out.println("Средний балл оценок по предметам - 4");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            } else if (programming > 91 & programming <= 100) {
                System.out.println("программирование - 5");
                System.out.println("Средний балл оценок по предметам - 4.5");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            }
        } else if (history > 91 & history <= 100) {
            System.out.print("История - 5, ");
            if (programming <= 60) {
                System.out.println("программирование - 2");
                System.out.println("Средний балл оценок по предметам - 3.5");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            } else if (programming > 60 & programming <= 73) {
                System.out.println("программирование - 3");
                System.out.println("Средний балл оценок по предметам - 4");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            } else if (programming > 73 & programming <= 91) {
                System.out.println("программирование - 4");
                System.out.println("Средний балл оценок по предметам - 4.5");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            } else if (programming > 91 & programming <= 100) {
                System.out.println("программирование - 5");
                System.out.println("Средний балл оценок по предметам - 5");
                programming = programming + history;
                programming = programming / 2;
                System.out.println("средний % по предметам - " + programming);
            }
        }
        System.out.println("");

        //8. Расчет годовой прибыли
        System.out.println("8. Расчет годовой прибыли");
        System.out.println("");

        int monthlySaleOfGoods = 13000;
        int rentARoom = 5000;
        int costOfProduction = 9000;
        int profitForTheYear = monthlySaleOfGoods - rentARoom - costOfProduction;
        profitForTheYear = profitForTheYear * 12;
        
        if (profitForTheYear > 0){
            System.out.println("Прибыль за год: +" + profitForTheYear + " руб.");
        }else if (profitForTheYear < 0){
            System.out.println("Прибыль за год: " + profitForTheYear + " руб.");
        }else if (profitForTheYear == 0){
            System.out.println("Прибыль за год: " + profitForTheYear + " руб.");
            
        }







    }
}