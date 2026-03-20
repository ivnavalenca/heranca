# 🎓 Lista de Exercícios — Sobrecarga e Sobrescrita em Java

## 📌 Contexto

Você está desenvolvendo um **Sistema Acadêmico** com as classes:

- `Pessoa`
- `Aluno`
- `Professor`

---

# 🟢 1. Exercício Fácil

## 🎯 Objetivo: Sobrescrita (Override)

### Enunciado

Crie uma classe `Pessoa` com:

```java
public String getDescricao() {
    return "Pessoa";
}
```

Depois:

- Crie a classe `Aluno` que herda de `Pessoa`
- Sobrescreva o método para retornar `"Aluno"`

### ❓ Pergunta
Qual método será executado?

---

# 🟡 2. Exercício Médio

## 🎯 Objetivo: Sobrecarga (Overload)

Na classe `Aluno`, implemente:

```java
double calcularMedia(double n1, double n2)
double calcularMedia(double n1, double n2, double n3)
```

### 📌 Regras
- Média de 2 notas
- Média de 3 notas

---

# 🟡 3. Exercício Médio

## 🎯 Objetivo: Uso de super

Na classe `Professor`:

- Sobrescreva `exibirDados()`
- Use `super.exibirDados()`

---

# 🔴 4. Exercício Difícil

## 🎯 Objetivo: Polimorfismo (sem ArrayList)

Use vetor:

```java
Pessoa[] pessoas = new Pessoa[2];
```

Adicione:
- 1 aluno
- 1 professor

Percorra com:

```java
for (Pessoa p : pessoas) {
    p.getDescricao();
}
```

---

# 💡 Perguntas

- O que é sobrescrita?
- O que é sobrecarga?
- Qual a diferença entre elas?

---

# ✅ Objetivos

- Entender herança
- Aplicar sobrescrita
- Aplicar sobrecarga
- Compreender polimorfismo básico
