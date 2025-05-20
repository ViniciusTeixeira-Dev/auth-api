
# 🔐 API de Autenticação / Authentication API

📌 API simples em Java com Spring Boot e MySQL para autenticação e registro de usuários.  
📌 Simple API in Java with Spring Boot and MySQL for user authentication and registration.

> 🇧🇷 Este projeto foi desenvolvido como prática de estudo.  
> 🇺🇸 This project was developed as a study practice.

▶️ [Versão em Português](#versão-em-português)  
▶️ [English Version](#english-version)

---

## 🇧🇷 Versão em Português

### 🔧 Tecnologias

- Java 17+
- Spring Boot
- MySQL
- Spring Security
- JWT (JSON Web Token)
- BCrypt para criptografia de senhas

### 🔐 Funcionalidades

- Registro de usuários
- Login com retorno de JWT
- Autenticação e autorização com base no papel do usuário

### 📁 Rotas

- `POST /register` → Registro de usuário
- `POST /login` → Login e geração de token JWT
- `GET /hello` → Lista todos os usuários (acesso geral)
- `GET /helloUser` → Acesso apenas para usuários com papel USER
- `GET /helloAdmin` → Acesso apenas para usuários com papel ADMIN
- `GET /helloMaster` → Acesso apenas para usuários com papel MASTER

---

## 🇺🇸 English Version

### 🔧 Technologies

- Java 17+
- Spring Boot
- MySQL
- Spring Security
- JWT (JSON Web Token)
- BCrypt for password encryption

### 🔐 Features

- User registration
- Login with JWT return
- Authentication and role-based access control

### 📁 Routes

- `POST /register` → User registration
- `POST /login` → Login and JWT token generation
- `GET /hello` → Lists all users (public access)
- `GET /helloUser` → Access for users with role USER
- `GET /helloAdmin` → Access for users with role ADMIN
- `GET /helloMaster` → Access for users with role MASTER
