## Palavra (this)

### O que é
É uma referencia do propio objeto.
impedir que referêncie a variável local e não o atributo.

```java
public class Pessoa{ 

    private String nome;

    public void setnome(){
         this.nome = nome;
    }
}
```
## Categorias de Métodos

- Método construtor
- Método de Representação
- Métodos de comparação semântica
- Métodos de acesso

### Método construtor

- Váriaveis locais devem ser inicializadas

- Atributos não inicializados recebem valores padrão

```java
public class Pessoa{ 

    private String nome;
    private int anoNas

    public Pessoa(String nome, int anoNasc){
        this.nome = nome;
        this.anoNasc = anoNasc;
    }
}
```

- Sem retorno
- Mesmo nome da classe
- se não definido terá o construtor padrão
- Não pode ser chamado com método comum

### Método de Representação

- Método que retorna um texto que representa o objeto.

- Todo ojeto java possui o método toString herdado de Object

- Deve ser subescrito

- Se não subescrito retornará o nome da classe e o endereço de memória

### Métodos de Acesso

- Interfaces da classe para que outros objetos posssam acessar os atributos da classe (getters e setters)

### Métodos de comparação semântica

- Métodos utilizados pelo java para definir  se dois objetos são iguais ou diferentes

- Igualdade de dois objetos é um caracteristica importante para estrutura de dados

- Todo ojeto java possui dois métodos de comparação chamados boolean equals() e  int hashCode

- O comportamento 

```java
public class Pessoa{

    private String nome, cpf;
    private int anoNasc;

public boolean equals(Object o){
    if (!( o instaceof Pessoa outra))
    return false;

    return this.cpf.equals(outra.cpf);

    public int hashCode(){
        Objects.hash(this.cpf);
    }
}
}
```

## Sobrecarga de Métodos 

- Uma classe pode ter mais de um método com o mesmo nome desde que tenha assinaturas diferentes

- A assinatura é definida por
    - Seu nome
    - Seus argumentos
- Verificado em tempo de compilação, não execução

```java

public class Data {
    private int dia, mes, ano;

    public void alterar(int d){
        this.dia = d;
    }
 public void alterar(int d, int m){
        this.dia = d;
        this.mes = m;
    }
     public void alterar(int d, int){
        this.dia = d;
    }

}

```
- Maioria dos construtores são sobrecarregados

## Modificadores de Membros

### Modificador static
 
- Ele indica que um membro pertence a classe, e não a um objeto específico

- São compartilhados por todas as instâncias da classe

- Podem ser usados sem instanciar a classe ex: Math.round(), String.format.

- Membros static representam informações que independem do estado do objeto

- Métodos static não podem acessar atributos não statics

```java

public class Produto{

    private static
    


}

```


### Modificador final

- Ele é usado para evidar mudanças

```java
public class Celular{
    private final String FREQUENCIA = "1800";
    private final int SERIAL;

}
```