package kata
/*
Your task, is to create a NxN spiral with a given size.

For example, spiral with size 5 should look like this:

00000
....0
000.0
0...0
00000
and with the size 10:

0000000000
.........0
00000000.0
0......0.0
0.0000.0.0
0.0..0.0.0
0.0....0.0
0.000000.0
0........0
0000000000
Return value should contain array of arrays, of 0 and 1, with the first row being composed of 1s. For example for given size 5 result should be:

[[1,1,1,1,1],[0,0,0,0,1],[1,1,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
Because of the edge-cases for tiny spirals, the size will be at least 5.

General rule-of-a-thumb is, that the snake made with '1' cannot touch to itself.
*/
object Spiralizor {
	fun spiralize(n: Int): Array<ByteArray> {
		val array:Array<ByteArray> = Array(n){ ByteArray(n) }
        //dir 1-right, 2-down, 3-left, 4-up
        var dir=1
        var lastX=0
        var lastY=0
        var toAdd=n
        var counter=-1

        for(x in 0 until n){
            when(dir){
                1-> {
                    for (i in lastX until lastX + toAdd)
                        array[lastY][i] = 1
                    lastX = lastX + toAdd - 1

                }
                2-> {
                    for (i in lastY until lastY + toAdd)
                         array[i][lastX] = 1
                    lastY = lastY + toAdd - 1
                }
                3->{
                    for (i in lastX downTo lastX-toAdd+1)
                        array[lastY][i] = 1
                    lastX = lastX - toAdd + 1
                }
                4->{
                    for (i in lastY  downTo lastY-toAdd+1)
                         array[i][lastX] = 1
                    lastY = lastY - toAdd + 1
                }
            }
            ++counter
            ++dir
            if(dir>4)
                dir=1
            if(counter%2==0&&counter!=0)
                toAdd-=2

        }
        return array
	}
}
