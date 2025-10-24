# Sistema de Gestão de Alunos e Cursos

Sistema acadêmico desenvolvido em Java para gerenciar alunos e cursos, implementado como exercício da faculdade com funcionalidades extras adicionadas.

## 📋 Sobre o Projeto

Este projeto foi desenvolvido como exercício de Programação Orientada a Objetos na faculdade. Além dos requisitos básicos solicitados pelo professor, implementei funcionalidades adicionais, incluindo:

- Interface gráfica com Swing para visualização de alunos
- Sistema completo de validações
- Relacionamento bidirecional entre Aluno e Curso
- Camada DAO para persistência de dados

## 🚀 Tecnologias Utilizadas

- **Java** - Linguagem principal
- **Swing** - Interface gráfica
- **Padrão MVC** - Arquitetura do projeto

## 📁 Estrutura do Projeto

```
FirstJavaProject/
├── model/           # Classes de modelo (Aluno, Curso, ModelException)
├── controller/      # Controladores (CtrlVerAluno)
├── viewer/          # Interfaces gráficas (JanelaVerAluno)
└── dao/            # Camada de acesso a dados (DaoAluno)
```

## ⚙️ Funcionalidades

### Requisitos da Faculdade
- Cadastro de alunos com validações
- Relacionamento entre aluno e curso
- Validação de matrícula, nome e curso

### Funcionalidades Extras Implementadas
- ✨ **Visualização de Alunos em Tabela** - Interface gráfica para listar todos os alunos cadastrados
- 📊 Exibição de dados em formato tabular (matrícula, nome, curso)
- 🔄 Método `toString()` personalizado para melhor visualização

## 🔧 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/eupedrx/FirstJavaProject.git
```

2. Compile o projeto:
```bash
javac -d bin src/**/*.java
```

3. Execute a aplicação:
```bash
java -cp bin viewer.JanelaVerAluno
```

## 💡 Principais Classes

### `Aluno`
Representa um aluno com matrícula, nome e curso. Inclui validações para garantir integridade dos dados.

### `Curso`
Gerencia informações do curso e mantém lista de alunos matriculados.

### `JanelaVerAluno`
Interface gráfica que exibe lista de alunos em formato de tabela utilizando JTable.

### `DaoAluno`
Camada de acesso a dados para operações com alunos.

## 📝 Conceitos Aplicados

- Programação Orientada a Objetos
- Padrão MVC (Model-View-Controller)
- Tratamento de exceções personalizadas
- Relacionamento bidirecional entre objetos
- Interface gráfica com Swing
- Padrão DAO (Data Access Object)

## 👨‍💻 Autor

Pedro - [@eupedrx](https://github.com/eupedrx)

## 📄 Licença

Este projeto foi desenvolvido para fins acadêmicos.
