# Sistema de Analise de Credito em Java <br> <br>
  # Descrição do Projeto #

Este projeto consiste no desenvolvimento de um sistema de análise de crédito desenvolvido em Java, com o objetivo de aplicar conceitos fundamentais de Programação Orientada a Objetos (POO) na construção de uma aplicação baseada em um cenário real de mercado.

A aplicação simula o fluxo inicial de uma solicitação de empréstimo, onde um cliente realiza um pedido de crédito e o sistema coleta informações necessárias para uma futura análise de aprovação.

O principal objetivo do projeto é desenvolver uma estrutura organizada, aplicando conceitos como modelagem de entidades, relacionamento entre objetos, encapsulamento e separação de responsabilidades.

Funcionalidades Implementadas
Cadastro de Cliente

A aplicação possui uma entidade responsável por representar o cliente, armazenando informações importantes como:

Nome;
Identificação;
Profissão;
CPF;
Data de nascimento;
Renda mensal;
Tempo de emprego.

A classe foi estruturada utilizando construtores para garantir que os objetos sejam criados com informações necessárias desde sua inicialização.

Solicitação de Crédito

Foi criada uma entidade responsável por representar um pedido de empréstimo realizado pelo cliente.

A solicitação contém informações como:

Cliente responsável pelo pedido;
Valor solicitado;
Quantidade de parcelas;
Data da solicitação;
Score utilizado na análise.

A modelagem foi desenvolvida considerando que uma solicitação pertence a um cliente específico, utilizando relacionamento entre objetos ao invés de armazenar apenas informações isoladas.

Conceitos Aplicados

Durante o desenvolvimento foram aplicados conceitos importantes da linguagem Java:

Programação Orientada a Objetos;
Criação e utilização de classes;
Instanciação de objetos;
Construtores;
Relacionamento entre objetos;
Tipagem de dados;
Uso de classes da API Java (LocalDate e BigDecimal);
Modelagem de entidades de um domínio real.
