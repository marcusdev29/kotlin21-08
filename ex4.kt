import java.util.*

fun main(){
    var maior = 0
    var num : Int

    for(i in 1 .. 5){
        var scanner = Scanner(System.`in`).useLocale(Locale.US)
        println("insira o numero: ")
        num = scanner.nextInt()

        if (num > maior){
            maior = num
            print("maior numero é $maior")
        }


        }
}
