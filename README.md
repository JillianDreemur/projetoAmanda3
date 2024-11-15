# Projeto Amanda 3° nota
Projeto referente a 3° nota da atividade de Engenharia de Software 2, durante o 4° período do curso de Ciência da Computação na Faculdade Católica da Paraíba, ministrada pela professora Amanda Miranda.
Sistema de Gerenciamento de Estoque (Arquitetura em Camadas)Sistema para controle e gerenciamento de estoque em uma empresa. Permite o cadastro, atualização e exclusão de itens, além da geração de relatórios de inventário. A arquitetura em camadas facilita a divisão entre interface, lógica de negócios e persistência de dados.  Integração com PostgreSQL para armazenar informações de produtos, histórico de transações e níveis de estoque. 
A interface, web ou desktop para facilitar o acesso. 
Padrões de projeto:

    O padrão Builder: é utilizado para a criação de relatórios de estoque com 
    diferentes configurações. 
    Com ele, é possível gerar relatórios customizados com informações detalhadas,
    como produtos por categoria, itens com estoque baixo ou resumo das movimentações,
    permitindo que o usuário adapte o relatório conforme as necessidades específicas da empresa.
    O padrão Abstract Factory: é implementado para criar objetos de diferentes tipos de produtos,
    como alimentos, eletrônicos e materiais de escritório. 
    Esse padrão facilita a criação de novos tipos de produtos, possibilitando uma adaptação 
    rápida do sistema a diferentes setores e simplificando
    a lógica de categorização e organização do estoque.

A data de entrega é para o dia 05/12 às 12h.

Observações Importantes: 

    É OBRIGATÓRIO O DOCUMENTO DE REQUISITOS FUNCIONAIS E NAO FUNCIONAIS 
    (Segue o modelo de exemplo em anexo)
    Deverá ser criado um repositório privado criado por algum membro da equipe 
    Esse repositório será clonado pelos demais participantes
    Deverá ser convidado como colaborador do repositório (para correção)
    o  seguinte usuário: amandamirandam  
    As branchs do repositório serão as seguintes: 
    - master 
    - desenvolvimento 
    - nome_do_aluno

Cada aluno deverá desenvolver em sua própria branch. 
O código da branch nome_do_aluno deverá ser enviada (merge) para branch desenvolvimento.
A branch desenvolvimento do repositório remoto deverá conter o código de todos os  desenvolvedores.
A branch master precisa estar totalmente atualizada na entrega do projeto, juntamente com a branch desenvolvimento.
