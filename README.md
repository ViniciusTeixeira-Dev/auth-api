# 🔐 API de Autenticação / Authentication API

API em Java com Spring Boot que permite registro e login de usuários, utilizando JWT para autenticação e BCrypt para segurança de senhas.

Java API using Spring Boot for user registration and login, with JWT authentication and BCrypt password hashing.

---

<details>
<summary>🇧🇷 Versão em Português</summary>

## 🔧 Tecnologias

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- JWT (JSON Web Token)
- BCrypt

## 🔐 Funcionalidades

- Registro de usuário com senha criptografada
- Login com geração de token JWT
- Proteção de rotas com autenticação via token
- Níveis de acesso:
  - `helloUser` (usuário autenticado)
  - `helloAdmin` (admin)
  - `helloMaster` (mestre)
- Rota pública: `hello` (todos acessam)

## 🔄 Rotas

| Método | Rota         | Acesso       | Descrição                        |
|--------|--------------|--------------|----------------------------------|
| POST   | `/register`  | Público      | Registro de novo usuário         |
| POST   | `/login`     | Público      | Autenticação e geração de token  |
| GET    | `/hello`     | Público      | Rota aberta                      |
| GET    | `/helloUser` | Autenticado  | Apenas usuários autenticados     |
| GET    | `/helloAdmin`| ADMIN        | Apenas admins                    |
| GET    | `/helloMaster`| MASTER      | Apenas mestres                   |

## 🗄️ Banco de Dados

- MySQL
- Tabela de usuários com campos como `username`, `password` (criptografada), `role`, etc.

</details>

---

<details>
<summary>🇺🇸 English Version</summary>

## 🔧 Technologies

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- JWT (JSON Web Token)
- BCrypt

## 🔐 Features

- User registration with password hashing
- Login with JWT token generation
- Protected routes using token authentication
- Role-based access:
  - `helloUser` (authenticated user)
  - `helloAdmin` (admin)
  - `helloMaster` (master)
- Public route: `hello` (open to all)

## 🔄 Routes

| Method | Endpoint       | Access       | Description                     |
|--------|----------------|--------------|---------------------------------|
| POST   | `/register`    | Public       | Register a new user             |
| POST   | `/login`       | Public       | Authenticate and return a token|
| GET    | `/hello`       | Public       | Open route                      |
| GET    | `/helloUser`   | Authenticated| Authenticated users only        |
| GET    | `/helloAdmin`  | ADMIN        | Admin users only                |
| GET    | `/helloMaster` | MASTER       | Master users only               |

## 🗄️ Database

- MySQL
- User table with fields such as `username`, `password` (encrypted), `role`, etc.

</details>
