
data class Recipe(var name: String)
fun main(){

    //List
    var mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("mShopingList original: $mShoppingList")

    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)

    println("mShopping items added: $mShoppingList")
    if (mShoppingList.contains("Tea")){
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    }
    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reveresed: $mShoppingList")


    //----Section 2 - Set -------

    println("-------------Set---------------")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")

    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)

    println("mShoppingSet items added: $mShoppingSet")
    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new Version: $mShoppingList")



    //Section ------ Map

    println("-------------------Map Start Here---------------------------")

    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalya")
    val r5 = Recipe("Sausage Rolls")

    val mRecipeMap = mutableMapOf("Receipe1" to r1, "Receipe2" to r2, "Recipe3" to r3)
    println("mRecipeMap original: $mRecipeMap")

    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap updated: $mRecipeMap")
    if (mRecipeMap.containsKey("Recipe1")) {
        println("Recipe1 is: ${mRecipeMap.getValue("Recipe1")}")}









}