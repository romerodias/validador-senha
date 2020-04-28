# validador-senha

O projeto **validador-senha** tem o objetivo de expor uma API para verificar e validar se uma senha está em conformidade com as regras de uma política pré estabelecida pela API.

# Pré requisitos
* Java 8 +
* Apache Maven 3.6.0 +
* docker
* docker-compose

# Instruções para Execução Local 
## Faça download do projeto
```
git clone https://github.com/romerodias/validador-senha.git
```

## Executar aplicação
``` 
mvn spring-boot:run 
```
## Acessar documentação iterativa da API
(http://endereco_local_da_api:8080/swagger-ui.html)

## Teste de requisição com curl
```
curl -X POST "http://endereco_local_da_api:8080/senha/validar?senha=AbTp91foo%40" -H "accept: */*"
```


# Instruções para Execução em Produção

## Gerar imagem Docker
Após executar o comando abaixo, será criado o artefato *jig-image.tar* no diretório target/, este artefato se trata da imagem docker da API validaor-senha.

```
mvn clean install -DskipTests jib:buildTar -Pdocker-image
```

## Registrar imagem Docker
Para distribuir a aplicação, você pode registrar a imagem docker em algum registry por exemplo AWS ECR, Docker Hub. No exemplo abaixo vamos registrar a imagem no Docker Host local.
```
docker load -i target/jib-image.tar 
```

## Rodar aplicação
O projeto possui um arquivo docker-compose.yml como exemplo para utilizar em produção.  
Acesse o diretório docker/ e execute o comando abaixo
```
docker-compose up
```

## Acessar documentação iterativa da API
(http://endereco_producao_da_api/swagger-ui.html)

# Decisões Técnicas
* A aplicação foi estruturada pensando em arquitetura hexagonal, tendo o package **br.com.rdtecnologia.validadorsenha.core** como core domain desacoplado da aplicação.
* Foi utilizado o plugin [Google jib](https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin) para containerizar a aplicação. Utilizando este plugin não é necessário instalar docker no host que empacota a imagem. Este plugin facilita na criação de scripts para pipeline de CI/CD;


# Sugestões para Produção
* Executar a API em ambiente controlado, recomendado utilizar um API Gateway que faça o controle de acesso;
* Utilizar uma solução de tracing distribuído por exemplo: Spring Cloud Sleuth e Spring Cloud Zipkin;