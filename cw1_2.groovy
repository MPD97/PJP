while(true) {
    println "Podaj liczbe:"
    input = new Scanner(System.in).nextLine()

    println "Podales liczbe: ${input}"

    for (character in input.toCharArray()) {
        switch (character) {
            case '0': print "zero"; break
            case '1': print "jeden"; break
            case '2': print "dwa"; break
            case '3': print "trzy"; break
            case '4': print "cztery"; break
            case '5': print "piec"; break
            case '6': print "szesc"; break
            case '7': print "siedem"; break
            case '8': print "osiem"; break
            case '9': print "dziewiec"; break
            default: print '<unk>'; break;
        }
        print " "
    }
    println ""
}


