package com.example.baitap2

import java.util.*


class Main {
    fun TimKiem(){
    var str: String? = null
    var currStr = ""
    val subStrings = ArrayList<String>()
    val checked = ArrayList<String>()
    val scanner = Scanner(System.`in`)
    print("Nhập chuỗi kí tự: ")
    str = scanner.nextLine()
    for (i in 1 until str.length) {
        for (j in 0 until str.length - i + 1) {
            currStr = str.substring(j, j + i)
            if (!checked.contains(currStr)) {
                subStrings.add(currStr)
                checked.add(currStr)
            } else
                subStrings.remove(currStr)
//            println("currStr: " + currStr)
//            println("subStrings: " + subStrings)
//            println("checked: " + checked)
        }
        if (!subStrings.isEmpty())
            break
        checked.clear()
    }
    if (subStrings.isEmpty()) {
        println("Không có subString nào thỏa mãn")
        println("Chuỗi vừa nhập: " + str)
    }
    else {
        println("SubString độc nhất: ")
        for (s in subStrings) println(s)
    }
        println("===============================")
    }

}
fun main(args: Array<String>) {
    val main = Main()
    do{
        val scanner= Scanner(System.`in`)
        println("1. Nhập chuỗi")
        println("2.Thoát")
        print("Nhập lưa chọn: ")
        var chon: Int = scanner.nextInt()
        when(chon){
            1 -> main.TimKiem()
        }
    }while (chon != 2)
}

//        fun longestSubstring(inputString: String) {
//            val arr1 = inputString.toCharArray()
//            var long_str: String? = null
//            var str_length = 0
//            // character at index i
//            // LinkedHashMap for sure index follow to order
//            val charPosMap: LinkedHashMap<Char, Int> = LinkedHashMap()
//            var i = 0
//            while (i < arr1.size) {
//                val ch = arr1[i]
//                if (!charPosMap.containsKey(ch)) {
//                    charPosMap[ch] = i
//                } else {
//                    i = charPosMap[ch]!!
//                    charPosMap.clear()
//                }
//                if (charPosMap.size > str_length) {
//                    str_length = charPosMap.size
//                    long_str = charPosMap.keys.toString()
//                }
//                i++
//            }
//            println("Input String : $inputString")
//            println("The longest substring : $long_str")
//            println("The longest Substring Length : $str_length")
//        }
//
//}
//fun main(args: Array<String>) {
//    var main =Main()
//    main.longestSubstring("pickoutthelongestsubstring")
//}

//fun smallestSubstring(a: string): Int {
//
//    // Stores all occurences
//    var a1: vector<string?>
//
//    // Generate all the substrings
//    for (i in 0 until a.size()) {
//        for (j in i + 1 until a.size()) {
//
//            // Avoid multiple occurences
//            if (i != j) // Append all substrings
//                a1.push_back(a.substr(i, j + 1))
//        }
//    }
//
//    // Take into account
//    // all the substrings
//    var a2: map<string?, Int>
//    for (i in a1) a2.get(i)++
//    var freshlist: vector<string?>
//
//    // Iterate over all
//    // unique substrings
//    for (i in a2) {
//
//        // If frequency is 1
//        if (i.second === 1) // Append into fresh list
//            freshlist.push_back(i.first)
//    }
//
//    // Initialize a dictionary
//    var dictionary: map<string?, Int>
//    for (i in freshlist) {
//        // Append the keys
//        dictionary.get(i) = i.size()
//    }
//    var newlist: vector<Int>
//
//    // Traverse the dictionary
//    for (i in dictionary) newlist.push_back(i.second)
//    var ans: Int = INT_MAX
//    for (i in newlist) ans = min(ans, i)
//
//    // Print the minimum of dictionary
//    return ans
//}
//
//// Driver Code
//fun main(): Int {
//    val S: string = "ababaabba"
//    cout shl smallestSubstring(S)
//    return 0
//}