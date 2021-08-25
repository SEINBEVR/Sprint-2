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

            numberOfClients = readInt()                                     //Количество клиентов
            clientsMoney = readListLong().toLongArray().sortedArray()       //Количество монет каждого из клиентов по возрастанию


            var maxProfit:Long = 0                                          //Максимальная прибыль
            var tempMaxProfit:Long                                          //Временная максимальная прибыль

            for(i in 0 until numberOfClients) {
                tempMaxProfit = clientsMoney[i] * (numberOfClients - i)     //Временная максимальная прибыль = количеству монет клиента * оставшее количество клинетов, имеющих больше или столько же монет
                maxProfit = max(tempMaxProfit, maxProfit)                   //Записываем в максимальную прибыль временную, если она больше
            }


            numberOfInputs--
            println(maxProfit)
        }



    }

}