package romannumerals

/*
Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and returning a string containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Example:

encode(1000) // should return "M"
Help:

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
Remember that there can't be more than 3 identical symbols in a row.

More about roman numerals - http://en.wikipedia.org/wiki/Roman_numerals
*/

 fun encode(num: Int): String {

        var numCp=num


        return StringBuilder().apply { 
            var m:Int=numCp/1000
            numCp-=(m*1000)
            
            for(mi in 1..m)
                append("M")
                
            var c=numCp/100    
            numCp-=(c*100)
            if(c==9)  {  
                append("CM")
            }else if(c==4){    
                append("CD")
            }else {
                if(c>=5)
                    append("D")
                for(ci in 1..(c%5))
                    append("C")
            } 
            
            var x=numCp/10 
            numCp-=(x*10)
            if(x==9)  {  
                append("XC")
            }else if(x==4){    
                append("XL")
            }else {
                if(x>=5)
                    append("L")
                for(xi in 1..(x%5))
                    append("X")   
            } 
            
            var i=numCp 
            if(i==9)  {  
                append("IX")
            }else if(i==4){    
                append("IV")
            }else {
                if(i>=5)
                    append("V")
                for(ii in 1..(i%5))
                    append("I")        
            }
        
        }.toString()
     
    }
