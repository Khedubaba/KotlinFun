fun main(args: Array<String>) {
    println("Hello Kotlin!")
    var age = 23
    var favDrink : String = "Coffee"
    var name = "Khedu"
    println("I am $name, I am $age years old and I love $favDrink")





    //This is How you do single line comment in kotlin
    /*Multiple
    line
    Comment*/





    //Math in Kotlin
    var radius = 7
    var pi = 3.14
    var c = radius * pi.toInt() * 2
    println(c)

    var wallet = 48
    wallet -= 5
    println(wallet)
    wallet += 100
    println(wallet)

    age += 40
    println("Tell me in multi line comment you'll be doing at $age years.")





    //if statements and booleans
    var isDogAlive: Boolean = false;
    if (isDogAlive){
        println("yeeee")
    }
    else{
        println("noooo")
    }

    if (name == "Khedu"){
        println("$name is a bawss!!")
    }





    //List and arrays in kotlin
    var luckyNumbers = listOf(1, 2, 4, 7, 9)
    var unluckyNum = arrayOf(8, 9, 10)
    var emptyArray = arrayOf<Int>()

    var mutableList = mutableListOf(2, 4, 6, 8, 10)
    mutableList.add(0, 21)
    mutableList.add(42)
    println(mutableList[1])
    println(mutableList.size)
    //Make list of your fav movies
    var favMovies: List<String> = listOf("Shawshank Redemption, Interstellar, Her, Avengers, Harry Potter Series")
    println(favMovies)





    // for loop in kotlin
    for (x in 1..10){
        println(x)
    }

    var favCandy = listOf("Snickers", "Chupa Chups", "Jolly Rauncher\n")
    for (candy in favCandy){
        println(candy)
    }

    //Loop through numbers and print out all the odd numbers
    for (i in 1..50){
        if (i%2 != 0){
            println(i)
        }
    }
    println("\n")





    // Maps in kotlin is key value storing method

    var dogs = mapOf("Fido" to 8, "Sarah" to 17, "Sean" to 6)
    println(dogs["Fido"])

    //Make a map that holds 3 words and 3 definations of slang you use, make use of mutable map
    var slangs = mutableMapOf("KnockOut" to "Beat them up boii", "grub" to "eat food")
    slangs["MJ9"] = "Khedu"
    println(slangs["MJ9"])





    // functions in kotlin

    fun hello() {
        var name = "Khedu"
        println("Hello $name")
    }
    fun hello1(): String{
        var name = "Khem"
        return "Hello $name"
    }
    //parameter pass in fun
    fun hello2(name: String): String{
        return "Hello $name"
    }
    // default parameter pass in fun
    fun hello3(name: String = "Ramu"): String{
        return "Hello $name"
    }
    // multiple parameter pass in fun
    fun hello4(name: String, punctuation: String): String{
        return "Hello $name$punctuation"
    }

    fun addNum(num1: Int, num2: Int): Int{
        return num1+num2
    }

    //Shortcut way to declare method in kotlin
    fun addNumbers(num1: Int, num2: Int) = num1 + num2

    hello()
    println(hello1())
    println(hello2("Aditya"))
    println(hello3())
    println(hello4("Shyam","!"))
    println(addNum(2, 8))
    println(addNumbers(2, 5))





    // Classes in Kotlin

//    class Dog(var name: String, var age: Int){
//    }

    class Dog{
        //properties of class
        var naam: String
        var agee: Int

//        init {
//            breed = ""
//            agee = 0
//        }

        constructor(naam: String, umar: Int){
            this.naam = naam
            this.agee = umar
        }

        //can have multiple constructors

        fun dogInfo(){
            println("$naam is $agee years olds")
        }
    }
    //creating objects of Dog class
    var myDog = Dog("Fido", 5)
    println(myDog.dogInfo())
    println()




    // Nullable in kotlin

    var ageIs: Int ? = 23
    ageIs =  21
    ageIs = null
    //to turn unnullable
    ageIs !!

    if (ageIs != null){
        ageIs !!
    }

    //Make String nullable
    var favPlace: String ? = "Alaska"
    favPlace = null;

    class Cat{

    }
    var myCat: Cat ? = Cat()
    myCat = null

}