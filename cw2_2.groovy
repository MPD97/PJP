import javax.swing.JOptionPane

def getInts() {
    def results = []
	def input = null
    do {
        input = JOptionPane.showInputDialog(null, "Podaj liczbę całkowitą", "")
		
        if (input?.matches(/^[-+]?\d+$/))
            results.push(Integer.parseInt(input))
			
    }while (input != null)

    return results
}

print getInts()