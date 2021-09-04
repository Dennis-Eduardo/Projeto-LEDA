# Análise comparativa de algoritmos de ordenação aplicado a dados da COVID-19.

O projeto consiste das seguintes fases:

1. Preparação do dataset. Compreende um registro histórico de ocorrência de COVID-19 para todas as cidades e estados do Brasil.
   i. Você deve baixar a planilha localmente para poder processá-la no seu código Java. Atenção, quando   descompacta se torna algo bem maior.

     ii.Você deve tratar apenas com os dados mais atuais (tem um campo chamado "É a última atualização?" ou "is_last" que deve eestar marcado como True). Valores antigos não interessam

1. Gerar um arquivo formatado para ser processado na próxima fase Análise dos algoritmos de ordenação
   i. Implemente e utilize todos os algoritmos de ordenação estudados (Selection Sort, Insertion Sort, Merge Sort, Quick Sort, QuickSort com Mediana de 3, counting, e HeapSort) para ordenar os registros de acordo com os seguintes parâmetros:

- Ordenação crescente por quantidade acumulada de óbitos;
- Ordenação crescente por quantidade acumulada de casos;
- Ordenação crescente por ordem alfabética pelo nome das cidades.

    ii. Cada arquivo de saída de ordenação deve ser gerado com base no método de ordenação e no elemento ordenado. Por exemplo, para o quick sort devem ser gerado 3 arquivos: qSort_ordena_obitos.csv e qSort_ordena_casos.csv, qSort_ordena_cidades.csv. Isso deve continuar para cada um dos métodos de ordenação.

    iii. Para cada algoritmo, registre o tempo necessário para ordenar o vetor de senhas (em milissegundos).

    iv. Elabore uma tabela para comparar o tempo de execução dos algoritmos.

1. Opcional: Para a elaboração dos comparativos devem ser usados ferramentas de code profiling, como por exemplo o https://visualvm.github.io/. Elabore gráficos mostrando o consumo de tempo e memória quando da execução do algoritmo.

# Tutorial para rodar o projeto:

1. Antes de preparar os códigos do projeto e os arquivos certifique-se de estar com uma versão do Java instalado na sua maquina com o JDK 1.8 ou superior site oficial da [Oracle](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html).
2. Baixe esse repositório do gitHub em sua máquina Repositório, e abra em uma IDE, utilizamos o [EclipseIDE](https://www.eclipse.org/downloads/)
3. Os dados foram baixados a partir do site da [Brasil.io](https://brasil.io/dataset/covid19/caso_full/).
4. Baixe o dataset completo o [caso.csv](https://data.brasil.io/dataset/covid19/caso.csv.gz),(o qual ja contem os dados filtrados e prontos para uso).
5. Agora deve baixar os arquivos para a execução do programa [aqui](https://drive.google.com/file/d/10Vv8usc3-5tahOTs0Le2ZG1ytNU0LB85/view?usp=sharing), a pasta deve ser colocada em um local de facil acesso.
6. Após baixar os arquivos deve extrai-los(se nao tiver o programa recomendo baixar o [winrar](https://www.win-rar.com/start.html?&L=0), para extrair arquivos .zip), seguindo com os dois arquivos deve-se pegar o arquivo caso.csv que se encontra dentro da pasta de caso, e move-lo para dentro da pasta CovidAnalyser>data>dadosbrutos.
7. Com os dados prontos agora é executar o programa da seguinte maneira:
   + Windows : deve abrir o pronpt de comando( iniciar do windows e pesquisar por cmd e executar) irá abrir o terminal do windows
   + Linux : deve abrir o terminal do linux
8. Seguindo no terminal deve fazer o caminho até a pasta do CovidAnalyser utilizando o comando " cd destino ".(se nao souber onde esta é so olhar na pasta emcima tem o caminho Ex:C:\Users\romen\OneDrive\Área de Trabalho\CovidAnalyser os comandos devem ser 1.cd OneDrive, cd Área de trabalho, cd CovidAnalyser)
9. Apos percorrer o caminho deve ser executado o comando : java -jar CovidAnalyser.jar "destino do caminho" (Ex de destino: "C:\Users\romen\OneDrive\Área de Trabalho\CovidAnalyser")
   9.1 OBS: o destino varia do windows para o linux mas é so encontrar onde está a pasta e fazer o caminho igual o exemplo.
10. Após executar o comando o programa ira funcionar e analisar e ordenar os dados, onde devem ser criados na pasta de CovidAnalyser>data>dadosfinais, os quais possuem todas as ordenações e os 3 tipos por nome/casos/obitos, além do arquivo tempos.txt marcando o tempo de execução dos algoritmos.

OBS: Caso apos executar o comando o programa não encontrar o arquivo deve ser por causa da sua  variável de ambiente JAVA_HOME não está setada no PATH para resolver so olhar o site no [windows](https://www.oobj.com.br/bc/article/como-configurar-a-variável-de-ambiente-java_home-windows-29.html) no [lunix](https://receitasdecodigo.com.br/ubuntu/como-configurar-java_home-para-java-no-ubuntu).
   
