package Domen;

/**
 * Класс для описания сотрудника учебного заведения
 */
public class Employee extends Person {
    private String special;

    /**
     * @param firstName имя сотрудинка
     * @param age       возраст сотрудника
     * @param special   специальность(должность) сотрудника
     * @apiNote конструктор класса
     */
    public Employee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }
}
