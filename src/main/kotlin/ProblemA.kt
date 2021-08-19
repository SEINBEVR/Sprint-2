/**
 * @author Kirill Vasilev <kirill.vasilev.work@gmail.com>
 */
class ProblemA {

    fun main() {

        var t = readInt()                                     //Количество наблюдений за лягушкой
        var x:Long                                            //Позиция лягушки
        var abk:List<Long>                                    //List содержащий данные о длине хода лягушки вправо и влево и количестве совершаемых шагов

        while(t > 0) {                                        //В цикле проводим вычисления позиции лягушки для каждого наблюдения
            abk = readListLong()
            x = 0

            for(i in 1..abk.elementAt(2).toInt()) {
                if(i % 2 != 0) x += abk.elementAt(0)    //Если шаг нечетный то сделать прыжок вправо
                else x -= abk.elementAt(1)              //Иначе шаг четный и сделать прыжок влево
            }
            println(x)                                        //Вывести конечную позицию лягушки
            t--                                               //Перейти к следующему наблюдению
        }
    }
}