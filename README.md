# Projeto Thriller Books API 👻📖

Este repositório contém o código-fonte para a API Thriller Books, uma aplicação Spring Boot para gerenciar um catálogo de livros de terror/suspense.

## Checklist✅

### 1. Configuração do Projeto🔧
 - [x] Configurado projeto Spring Boot usando o Spring Initializr.
 - [x] Adicionadas dependências necessárias no arquivo pom.xml.
 - [x] Configurado arquivo application.properties com as informações de conexão ao MySQL.

### 2. Modelagem de Dados🎲
- [x] Criada a entidade Livro com atributos como título, autor, ano de publicação, etc.
- [x] Criada a entidade Autor com atributos como nome e lista de livros associados.
- [x] Configurado relacionamento bidirecional entre Livro e Autor.

### 3. Controladores🎮
- [ ] Implementado controlador para gerenciar operações CRUD para os livros.
- [ ] Definidos endpoints para listar todos os livros, obter detalhes de um livro específico, adicionar um novo livro, atualizar informações e excluir um livro.
- [ ] Adicionadas validações para garantir a integridade dos dados.

### 4. Documentação da API
- [ ] Utilizado Swagger ou Spring Rest Docs para documentar a API.
- [ ]  Documentados os endpoints, parâmetros e respostas.

### 5. Testes Unitários
- [ ] Criar testes unitários para as classes com regras de negócio.

### 6. Persistência de Dados
- [x] Utilizado o Spring Data JPA para persistir os dados no MySQL.
- [ ] Testado a aplicação com dados reais no banco de dados MySQL.

## Como Executar a Aplicação🕹
1. Clone o repositório: git clone https://github.com/seu-usuario/thriller-books-api.git
2. Navegue até o diretório do projeto: cd thriller-books-api
3. Execute a aplicação: mvn spring-boot:run
4. Acesse a documentação da API: http://localhost:8080/swagger-ui.html
