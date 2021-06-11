package ru.netology;
public class Main {
    public static void main(String[] args) {
        try {
            Person mom1 = Person.builder()
                    .buildName("Анна")
                    .buildSurname("Вольф")
                    .buildAge(31)
                    .buildAdress("Сидней")
                    .build();
            Person son1 = mom1.newChildBuilder()
                    .buildName("Антошка")
                    .buildAge(3)
                    .build();
            Person daughter1 = mom1.newChildBuilder()
                    .buildName("Катеринка")
                    .buildAge(11)
                    .build();
            System.out.println("У " + mom1 + " есть сын, " + son1 + " и дочь, "  + daughter1);
            System.out.println("\n");

            Person dad1 =  Person.builder()
                    .buildName("Анатолий")
                    .buildSurname("Касперчак")
                    .buildAge(44)
                    .buildAdress("Балабаново")
                    .build();
            Person son2 = dad1.newChildBuilder()
                    .buildName("Леонид")
                    .buildAge(23)
                    .build();


            System.out.println("У " + dad1 + " есть сын, " + son2);
            dad1.happyBirthday();
            System.out.println("У человека по имени " + dad1.getName() + " день Рождение, ему теперь   " + dad1.getAge());
            Person uncle = Person.builder()
                    .buildName("Банни")
                    .buildSurname("Карвахаль")
                    .buildAge(-100)
                    .buildAdress("Гавана")
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}