class Solution:
    def get_minimizer(self, iterations: int, learning_rate: float, init: int) -> float:
        minimizer = init
        for i in range(iterations):
            derivative = 2 * minimizer
            minimizer = minimizer - derivative * learning_rate
        return round(minimizer, 5)
    