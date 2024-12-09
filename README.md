# Payment-App
Payment-App é um projeto backend de uma plataforma de pagamentos. Nela é possível depositar e realizar transferências entre dois usuários, tendo dois tipos de usuários, os comuns e os lojistas.

### Tecnologias Utilizadas
- Java 21.
- Spring boot.
- Mapeamento de entidades com Jakarta Persistence.
- Spring Cloud Open Feign para comunicação com API externa.
- Hibernate Validator para validação de dados.
- Tratamento de exceções com ControllerAdvice e Problem Details (RFC 7807).
- SLF4J para efetuar logs.

### Funcionalidades
- Cadastro de uma nova Wallet.
- Transferências entre usuários com Mocks autenticador e notificador externo.
  

- Endpoint para transferência

```json
POST /transfer
Content-Type: application/json

{
  "value": 100.0,
  "payer": 4,
  "payee": 15
}
```
