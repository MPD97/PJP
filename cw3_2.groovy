def pmap = [
        Groovy: ['Asia', 'Jan'],
        Grails: ['Asia', 'Jan', 'Stefan', 'Mirek'],
        Java  : ['Asia', 'Stefan', 'Mirek'],
        JEE   : ['Slawek', 'Stefan', 'Janusz']
]

println "Ile osób pracuje w każdym z projektów"

def keys = pmap.keySet()
keys.each { key ->
    def count = pmap.get(key).size()
    println "$key: $count"
}

println ""
println "Projekty, które mają więcej niż dwóch programistów"


pmap.findAll {
    it.value.size() > 2
}.collect { el -> 
	println el.key 
}

println ""
println "Programisci : projekty"

def programmers = []
pmap.values().each({ arr ->
	arr.each({ 
		if(!programmers.contains(it))
		{
			programmers.push(it)
		}
	})
})

programmers.each({ x ->
    def projects = pmap.findAll({ programmer ->
		programmer.value.contains(x) 
	}).collect({ el ->
		el.key 
	})
	
    println "$x: $projects"
})