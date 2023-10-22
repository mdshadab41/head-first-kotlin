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

//    fun convert(x: Double,
//               converter: (Double) -> Double): Double {
//
//        val result = converter(x)
//        println(result)
//        return result
//    }
//    fun convertFive(converter: (Int) -> Double) : Double {
//        val result = converter(5)
//        println(result)
//        return result
//    }
//    convert(20.0){it * 1.8 + 32}
//    convertFive { it * 1.8 +32  }

    ///Convert 2.5kg to Pounds
    println("Convert 2.5kg to Pounds: ${getConversionLambda("KgsToPounds")(2.5)}")
//Define two conversion lambdas
    val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUSTonsLambda = getConversionLambda("PoundsToUSTons")
//Combine the two lambdas to create a new one
    val kgsToUSTonsLambda = combine(kgsToPoundsLambda, poundsToUSTonsLambda)
//Use the new lambda to convert 17.4 to US tons
    val value = 17.4
  //  println("$value kgs is ${convert(value, kgsToUSTonsLambda)} US tons")






}

typealias DoubleConversion = (Double) -> Double

fun convert(x: Double,
            converter:DoubleConversion: DoubleConversion {

    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun getConversionLambda(str: String): DoubleConversion {
    if (str == "CentigradeToFahrenheit") {
        return { it * 1.8 + 32 }
    } else if (str == "KgsToPounds") {
        return { it * 2.204623 }
    } else if (str == "PoundsToUSTons") {
        return { it / 2000.0 }
    } else {
        return { it }
    }
}

fun combine(lambda1: DoubleConversion,
            lambda2: DoubleConversion): DoubleConversion {
    return { x: Double -> lambda2(lambda1(x)) }
}

