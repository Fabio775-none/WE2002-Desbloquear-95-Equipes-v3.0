# Desbloquear 95 Equipes v3.0 | Winning Eleven 2002 PS1

**Desenvolvido por Fabio FJA | Java | PlayStation 1**

Desbloquear 95 Equipes v3.0 é uma ferramenta de modificação do Winning Eleven 2002 para PlayStation 1 (PSX), desenvolvida em Java com interface gráfica Swing.

O programa permite alterar estruturas internas do jogo para desbloquear até 95 equipes nos modos Master Liga, Liga e Copas, ampliar as possibilidades de seleção de times e modificar a organização das equipes nos menus originais.

O projeto utiliza engenharia reversa e manipulação direta de arquivos binários por meio de offsets, permitindo modificar determinadas limitações do jogo original sem a necessidade de utilizar um editor hexadecimal manualmente.

## Funcionalidades

### 1. Desbloqueio de 95 equipes na Master Liga
- Modifica parâmetros internos relacionados à disponibilidade de equipes.
- Permite ampliar a seleção de clubes no modo Master Liga.
- Altera offsets específicos para liberar opções originalmente limitadas.

### 2. Desbloqueio de 95 equipes nos modos Liga e Copas
- Modifica as restrições de seleção de equipes.
- Permite utilizar uma quantidade maior de equipes nas competições.
- Altera parâmetros internos de navegação e seleção dos times.
- Inclui modificações relacionadas à liberação de equipes All-Star e seleções.

### 3. Reorganização dos clubes da Master Liga
- Move os clubes da Master Liga para a parte inferior da tela de seleção.
- Modifica a disposição das equipes nos menus.
- Utiliza arquivos binários personalizados para reorganizar os dados de seleção e os ícones dos menus.

### 4. Desbloqueio de seleções All-Star nas contratações
- Modifica os parâmetros do menu de contratações da Master Liga.
- Permite acessar seleções All-Star anteriormente indisponíveis nesse menu.
- Amplia as possibilidades de seleção de equipes para contratações.

### 5. Restauração de dados originais
- Inclui uma opção para restaurar determinadas estruturas binárias originais do jogo.
- Restaura dados de torneios, organização de equipes e ícones dos menus.
- Permite desfazer parte das alterações realizadas pela ferramenta.

### 6. Interface gráfica
- Interface desenvolvida em Java Swing.
- Seleção do arquivo BIN por meio de uma janela de navegação.
- Opções de modificação organizadas em caixas de seleção.
- Aplicação das alterações diretamente no arquivo selecionado.
- Mensagens de confirmação das operações.
- Menu de créditos dos desenvolvedores.

## Tecnologias utilizadas

- **Linguagem:** Java 8
- **Interface gráfica:** Java Swing
- **IDE:** Apache NetBeans
- **Sistema de compilação:** Apache Ant
- **Manipulação binária:** RandomAccessFile
- **Arquivos modificados:** imagens BIN do Winning Eleven 2002
- **Distribuição:** executável Java (.jar)

## Funcionamento

O programa utiliza offsets previamente identificados nos arquivos do jogo para localizar e substituir valores binários específicos.

Também utiliza arquivos BIN auxiliares contendo dados modificados e originais, permitindo substituir conjuntos de bytes relacionados aos menus e à organização das equipes.

O objetivo é expandir as possibilidades do Winning Eleven 2002 preservando sua estrutura original.

## Créditos

**Programação:** Fabio FJA

**Pesquisa de offsets:** Fabio FJA

**Versão:** 3.0

**Plataforma:** PlayStation 1 (PSX)

**Status:** projeto de modificação e pesquisa.

### Observações

- Faça backup da imagem BIN antes de modificar o jogo.
- A ferramenta altera diretamente o arquivo selecionado.
- A opção de restauração não substitui a necessidade de manter um backup completo.
- Projeto independente, sem vínculo oficial com a Konami.
