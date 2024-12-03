fun main() {
    while (true) {
        println("Welcome to your calculator: \n")
        println("To exit, type 'exit'\n")

        // usuario ingresa primer valor
        print("Please enter the first number: ")
        val input1 = readLine()
        if (input1?.lowercase() == "exit") break
        val num1 = input1?.toDoubleOrNull()
        if (num1 == null) {
            println("Value entered must be a number\n")
            continue
        }

        // Get the operation
        print("Please enter operation (+, -, *, /): ")
        val operation = readLine()
        if (operation?.lowercase() == "exit") break
        if (operation !in listOf("+", "-", "*", "/")) {
            println("Invalid operation. Must be one of (+, -, *, /)\n")
            continue
        }

        // usuario ingresa segundo valor
        print("Please enter the second number: ")
        val input2 = readLine()
        if (input2?.lowercase() == "exit") break
        val num2 = input2?.toDoubleOrNull()
        if (num2 == null) {
            println("Value entered must be a number\n")
            continue
        }

        // Validacion de no poder sumar entre 0
        if (operation == "/" && num2 == 0.0) {
            println("Error: Division by zero is not allowed\n")
            continue
        }

        // Calculacion de el resultado
        val result = when (operation) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> null // This case should never occur
        }

        // Demostramos el resultado
        if (result != null) {
            print("--------------------------\n")
            print(String.format(result.toString()))
            print("\n--------------------------\n")
        }
        else {
            print("Error: operation must be on of these ( + , - , / , *)")
        }
    }
    println("Exited successfully\n")
    println("Goodbye!")
}








