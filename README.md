# API Spring boot
Este projeto desenvolve uma api com spring boot com as seguintes funcionalidades:
- Cadastro Servidor:
- Busca de servidor por matricula;
- Cadastro de lotação;
- Consulta de lotação por nome.
## Começando

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK 11: Necessário para executar o projeto Java](https://www.techspot.com/downloads/5553-java-jdk.html)
- [Maven 3.6.3: Necessário para realizar o build do projeto Java](https://dlcdn.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip)
- [IntelliJ IDEA: Para desenvolvimento do projeto](https://www.jetbrains.com/pt-br/idea/download/download-thanks.html?platform=windows)
- Banco de dados em memoria H2-DATABASE
## Desenvolvimento

Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub num diretório de sua preferência:

```shell
cd "diretorio de sua preferencia"
git clone https://github.com/Ruanxbrx/atividade-springboot-java-15.git
```
### Construção

Para construir o projeto com o Maven, executar os comando abaixo:

```shell
mvn clean install
```

O comando irá baixar todas as dependências do projeto e criar um diretório *target* com os artefatos construídos, que incluem o arquivo jar do projeto.
## Features

O projeto pode ser usado como modelo para iniciar o desenvolvimento de um projeto Java usando o Maven e Spring boot. Ele também demonstra de forma prática como configurar o Maven em um projeto Java.
## Configuração

Para executar o projeto, é necessário utilizar o IntelliJ , para que o mesmo identifique as dependências necessárias para a execução no repositório .m2 do Maven. Uma vez importado o projeto, será criado um arquivo *.classpath* que irá informar qual a classe principal para a execução.
## Testes

Para rodar os testes, utilize o comando abaixo:

```
mvn test
```
## Rodar aplicação
Para rodar a aplicação ultilize o comando abaixo:
```
mvn spring-boot:run
```