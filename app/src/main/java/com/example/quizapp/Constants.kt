package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the capital of Nepal ?",
            "Kathmandu", "Pokhara",
            "Baglung", "Chitwan",
            1
        )
        questionsList.add(que1)
        val que2 = Question(
            2, "In which district does FUNG-FUNG waterfall located?",
            "Kathmandu", "Gorkha",
            "Nuwakot", "Manang", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "How many heritage properties are listed in the World Heritage List?",
            "5", "10",
            "15", "20", 2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Who was the first to use the word ‘Jai Nepal’?",
            "Bhimsen Thapa", "Sukraraj Shastri",
            "Amar Singh Thapa", "Dashrath Chand", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "How many national pride projects are there in Nepal right now?",
            "18", "20",
            "23", "25", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Which is Nepal’s first highway ?",
            "Araniko Highway", "Siddhartha Highway",
            "Tribhuwan Highway", "Mahendra Highway", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What is the name of road Kathmandu – Pokhara?",
            "Prithivi Highway", "Araniko Highway",
            "Bhupi Sherchen Highway", "Siddhartha Highway", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What is called the blank sheet on the front and back of the book?",
            "Smell Leaf", "Free Leaf",
            "Over Leaf", "Fly Leaf", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Who is the ‘Zero’ Inventor?",
            "Christopher Columbus", "Arya Bhatta",
            "Chanakya", "Aristotle", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "From which district did tea cultivation originate in Nepal?",
            "Ilam", "Jhapa",
            "Morang", "Taplejung", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}