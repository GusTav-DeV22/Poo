## Palavra (this)

### O que é
É uma referencia do propio objeto.
impedir que referêncie a variável local e não o atributo.

```
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

```
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

## Método de Representação

- Método que retorna um texto que representa o objeto.

- Todo ojeto java possui o método toString herdado de Object

- Deve ser subescrito

- Se não subescrito retornará o nome da classe e o endereço de memória

## Métodos de Acesso

- Interfaces da classe para que outros objetos posssam acessar os atributos da classe (getters e setters)

