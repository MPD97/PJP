
def apply(List list, Closure closure) {
    list.collect(closure)
}

def example1 = [-5, 0, 20, 150]
def result1 = apply(example1, {
    it + it * 2
})

def example2 = [1, 2, 15, -200]
def result2 = apply(example2, {
    it / 2
})

def example3 = [0, 1, 5, 15, 25, -754]
def result3 = apply(example3, {
    it % 5
})

println result1
println result2
println result3