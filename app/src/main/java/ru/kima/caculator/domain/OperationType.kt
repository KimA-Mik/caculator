package ru.kima.caculator.domain

enum class OperationType(val symbol: String) {
    ADD("+"),
    MUL("*"),
    SUB("-"),
    DIV("/")
}