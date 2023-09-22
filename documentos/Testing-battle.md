# IMD00412 - Introdução ao Teste de Software - Prof. Eiji Adachi - Semestre 2023.2

## Batalha de Testes

### Passo 0: Pré-requisitos para participação
Para participar, o aluno deverá atender todos os seguitnes pré-requisitos:
- Ter enviado o trabalho via SIGAA dentro do prazo estabelecido;
- Ter anexado ao seu projeto um documento evidenciando o processo de sistematização do projeto dos casos de teste;
- Ter implementado os casos de teste como testes parametrizáveis JUnit;
- Estar em sala de aula no início da batalha. Não serão aceitos participantes que cheguem após o início da batalha.

Qualquer tentativa de alterar o código enviado originalmente via SIGAA, ou qualquer outra tentativa de 'roubar' para obter vantagem indevida, levará à eliminação da atividade e também à nota 0 na 1a unidade.

### Passo 1: Registre-se e escolha o seu nome de batalha
Entre na planilha compartilhada pelo professor, escolha um dos battler-id pré-definidos e coloque o seu nome ao lado -- faça isso na aba 'seu-battler-id'. Ao longo de toda a batalha, não será possível alterar o seu battle-id.

Link para a planilha: https://docs.google.com/spreadsheets/d/1m8ipqApBdfNdNMjbuEIUCYJm8HDoKxxI7aFfW9cW2Yo/edit?usp=sharing

### Passo 2: Copie o arquivo Matricula.java do professor para o seu projeto
Baixe do SIGAA o arquivo Matricula.java, o qual contém a solução do professor, e coloque no seu projeto, sobrescrevendo o seu arquivo original.

### Passo 3: Rode a solução do professor e garanta que seus testes passam
Execute a sua suíte de testes testando a solução do professor. Se nenhum caso de teste falhar, você ganhou 1,0 ponto na batalha. Nesse caso, vá na aba 'pontuação' e registre esse ponto na coluna 'initial-point' do seu battler-id. 

Se casos de teste falharem, você deve eliminar esses testes da sua suíte (basta comentar a linha correspondente ao caso de teste) e não receberá o ponto 'initial-point', devendo registrar 0,0 na coluna correspondente.

### Passo 4: Insira os defeitos e verifique se sua suíte de testes foi capaz de identificá-lo
Em primeiro lugar, garanta que com a solução original do professor a sua suíte de testes executa sem que qualquer teste acuse falha (isso já deveria ter sido feito no passo anterior, estou repetindo pra ficar claro).

Para cada defeito definido na tabela 'bug-description', faça:
1. Altere o código do arquivo Matricula.java conforme o defeito descrito na tabela. O professor irá introduzir um defeito por vez, então fique atento.
2. Execute a sua suíte de testes e verifique se algum caso de teste foi capaz de identificar o defeito introduzido. 
    - Se sua suíte de testes foi capaz de identificar o defeito, você deve registrar a sua pontuação na aba 'pontuação' na coluna correspondente ao defeito. A pontuação a ser registrada deve seguir a seguinte fórmula: Pontuação = 1 / # Casos de Teste que Acusaram Falhas. Ou seja, se apenas um caso de teste acusou falha, você deve registrar como a fórmula '=1/1', se foram dois casos de teste, você deve registrar a pontuação com a fórmula '= 1/2', e assim sucessivamente.
    - Se a sua suíte de testes não identificou o defeito, isto é, se todos os casos de teste executaram normalmente, então você não pontua, devendo registrar 0,0 na coluna correspondente.
3. Desfaça o defeito introduzido, e volte para o primeiro passo para introduzir o defeito seguinte.

### Passo 5: Apuração do resultado
Após todos os defeitos terem sido introduzidos e testados, chega-se ao fim da batalha e passa-se à apuração dos resultados. Os alunos que conseguirem determinada pontuação na batalha, já terá assegurada determinada pontuação na 1a unidade.
- Se pontuação na batalha estiver entre [80%-100%], então aluno já tem 8,0 na 1a unidade 
- Se pontuação na batalha estiver entre [70%-80%[, então aluno já tem 7,0 na 1a unidade 
- Se pontuação na batalha estiver entre [60%-70%[, então aluno já tem 6,0 na 1a unidade 
- Se pontuação na batalha estiver entre [50%-60%[, então aluno já tem 5,0 na 1a unidade 
- Se pontuação na batalha estiver entre [40%-50%[, então aluno já tem 4,0 na 1a unidade 
- Demais casos, aluno tem 3,0 na 1a unidade

O melhor aluno ganhará um chocolate. Caso haja empate, os critérios de desempate são:
- O aluno que tiver a menor suíte de testes terá maior prioridade;
- O aluno que tiver entregue mais cedo no SIGAA terá maior prioridade.

Se ainda persistir o empate, será feito um sorteio para definir o vencedor.

### Considerações finais
- Casos não previstos e identificados durante a batalha serão resolvidos a critério do professor.
