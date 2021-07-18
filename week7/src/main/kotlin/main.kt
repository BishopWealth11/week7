fun main(args: Array<String>) {
    var num = 987654321
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }
    println("Reversed Number: $reversed")
}