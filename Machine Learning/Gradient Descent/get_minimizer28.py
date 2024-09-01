class Solution:
    def get_minimizer(self, iterations: int, learning_rate: float, init: int) -> float:
        minimizer = init
        for i in range(iterations):
            derivative = minimizer * 2
            minimizer = minimizer - learning_rate * derivative
        return round(minimizer, 5)