fun main(args: Array<String>) {

    var diametro = 0
    var perimetro = 0.0
    var area = 0.0

    println("Digite o diâmetro do círculo a se calculado: ")
    diametro = readLine()!!.toInt()

    var raio = diametro/2
    println(raio)

    println("O valor da área do círculo é ${3.14*(raio*raio)}")
    println("O valor do perímetro do círculo é ${2*3.14*raio}")





}