fun main(){
    var addFive = {x: Int -> x + 5}
    println("Pass 6 to addFive: ${addFive(6)}")

    val addInts = {x: Int, y: Int -> x+y}
    val result = addInts.invoke(6,7)
    println(result)

    val inLambdas: (Int, Int) -> Int = {x,y -> x +y}
    println(inLambdas(7,8))

    val addSeven: (Int) -> Int = {it +7}
    println(addSeven(7))

    val myLambdas: () -> Unit = { println("Hi Lambdas") }
    myLambdas()
}