
import javax.swing.*

def getData(arg1 = null, arg2 = null) {
    def results = []
	def input = null
	
    do {
        input = JOptionPane.showInputDialog(null, "Podaj dane", "")

        if (input == null)
            break

        if (arg1 instanceof Class) {
            try {
                input = input.asType(arg1)
                if (arg2 instanceof Closure && !validate(arg2, input)) {
                    continue
                }
            }
            catch (ex) {
                continue
            }
        }

        if (arg1 instanceof Closure && !validate(arg1, input)) {
            continue
        }

        results.push(input)
		
    }while(true)

    return results
}

def validate(c, value) {
    return c(value)
}

println getData(Integer) { it > 0 }
println getData() { it.size() > 3 }
println getData()
println getData(BigDecimal)