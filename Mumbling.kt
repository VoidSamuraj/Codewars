package accum
/*
This time no story, no theory. The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
*/
fun accum(s:String):String {
    val length=s.length
    return StringBuilder().apply{
        s.forEachIndexed{ind,char->
            append(char.toUpperCase())
            for(i in 1..ind)
                append(char.toLowerCase())
            if(length>ind+1)
                append('-')    
        }
    }.toString()
}
