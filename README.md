# 📺 Video Streaming Service Design
> 🗓️ Created during my **Freshman Year** of university.

## 🎯 Objective

This project involved designing a **Video Streaming Service Platform** using **UML Class Diagrams**, inspired by platforms such as Netflix, Disney+, and Exxen.

---

## 🛠 Design Summary

The class diagram was created to model a complete video streaming service. It includes:

- **Classes** that represent core entities (users, content, subscriptions, etc.)
- **Attributes and methods** for each class to define their structure and behavior
- **Relationships** among classes such as:
  - Inheritance
  - Association
  - Aggregation
  - Composition
- Utilization of **abstract classes** and **interfaces** to reflect polymorphic behavior

---

## 👨‍💻 OOP Principles Applied

The following object-oriented programming concepts were implemented throughout the design:

- ✅ Abstraction  
- ✅ Encapsulation  
- ✅ Inheritance  
- ✅ Polymorphism  
- ✅ Association / Aggregation / Composition  

The system models realistic functionalities such as content viewing, user interaction, and admin control mechanisms.

---

## 🖼 Tools & References

- Diagram created using:  
  🔗 [Visual Paradigm Online](https://online.visual-paradigm.com/app/diagrams/#diagram:proj=0&type=ClassDiagram)

- Design based on guidelines and examples from:
  - [Raygun OOP Concepts](https://raygun.com/blog/oop-concepts-java/)
  - [Java MOOC – Class Diagrams](https://java-programming.mooc.fi/part-11/1-class-diagrams)

---

## 🧩 Key Classes in the Design

- `User` (with subclasses: `RegularUser`, `Admin`)
- `Content` (abstract) → `Movie`, `Series`, `Episode`
- `SubscriptionPlan`
- `WatchHistory`
- `Playlist`
- `BillingInfo`
- `StreamingSession`
- `RecommendationEngine` (interface)

These were structured to accurately reflect both the data and functionality of a modern streaming platform.


