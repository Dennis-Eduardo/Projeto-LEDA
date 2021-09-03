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

1. Antes de preparar os códigos do projeto e os arquivos certifique-se de estar com uma versão do Java instalado na sua maquina com o JDK 1.8 ou superior site oficial da Oracle.
2. Baixe esse repositório do gitHub em sua máquina Repositório
   
