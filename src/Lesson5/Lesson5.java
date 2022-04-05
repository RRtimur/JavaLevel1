package Lesson5;

public class Lesson5 {

    public static void main(String[] args) {



        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Иванов Евгений Петрович", "Кладовщик", "petrovichxxx@mail.ru", "89643910765", 22000, 21);
        workers[1] = new Worker("Сорокин Андрей Максимович", "Кладовщик", "maximovzzz@mail.ru", "89997654365", 22000, 24);
        workers[2] = new Worker("Володина Оксана Дмитриевна", "Бухгалтер", "dmitrievna7@mail.ru", "89997654332", 35000, 53);
        workers[3] = new Worker("Ловецкий Генадий Александрович", "Старший Кладовщик", "lovegen@gmail.com", "89606547685", 42000, 41);
        workers[4] = new Worker("Жупко Александр Владимирович", "Зам.Директора", "jupko2@mail.ru", "89996789823", 60000, 49);

        getWorkerOverForty(workers);
    }

    public static void getWorkerOverForty(Worker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 40) {
                System.out.println(workers[i].getInfo());
            }
        }
    }
}