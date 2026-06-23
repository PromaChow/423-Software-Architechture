# Order Processing System

## Overview

This project represents a simplified order processing system implemented in Java. It simulates core operations such as user management, order placement, inventory checking, pricing calculation, payment handling, and notification delivery.

The system is organized into multiple classes, each responsible for a specific part of the workflow. Together, they demonstrate how different components interact during the lifecycle of an order.

---

## Project Structure

### `App.java`

This is the entry point of the application.

It initializes the required services and simulates a basic execution flow:

* Retrieves a user from the user service
* Places multiple orders for the user
* Initiates the checkout process

---

### `User.java`

This class represents a user in the system.

It contains:

* Basic user attributes such as ID, name, email, type, and balance
* A helper method to determine whether the user has a premium status

---

### `UserService.java`

This service is responsible for managing user-related operations.

Its responsibilities include:

* Fetching user data and storing it in an in-memory cache
* Creating user objects when they are not already cached
* Updating the user's balance after transactions

---

### `Order.java`

This class represents an order associated with a user.

It maintains:

* A list of item identifiers
* Corresponding quantities for each item
* The total cost of the order
* A flag indicating whether the order has been checked out

It also provides a method to add items to the order.

---

### `OrderService.java`

This service manages the lifecycle of orders.

Its responsibilities include:

* Creating and storing active orders per user
* Adding items to an order after checking inventory availability
* Performing checkout operations, including:

  * Calculating total cost using the pricing service
  * Applying user-specific adjustments
  * Updating inventory
  * Deducting user balance
  * Triggering payment and notification services

---

### `InventoryService.java`

This service manages item stock levels.

It provides:

* A method to check whether a requested quantity of an item is available
* A method to reduce stock after a successful order

The inventory is maintained using an in-memory data structure.

---

### `PricingService.java`

This service handles price calculation for items.

It determines:

* Base price based on item identifier
* Price adjustments based on quantity
* Discounts based on user type
* Additional conditional adjustments based on user attributes

---

### `PaymentGateway.java`

This class is responsible for handling payment processing.

Its responsibilities include:

* Validating payment amounts
* Applying conditional logic based on user type
* Logging payment transactions

---

### `NotificationService.java`

This service is responsible for notifying users about order events.

It determines:

* The notification channel based on user email
* Whether priority handling is required for certain user types

---

## Notes

* All data is stored in memory and is not persisted
* The system uses simple conditional logic for decision making
* Services are tightly interconnected and invoked directly
* The implementation focuses on demonstrating interaction between components rather than production readiness

---
