# Meal Cost Calculator

## 📌 Problem Statement
This program calculates the total cost of a meal, including tip and tax, and rounds the final amount to the nearest integer.

## 🔹 How It Works
The program takes three inputs:
1. **Meal Cost (`double`)** – The base price of the meal.
2. **Tip Percentage (`int`)** – The percentage of the meal price added as a tip.
3. **Tax Percentage (`int`)** – The percentage of the meal price added as tax.

The total cost is calculated as:
```math
Total Cost = Meal Cost + (Meal Cost * Tip / 100) + (Meal Cost * Tax / 100)
```
The final result is rounded using `Math.round()` and displayed as an integer.

## 💻 Code Implementation (Java 15)
```java
import java.util.Scanner;

public class MealCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();
        scanner.close();

        System.out.println((int) Math.round(meal_cost + (meal_cost * tip_percent / 100) + (meal_cost * tax_percent / 100)));
    }
}
```

## 🎯 Example
### **Input:**
```
12.00
20
8
```
### **Calculation:**
- Tip: `12.00 * 0.20 = 2.40`
- Tax: `12.00 * 0.08 = 0.96`
- Total Cost: `12.00 + 2.40 + 0.96 = 15.36`
- Rounded Output: `15`

### **Output:**
```
15
```

## 🚀 Features
✅ Minimal and efficient code.  
✅ Uses `Math.round()` for precise rounding.  
✅ Works with **Java 15** and later versions.  

## 📂 Project Structure
```
📂 MealCostCalculator
 ├── 📄 README.md  (This file)
 ├── 📄 MealCostCalculator.java (Main Java file)
```

## 🛠️ How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/meal-cost-calculator.git
   ```
2. Navigate to the project folder:
   ```sh
   cd meal-cost-calculator
   ```
3. Compile and run the program:
   ```sh
   javac MealCostCalculator.java
   java MealCostCalculator
   ```
4. Enter the input values and get the result!

## 📜 License
This project is open-source and available under the **MIT License**.

---
Feel free to contribute, suggest improvements, or report issues! 😊
