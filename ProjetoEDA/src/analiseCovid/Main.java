package analiseCovid;

import analiseCovid.estruturas.*;
import analiseCovid.csv.*;
import analiseCovid.adicionais.*;

import java.util.Arrays;

public class Main {
    
    public static void calcularCountingSort(String dadosEntrada, String dadosFinais, Timer timer) {

        Vector<CovidData> dados;

        System.out.println("\nCalculando os melhores casos do CountingSort...");

        // Melhores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MELHOR.replace("{0}", dadosEntrada));
        timer.setTemporaryInitialTime();
        dados = CountingSort.ordenarPorObitos(dados);
        timer.setTemporaryFinalTime();
        timer.setCountingTimeObitos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, dadosFinais + "/countingsort-melhor-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MELHOR.replace("{0}", dadosEntrada));
        timer.setTemporaryInitialTime();
        dados = CountingSort.ordenarPorCasos(dados);
        timer.setTemporaryFinalTime();
        timer.setCountingTimeCasos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, dadosFinais + "/countingsort-melhor-casosconfirmados.csv", Strings.CABECALHO);

        System.out.println("Calculando os piores casos do CountingSort...");

        // Piores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_PIOR.replace("{0}", dadosEntrada));
        timer.setTemporaryInitialTime();
        dados = CountingSort.ordenarPorObitos(dados);
        timer.setTemporaryFinalTime();
        timer.setCountingTimeObitos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, dadosFinais + "/countingsort-pior-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_PIOR.replace("{0}", dadosEntrada));
        timer.setTemporaryInitialTime();
        dados = CountingSort.ordenarPorCasos(dados);
        timer.setTemporaryFinalTime();
        timer.setCountingTimeCasos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, dadosFinais + "/countingsort-pior-casosconfirmados.csv", Strings.CABECALHO);

        System.out.println("Calculando os medios casos do CountingSort...");

        // Médios Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MEDIO.replace("{0}", dadosEntrada));
        timer.setTemporaryInitialTime();
        dados = CountingSort.ordenarPorObitos(dados);
        timer.setTemporaryFinalTime();
        timer.setCountingTimeObitos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, dadosFinais + "/countingsort-medio-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MEDIO.replace("{0}", dadosEntrada));
        timer.setTemporaryInitialTime();
        dados = CountingSort.ordenarPorCasos(dados);
        timer.setTemporaryFinalTime();
        timer.setCountingTimeCasos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, dadosFinais + "/countingsort-medio-casosconfirmados.csv", Strings.CABECALHO);

        System.out.println("CountingSort calculado com sucesso!");

    }

    public static void calcularHeapSort(String pathDadosBrutos, String pathDadosFinais, Timer timer) {

        Vector<CovidData> dados;

        System.out.println("\nCalculando os melhores casos do HeapSort...");

        // Melhores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        HeapSort.sort(dados, HeapSort.OBITOS);
        timer.setTemporaryFinalTime();
        timer.setHeapTimeObitos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/heapsort-melhor-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        HeapSort.sort(dados, HeapSort.CASOS);
        timer.setTemporaryFinalTime();
        timer.setHeapTimeCasos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/heapsort-melhor-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        HeapSort.sort(dados, HeapSort.CIDADES);
        timer.setTemporaryFinalTime();
        timer.setHeapTimeCidades(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/heapsort-melhor-cidades.csv", Strings.CABECALHO);

        System.out.println("Calculando os piores casos do HeapSort...");

        // Piores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        HeapSort.sort(dados, HeapSort.OBITOS);
        timer.setTemporaryFinalTime();
        timer.setHeapTimeObitos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/heapsort-pior-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        HeapSort.sort(dados, HeapSort.CASOS);
        timer.setTemporaryFinalTime();
        timer.setHeapTimeCasos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/heapsort-pior-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        HeapSort.sort(dados, HeapSort.CIDADES);
        timer.setTemporaryFinalTime();
        timer.setHeapTimeCidades(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/heapsort-pior-cidades.csv", Strings.CABECALHO);

        System.out.println("Calculando os medios casos do HeapSort...");

        // Médios Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        HeapSort.sort(dados, HeapSort.OBITOS);
        timer.setTemporaryFinalTime();
        timer.setHeapTimeObitos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/heapsort-medio-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        HeapSort.sort(dados, HeapSort.CASOS);
        timer.setTemporaryFinalTime();
        timer.setHeapTimeCasos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/heapsort-medio-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        HeapSort.sort(dados, HeapSort.CIDADES);
        timer.setTemporaryFinalTime();
        timer.setHeapTimeCidades(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/heapsort-medio-cidades.csv", Strings.CABECALHO);

        System.out.println("HeapSort calculado com sucesso!");

    }

    public static void calcularInsertionSort(String pathDadosBrutos, String pathDadosFinais, Timer timer) {

        Vector<CovidData> dados;

        System.out.println("\nCalculando os melhores casos do InsertionSort...");

        // Melhores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        InsertionSort.ordenarPorObitos(dados);
        timer.setTemporaryFinalTime();
        timer.setInsertionTimeObitos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/insertionsort-melhor-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        InsertionSort.ordenarPorCasos(dados);
        timer.setTemporaryFinalTime();
        timer.setInsertionTimeCasos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/insertionsort-melhor-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        InsertionSort.ordenarPorCasos(dados);
        timer.setTemporaryFinalTime();
        timer.setInsertionTimeCidades(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/insertionsort-melhor-cidades.csv", Strings.CABECALHO);

        System.out.println("Calculando os piores casos do InsertionSort...");

        // Piores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        InsertionSort.ordenarPorObitos(dados);
        timer.setTemporaryFinalTime();
        timer.setInsertionTimeObitos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/insertionsort-pior-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        InsertionSort.ordenarPorCasos(dados);
        timer.setTemporaryFinalTime();
        timer.setInsertionTimeCasos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/insertionsort-pior-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        InsertionSort.ordenarPorNomeDasCidades(dados);
        timer.setTemporaryFinalTime();
        timer.setInsertionTimeCidades(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/insertionsort-pior-cidades.csv", Strings.CABECALHO);

        System.out.println("Calculando os medios casos do InsertionSort...");

        // Médios Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        InsertionSort.ordenarPorObitos(dados);
        timer.setTemporaryFinalTime();
        timer.setInsertionTimeObitos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/insertionsort-medio-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        InsertionSort.ordenarPorCasos(dados);
        timer.setTemporaryFinalTime();
        timer.setInsertionTimeCasos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/insertionsort-medio-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        InsertionSort.ordenarPorNomeDasCidades(dados);
        timer.setTemporaryFinalTime();
        timer.setInsertionTimeCidades(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/insertionsort-medio-cidades.csv", Strings.CABECALHO);

        System.out.println("InsertionSort calculado com sucesso!");

    }

    public static void calcularMergeSort(String pathDadosBrutos, String pathDadosFinais, Timer timer) {
        Vector<CovidData> dados;

        System.out.println("\nCalculando os melhores casos do MergeSort...");

        // Melhores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        MergeSort.sort(dados, 0, dados.size() - 1, MergeSort.OBITOS);
        timer.setTemporaryFinalTime();
        timer.setMergeTimeObitos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/mergesort-melhor-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        MergeSort.sort(dados, 0, dados.size() - 1, MergeSort.CASOS);
        timer.setTemporaryFinalTime();
        timer.setMergeTimeCasos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/mergesort-melhor-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        MergeSort.sort(dados, 0, dados.size() - 1, MergeSort.CIDADES);
        timer.setTemporaryFinalTime();
        timer.setMergeTimeCidades(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/mergesort-melhor-cidades.csv", Strings.CABECALHO);

        System.out.println("Calculando os piores casos do MergeSort...");

        // Piores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        MergeSort.sort(dados, 0, dados.size() - 1, MergeSort.OBITOS);
        timer.setTemporaryFinalTime();
        timer.setMergeTimeObitos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/mergesort-pior-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        MergeSort.sort(dados, 0, dados.size() - 1, MergeSort.CASOS);
        timer.setTemporaryFinalTime();
        timer.setMergeTimeCasos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/mergesort-pior-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        MergeSort.sort(dados, 0, dados.size() - 1, MergeSort.CIDADES);
        timer.setTemporaryFinalTime();
        timer.setMergeTimeCidades(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/mergesort-pior-cidades.csv", Strings.CABECALHO);

        System.out.println("Calculando os médios casos do MergeSort...");

        // Medios Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        MergeSort.sort(dados, 0, dados.size() - 1, MergeSort.OBITOS);
        timer.setTemporaryFinalTime();
        timer.setMergeTimeObitos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/mergesort-medio-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        MergeSort.sort(dados, 0, dados.size() - 1, MergeSort.CASOS);
        timer.setTemporaryFinalTime();
        timer.setMergeTimeCasos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/mergesort-medio-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        MergeSort.sort(dados, 0, dados.size() - 1, MergeSort.CIDADES);
        timer.setTemporaryFinalTime();
        timer.setMergeTimeCidades(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/mergesort-medio-cidades.csv", Strings.CABECALHO);

        System.out.println("MergeSort calculado com sucesso!");

    }

    public static void calcularQuickSortMedianaDeTresSort(String pathDadosBrutos, String pathDadosFinais, Timer timer) {
        Vector<CovidData> dados;

        System.out.println("\nCalculando os melhores casos do QuickSort Mediana de Três...");

        // Melhores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        Quick3Sort.sort(dados, 0, dados.size() - 1, Quick3Sort.OBITOS);
        timer.setTemporaryFinalTime();
        timer.setQUickMedTimeObitos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quick3sort-melhor-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        Quick3Sort.sort(dados, 0, dados.size() - 1, Quick3Sort.CASOS);
        timer.setTemporaryFinalTime();
        timer.setQUickMedTimeCasos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quick3sort-melhor-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        Quick3Sort.sort(dados, 0, dados.size() - 1, Quick3Sort.CIDADES);
        timer.setTemporaryFinalTime();
        timer.setQUickMedTimeCidades(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quick3sort-melhor-cidades.csv", Strings.CABECALHO);

        System.out.println("Calculando os piores casos do QuickSort Mediana de Tres...");

        // Piores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        Quick3Sort.sort(dados, 0, dados.size() - 1, Quick3Sort.OBITOS);
        timer.setTemporaryFinalTime();
        timer.setQUickMedTimeObitos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quick3sort-pior-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        Quick3Sort.sort(dados, 0, dados.size() - 1, Quick3Sort.CASOS);
        timer.setTemporaryFinalTime();
        timer.setQUickMedTimeCasos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quick3sort-pior-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        Quick3Sort.sort(dados, 0, dados.size() - 1, Quick3Sort.CIDADES);
        timer.setTemporaryFinalTime();
        timer.setQUickMedTimeCidades(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quick3sort-pior-cidades.csv", Strings.CABECALHO);

        System.out.println("Calculando os medios casos do QuickSort Mediana de Tres...");

        // Medios Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        Quick3Sort.sort(dados, 0, dados.size() - 1, Quick3Sort.OBITOS);
        timer.setTemporaryFinalTime();
        timer.setQUickMedTimeObitos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quick3sort-medio-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        Quick3Sort.sort(dados, 0, dados.size() - 1, Quick3Sort.CASOS);
        timer.setTemporaryFinalTime();
        timer.setQUickMedTimeCasos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quick3sort-medio-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        Quick3Sort.sort(dados, 0, dados.size() - 1, Quick3Sort.CIDADES);
        timer.setTemporaryFinalTime();
        timer.setQUickMedTimeCidades(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quick3sort-medio-cidades.csv", Strings.CABECALHO);

        System.out.println("QuickSort Mediana de Tres calculado com sucesso!");

    }

    public static void calcularQuickSort(String pathDadosBrutos, String pathDadosFinais, Timer timer) {
        Vector<CovidData> dados;

        System.out.println("\nCalculando os melhores casos do QuickSort...");

        // Melhores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        QuickSort.sort(dados, 0, dados.size() - 1, QuickSort.OBITOS);
        timer.setTemporaryFinalTime();
        timer.setQuickTimeObitos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quicksort-melhor-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        QuickSort.sort(dados, 0, dados.size() - 1, QuickSort.CASOS);
        timer.setTemporaryFinalTime();
        timer.setQuickTimeCasos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quicksort-melhor-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        QuickSort.sort(dados, 0, dados.size() - 1, QuickSort.CIDADES);
        timer.setTemporaryFinalTime();
        timer.setQuickTimeCidades(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quicksort-melhor-cidades.csv", Strings.CABECALHO);

        System.out.println("Calculando os piores casos do QuickSort...");

        // Piores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        QuickSort.sort(dados, 0, dados.size() - 1, QuickSort.OBITOS);
        timer.setTemporaryFinalTime();
        timer.setQuickTimeObitos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quicksort-pior-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        QuickSort.sort(dados, 0, dados.size() - 1, QuickSort.CASOS);
        timer.setTemporaryFinalTime();
        timer.setQuickTimeCasos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quicksort-pior-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        QuickSort.sort(dados, 0, dados.size() - 1, QuickSort.CIDADES);
        timer.setTemporaryFinalTime();
        timer.setQuickTimeCidades(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quicksort-pior-cidades.csv", Strings.CABECALHO);

        System.out.println("Calculando os medios casos do QuickSort...");

        // Medios Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        QuickSort.sort(dados, 0, dados.size() - 1, QuickSort.OBITOS);
        timer.setTemporaryFinalTime();
        timer.setQuickTimeObitos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quicksort-medio-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        QuickSort.sort(dados, 0, dados.size() - 1, QuickSort.CASOS);
        timer.setTemporaryFinalTime();
        timer.setQuickTimeCasos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quicksort-medio-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        QuickSort.sort(dados, 0, dados.size() - 1, QuickSort.CIDADES);
        timer.setTemporaryFinalTime();
        timer.setQuickTimeCidades(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/quicksort-medio-cidades.csv", Strings.CABECALHO);

        System.out.println("QuickSort com sucesso!");

    }

    public static void calcularSelectionSort(String pathDadosBrutos, String pathDadosFinais, Timer timer) {
        Vector<CovidData> dados;

        System.out.println("\nCalculando os melhores casos do SelectionSort...");

        // Melhores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        SelectionSort.ordenarPorObitos(dados, SelectionSort.INCREASE);
        timer.setTemporaryFinalTime();
        timer.setselectionTimeObitos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/selectionsort-melhor-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        SelectionSort.ordenarPorCasos(dados, SelectionSort.INCREASE);
        timer.setTemporaryFinalTime();
        timer.setselectionTimeCasos(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/selectionsort-melhor-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_MELHOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        SelectionSort.ordenarPorNomeDasCidades(dados, SelectionSort.INCREASE);
        timer.setTemporaryFinalTime();
        timer.setselectionTimeCidades(Timer.MELHOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/selectionsort-melhor-cidades.csv", Strings.CABECALHO);

        System.out.println("Calculando os piores casos do SelectionSort...");

        // Piores Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        SelectionSort.ordenarPorObitos(dados, SelectionSort.INCREASE);
        timer.setTemporaryFinalTime();
        timer.setselectionTimeObitos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/selectionsort-pior-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        SelectionSort.ordenarPorCasos(dados, SelectionSort.INCREASE);
        timer.setTemporaryFinalTime();
        timer.setselectionTimeCasos(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/selectionsort-pior-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_PIOR.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        SelectionSort.ordenarPorNomeDasCidades(dados, SelectionSort.INCREASE);
        timer.setTemporaryFinalTime();
        timer.setselectionTimeCidades(Timer.PIOR, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/selectionsort-pior-cidades.csv", Strings.CABECALHO);

        System.out.println("Calculando os médios casos do SelectionSort...");

        // Medios Casos

        dados = CSVler.lerDados(Strings.PATH_OBITOS_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        SelectionSort.ordenarPorObitos(dados, SelectionSort.INCREASE);
        timer.setTemporaryFinalTime();
        timer.setselectionTimeObitos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/selectionsort-medio-obitos.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CONFIRMADOS_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        SelectionSort.ordenarPorCasos(dados, SelectionSort.INCREASE);
        timer.setTemporaryFinalTime();
        timer.setselectionTimeCasos(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/selectionsort-medio-casosconfirmados.csv", Strings.CABECALHO);

        dados = CSVler.lerDados(Strings.PATH_CIDADES_MEDIO.replace("{0}", pathDadosBrutos));
        timer.setTemporaryInitialTime();
        SelectionSort.ordenarPorNomeDasCidades(dados, SelectionSort.INCREASE);
        timer.setTemporaryFinalTime();
        timer.setselectionTimeCidades(Timer.MEDIO, timer.getTemporaryFinalTime());
        CSVescrever.escreverDados(dados, pathDadosFinais + "/selectionsort-medio-cidades.csv", Strings.CABECALHO);

        System.out.println("SelectionSort com sucesso!");

    }

    

    public static void ordenarDadosECalcularTempos(String dadosLimpos, String dadosFinais) {
        Timer timer = new Timer();
        calcularCountingSort(dadosLimpos, dadosFinais, timer);
        calcularHeapSort(dadosLimpos, dadosFinais, timer);
        calcularInsertionSort(dadosLimpos, dadosFinais, timer);
        calcularMergeSort(dadosLimpos, dadosFinais, timer);
        calcularQuickSort(dadosLimpos, dadosFinais, timer);
        calcularSelectionSort(dadosLimpos, dadosFinais, timer);
        calcularQuickSortMedianaDeTresSort(dadosLimpos, dadosFinais, timer);

        System.out.println("\nEscrevendo tempos...");
        TimerWriter.writeTime(timer, dadosFinais + "/tempos.txt");
        System.out.println("Tempos escritos com sucesso!...");
    }
    
    public static void criarArquivosDeDadosBrutos(String dadosEntrada) {

        Vector<CovidData> dados;

        System.out.println("Lendo arquivo - casos");

        // Lendo arquivo bruto, filtrando e escrevendo o aquivo filtrado.
        dados = CSVler.lerDados(Strings.PATH_DADOS.replace("{0}", dadosEntrada));
        dados = CSVlimpar.filtrarDados(dados);
        CSVescrever.escreverDados(dados, Strings.PATH_DADOS_LIMPOS.replace("{0}", dadosEntrada), Strings.CABECALHO);

        System.out.println("Calculando e escrevendo melhores, piores, e medios casos de obitos.");

        // Medio - Obito
        dados = CSVler.lerDados(Strings.PATH_DADOS_LIMPOS.replace("{0}", dadosEntrada));
        CSVescrever.escreverDados(dados, Strings.PATH_OBITOS_MEDIO.replace("{0}", dadosEntrada), Strings.CABECALHO);

        // Melhor - Obito
        SelectionSort.ordenarPorObitos(dados, SelectionSort.INCREASE);
        CSVescrever.escreverDados(dados, Strings.PATH_OBITOS_MELHOR.replace("{0}", dadosEntrada), Strings.CABECALHO);

        // Pior - Obito
        SelectionSort.ordenarPorObitos(dados, SelectionSort.DECREASE);
        CSVescrever.escreverDados(dados, Strings.PATH_OBITOS_PIOR.replace("{0}", dadosEntrada), Strings.CABECALHO);

        System.out.println("Calculando e escrevendo melhores, piores, e medios casos de casos confirmados.");

        // Medio - Casos
        dados = CSVler.lerDados(Strings.PATH_DADOS_LIMPOS.replace("{0}", dadosEntrada));
        CSVescrever.escreverDados(dados, Strings.PATH_CONFIRMADOS_MEDIO.replace("{0}", dadosEntrada), Strings.CABECALHO);

        // Melhor - Casos
        SelectionSort.ordenarPorCasos(dados, SelectionSort.INCREASE);
        CSVescrever.escreverDados(dados, Strings.PATH_CONFIRMADOS_MELHOR.replace("{0}", dadosEntrada), Strings.CABECALHO);

        // Pior - Casos
        SelectionSort.ordenarPorCasos(dados, SelectionSort.DECREASE);
        CSVescrever.escreverDados(dados, Strings.PATH_CONFIRMADOS_PIOR.replace("{0}", dadosEntrada), Strings.CABECALHO);

        System.out.println("Calculando e escrevendo melhores, piores, e medios casos de cidades.");

        // Medio - Cidades
        dados = CSVler.lerDados(Strings.PATH_DADOS_LIMPOS.replace("{0}", dadosEntrada));
        CSVescrever.escreverDados(dados, Strings.PATH_CIDADES_MEDIO.replace("{0}", dadosEntrada), Strings.CABECALHO);

        // Melhor - Cidades
        SelectionSort.ordenarPorNomeDasCidades(dados, SelectionSort.INCREASE);
        CSVescrever.escreverDados(dados, Strings.PATH_CIDADES_MELHOR.replace("{0}", dadosEntrada), Strings.CABECALHO);

        // Pior - Cidades
        SelectionSort.ordenarPorNomeDasCidades(dados, SelectionSort.DECREASE);
        CSVescrever.escreverDados(dados, Strings.PATH_CIDADES_PIOR.replace("{0}", dadosEntrada), Strings.CABECALHO);

        System.out.println("Finalizando a manipulacao dos dados.");

    }
    public static void main(String[] args) {

        System.out.println("Iniciando...");

        String dadosEntrada = args[0] + "/data/dadosbrutos";
        String dadosFinais = args[0] + "/data/dadosfinais";

        criarArquivosDeDadosBrutos(dadosEntrada);
        ordenarDadosECalcularTempos(dadosEntrada, dadosFinais);

        System.out.println("Finalizando...");
    }


}