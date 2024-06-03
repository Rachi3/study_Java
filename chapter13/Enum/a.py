import matplotlib.pyplot as plt

# 할인 채권의 정보
face_value_discount = 1000
ytm_discount = 0.074  # 7.4% 만기수익률
years_remaining = [1, 3, 8, 12, 13]
prices_discount = []

# 할증 채권의 정보
face_value_premium = 1000
ytm_premium = 0.054  # 5.4% 만기수익률
prices_premium = []

# 각 채권의 현재 가격 계산
for year in years_remaining:
    price_discount = face_value_discount / ((1 + ytm_discount/2) ** (2 * year))
    price_premium = face_value_premium / ((1 + ytm_premium/2) ** (2 * year))
    prices_discount.append(price_discount)
    prices_premium.append(price_premium)

# 그래프 그리기
plt.plot(years_remaining, prices_discount, marker='o', label='할인채')
plt.plot(years_remaining, prices_premium, marker='o', label='할증채')
plt.xlabel('만기년수')
plt.ylabel('가격')
plt.title('채권가격과 만기간의 관계')
plt.legend()
plt.grid(True)
plt.show()
