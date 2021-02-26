public class Task2 {
    public static void main(String[] args){
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Рыжков", "89643939223");
        phonebook.add("Рыжков", "86473459092");
        phonebook.add("Петров", "88736475264");
        phonebook.add("Гладилов", "86548937445");
        phonebook.add("Петров", "86747259053");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Рыжков");
        System.out.println(phonebook.get("Рыжков"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Гладилов");
        System.out.println(phonebook.get("Гладилов"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Рыжков", "89643939223");
        System.out.println("Рыжков");
        System.out.println(phonebook.get("Рыжков"));
    }
}
