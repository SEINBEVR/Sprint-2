import kotlin.math.abs
/**
 * @author Kirill Vasilev <kirill.vasilev.work@gmail.com>
 */
class ProblemC {

    fun main() {

        var numberOfStudents = readInt()                        //Считываем количество входных данных, данная переменная нигде не используется
        val scoresList = readListInt()                          //Записываем количество очков каждого студента в Лист
        val scoresMutableList = mutableListOf<Int>()            //
        scoresMutableList.addAll(scoresList)                    //На основе прошлого листа создаем изменяемый лист, чтобы с ним можно было работать в рекурсии
        val minimalNumberOfExercises =
            recursion(scoresMutableList, 0)            //Вызываем функцию ркурсии, передавая количество необходимых выполнений заданий с 0
        println(minimalNumberOfExercises)                       //Выводим в консоль необходимое минимальное количество выполненных заданий для формирования пар
    }

    /**
     * @param scoresArray изменяемый список количества очков каждого студента
     * @param difference минимальной количество необходимых заданий для выполнения,
     * записан как "разница", поскольку это является разницей для двух минимальных объектов коллекции
     * @return difference минимальное количество необходимых заданий для выполнения для формирования пар
     */
    fun recursion(scoresArray: MutableList<Int>, difference: Int):Int {

        if(scoresArray.isNotEmpty()) {          //Проверяем содержатся ли еще элементы в коллекции

            var min1 = Integer.MAX_VALUE            //Создаем две переменные, которые будут хранить минимальные элементы коллекции
            var min2 = Integer.MAX_VALUE            //Две переменные, поскольку формируем пары

            for(i in scoresArray.indices) {         //В цикле по индексам
                if(scoresArray[i] < min1) {         //Находим первый минимальный элемент
                    min2 = min1
                    min1 = scoresArray[i]
                } else if(scoresArray[i] < min2) {  //Находим второй минимальный элемент
                    min2 = scoresArray[i]
                }
            }

            scoresArray.remove(min1)                //Удаляем посчитанную пару студентов из коллекции
            scoresArray.remove(min2)

            return recursion(scoresArray,           //Вызываем рекурсивно минимальной разницы очков для всех пар,
                difference                 //пока коллекция не станет пустой
                        + abs(min2-min1))
        }
        return difference                       //Если элементов в коллекции больше нет возвращаем минимальное количество задач для выполнения
    }

}