fun main(){

    val valor = arrayListOf(10,2,3,4,5,6,7,8,9,100).sum()
    val media = valor /10

    println("A media dos valores -> $media")

    if(media <= 5){
        println("media menor ou igual dos valores -> $media")
    }

    if (media > 10){
        println("media é maior que 10")
    }
}