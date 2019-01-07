# ComplianceFiscal-Api

# -> Backend

# Caso de Uso: Gestão de produtos

- Utilizando API’s Rest com Java, disponibilizar para o usuário final uma interface que possibilite as ações:

1. Incluir novos produtos (Validar se o produto já não existe na base)
2. Alterar produtos;
3. Consultar produtos por código e descrição e por código ou descrição (O serviço de consulta deve ser único);
4. Excluir produtos;

# Caso de uso: Gestão de pedidos

- Utilizando API’s Rest com Java, disponibilizar para o usuário final uma interface que possibilite a validação de pedidos:

1. O usuário informa o código do produto e a API devolve os dados do produto (Caso o código seja válido, caso contrário informar ao usuário que o produto não existe);
2. Usuário informa a quantidade e registra o pedido, caso o estoque seja insuficiente, informar o usuário que a quantidade excede o estoque;
3. Caso a situação de nro. 2 seja valida, registrar o pedido na tabela PEDIDOS;

# Critérios para execução do teste

- É imprescindível o uso de frameworks de persistência para gestão dos dados (As tabelas devem ser geradas dinâmicamente à partir da aplicação);
- Construir o front-end utilizando HTML 5 e Javascript (É permitido o uso de SpringBoot);
- Para armazenamento dos dados deverá ser utilizado PostgreSQL;

# Swagger

- API REST com Swagger-ui. Disponível em: http://localhost:8080/swagger-ui.html

# Heroku

- API REST com Swagger-ui. Disponível em: https://compliancefiscal-api.herokuapp.com/swagger-ui.html#/produtos-resource

# -> Frontend

# compliance-front

## Project setup
```
npm install
```

### Compiles and hot-reloads for development
```
npm run serve
```

### Compiles and minifies for production
```
npm run build
```

### Lints and fixes files
```
npm run lint