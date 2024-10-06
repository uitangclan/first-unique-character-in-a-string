fun main() {
    var s = "loveleetcode"
    firstUniqChar(s)
}

fun firstUniqChar(str: String): Int {
    var map = HashMap<Char, Int> ()
    for (char in str) {
        map.put(char, map.getOrDefault(char, 0) + 1)
    }
    
    for (i in str) {
        if (map.get(i)!! == 1) {
            return str.indexOf(i)
        }
    }
    return -1
}
