function onFormSubmit(e) {
  // Verifica se as respostas foram recebidas corretamente
  Logger.log("Respostas recebidas: " + JSON.stringify(e.namedValues));

  // Obtém as respostas do formulário enviado para a planilha
  var resposta = e.namedValues;
  var demanda = resposta["Qual é sua demanda?"] ? resposta["Qual é sua demanda?"][0].trim() : "Não fornecido";
  Logger.log("Valor da demanda: '" + demanda + "'");

  if (demanda.toLowerCase() === "solicitação de criação de vm") {
    Logger.log("✅ O usuário optou por criar VMs.");
    criacao_vm(resposta);
  } 
  else if (demanda.toLowerCase() === "renovação de tempo de vida de vm") {
    Logger.log("🔄 O usuário optou por renovar o tempo da(s) VM(s).");
    renovar_vm(resposta);
  } else {
    Logger.log("❌ Demanda não reconhecida: " + demanda);
  }
}

function renovar_vm(resposta) {
  Logger.log("Renovação de VM processada.");

  // ID da lista do Trello onde o card será criado
  var listId = "660b147ef76bda454efe54eb"; 

  var nome_completo = resposta["Nome do Solicitante de Renovação"] ? resposta["Nome do Solicitante de Renovação"][0] : "Não fornecido";
  var email_institucional_aluno = resposta["Email institucional (solicitante de renovação):"] ? resposta["Email institucional (solicitante de renovação):"][0] : "Não fornecido";
  var email_institucional_orientador = resposta["Email institucional (orientador do projeto):"] ? resposta["Email institucional (orientador do projeto):"][0] : "Não fornecido";
  var tempo_de_vida = resposta["Tempo de vida requisitado"] ? resposta["Tempo de vida requisitado"][0] : "Não fornecido";
  var nomeVm = resposta["Nome da(s) VM(s)"] ? resposta["Nome da(s) VM(s)"][0] : "Não fornecido";
  var justificativa_vm = resposta["Justificativa de renovação de VM"] ? resposta["Justificativa de renovação de VM"][0] : "Não fornecido";

  // Criação do título e descrição do card para a renovação
  var tituloCard    = "🖥️ Renovação de VM: " + nomeVm;
  var descricaoCard = "📝 Nome da(s) VM(s): " + nomeVm + "\n" +
                      "📧 **Email do Solicitante**: " + email_institucional_aluno + "\n" +
                      "📧 **Email do orientador**: " + email_institucional_orientador + "\n" +
                      "⚙️ **Tempo Solicitado**: " + tempo_de_vida + "\n" +
                      "💾 **Justificativa**: " + justificativa_vm + "\n";

  // Chama a função para criar o card no Trello
  criarCardTrello(listId, tituloCard, descricaoCard);
}

function criacao_vm(resposta) {
  // ID da lista do Trello onde o card será criado
  var listId = "660b147ef76bda454efe54eb"; 

  // Dados gerais do solicitante
  var nome_completo = resposta["Nome completo do solicitante:"] ? resposta["Nome completo do solicitante:"][0] : "Não fornecido";
  var nivel_formacao = resposta["Nível de formação:"] ? resposta["Nível de formação:"][0] : "Não fornecido";
  var email_institucional_aluno = resposta["E-mail Institucional (requerente) -  (somente):"] ? resposta["E-mail Institucional (requerente) -  (somente):"][0] : "Não fornecido";
  var email_institucional_orientador = resposta["Email institucional (orientador) - (somente):"] ? resposta["Email institucional (orientador) - (somente):"][0] : "Não fornecido";
  var justificativa_vm = resposta["Justificativa de criação da máquina virtual:"] ? resposta["Justificativa de criação da máquina virtual:"][0] : "Não fornecido";
  var tempo_de_vida = resposta["Tempo de vida:"] ? resposta["Tempo de vida:"][0] : "Não fornecido";

  // Detalhes da primeira VM
  var nomeVm = resposta["Nome da VM:"] ? resposta["Nome da VM:"][0] : "Não fornecido";
  var sistemaOperacional = resposta["Sistema Operacional:"] ? resposta["Sistema Operacional:"][0] : "Não fornecido";
  var quantoDeRam = resposta["Quantidade de memória RAM da VM:"] ? resposta["Quantidade de memória RAM da VM:"][0] : "Não fornecido";
  var quantoDeArmazenamento = resposta["Quantidade de armazenamento da VM:"] ? resposta["Quantidade de armazenamento da VM:"][0] : "Não fornecido";
  var cpus = resposta["Quantidade de Núcleos da VM:"] ? resposta["Quantidade de Núcleos da VM:"][0] : "Não fornecido";

  // Título e descrição do card
  var titulo = "🖥️ Criação de VM para: " + nome_completo;
  var descricaoCard = "📝 **Nome Completo**: " + nome_completo + "\n" +
                      "🎓 **Nível de Formação**: " + nivel_formacao + "\n" +
                      "📧 **Email do Solicitante**: " + email_institucional_aluno + "\n" +
                      "👨‍🏫 **Email do Orientador**: " + email_institucional_orientador + "\n" +
                      "📜 **Justificativa**: " + justificativa_vm + "\n" +
                      "⏳ **Tempo de Vida**: " + tempo_de_vida + "\n" + "\n" +
                      "💻  ---------------- VM 1 ----------------  💻\n" +
                      "🖥️ **Nome da VM**: " + nomeVm + "\n" +
                      "💿 **Sistema Operacional**: " + sistemaOperacional + "\n" +
                      "🛠️ **Memória RAM**: " + quantoDeRam + "\n" +
                      "💾 **Armazenamento**: " + quantoDeArmazenamento + "\n" +
                      "⚙️ **CPUs**: " + cpus + "\n" + "\n" ;


  // Verifica se o usuário deseja adicionar mais VM
  var opcao1 = resposta["Você solicitou a criação de 1 VM. Deseja solicitar mais uma VM?"];
  if (opcao1 == "Sim"){
    // Detalhes da primeira VM
    nomeVm2 = resposta["Nome da VM 2:"] ? resposta["Nome da VM 2:"][0] : "Não fornecido";
    sistemaOperacional2 = resposta["Sistema Operacional 2:"] ? resposta["Sistema Operacional 2:"][0] : "Não fornecido";
    quantoDeRam2 = resposta["Quantidade de memória RAM da VM 2:"] ? resposta["Quantidade de memória RAM da VM 2:"][0] : "Não fornecido";
    quantoDeArmazenamento2 = resposta["Quantidade de armazenamento da VM 2:"] ? resposta["Quantidade de armazenamento da VM 2:"][0] : "Não fornecido";
    cpus2 = resposta["Quantidade de Núcleos da VM 2:"] ? resposta["Quantidade de Núcleos da VM 2:"][0] : "Não fornecido";

    // Descrição da primeira VM
    descricaoCard += "💻  ---------------- VM 2 ----------------  💻\n" +
                        "🖥️ **Nome da VM**: " + nomeVm2 + "\n" +
                        "💿 **Sistema Operacional**: " + sistemaOperacional2 + "\n" +
                        "🛠️ **Memória RAM**: " + quantoDeRam2 + "\n" +
                        "💾 **Armazenamento**: " + quantoDeArmazenamento2 + "\n" +
                        "⚙️ **CPUs**: " + cpus2 + "\n";
  }
  // Verifica se o usuário deseja adicionar mais uma VM
  var opcao2 = resposta["Você solicitou a criação de 2 VMs. Deseja solicitar mais uma VM?"];
  if (opcao2 == "Sim"){
    // Detalhes da nova VM (mesmas perguntas para a nova VM)
    nomeVm3 = resposta["Nome da VM 3:"] ? resposta["Nome da VM 3:"][0] : "Não fornecido";
    sistemaOperacional3 = resposta["Sistema Operacional 3:"] ? resposta["Sistema Operacional 3:"][0] : "Não fornecido";
    quantoDeRam3 = resposta["Quantidade de memória RAM da VM 3:"] ? resposta["Quantidade de memória RAM da VM 3:"][0] : "Não fornecido";
    quantoDeArmazenamento3 = resposta["Quantidade de armazenamento da VM 3:"] ? resposta["Quantidade de armazenamento da VM 3:"][0] : "Não fornecido";
    cpus3 = resposta["Quantidade de Núcleos da VM 3:"] ? resposta["Quantidade de Núcleos da VM 3:"][0] : "Não fornecido";

    // Adiciona os detalhes da nova VM ao conteúdo do card
    descricaoCard += "\n💻  ---------------- VM 3 ----------------  💻\n" +
                    "🖥️ **Nome da VM**: " + nomeVm3 + "\n" +
                    "💿 **Sistema Operacional**: " + sistemaOperacional3 + "\n" +
                    "🛠️ **Memória RAM**: " + quantoDeRam3 + "\n" +
                    "💾 **Armazenamento**: " + quantoDeArmazenamento3 + "\n" +
                    "⚙️ **CPUs**: " + cpus3 + "\n";
                    
  }

  // Verifica se o usuário deseja adicionar mais uma VM
  var opcao3 = resposta["Você solicitou a criação de 3 VMs. Deseja solicitar mais uma VM?"];
  if (opcao3 == "Sim"){
    // Detalhes da nova VM (mesmas perguntas para a nova VM)
    nomeVm4 = resposta["Nome da VM 4:"] ? resposta["Nome da VM 4:"][0] : "Não fornecido";
    sistemaOperacional4 = resposta["Sistema Operacional 4:"] ? resposta["Sistema Operacional 4:"][0] : "Não fornecido";
    quantoDeRam4 = resposta["Quantidade de memória RAM da VM 4:"] ? resposta["Quantidade de memória RAM da VM 4:"][0] : "Não fornecido";
    quantoDeArmazenamento4 = resposta["Quantidade de armazenamento da VM 4:"] ? resposta["Quantidade de armazenamento da VM 4:"][0] : "Não fornecido";
    cpus4 = resposta["Quantidade de Núcleos da VM 4:"] ? resposta["Quantidade de Núcleos da VM 4:"][0] : "Não fornecido";

    // Adiciona os detalhes da nova VM ao conteúdo do card
    descricaoCard += "\n💻  ---------------- VM 4 ----------------  💻\n" +
                    "🖥️ **Nome da VM**: " + nomeVm4 + "\n" +
                    "💿 **Sistema Operacional**: " + sistemaOperacional4 + "\n" +
                    "🛠️ **Memória RAM**: " + quantoDeRam4 + "\n" +
                    "💾 **Armazenamento**: " + quantoDeArmazenamento4 + "\n" +
                    "⚙️ **CPUs**: " + cpus4 + "\n";
  }

  // Criação do card para a primeira VM no Trello
  criarCardTrello(listId, titulo, descricaoCard);
}


function criarCardTrello(listId, titulo, descricao) {
  // Substitua por sua chave API e token
  var apiKey = "88b2dd1546e4cbbfb560c0943c4d9908"; 
  var token = "ATTAe8dc57311f1af2d0157e61fb6e36b61e4636693ee29149f4579cd24fb66ee6aa0C6B79BE";  

  // URL para criar o card no Trello
  var url = "https://api.trello.com/1/cards";

  // Montagem do payload para criar o card
  var payload = {
    name: titulo,  // Título do card
    desc: descricao,  // Descrição do card
    idList: listId,  // ID da lista onde o card será criado
    key: apiKey,
    token: token
  };

  // Configuração da requisição
  var options = {
    method: "post",
    payload: payload
  };

  try {
    // Envia a requisição para a API do Trello
    var response = UrlFetchApp.fetch(url, options);

    // Log da resposta da API para depuração
    Logger.log("Resposta da API do Trello: " + response.getContentText());
  } catch (error) {
    // Caso ocorra erro, log da mensagem de erro
    Logger.log("Erro ao criar card: " + error.message);
  }
}
