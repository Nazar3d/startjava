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
                if(c % 2 == 0) {
                    if (c > 0) {
                        System.out.println(c + " является положительным и четным\n");
                    } else {
                        System.out.println(c + " является отрицательным и четным\n");
                    }
                } else {
                if (c > 0) {
                        System.out.println(c + " является положительным и нечетным\n");
                    } else {
                        System.out.println(c + " является отрицательным и нечетным\n");
                    }
                }
        }
        //4. Поиск одинаковых цифр в числах
            System.out.println("4. Поиск одинаковых цифр в числах\n");

        int d = 123;
        int f = 223;

        int numberOnesD = ( d / 1 ) % 10;
        int numberTensD = ( d / 10 ) % 10;
        int numberHundredsD = ( d / 100 ) % 10;

        int numberOnesF = ( f / 1 ) % 10;
        int numberTensF = ( f / 10 ) % 10;
        int numberHundredsF = ( f / 100 ) % 10;

        if(numberHundredsD == numberHundredsF) {
            if(numberTensD == numberTensF) {
                if(numberOnesD == numberOnesF){
                    System.out.println("В числах " + d + " и " + f + " все разряды совпадают\n");
                } else {
                    System.out.println("В числах " + d + " и " + f + " разряды 100 (" + numberHundredsD + ") и 10 (" + numberTensD + ") совпадают\n");
                }
            } else {
                if(numberOnesD == numberOnesF){
                    System.out.println("В числах " + d + " и " + f + " разряды 100 (" + numberHundredsD + ") и 1 (" + numberOnesD + ") совпадают\n");
                } else {
                    System.out.println("В числах " + d + " и " + f + " разряд 100 (" + numberHundredsD + ") совпадает\n");
                }
            }
        } else {
            if(numberTensD == numberTensF) {
                if(numberOnesD == numberOnesF){
                    System.out.println("В числах " + d + " и " + f + " разряды 10 (" + numberTensD + ") и 1 (" + numberOnesD + ") совпадают\n");
                } else {
                    System.out.println("В числах " + d + " и " + f + " разряд 10 (" + numberTensD + ") совпадает\n");
                }
            } else {
                if(numberOnesD == numberOnesF){
                    System.out.println("В числах " + d + " и " + f + " разряд 1 (" + numberOnesD + ") совпадает\n");
                } else {
                    System.out.println("В числах " + d + " и " + f + " разряды не совпадают\n");
                }
            }
        }

        //5. Определение символа по его коду
        System.out.println("5. Определение символа по его коду\n");

        char simbol = '\u0031';

        if(simbol >= 'A' & simbol <= 'Z'){
            System.out.println("символ " + simbol + " является большой буквой\n");
        } else if(simbol >= 'a' & simbol <= 'z'){
            System.out.println("символ " + simbol + " является маленькой буквой\n");
        } else if(simbol >= '0' & simbol <= '9'){
            System.out.println("символ " + simbol + " является цифрой\n");
        } else {
            System.out.println("символ " + simbol + " не буква и не цифра\n");
        }

        //6. Подсчет суммы вклада и начисленных банком %
        System.out.println("6. Подсчет суммы вклада и начисленных банком %\n");

        int bank = 400000;

        if(bank < 100000) {
            System.out.println("Сумма вклада: " + bank);
            bank = bank / 100 * 5;
            System.out.println("сумма начисленного %: " + bank);
            bank = bank / 5 * 100 + bank;
            System.out.println("Итоговая сумма с %: " + bank + "\n");
        } else if(100000 <= bank & bank <= 300000){
            System.out.println("Сумма вклада: " + bank);
            bank = bank / 100 * 7;
            System.out.println("сумма начисленного %: " + bank);
            bank = bank / 7 * 100 + bank;
            System.out.println("Итоговая сумма с %: " + bank + "\n");
        } else if(300000 < bank){
            System.out.println("Сумма вклада: " + bank);
            bank = bank / 100 * 10;
            System.out.println("сумма начисленного %: " + bank);
            bank = bank / 10 * 100 + bank;
            System.out.println("Итоговая сумма с %: " + bank + "\n");
        }

        //7. Определение оценки по предметам
        System.out.println("7. Определение оценки по предметам\n");
        int history = 59;
        int programming = 92;

        if (history <= 60) {
            System.out.print("История - 2, ");
            if (programming <= 60) {
                System.out.println("программирование - 2");
                System.out.println("Средний балл оценок по предметам - 2");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            } else if (programming > 60 & programming <= 73) {
                System.out.println("программирование - 3");
                System.out.println("Средний балл оценок по предметам - 2.5");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            } else if (programming > 73 & programming <= 91) {
                System.out.println("программирование - 4");
                System.out.println("Средний балл оценок по предметам - 3");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            } else if (programming > 91 & programming <= 100) {
                System.out.println("программирование - 5");
                System.out.println("Средний балл оценок по предметам - 3.5");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            }
        } else if (history > 60 & history <= 73) {
            System.out.print("История - 3, ");
            if (programming <= 60) {
                System.out.println("программирование - 2");
                System.out.println("Средний балл оценок по предметам - 2.5");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            } else if (programming > 60 & programming <= 73) {
                System.out.println("программирование - 3");
                System.out.println("Средний балл оценок по предметам - 3");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            } else if (programming > 73 & programming <= 91) {
                System.out.println("программирование - 4");
                System.out.println("Средний балл оценок по предметам - 3.5");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            } else if (programming > 91 & programming <= 100) {
                System.out.println("программирование - 5");
                System.out.println("Средний балл оценок по предметам - 4");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            }
        } else if (history > 73 & history <= 91) {
            System.out.print("История - 4, ");
            if (programming <= 60) {
                System.out.println("программирование - 2");
                System.out.println("Средний балл оценок по предметам - 3");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            } else if (programming > 60 & programming <= 73) {
                System.out.println("программирование - 3");
                System.out.println("Средний балл оценок по предметам - 3.5");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            } else if (programming > 73 & programming <= 91) {
                System.out.println("программирование - 4");
                System.out.println("Средний балл оценок по предметам - 4");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            } else if (programming > 91 & programming <= 100) {
                System.out.println("программирование - 5");
                System.out.println("Средний балл оценок по предметам - 4.5");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            }
        } else if (history > 91 & history <= 100) {
            System.out.print("История - 5, ");
            if (programming <= 60) {
                System.out.println("программирование - 2");
                System.out.println("Средний балл оценок по предметам - 3.5");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            } else if (programming > 60 & programming <= 73) {
                System.out.println("программирование - 3");
                System.out.println("Средний балл оценок по предметам - 4");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            } else if (programming > 73 & programming <= 91) {
                System.out.println("программирование - 4");
                System.out.println("Средний балл оценок по предметам - 4.5");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            } else if (programming > 91 & programming <= 100) {
                System.out.println("программирование - 5");
                System.out.println("Средний балл оценок по предметам - 5");
                programming += history;
                programming /= 2;
                System.out.println("средний % по предметам - " + programming + "\n");
            }
        }

        //8. Расчет годовой прибыли
        System.out.println("8. Расчет годовой прибыли\n");

        int monthlySaleGoods = 13000;
        int rentRoom = 5000;
        int costProduct = 9000;
        int profitForYear = monthlySaleGoods - rentRoom - costProduct;
        profitForYear *= 12;
        
        if (profitForYear > 0){
            System.out.println("Прибыль за год: +" + profitForYear + " руб.");
        }else if (profitForYear < 0){
            System.out.println("Прибыль за год: " + profitForYear + " руб.");
        }else if (profitForYear == 0){
            System.out.println("Прибыль за год: " + profitForYear + " руб.");
        }
    }
}