package kata
/*
Your task, is to create N×N multiplication table, of size provided in parameter.

For example, when given size is 3:

1 2 3
2 4 6
3 6 9
For the given example, the return value should be:

[[1,2,3],[2,4,6],[3,6,9]]
*/
object KataSolution {
    fun multiplicationTable(size: Int): Array<IntArray> {
        val array = Array<IntArray>(size){IntArray(size)} 
        for(x in 1..size){
            for(y in 1..size){
                 array[x-1][y-1]=x*y
            }
        }
        return array
    }
}
