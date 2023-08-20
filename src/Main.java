public class Main {
    public static void main(String[] args) {
        int clientOS = 3;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Выберите операционую систему ");
        }



        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }




        int year = 2004;
        if (year % 4 == 0) {
            System.out.println(year + (" год является выоскосным"));
        } else if (year % 100 != 0) {
            System.out.println(year + (" год не является выоскосным"));
        }else if (year % 400 == 0) {
            System.out.println(year + (" год является выоскосным"));
        } else {
            System.out.println(year + (" год не является выоскосным"));
        }




        int deliveryDistance =20 ;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в пределах " + deliveryDistance +"км потребуется 1 день Доставки");
        }else if (deliveryDistance >= 21  && deliveryDistance <= 60) {
            System.out.println("Доставка в пределах " + deliveryDistance +"км потребуется 2 деня Доставки");
        }else if (deliveryDistance >= 61 && deliveryDistance <= 100){
            System.out.println("Доставка в пределах " + deliveryDistance + "км потребуется 3 день Доставки");
        }else{
            System.out.println("Достаки нет в пределах выше 100 км");
        }



        char monthNumber = 1;
        switch (monthNumber) {
            case 1 : case 2 : case 12 :
                System.out.println("Зима");
                break;
            case 3: case 4: case 5:
                System.out.println("Весна");
                break;
            case 6: case 7: case 8:
                System.out.println("Лето");
            case 9: case 10: case 11:
                System.out.println("Осень");
                break;

        }




    }
}