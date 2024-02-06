fun main() {

        var age = readLine()!!.toInt()

        when{
            (age<4)->  print("Младенец")
            (4<age && age<11)-> print("Ребенок")
            (10<age && age<20)-> print("Подросток")
            (19<age && age<31)-> print("Молодость")
            (30<age && age<61)-> print("Зрелость")
            (60<age && age<81)-> print("Пожилой")
            (80<age && age<101)-> print("Старость")
        }

}