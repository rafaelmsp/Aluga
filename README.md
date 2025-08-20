<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8">
     </head>
  <body>
    <h1>🏠 Aluga</h1>
    <p>O <strong>Aluga</strong> é um sistema de <strong>gestão de locação de imóveis</strong>, desenvolvido para facilitar o processo de administração imobiliária. 
    Ele permite que proprietários, imobiliárias e inquilinos gerenciem contratos, pagamentos e imóveis de forma simples e eficiente.</p>

    <h2>📦 Estrutura do Projeto</h2>
    <pre><code>
Aluga/
 ├── backend/    <!-- API em Java Spring Boot -->
 ├── frontend/   <!-- Interface Angular -->
 ├── docs/       <!-- Documentação do projeto -->
 └── README.md   <!-- Este arquivo em HTML -->
    </code></pre>

    <h2>🚀 Tecnologias Utilizadas</h2>
    <ul>
      <li><strong>Backend:</strong> Java + Spring Boot</li>
      <li><strong>Frontend:</strong> Angular (HTML, TypeScript, CSS)</li>
      <li><strong>Banco de Dados:</strong> PostgreSQL</li>
      <li><strong>Versionamento:</strong> Git e GitHub</li>
    </ul>

    <h2>⚙️ Funcionalidades Principais</h2>
    <ul>
      <li>📌 Cadastro de imóveis (com descrição, endereço e valor de aluguel)</li>
      <li>👤 Cadastro de inquilinos e proprietários</li>
      <li>📝 Criação e gestão de contratos de locação</li>
      <li>💰 Controle de pagamentos e recebimentos</li>
      <li>📊 Relatórios financeiros e de ocupação</li>
      <li>🔒 Autenticação de usuários (login e senha)</li>
    </ul>

    <h2>🛠️ Como Executar Localmente</h2>
    <h3>Pré-requisitos</h3>
    <ul>
      <li><a href="https://adoptium.net/">Java 17+</a></li>
      <li><a href="https://nodejs.org/">Node.js 18+</a></li>
      <li><a href="https://www.postgresql.org/">PostgreSQL</a></li>
      <li>Maven para gerenciamento do backend</li>
    </ul>

    <h3>Passos</h3>
    <ol>
      <li><strong>Clonar o repositório:</strong>
        <pre><code>git clone https://github.com/rafaelmsp/Aluga.git
cd Aluga</code></pre>
      </li>
      <li><strong>Configurar o banco de dados:</strong>
        <ul>
          <li>Criar um banco chamado <code>aluga_db</code> no PostgreSQL</li>
          <li>Atualizar as credenciais no arquivo <code>application.properties</code></li>
        </ul>
      </li>
      <li><strong>Rodar o backend:</strong>
        <pre><code>cd backend
./mvnw spring-boot:run</code></pre>
      </li>
      <li><strong>Rodar o frontend:</strong>
        <pre><code>cd frontend
npm install
ng serve</code></pre>
      </li>
      <li><strong>Acessar no navegador:</strong>
        <pre><code>http://localhost:4200</code></pre>
      </li>
    </ol>

    <h2>📖 Documentação</h2>
    <p>A documentação com casos de uso, diagramas de arquitetura e especificações está disponível na pasta <code>/docs</code>.</p>

    <h2>🤝 Contribuição</h2>
    <p>Contribuições são bem-vindas! Para colaborar:</p>
    <ol>
      <li>Faça um fork do projeto</li>
      <li>Crie uma branch com sua feature:
        <pre><code>git checkout -b feature/nova-feature</code></pre>
      </li>
      <li>Commit suas alterações:
        <pre><code>git commit -m "Adiciona nova feature"</code></pre>
      </li>
      <li>Envie para o GitHub:
        <pre><code>git push origin feature/nova-feature</code></pre>
      </li>
      <li>Abra um Pull Request</li>
    </ol>

    <h2>📄 Licença</h2>
    <p>Este projeto está sob a licença <strong>MIT</strong>. Veja o arquivo <code>LICENSE</code> para mais detalhes.</p>

    <h2>👤 Autor</h2>
    <p><strong>Rafael Moraes da Silva Passos</strong><br>
    🔗 <a href="https://github.com/rafaelmsp">GitHub</a></p>

  </body>
</html>
