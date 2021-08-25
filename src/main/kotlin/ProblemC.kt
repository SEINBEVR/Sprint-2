/**
 * @author Kirill Vasilev <kirill.vasilev.work@gmail.com>
 */
class ProblemC {

    fun main() {

        val numberOfStudents = readInt()                        //Считываем количество входных данных
        val scoresList = readListInt().sorted()                 //Считываем умение программировать каждого студента в порядке возрастания

        var exCounter = 0                                       //Счетчик количества задач для решения
        for (i in 1 until numberOfStudents step 2) {
            exCounter += scoresList[i] - scoresList[i - 1]      //Попарно складываем разницу умения программировать
        }
        println(exCounter)
    }
}