# Luiz Felipe Gonçalves Braga
## Projeto 3: 2º Semestre de 2022


## Parceiro Acadêmico

## IACIT 
                                  
![](https://github.com/Obrag/Bertoti/blob/94dbef14d4d5e80d27eaa03a96e49ff147ef09a0/Metodologia/API%20IACIT.png)



## Descrição do Projeto
Foi proposto um desafio para desenvolver um sistema capaz de importar dados meteorológicos de arquivos CSV disponibilizados pela empresa, armazená-los em uma base de dados e gerar relatórios solicitados pelos clientes da empresa IACIT. A aplicação web é capaz filtrar os registros por regiões, estados, estações, tipo de dado e ranges de datas, além de exibir as informações em formato de gráficos e cards. Por fim, é possível obter relatórios com base na pesquisa realizada.

Requisitos funcionais exigidos: Cadastro de estações, cadastro de estados e regiões, importação de dados e geração de relatórios.
Requisitos não funcionais exigidos: Sistema Web, linguagem java, banco de dados relacional e documentações.
Tecnologias utilizadas


## Tecnologias Utilizadas

### Java

A linguagem Java foi utilizada para desenvolver todo o back-end da aplicação, utilizando o framework Spring Boot. O Spring Boot é uma estrutura que permite aos desenvolvedores criar rapidamente aplicativos web em Java, fornecendo um conjunto de ferramentas e bibliotecas que tornam a construção de aplicativos mais rápida e fácil.

### PostgreSQL
O banco de dados PostgreSQL foi utilizado para armazenar os dados meteorológicos que foram importados a partir dos arquivos CSVs, que foram disponibilizados pela empresa. PostgreSQL é um sistema de gerenciamento de banco de dados relacional de código aberto que é amplamente utilizado em aplicações empresariais e científicas, devido à sua confiabilidade, escalabilidade e recursos avançados. Além disso, o PostgreSQL é compatível com muitas linguagens de programação, incluindo Java, que foi usada neste projeto. Isso significa que os dados podem ser facilmente acessados e manipulados por meio do back-end da aplicação, permitindo que a equipe de desenvolvimento crie consultas complexas para gerar os relatórios solicitados pelos clientes da empresa IACIT.

### HTML, CSS e Javascript

As linguagens de marcação HTML e CSS foram utilizadas em conjunto com a linguagem de programação JavaScript para criar a interface gráfica da aplicação. O HTML é a base da estrutura da página web, enquanto o CSS é responsável por definir o estilo visual e a aparência da página. O JavaScript é utilizado para adicionar interatividade à página, permitindo que o usuário realize ações e que os dados sejam exibidos e atualizados dinamicamente. Com o uso do HTML, CSS e JavaScript, foi possível criar uma interface amigável e intuitiva para os usuários da aplicação, permitindo que eles possam visualizar os dados meteorológicos e gerar relatórios de forma fácil e eficiente. Além disso, utilizamos uma biblioteca do javascript chamada Charts, perfeita para disponibilizar os dados em forma de gráficos.



## Contribuições Individuais 
<details>
  <summary><b>Criação da lógica de geração de gráficos</b></summary> 

  <p>Implementei a lógica necessária para transformar os dados meteorológicos em gráficos compreensíveis. Isso envolveu  a utilização da bibliotecas gráfica a Charts.js, para criar visualizações adequadas e interativas dos dados.

![](https://github.com/Obrag/Bertoti/blob/bd304c69480604a8b7e88446925f6274995f8892/Metodologia/Gr%C3%A1fico%201.png)
![](https://github.com/Obrag/Bertoti/blob/bd304c69480604a8b7e88446925f6274995f8892/Metodologia/Gr%C3%A1fico%202.png)

O código acima apresentado cria um gráfico de linha utilizando a biblioteca Chart.js.

myLineChart = new Chart(ctx, {...}): Cria uma nova instância do gráfico de linha e o associa a um elemento do DOM com o contexto ctx.

type: 'line': Define o tipo de gráfico como "line", indicando que será um gráfico de linha.

data: {...}: Define os dados do gráfico, incluindo os rótulos (labels) para o eixo x e os conjuntos de dados (datasets) que serão exibidos no gráfico.

labels: arrayHora: Define os rótulos para o eixo x do gráfico, utilizando o array arrayHora.

datasets: [{...}, {...}, {...}]: Define os conjuntos de dados que serão exibidos no gráfico. Cada conjunto de dados é um objeto com configurações específicas.

label: "Nível da estação(mB)": Define o rótulo para o conjunto de dados, que será exibido na legenda do gráfico.

lineTension: 0.3: Define a tensão da linha do gráfico, controlando o quão suave ou rígida ela será.

backgroundColor, borderColor, pointRadius, pointBackgroundColor, pointBorderColor, pointHoverRadius, pointHoverBackgroundColor, pointHitRadius, pointBorderWidth: São configurações relacionadas às cores, tamanho e estilo dos pontos e linhas no gráfico.

data: arrayPressaoEstacao, data: arrayPressaoMax, data: arrayPressaoMin: São os conjuntos de dados reais que serão plotados no gráfico. Cada conjunto de dados é representado por um array, que contém os valores que serão exibidos no eixo y do gráfico.
</details>

<details>
  <summary><b>Segurança</b></summary> 
Na parte de segunraça desenvolvi a autenticação que o código faz da seguinte maneira: Quando o usuário usa a aplicação o código faz o registro do IP no LOG, e das outras vezes que a aplicação for executada ele vai comparar o registro do ultimo log e comparar com a atual para saber se é o mesmo usuário. 
  
  
![](https://github.com/Obrag/Bertoti/blob/0a79c5fcd26a2b9c467fd63f16de4ccae8c6618a/Metodologia/log.png)
  
 O código acima representa uma parte da autenticação desenvolvida. 
 
 $(function() {...});: Isso envolve todo o código dentro de uma função que será executada quando a página terminar de carregar.

$.getJSON("https://api.ipify.org?format=jsonp&callback=?", function(json) {...});: Faz uma requisição GET para a API do ipify.org para obter o endereço IP do cliente. A função getJSON recebe uma URL como parâmetro e uma função de retorno que será executada quando a resposta da requisição estiver disponível. A resposta da API é passada para a função como um objeto json.

const formulario = document.querySelector("form");: Seleciona o elemento <form> do HTML e o armazena na variável formulario.

const Iemail = document.getElementById("inputEmail");: Seleciona o elemento com o ID inputEmail do HTML e o armazena na variável Iemail.

function cadastrarLog() {...}: Define uma função chamada cadastrarLog() que é responsável por enviar uma requisição POST para o servidor para cadastrar um log de login. A função utiliza a função fetch() para enviar a requisição para o endpoint http://localhost:8080/log. Os cabeçalhos da requisição são definidos para indicar que o tipo de conteúdo é JSON. O corpo da requisição é definido como um objeto JSON que contém o email do usuário, o endereço IP e o status de "logado".

.then(function(res) {console.log(res) }): Define uma função de retorno que será executada quando a requisição POST for concluída com sucesso. Nesse caso, a função simplesmente exibe a resposta da requisição no console.

.catch(function(res) {console.log(res) }): Define uma função de retorno que será executada se ocorrer algum erro na requisição POST. Nesse caso, a função simplesmente exibe o erro no console.

formulario.addEventListener('submit', function(event) {...});: Adiciona um ouvinte de evento ao formulário que aguarda o evento de envio (submit). Quando o evento é acionado, a função de retorno é executada. Essa função chama a função cadastrarLog() para enviar a requisição POST.

Esse código combina o uso do jQuery para fazer uma requisição GET para obter o endereço IP do cliente e o uso do JavaScript puro (Vanilla JavaScript) para selecionar elementos do HTML, adicionar um ouvinte de evento e enviar a requisição POST. O objetivo é cadastrar um log de login no servidor quando o formulário for enviado.
  
</details>
  
<details>
  <summary><b>Estrutura HTML</b></summary> 
  
Na parte da estrutura HTML eu desenvolvi a estrutura básica do projeto HTML, definindo a hierarquia dos elementos, como a organização de seções, cabeçalhos, rodapés e outros elementos.
  
  ![](https://github.com/Obrag/Bertoti/blob/b58b34248eec1e3d7d1cb3edff409402b5990dfc/Metodologia/HTML%20ESTRUTURA.png)
 
  Esse código define a estrutura básica da página HTML e implementa uma barra de navegação com um campo de pesquisa e um botão de busca. Vou explicar as principais partes:

body class="sb-nav-fixed": Define a classe CSS "sb-nav-fixed" para o elemento body, que provavelmente possui algum estilo de layout fixo para a barra de navegação.

nav class="sb-topnav : Cria uma barra de navegação superior usando classes CSS pré-definidas, como "navbar", "navbar-expand" e "navbar-dark". A barra de navegação tem um fundo escuro ("bg-dark").

a class="navbar-brand: Um link de navegação com a classe "navbar-brand" e o texto "IACIT". Esse link provavelmente serve como logotipo ou nome da marca.

button class="btn: Um botão com a classe "btn" e "btn-link" para alternar a barra lateral. Esse botão geralmente é usado para mostrar ou ocultar o menu lateral em um layout responsivo. Ele contém um ícone de barras.

form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">: Um formulário com classes CSS "d-none" e "d-md-inline-block", que indica que o formulário é oculto em telas menores que md (médias) e exibido em telas maiores. O formulário tem classes adicionais "form-inline" e "ms-auto me-0 me-md-3 my-2 my-md-0" para ajustar o estilo de exibição.

div class="ls-field-lg">: Um elemento <div> com a classe "ls-field-lg", provavelmente usado para estilização específica.

select class="est-select" style="width:300px" id="estacoes-select">: Um elemento select com a classe "est-select" e um estilo de largura de 300 pixels. Esse elemento é um menu suspenso onde os usuários podem selecionar uma opção. Ele tem o ID "estacoes-select".

option id="select1" value="abc" disabled="" selected=""Procurar...<option>: Uma opção pré-definida no menu suspenso, com o ID "select1" e o valor "abc". Essa opção está desabilitada (disabled) e selecionada (selected) por padrão, e exibe o texto "Procurar...".

script... Código JavaScript embutido no HTML. Esse código é executado quando o documento HTML é carregado e usa a biblioteca jQuery para fazer uma requisição GET para "/estacoes" e preencher dinamicamente as opções do menu suspenso "estacoes-select" com base nos dados recebidos. Em seguida, há uma função search() que é chamada quando o botão "btnNavbarSearch" é clicado, que obtém o valor selecionado do menu.

</details>


### Aprendizados Efetivos 
<details>
  <summary>Spring Framework</summary>
    <ul>
      <li>Desenvolvimento de aplicações web</li>
      <li>Arquitetura REST</li>
      <li>Integração com banco de dados</li>
      <li>Injeção de dependências</li>
      <li>Desenvolvimento de código através de interfaces</li>
    </ul>
</details>
<details>
  <summary>Banco de dados</summary>
    <ul>
      <li>Consultas personalizadas com SQL</li>
      <li>Geração de scripts</li>
      <li>Export e import de backup</li>
    </ul>
</details>
<details>
  <summary>Programação</summary>
    <ul>
      <li>Funções em JavaScript</li>
      <li>Manipulação de variáveis com JavaScript</li>
      <li>Programação orientada a objetos</li>
      <li>Consumo de API Rest</li>
      <li>Gerenciamento de usuários</li>
      <li>Consumo de recursos de bootstrap</li>
    </ul>
</details>

