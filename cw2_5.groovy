def eachTuple(list, closure) {
	def n = closure.maximumNumberOfParameters
	def data = []

	list.each {
		data.add(data.size(), it)
		if (data.size() == n) {
			closure(data)
			data.clear()
		}
	}
}

def list = (1..40)

eachTuple(list) { e1, e2, e3, e4 ->
	println "$e1 $e2 $e3 $e4"
}

def s = 'asia ma kota i psa'

def out = new StringBuffer()
eachTuple(s) { a, b ->
	out << b << a
}
println out