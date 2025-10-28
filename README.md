# S3.02 – Patterns 2

## 📄 Description – Exercise Statement

This project contains the solutions for **S3.02 – Patterns 2**, which focuses on identifying and implementing design patterns in Java.

---

## 🧩 Level 1 – Builder Pattern

### 🧠 Objective
Develop a pizza ordering system using the **Builder Design Pattern**.

### 🏗️ Requirements
- Define a `Pizza` class with:
  - `size`
  - `dough`
  - `toppings`
- Create a `PizzaBuilder` interface with methods to configure a pizza.
- Implement concrete builders for different pizza types (e.g., Hawaiian, Vegetarian).
- Create a `MestrePizzer` (Director) class that constructs pizzas in a specific sequence.
- The `Main` class should demonstrate building pizzas with different configurations.

### 🧱 Implementation
**Main components:**
- `Pizza` → product being built.
- `PizzaBuilder` → defines steps to build a pizza.
- `HawaiianPizzaBuilder` / `VegetarianPizzaBuilder` → concrete builders.
- `MestrePizzer` → director that defines the order of construction steps.

---

## 🧩 Level 2 – Observer Pattern

### 🧠 Objective
Design a system where a **Stock Agent** (Observable) notifies several **Stock Agencies** (Observers) when the market goes up or down.

### 🏗️ Requirements
- Implement an `Observable` interface for adding/removing observers.
- Implement an `Observer` interface with an `update()` method.
- Create:
  - `StockAgent` → concrete observable that tracks market status.
  - `StockAgency` → concrete observer that reacts to updates.
- When the market changes, the agent must notify all subscribed agencies.

### 🧱 Implementation
**Main components:**
- `Observable` / `Observer` interfaces.
- `StockAgent` → stores observer references and sends notifications.
- `StockAgency` → reacts to notifications.
- `Main` → registers multiple agencies and simulates market changes.


---

## 🧩 Level 3 – Callback Pattern

### 🧠 Objective
Simulate a **payment gateway** that processes payments using different methods (Credit Card, PayPal, Bank Transfer).  
The gateway should **execute payments without knowing** the specific payment type and **return control** to the original class through a **callback**.

### 🏗️ Requirements
- Define a `PaymentMethod` interface with `processPayment(double amount)`.
- Implement concrete payment methods:
    - `CreditCard`
    - `Paypal`
    - `BankTransfer`
- Create a `PaymentCallback` interface with `onPaymentComplete(String status)`.
- Implement a `PaymentGateway` that:
    - Executes the payment.
    - Invokes the callback once the payment is completed.
- Create a `ShoeStore` class that initiates payments and handles callback notifications.
- The `Main` class demonstrates multiple payment executions.

### 🧱 Implementation
**Main components:**
- `PaymentMethod` → payment behavior abstraction.
- `PaymentCallback` → callback interface to receive completion notifications.
- `PaymentGateway` → executes payment and triggers callback.
- `ShoeStore` → client that uses the gateway and reacts to callback results.

---

## 💻 Technologies Used
- Java 17
- IntelliJ IDEA
- Gradle
- Git & GitHub

---

## 📋 Requirements
- JDK 17 or higher
- IntelliJ IDEA (or any Java-compatible IDE)
- Git

---

## 🛠️ Installation
Clone the repository and open it in IntelliJ IDEA:

```sh
git clone https://github.com/leilaweicman/3.2-patterns
cd S3.2-patterns
```

---

## ▶️ Execution

Run the Main class from each level:

### Level 1

Run:
```sh
java nivel1.Main
```

Expected output (example):
```yaml
First pizza built: Pizza [size=Large, dough=Thick crust, toppings=[Ham, Pineapple, Cheese]]
Second pizza built: Pizza [size=Medium, dough=Thin crust, toppings=[Tomato, Cheese, Onion, Peppers, Olives]]
```

--- 

### Level 2

Run:
```sh
java nivel2.Main
```

Expected output (example):
```yaml
Market status changed to: UP
[Agency Alpha] Notified: Market is UP
[Agency Beta] Notified: Market is UP

Market status changed to: DOWN
[Agency Alpha] Notified: Market is DOWN
[Agency Beta] Notified: Market is DOWN
```

--- 

### Level 3

Run:
```sh
java nivel3.Main
```

Expected output (example):
```yaml
ShoeStore: Initiating payment...

Starting payment process...
Processing credit card payment of $30.0...
ShoeStore received callback: Payment of $30.0 processed successfully.

ShoeStore: Initiating payment...

Starting payment process...
Processing PayPal payment of $40.0...
ShoeStore received callback: Payment of $40.0 processed successfully.

ShoeStore: Initiating payment...

Starting payment process...
Processing bank transfer of $50.0...
ShoeStore received callback: Payment of $50.0 processed successfully.
```

---

## 🌐 Deployment
Not applicable (local practice project).


---

## 🤝 Contributions

1. Fork this repository.
2. Create a new branch:
```sh
git checkout -b feature/NewFeature
```
3. Commit your changes:
```sh
git commit -m "Add NewFeature"
```
4. Commit your changes:
```sh
git push origin feature/NewFeature
```
5. Open a Pull Request.
