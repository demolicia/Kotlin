fun main() {
    var first = 56
    var second = 78
    var third = 89

    if(first > second && first > third){
        println("$first is the largest number")
    }
    else if(second > first && second > third){
        println("$second is the largest number")
    }
    else{
        println("$third is the largest number")
    }
}