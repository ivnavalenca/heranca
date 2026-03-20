# 📘 Gabarito Atualizado — Sistema Acadêmico (Nível Básico)

Este gabarito está alinhado com o exercício atual.

⚠️ Importante:
- NÃO utiliza ArrayList
- NÃO utiliza classe abstrata
- Foco apenas em: herança, sobrescrita, sobrecarga e polimorfismo básico

---

# 🟢 1. Sobrescrita (Override)

## ✔️ Código

### Pessoa
```java
public class Pessoa {
    public String getDescricao() {
        return "Pessoa";
    }
}
```

### Aluno
```java
public class Aluno extends Pessoa {

    @Override
    public String getDescricao() {
        return "Aluno";
    }
}
```

## 💡 Explicação

- O método tem o mesmo nome nas duas classes
- O comportamento muda na classe filha

👉 Isso é **sobrescrita**

---

# 🟡 2. Sobrecarga (Overload)

## ✔️ Código

```java
public double calcularMedia(double n1, double n2) {
    return (n1 + n2) / 2;
}

public double calcularMedia(double n1, double n2, double n3) {
    return (n1 + n2 + n3) / 3;
}
```

## 💡 Explicação

- Mesmo nome de método
- Parâmetros diferentes

👉 Isso é **sobrecarga**

---

# 🟡 3. Uso de super

## ✔️ Código

### Pessoa
```java
public void exibirDados() {
    System.out.println("Dados da pessoa");
}
```

### Professor
```java
public class Professor extends Pessoa {

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Dados do professor");
    }
}
```

## 💡 Explicação

- `super` chama o método da classe pai
- Evita repetir código

---

# 🔴 4. Polimorfismo (sem ArrayList)

## ✔️ Código

```java
Pessoa[] pessoas = new Pessoa[2];

pessoas[0] = new Aluno();
pessoas[1] = new Professor();

for (Pessoa p : pessoas) {
    System.out.println(p.getDescricao());
}
```

## 💡 Explicação

- A variável é do tipo `Pessoa`
- Os objetos são diferentes (`Aluno` e `Professor`)

👉 O Java decide qual método executar em tempo de execução

Isso é:
👉 **polimorfismo**

---

# 🎯 Resumo Final

| Conceito     | Exemplo |
|--------------|--------|
| Herança      | Aluno extends Pessoa |
| Sobrescrita  | getDescricao() |
| Sobrecarga   | calcularMedia() |
| Polimorfismo | Pessoa p = new Aluno() |

---

# 🚀 Dica Final

Teste cada parte do código separadamente.
Entender é mais importante do que copiar!
