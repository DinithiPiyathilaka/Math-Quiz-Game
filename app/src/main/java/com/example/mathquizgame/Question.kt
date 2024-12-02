package com.example.mathquizgame

data class Question(
	val question: String,
	val options: List<String>,
	val correctOption: Int
)