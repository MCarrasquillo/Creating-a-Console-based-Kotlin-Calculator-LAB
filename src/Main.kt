//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    while(true) {
        print("Welcome to your calculator: \n")
        print("To exit type exit\n")
        print("Please enter first number: ")
        val num1 = readLine()?.toDoubleOrNull()

        if (num1.toString() == "exit"){
            break
        }
        if (num1 == null) {
            println("value entered must be a number")
            return
        }
        print("please enter operation( + , - , / , *):  ")
        val operation = readLine()
        if (operation == "exit"){
            break
        }
        print("Please enter second number: ")
        val num2 = readLine()?.toDoubleOrNull()
        if (num2.toString() == "exit"){
            break
        }
        if (num2 == null) {
            println("Value entered must be a number")
            return
        }

        if (operation == "/" && num2 == 0.0) {
            print("You cannot divide by 0")
            return
        }

        val result = when (operation) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "/" -> num1 / num2
            "*" -> num1 * num2
            else -> null
        }
        if (result != null) {
            print("--------------------------\n")
            print(String.format(result.toString()))
            print("\n--------------------------\n")
        }

        else {
            print("Error: operation must be on of these ( + , - , / , *)")
        }
    }

}
