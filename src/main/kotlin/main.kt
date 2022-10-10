fun main() {
    val amount = 1200
    val discount1 = amount * 0  //Если сумма покупки от 0 до 1 000 рублей, то никаких скидок нет.
    val discount2 = 100   //Если сумма покупки от 1 001 до 10 000 рублей, то стандартная скидка - 100 рублей
    val discount3 = amount * 0.05 //Если сумма покупки от 10 001 рубль и выше то % составляет 5% от суммы.
    val discount4 = 0.01 //Если покупатель- постоянный клиент
    val statusOfBuyer = true // true- постоянный покупатель, false- непостоянный.


    val totalDiscount = when (amount) {
        in 0..1000 -> if (statusOfBuyer) discount4 else discount1
        in 1001..10000 -> if (statusOfBuyer) discount2 + (amount - discount2) * discount4 else discount2
        in 10001..Int.MAX_VALUE -> if (statusOfBuyer) discount3 + (amount - discount3) * discount4 else discount3
        else -> "not rated"
    }

    println("Скидка составит: $totalDiscount RUB")

}