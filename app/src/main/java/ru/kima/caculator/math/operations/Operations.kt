package ru.kima.caculator.math.operations

class Plus : Operation {
    override fun perform(lhs: Double, rhs: Double): Double {
        return lhs + rhs
    }
}

class Minus : Operation {
    override fun perform(lhs: Double, rhs: Double): Double {
        return lhs - rhs
    }
}

class Multiply : Operation {
    override fun perform(lhs: Double, rhs: Double): Double {
        return lhs * rhs
    }
}

class Divide : Operation {
    override fun perform(lhs: Double, rhs: Double): Double {
        return lhs / rhs
    }
}