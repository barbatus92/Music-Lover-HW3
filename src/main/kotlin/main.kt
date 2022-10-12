fun main() {
    val amount = 150
    val discountZero = amount * 0  //Если сумма покупки от 0 до 1 000 рублей, то никаких скидок нет.
    val discountMid =
        100   //Если сумма покупки от 1 001 до 10 000 рублей, то стандартная скидка - 100 рублей
    val discountMax = (amount * 0.05) //Если сумма покупки от 10 001 рубль и выше то % составляет 5% от суммы.
    val discountRegularBuyer = 0.01 //Если покупатель- постоянный клиент
    val statusOfBuyer = true // true- постоянный покупатель, false- непостоянный.
    var totalDiscount = 0

    when (amount) {
        in 0..1000 -> totalDiscount = discountZero
        in 1001..10000 -> totalDiscount = discountMid
        in 10001..Int.MAX_VALUE -> totalDiscount = discountMax.toInt()
        else -> "not rated"
    }
    if (statusOfBuyer) { // проверка на статус постоянного покупателя
        totalDiscount = ((amount - totalDiscount) * discountRegularBuyer + totalDiscount).toInt()
    }
    print(" Сумма покупки: $amount рублей \n Ваша скидка составит : $totalDiscount рублей")
}
