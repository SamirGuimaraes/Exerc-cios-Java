## 1. Considerando o contexto de herança, crie um projeto em Java para representar a situação abaixo.

### Criação de uma classe `Animal` que obedeça à seguinte descrição:
- Possua os atributos:
  - `nome` (String)
  - `comprimento` (float)
  - `número de patas` (int)
  - `cor` (String)
  - `ambiente` (String)
  - `velocidade média` (float)
- Implemente um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos e atribua-os aos seus respectivos atributos.
- Crie os métodos:
  - Getters e setters para cada um dos atributos.
  - Um método `exibirDados()`, sem parâmetro e do tipo `void`, que, quando chamado, imprima na tela uma espécie de relatório informando os dados do animal.

### Criação de uma classe `Peixe` que herda da classe `Animal` e obedeça à seguinte descrição:
- Possua um atributo:
  - `característica` (String: barbatana, cauda, ...)
- Implemente um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos (incluindo os atributos da classe `Animal`) e atribua-os aos seus respectivos atributos.
- Crie os métodos:
  - Getters e setters para o atributo `característica`.
  - Um método `exibirDadosPeixe()`, sem parâmetro e do tipo `void`, que, quando chamado, imprima na tela uma espécie de relatório informando os dados do peixe.

### Criação de uma classe `Mamifero` que herda da classe `Animal` e obedeça à seguinte descrição:
- Possua um atributo:
  - `alimento` (String)
- Implemente um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos (incluindo os atributos da classe `Animal`) e atribua-os aos seus respectivos atributos.
- Crie os métodos:
  - Getters e setters para o atributo `alimento`.
  - Um método `exibirDadosMamifero()`, sem parâmetro e do tipo `void`, que, quando chamado, imprima na tela uma espécie de relatório informando os dados do mamífero (incluindo os dados do `Animal` e mais o `alimento`).

### Para testar a implementação das classes acima:
- Crie uma classe `TestarAnimais` que possua um método `main` e instancie objetos para cada classe.
- Ao final, chame os métodos para imprimir os dados de cada um dos objetos criados.

