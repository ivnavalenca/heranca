# 🎓 Exercícios Complementares — Evolução do Sistema Acadêmico

## 📌 Contexto

Você já possui um sistema com:

- `Pessoa`
- `Aluno`
- `Professor`

Agora seu objetivo é **evoluir esse sistema**, aplicando melhor os conceitos de POO.

---

# 🟢 1. Exercício Fácil

## 🎯 Objetivo: Modificação simples + sobrescrita

### Enunciado

Adicione na classe `Pessoa` o método:

```java
public String saudacao() {
    return "Olá!";
}
```

Depois:

- Sobrescreva esse método em `Aluno` e `Professor`
- Cada um deve retornar uma saudação diferente

### ❓ Pergunta

O que acontece quando você chama `saudacao()` usando uma variável do tipo `Pessoa`?

---

# 🟡 2. Exercícios Médios

## 🟡 Exercício 2

### Enunciado

Crie sobrecarga:

```java
calcularMedia(double n1, double n2, double n3, double n4)
```

### ❓ Pergunta

Como o Java decide qual método chamar?

---

## 🟡 Exercício 3

### Enunciado

Sobrescreva `exibirDados()` em `Professor` usando `super`.

### ❓ Pergunta

Qual a vantagem de usar `super`?

---

# 🔴 3. Exercício Difícil

## 🎯 Objetivo: Polimorfismo

Crie uma lista `ArrayList<Pessoa>` e adicione alunos e professores.

Percorra chamando:

- `exibirDados()`
- `getDescricao()`

---

# 🟣 4. Desafio Avançado

Transforme `Pessoa` em classe abstrata.

Implemente:

```java
public abstract String getDescricao();
```

---

# 💡 Bônus

Crie:

```java
public void gerarRelatorio(Pessoa p)
```

---

# ✅ Objetivos

- Praticar herança
- Aplicar sobrecarga e sobrescrita
- Entender polimorfismo
