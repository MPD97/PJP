
def dict = [:]

while(true) {
    println "Podaj pozycje zgodnie ze wzorem: klucz=wartosc"
    input = new Scanner(System.in).nextLine()

    separatorIdx = input.indexOf('=')

    key = input.substring(0, separatorIdx)
    value = input.substring(separatorIdx + 1, input.length())
    valueInt = value.toInteger()

    if(dict.containsKey(key)){
        dict[key] += valueInt
    }
    else{
        dict[key] = valueInt
    }

    println ""
    println "Aktualny stan: "
    dict.each{entry -> println "$entry.key: $entry.value"}
}

