fun main() {
    println("Введите двузначное число:")
    val input = readLine()

    try {
        val number = input?.toInt() ?: throw IllegalArgumentException("Некорректный ввод. Ожидалось число.")

        if (number < 10 || number > 99) {
            println("Ошибка: Введите двузначное число.")
            return
        }

        val hasEight = number.toString().contains('8')
        
        if (hasEight) {
            println("В числе $number присутствует цифра 8.")
        } else {
            println("В числе $number отсутствует цифра 8.")
        }

    } catch (e: NumberFormatException) {
        println("Ошибка: некорректный ввод. Ожидалось число.")
    } catch (e: IllegalArgumentException) {
        println("Ошибка: ${e.message}")
    } catch (e: Exception) {
        println("Произошла неожиданная ошибка: ${e.message}")
    }
}