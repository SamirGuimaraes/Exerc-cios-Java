## 2. Crie uma classe `Equipamento` com os seguintes atributos e métodos:

### Classe `Equipamento`
- Atributos:
  - `ligado` (tipo `boolean`)
  - `nome` (tipo `String`)
- Métodos:
  - `liga()`: Torna o atributo `ligado` igual a `true`.
  - `desliga()`: Torna o atributo `ligado` igual a `false`.

### Classe `EquipamentoSonoro` (herda de `Equipamento`)
- Atributos:
  - `volume` (tipo `short`, varia de 0 a 10)
  - `stereo` (tipo `boolean`)
- Métodos:
  - Getters e setters para os atributos `volume` e `stereo`.
  - `ativarMono()`: Torna o atributo `stereo` igual a `false`.
  - `ativarStereo()`: Torna o atributo `stereo` igual a `true`.
  - Sobrescrita do método `liga()`: Ajusta o volume para 5 automaticamente ao ligar o equipamento sonoro.

### Teste das classes
- Crie uma classe com o método `main` para instanciar objetos das classes `Equipamento` e `EquipamentoSonoro`.
- Chame os métodos apropriados e exiba os dados para validar o funcionamento correto.

