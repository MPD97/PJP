def maximum(collection) {
    def max = collection.max()
    def result = []

    collection.eachWithIndex{ element, index ->
        if (element == max)
            result.push(index)
    }

    return new Tuple(max, result.reverse())
}

(maxVal, indList) = maximum( [5, 3, 5, 5, 1, 5] )
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"