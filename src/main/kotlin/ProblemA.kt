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
            val k = abk.elementAt(2).toInt()            //Количество прыжков
            val a = abk.elementAt(0)                    //Длина прыжка вправо
            val b = abk.elementAt(1)                    //Длина прыжка влево

            for(i in 1..k) {
                if(i % 2 != 0) x += a                         //Если шаг нечетный то сделать прыжок вправо
                else x -= b                                   //Иначе шаг четный и сделать прыжок влево
            }
            println(x)                                        //Вывести конечную позицию лягушки
            t--                                               //Перейти к следующему наблюдению
        }
    }
}