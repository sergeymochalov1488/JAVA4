package Services;

import java.util.List;

/**
 * @apiNote Интерфейс для описания взаимодейсвтия с участниками учебного заведения
 * @author Developer Name
 * @version 1.0
 */


public interface iPersonService<T> {
    /**
     * метод получения списка всех участников
     */
    List<T> getAll();

    /**
     * метод созадния учатинка
     * @param name имя учачтинка
     * @param age возраст участинка
     */
    void create(String name, int age);
}
