📧 Corporate Email Validator

Validador de e-mails corporativos criado em Java como parte de um desafio da plataforma DIO.me. O programa verifica se o e-mail fornecido pertence ao domínio corporativo @company.com.

✨ Demonstração

> Acima: exemplo de execução do programa validando um e-mail no terminal.

🚀 Como executar
1. Clone este repositório: 
git clone https://github.com/Robertoursine/Desafio-dio.git

2. Navegue até a pasta do projeto:
cd Desafio-dio

3. Compile e execute:
javac src/CorporateEmailValidator.java
java -cp src CorporateEmailValidator

✅ Testando o programa
Para testar a aplicação, basta executá-la no terminal e fornecer diferentes e-mails, como:

usuario@company.com → válido

usuario@gmail.com → inválido

Você pode modificar o domínio esperado alterando a string:
String dominio = "@company.com";

🧠 Lógica empregada
Uso do método .endsWith() para verificar o domínio do e-mail.

Entrada de dados via Scanner.

📁 Estrutura do projeto
Desafio-dio/
├── src/
│   └── CorporateEmailValidator.java
├── .gitignore
├── README.md
└── .idea/ (opcional - ambiente IntelliJ)
📄 Licença
Este projeto está licenciado sob os termos da licença MIT. Consulte o arquivo LICENSE para mais detalhes.

🙋 Sobre
Criado por Roberto como parte do desenvolvimento de habilidades em Java através dos desafios da DIO.me.

