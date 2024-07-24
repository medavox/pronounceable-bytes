val onsets = listOf<String>(" ", "b", "c", "d", "f", "g", "h", "k", "l", "m", "n", "p", "s", "t", "w", "y")
val codas = listOf<String>("q", "a", "e", "i", "o", "u", "ai", "au", "qn", "an", "en", "in", "on", "un", "ain", "aun")
val sb = StringBuilder()
sb.append("|  | ")
codas.forEachIndexed { index, coda ->
    sb.append("0x␣"+index.toUInt().toString(radix = 16))
    sb.append(": **␣$coda** | ")
}
sb.append("\n| --- | ")
sb.append(codas.joinToString(" | ") { "---" })
sb.append(" |\n")
for (i in onsets.indices) {
    sb.append("| **0x${i.toUInt().toString(radix=16)}␣: ${onsets[i]}␣** | ")

    for (j in codas.indices) {
        sb.append(i.toUInt().toString(16))
        sb.append(j.toUInt().toString(16))
        sb.append(": "+onsets[i]+codas[j])
        sb.append(" | ")
    }
    sb.append("\n")
}
println(sb.toString())
