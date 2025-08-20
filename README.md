<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
 
</head>
<body>

  <h1>🏠 Aluga</h1>
  <p><strong>Aluga</strong> é um sistema de <strong>gestão de locação de imóveis</strong> que facilita o processo de administração imobiliária. 
  Ele permite gerenciar imóveis, inquilinos, contratos e pagamentos de forma simples e eficiente.</p>

  <h2>📦 Estrutura do Projeto</h2>
  <pre>
Aluga/
 ├── backend/    (API em Java Spring Boot)
 ├── frontend/   (Interface Angular)
 ├── docs/       (Documentação)
 └── README.md   (Este arquivo)
  </pre>

  <h2>🚀 Tecnologias Utilizadas</h2>
  <ul>
    <li>Backend: Java + Spring Boot</li>
    <li>Frontend: Angular (HTML, TypeScript, CSS)</li>
    <li>Banco de Dados: PostgreSQL</li>
    <li>Versionamento: Git/GitHub</li>
  </ul>

  <h2>⚙️ Funcionalidades Principais</h2>
  <ul>
    <li>📌 Cadastro de imóveis</li>
    <li>👤 Cadastro de inquilinos e proprietários</li>
    <li>📝 Criação e gestão de contratos de locação</li>
    <li>💰 Controle de pagamentos e recebimentos</li>
    <li>📊 Relatórios financeiros</li>
    <li>🔒 Autenticação de usuários</li>
  </ul>

  <h2>🛠️ Como Executar Localmente</h2>

  <h3>Pré-requisitos</h3>
  <ul>
    <li><a href="https://adoptium.net/">Java 17+</a></li>
    <li><a href="https://nodejs.org/">Node.js 18+</a></li>
    <li><a href="https://www.postgresql.org/">PostgreSQL</a></li>
    <li>Maven</li>
  </ul>

  <h3>Passos</h3>
  <ol>
    <li>Clonar o repositório:
      <pre>git clone https://github.com/rafaelmsp/Aluga.git
cd Aluga</pre>
    </li>
    <li>Configurar o banco de dados:
      <ul>
        <li>Criar um banco chamado <code>aluga_db</code> no PostgreSQL</li>
        <li>Configurar as credenciais em <code>application.properties</code></li>
      </ul>
    </li>
    <li>Rodar o backend:
      <pre>cd backend
./mvnw spring-boot:run</pre>
    </li>
    <li>Rodar o frontend:
      <pre>cd frontend
npm install
ng serve</pre>
    </li>
    <li>Acessar no navegador:
      <pre>http://localhost:4200</pre>
    </li>
  </ol>

  <h2>📖 Documentação</h2>
  <p>A documentação com casos de uso e diagramas está disponível na pasta <code>/docs</code>.</p>

  <h2>🤝 Contribuição</h2>
  <ol>
    <li>Faça um fork do projeto</li>
    <li>Crie uma branch: <code>git checkout -b feature/nova-feature</code></li>
    <li>Commit suas alterações: <code>git commit -m "Adiciona nova feature"</code></li>
    <li>Envie para o GitHub: <code>git push origin feature/nova-feature</code></li>
    <li>Abra um Pull Request</li>
  </ol>

  <h2>📄 Licença</h2>
  <p>Projeto sob licença <strong>MIT</strong>. Veja o arquivo <code>LICENSE</code> para mais detalhes.</p>

  <h2>👤 Autor</h2>
  <p><strong>Rafael Moraes da Silva Passos</strong><br>
  🔗 <a href="https://github.com/rafaelmsp">GitHub</a></p>

</body>
</html>
