import java.util.Scanner
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    var mark: Int = reader.nextInt()

    if (mark < 90 - 100) {
        println("A")
    } else if (mark > 80 - 89) {
        println("B")
    } else if (mark < 70 - 79) {
        println("C")
    } else if (mark < 60 - 69) {
        println("D")
    } else {
        println("FAIL")
    }
}