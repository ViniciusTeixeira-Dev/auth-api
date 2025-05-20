
# 🔐 API de Autenticação em Java / Java Authentication API

📌 Projeto simples com Java, Spring Boot e MySQL que implementa uma API de autenticação com **senhas criptografadas com Bcrypt** e **JWT** para controle de acesso baseado em perfis de usuário.  
📌 Simple project using Java, Spring Boot, and MySQL that implements an authentication API with **Bcrypt-encrypted passwords** and **JWT** for role-based access control.

> 🇧🇷 Este projeto foi desenvolvido como prática de estudo com autenticação e controle de acesso.  
> 🇺🇸 This project was developed as a study practice on authentication and access control.

---

## 🇧🇷 Versão em Português

### 🚀 Tecnologias

- Java 17+
- Spring Boot
- Spring Security
- MySQL
- JWT (JSON Web Token)
- Bcrypt

---

### 📦 Funcionalidades

- Registro de usuários com senha criptografada
- Login com geração de token JWT
- Autenticação e autorização com base em perfis:
  - `USER`
  - `ADMIN`
  - `MASTER`

---

### 📌 Rotas

| Método | Endpoint        | Descrição                          | Acesso       |
|--------|------------------|-------------------------------------|--------------|
| POST   | `/register`      | Registrar novo usuário              | Público      |
| POST   | `/login`         | Autenticar e gerar token            | Público      |
| GET    | `/hello`         | Mensagem pública                    | Público      |
| GET    | `/helloUser`     | Mensagem para perfil USER           | Autenticado  |
| GET    | `/helloAdmin`    | Mensagem para perfil ADMIN          | ADMIN        |
| GET    | `/helloMaster`   | Mensagem para perfil MASTER         | MASTER       |

📌 Envie o token JWT no header:
```
Authorization: Bearer <seu_token>
```

---

## 🇺🇸 English Version

### 🚀 Technologies

- Java 17+
- Spring Boot
- Spring Security
- MySQL
- JWT (JSON Web Token)
- Bcrypt

---

### 📦 Features

- User registration with encrypted password
- Login with JWT token generation
- Authentication and role-based access control:
  - `USER`
  - `ADMIN`
  - `MASTER`

---

### 📌 Endpoints

| Method | Endpoint        | Description                         | Access       |
|--------|------------------|-------------------------------------|--------------|
| POST   | `/register`      | Register new user                   | Public       |
| POST   | `/login`         | Authenticate and generate token     | Public       |
| GET    | `/hello`         | Public message                      | Public       |
| GET    | `/helloUser`     | Message for USER role               | Authenticated|
| GET    | `/helloAdmin`    | Message for ADMIN role              | ADMIN        |
| GET    | `/helloMaster`   | Message for MASTER role             | MASTER       |

📌 Include the JWT token in the header:
```
Authorization: Bearer <your_token>
```

---

## 📄 Licença / License

Este projeto está sob a licença MIT.  
This project is under the MIT license.
