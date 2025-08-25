# 📄 Project Use Case Document – Smart Notification System (SNS++)

---

## 1. Problem Statement

Modern applications (e-commerce, banking, SaaS platforms) need to notify users about real-time events such as order updates, password resets, or promotional campaigns.

Each product team currently builds their own notification logic, leading to:

- Code duplication
- No standard retry or rate-limit handling
- Inconsistent user experience
- Difficult monitoring

This project solves that by building a **centralized, pluggable notification platform** (SNS++) that supports multiple event types and delivery channels like email, SMS, and push.

---

## 2. Actors

| Actor               | Role                                                  |
| ------------------- | ----------------------------------------------------- |
| External Service    | Triggers an event like ORDER_PLACED or PASSWORD_RESET |
| Notification API    | Ingests events into the system                        |
| Notification Worker | Picks from queue and sends via correct channel        |
| End User            | Receives email/SMS/push notifications                 |
| Admin               | Manages templates and user opt-in preferences         |

---

## 3. Use Cases

### 1. Order Confirmation (Email)

- Trigger: Order Service emits `ORDER_PLACED`
- Action: Send order confirmation email to the customer

### 2. Password Reset (SMS)

- Trigger: Auth Service emits `PASSWORD_RESET`
- Action: Send OTP to user's registered phone

### 3. Delivery Delay Alert (Email + SMS)

- Trigger: Logistics Service emits `DELIVERY_DELAYED`
- Action: Notify user via email and SMS

### 4. Marketing Campaign (Push)

- Trigger: Marketing tool emits `NEW_CAMPAIGN`
- Action: Push promotional message to opted-in users

### 5. Account Activity Alert (Email)

- Trigger: Login Service emits `NEW_DEVICE_LOGIN`
- Action: Email user about suspicious login activity

---

## 4. Notification Channels

| Event Type       | Channel(s) | Template ID          | Retry? | Rate Limited? |
| ---------------- | ---------- | -------------------- | ------ | ------------- |
| ORDER_PLACED     | Email      | order-confirmation   | ✅     | ✅            |
| PASSWORD_RESET   | SMS        | password-reset       | ✅     | ✅            |
| DELIVERY_DELAYED | Email, SMS | delivery-delay-alert | ✅     | ✅            |
| NEW_CAMPAIGN     | Push       | promo-blast          | ❌     | ✅            |
| NEW_DEVICE_LOGIN | Email      | account-activity     | ✅     | ✅            |

---

## 5. Flow Diagram (Text-based for now)

```text
[Order Service]
     ↓ (POST /events)
[Notification API]
     ↓ (Push to Kafka/SQS)
[Message Queue]
     ↓
[Notification Worker Service]
     ↓                ↓             ↓
[Send Email]    [Send SMS]     [Push Notification]

(Optional: Redis rate limit check, Retry logic, Template render)

```

## 6. Out Of Scope

- No UI for EndUsers to view the Notification history
- No voice call notification
- No Multi language support as of now(Only Supported in English)

## 7. Assumptions

- Events come from internal services with proper IAM auth
- Templates exist before the event arrives
- Each user has a valid email and/or phone number on file
