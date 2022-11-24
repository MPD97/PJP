def list1 = [ 'a', 'b', 'c']
def list2 = [ 1, 8, 23 ]

list1.each {
    print(it + ", ")
}
println()

list2.each {
    print(it + ", ")
}

println()

def list11 = []
list1.each {
    list11.add(list11.size(), it + it)
}
println(list11)

def list12 = []
list2.each {
    list12.add(list12.size(), it + it)
}
println(list12)