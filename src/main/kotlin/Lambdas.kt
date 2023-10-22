fun main(){
//    var addFive = {x: Int -> x + 5}
//    println("Pass 6 to addFive: ${addFive(6)}")
//
//    val addInts = {x: Int, y: Int -> x+y}
//    val result = addInts.invoke(6,7)
//    println(result)
//
//    val inLambdas: (Int, Int) -> Int = {x,y -> x +y}
//    println(inLambdas(7,8))
//
//    val addSeven: (Int) -> Int = {it +7}
//    println(addSeven(7))
//
//    val myLambdas: () -> Unit = { println("Hi Lambdas") }
//    myLambdas()

    fun convert(x: Double,
               converter: (Double) -> Double): Double {

        val result = converter(x)
        println(result)
        return result
    }
    fun convertFive(converter: (Int) -> Double) : Double {
        val result = converter(5)
        println(result)
        return result
    }
    convert(20.0){it * 1.8 + 32}
    convertFive { it * 1.8 +32  }

}