# 🎓 Lista de Exercícios — Sobrecarga e Sobrescrita em Java

## 📌 Contexto

Você está desenvolvendo um **Sistema Acadêmico** com as classes:

- `Pessoa`
- `Aluno`
- `Professor`

O objetivo é praticar os conceitos de:

- ✅ Herança  
- ✅ Sobrescrita (Override)  
- ✅ Sobrecarga (Overload)  
- ✅ Polimorfismo  

---

# 🟢 1. Exercício Fácil

## 🎯 Objetivo: Identificar e aplicar sobrescrita

### Enunciado

Crie uma classe `Pessoa` com:

- atributo `nome`
- método:

```java
public String getDescricao() {
    return "Pessoa";
}
```

Depois:

1. Crie a classe `Aluno` que herda de `Pessoa`
2. Sobrescreva o método `getDescricao()` para retornar `"Aluno"`
3. No `main`, crie um objeto `Aluno` e mostre o resultado

### ❓ Pergunta

O método chamado é o da classe pai ou da classe filha?

---

# 🟡 2. Exercícios Médios

---

## 🟡 Exercício 2

## 🎯 Objetivo: Trabalhar sobrecarga

### Enunciado

Na classe `Aluno`, implemente:

```java
double calcularMedia(double n1, double n2)
double calcularMedia(double n1, double n2, double n3)
```

### 📌 Regras

- O primeiro calcula média de 2 notas  
- O segundo calcula média de 3 notas  

No `main`, chame os dois métodos.

### ❓ Pergunta

Qual método será chamado em cada caso e por quê?

---

## 🟡 Exercício 3

## 🎯 Objetivo: Combinar herança + sobrescrita

### Enunciado

1. Crie a classe `Professor` que herda de `Pessoa`
2. Implemente o método:

```java
@Override
public String getDescricao() {
    return "Professor";
}
```

No `main`, crie:

```java
Pessoa p = new Professor();
```

### ❓ Pergunta

Qual método será executado? Explique o porquê.

---

# 🔴 3. Exercício Difícil

## 🎯 Objetivo: Sobrecarga + sobrescrita juntas

### Enunciado

Na classe `Aluno`:

1. Crie:

```java
double calcularMedia()
```

2. Crie:

```java
double calcularMedia(double prova, double trabalho)
```

3. Sobrescreva o método:

```java
@Override
public String toString()
```

Para exibir:

```
Aluno: nome | Média: valor
```

### 📌 No `main`

- Crie um aluno  
- Chame os dois métodos  
- Imprima o objeto diretamente  

### ❓ Pergunta

Qual a vantagem de sobrescrever `toString()`?

---

# 🟣 4. Desafio

## 🎯 Objetivo: Polimorfismo + Sobrescrita + Sobrecarga

### Enunciado

Crie um sistema com:

- `Pessoa` (classe base)
- `Aluno`
- `Professor`

---

## 📌 Requisitos

1. Todos devem ter:

```java
public String getDescricao()
```

2. Crie uma lista:

```java
ArrayList<Pessoa> pessoas = new ArrayList<>();
```

3. Adicione:

- 1 aluno  
- 1 professor  

4. Percorra a lista e exiba:

```java
p.getDescricao();
```

---

## 🔥 Parte Avançada

No `Professor`, implemente sobrecarga:

```java
double calcularSalario()
double calcularSalario(double bonus)
```

---

# 💡 Perguntas Reflexivas

- Por que o mesmo método (`getDescricao`) tem comportamentos diferentes?  
- Qual a diferença entre **sobrecarga** e **sobrescrita**?  
- Em qual situação usar cada um?  

---

# ✅ Objetivos de Aprendizagem

Ao final desta atividade, o aluno deverá ser capaz de:

- Entender e aplicar **herança**
- Diferenciar **sobrecarga** de **sobrescrita**
- Aplicar **polimorfismo**
- Estruturar classes de forma orientada a objetos
