# 📘 Gabarito Explicado — Sistema Acadêmico em Java

Este gabarito foi feito para **te ajudar a entender** os conceitos, não apenas copiar código 🙂

Aqui você verá:
- ✔️ Código
- ✔️ Explicação simples
- ✔️ Dicas importantes

---

# 🟢 1. Sobrescrita (Override)

## ✔️ Código

### Pessoa
```java
public String saudacao() {
    return "Olá!";
}
```

### Aluno
```java
@Override
public String saudacao() {
    return "Oi, sou um aluno!";
}
```

### Professor
```java
@Override
public String saudacao() {
    return "Olá, sou um professor!";
}
```

## 💡 Explicação

- Todas as classes têm um método com o **mesmo nome**
- Mas cada uma tem um comportamento diferente

👉 Isso é **SOBRESCRITA**

📌 Importante:
Quando você faz:

```java
Pessoa p = new Aluno();
System.out.println(p.saudacao());
```

✔️ O Java executa o método do **Aluno**, não da Pessoa

👉 Isso acontece por causa do **polimorfismo**

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

public double calcularMedia(double n1, double n2, double n3, double n4) {
    return (n1 + n2 + n3 + n4) / 4;
}
```

## 💡 Explicação

- Todos os métodos têm o **mesmo nome**
- Mas têm **parâmetros diferentes**

👉 Isso é **SOBRECARGA**

📌 O Java escolhe qual método usar olhando:
- quantidade de parâmetros
- tipo dos parâmetros

---

# 🟡 3. Uso de super

## ✔️ Código

```java
@Override
public void exibirDados() {
    super.exibirDados();
    System.out.println("Salário: " + calcularSalario());
}
```

## 💡 Explicação

- `super` chama o método da classe pai
- Evita repetir código

👉 Boa prática: **reutilizar código**

---

# 🔴 4. Polimorfismo

## ✔️ Código (sem ArrayList)

```java
Pessoa[] pessoas = new Pessoa[2];

pessoas[0] = new Aluno("João", 20, 8, 7);
pessoas[1] = new Professor("Maria", 40, 3000, 10);

for (Pessoa p : pessoas) {
    p.exibirDados();
    System.out.println(p.getDescricao());
}
```

## 💡 Explicação

- A variável é do tipo `Pessoa`
- Mas os objetos são `Aluno` e `Professor`

👉 O Java decide qual método usar **em tempo de execução**

Isso é:
👉 **POLIMORFISMO**

---

# 🟣 5. Sem Classe Abstrata (Versão Simples)

## ✔️ Código

```java
public class Pessoa {

    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getDescricao() {
        return "Pessoa";
    }
}
```

## 💡 Explicação

- Classe normal pode ser usada diretamente
- As subclasses podem sobrescrever métodos

👉 Classe abstrata NÃO é obrigatória

---

# 💡 Bônus

```java
public static void gerarRelatorio(Pessoa p) {
    System.out.println("Nome: " + p.nome);
    System.out.println("Tipo: " + p.getDescricao());
}
```

## 💡 Explicação

Esse método funciona para qualquer objeto que seja `Pessoa`.

👉 Isso é possível graças ao **polimorfismo**

---

# 🎯 Resumo Final

| Conceito     | O que significa |
|--------------|----------------|
| Herança      | Uma classe herda da outra |
| Sobrescrita  | Mesmo método, comportamento diferente |
| Sobrecarga   | Mesmo método, parâmetros diferentes |
| Polimorfismo | Um método funciona para vários tipos |

---

# 🚀 Dica Final

Se você entendeu isso, você já domina a base de **Programação Orientada a Objetos em Java** 💪

Se não, releia com calma e teste no código!
