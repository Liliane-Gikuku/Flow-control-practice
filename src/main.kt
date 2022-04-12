fun main(){
    greetJane("jane")
    greetJane("Jane")
    identifyNumber(2)
    identifyNumber(0)
    identifyNumber(5)
    hasVisitedCapital("Ugandan")
    hasVisitedCapital("Congo")
    hasVisitedCapital2("Burundian")
    hasVisitedCapital3("Ghanaian")
    hasVisitedCapital3("Tanzanian")
    admitPerson(1)

}
fun greetJane(name:String) {
    if (name == "Jane") {
        println("Hello Jane")
    }
    else {
        println("Who are you?")

    }
}

//prints out odd or even when a number is passed to it

fun identifyNumber(number:Int){
    if(number%2==0){
        println("even")
    }
    else{
        println("odd")
    }
}


fun hasVisitedCapital(nationality:String){
    if (nationality.equals("Kenyan")){
        println("Have you ever been to Nairobi?")
    }
    else if(nationality.equals("Burundian")){
        println("Have you ever been to Bujumbura?")
    }

    else if(nationality.equals("Ugandan")){
        println("Have you ever been to Kampala?")
    }
    else{
        println("Have you ever been to East Africa?")
    }
}

fun hasVisitedCapital2(nationality:String){
    when(nationality){
        "Kenyan"->println("Have you ever been to Nairobi?")
        "Burundian"->println("Have you ever been to Bujumbura?")
        "Ugandan"->println("Have you ever been to Kampala?")
        else->println("Have you ever been to East Africa?")
    }
}

fun hasVisitedCapital3(nationality:String){
    when(nationality){
        "Tanzanian","Kenyan"->println("Have you ever been to Nairobi?")
        "Ghanaian","Nigerian"->println("Have you ever been to Lagos?")
        "Botswanan", "Zimbambwean"->println("Have you ever been to Kampala?")
        else->println("Have you ever been to East Africa?")
    }
}

/*Otherwise it would be alot of typing with if statements
if(nationality.equals ("ug") ||nationality.equals ("Tzn")
It is posssible to combine branch conditions using when condition*/

fun admitPerson(age:Int){
    when(age) {
        1, 2, 3, 4 -> println("Kindergarten")
        5, 6, 7, 8, 9, 10 -> println("Primary")

        else -> println("No place")
    }

    }


fun validatePassWord(password:String){
    if(password.equals("char>=8 & char<=16")){
        println("true")
    }
        else{
            println("false")
        }
}

