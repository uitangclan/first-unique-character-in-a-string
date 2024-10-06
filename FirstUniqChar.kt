fun main() {
    var s = charArrayOf('h','e','l','l','o')
    reverseString(s)
}

fun reverseString(s: CharArray) {
    var left = 0
    var right = s.size - 1
    while (left < right) {
        s[left] = s[right].also {s[right] = s[left]}
        left++
        right--
    }
}
