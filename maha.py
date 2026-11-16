from math import comb

n = 10
p = 0.8
q = 1 - p

# 1. Probability that every visitor buys a souvenir
p_all = comb(n, 10) * (p ** 10) * (q ** 0)

print("Probability that every visitor buys:", p_all)

# 2. Probability that maximum 7 visitors buy souvenirs
p_max7 = sum(comb(n, x) * (p ** x) * (q ** (n - x))
             for x in range(0, 8))

print("Probability that maximum 7 visitors buy:", p_max7)
