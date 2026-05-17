fun missingNumbers(arr: Array<Int>, brr: Array<Int>): Array<Int> {
    val arrMap = hashMapOf<Int, Int>()
    val brrMap = hashMapOf<Int, Int>()
    val result = arrayListOf<Int>()


    for(i in arr){
        arrMap[i] = 1 + (arrMap[i] ?: 0)
    }

    for(i in brr){
        brrMap[i] = 1 + (brrMap[i] ?: 0)
    }

    for((value, count) in brrMap){
        if((arrMap[value] ?: 0) != count){
            result.add(value)
        }
    }
    
    return result.sorted().toTypedArray()
}

fun main() {
    println(missingNumbers(arrayOf(203, 204, 205, 206, 207, 208, 203, 204, 205, 206), arrayOf(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204)).joinToString())
}