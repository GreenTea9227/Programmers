class Solution {
    fun solution(my_string: String) =  my_string.replace("[aeiou]".toRegex(),"")
}