fun main(args: Array<String>) {
    calculateUserInput()
}
fun calculateUserInput(){
    var isValidChoice = true
    while (isValidChoice){
        print("შეიყვანეთ X ცვლადის მნიშვნელობა: ")
        val x = readIntOrAskAgain()
        print("შეიყვანეთ y ცვლადის მნიშვნელობა: ")
        val y = readIntOrAskAgain()
        val z = x+y
        println("X და Y ჯამი არის: $z")
        println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
        var ANSWER = readln()
        if(notTheRightLetters(ANSWER)){
            while (notTheRightLetters(ANSWER)) {
                println("გთხოვთ შეიყვანოთ y/n")
                ANSWER = readln()
                isValidChoice = checkIfRestartOrEnd(ANSWER)
            }
        }else
            isValidChoice = checkIfRestartOrEnd(ANSWER)
    }
}

fun notTheRightLetters(ANSWER: String): Boolean {
    if (!ANSWER.equals("n",true) &&
        !ANSWER.equals("y",true)) {
        return true
    }else{
        return false
    }
}

fun checkIfRestartOrEnd(answer: String): Boolean{
    if (!answer.equals("n",true)){
        return true
    }
    else{
        println("დასასრული")
        return false
    }
}

fun readIntOrAskAgain():Int {
    while (true){
        try {
            return readln().toInt()
        }catch (e: NumberFormatException){
            print("გთხოვთ შეიყვანოთ მთელი რიცხვი. ")
        }
    }
}