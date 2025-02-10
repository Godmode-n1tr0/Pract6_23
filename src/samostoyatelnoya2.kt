fun canBrickPass(a: Int, b: Int, x: Int, y: Int, z: Int): Boolean {
    return when {
        (x <= a && y <= b) || (x <= b && y <= a) -> true
        (x <= a && z <= b) || (x <= b && z <= a) -> true
        (y <= a && z <= b) || (y <= b && z <= a) -> true
        else -> false
    }
}

fun main() {
    var a = 0
    var b = 0
    var x = 0
    var y = 0
    var z = 0

    while (true) {
        try {
            println("Введите размер отверстия (a и b):")
            print("a: ")
            a = readLine()!!.toInt()
            print("b: ")
            b = readLine()!!.toInt()
            break
        } catch (e: NumberFormatException) {
            println("Ошибка! Введите целые числа для размеров отверстия.")
        }
    }

    while (true) {
        try {
            println("Введите размеры кирпича (x, y и z):")
            print("x: ")
            x = readLine()!!.toInt()
            print("y: ")
            y = readLine()!!.toInt()
            print("z: ")
            z = readLine()!!.toInt()
            break
        } catch (e: NumberFormatException) {
            println("Ошибка! Введите целые числа для размеров кирпича.")
        }
    }

    if (canBrickPass(a, b, x, y, z)) {
        println("Кирпич пройдет через отверстие.")
    } else {
        println("Кирпич не пройдет через отверстие.")
    }
}
