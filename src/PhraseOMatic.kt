



fun main(){

    val wordArray1 = arrayOf("Я", "Он", "Ты", "Она", "Они")
    val wordArray2 = arrayOf("стоят", "идут", "бегут", "едут")
    val wordArray3= arrayOf("домой", "в гости", "на работу", "на учебу", "в деревню")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)





}