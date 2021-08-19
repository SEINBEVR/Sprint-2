import kotlin.math.max
/**
 * @author Kirill Vasilev <kirill.vasilev.work@gmail.com>
 */
class ProblemD {

    fun main() {

        var numberOfInputs = readInt()                                      //Количество наборов входных данных

        var numberOfClients:Int                                             //Количество клиентов в наборе входных данных
        var clientsMoney:LongArray                                          //Массив, содержащий количество монет каждого клиента

        while(numberOfInputs > 0) {
            //Считываем набор данных из:
            numberOfClients = readInt()                                     //Количество клиентов
            clientsMoney = readListLong().toLongArray()                     //Количество монет каждого из клиентов

            var maxProfit:Long = 0                                          //Начальный максимальный доход для набора данных = 0

            for(i in 0 until numberOfClients) {                             //В двойном цикле ищем максимальную прибыль с клиентов
                var tempMaxProfit = clientsMoney[i]                         //Добавляем новую переменную, временно хранящую максимальную прибыль
                for(j in 0 until numberOfClients) {                         //Вычисляем максимальную прибыль для каждой возможной комбинации
                    if(i != j && clientsMoney[j] >= clientsMoney[i]) {
                        tempMaxProfit += clientsMoney[i]
                    }
                }
                maxProfit = max(tempMaxProfit, maxProfit)                    //Записываем максимальную прибыль, сравнивая уже имеющуюся максимальную прибыль с
            }                                                               //прошлых итераций с максимальной прибылью с настоящей итерации
            numberOfInputs--
            println(maxProfit)                                              //Вывод максимальной прибыли
        }



    }

}