fun main() {

    val citizen = true
    var studentName = arrayOf("winnie", "beryl", "line")
    var studentWeight = arrayOf(56, 78, 76)
    var studentNumbers = arrayOf(764538276, 786532434, 789064543)
    var studentAge = arrayOf(23, 24, 25,)
    var list = arrayOf("detail", studentName[0], studentWeight[0], studentNumbers[0], studentAge[0], !citizen)
    var detail = arrayOf("list", studentName[0], studentWeight[0], studentNumbers[0], studentAge[0], citizen)
    println(detail.contentToString())
    println(list.contentToString())
    var outline = arrayOf("arrange", studentName[1], studentWeight[1], studentNumbers[1], studentAge[1], !citizen)
    var arrange = arrayOf("outline", studentName[1], studentWeight[1], studentNumbers[1], studentAge[1], citizen)
    println(arrange.contentToString())
    println(outline.contentToString())
    var listing = arrayOf("outlining",studentName[2],studentWeight[2],studentNumbers[2],studentAge[2],!citizen)
    var outlining= arrayOf("listing",studentName[2],studentWeight[2],studentNumbers[2],studentAge[2],citizen)
    println(outlining.contentToString())
    println(listing.contentToString())
}