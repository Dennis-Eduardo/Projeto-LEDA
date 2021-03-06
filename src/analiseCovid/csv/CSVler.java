package analiseCovid.csv;

import analiseCovid.adicionais.CovidData;
import analiseCovid.adicionais.Vector;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVler {
    public static Vector<CovidData> lerDados(String caminho) {
        String linha = "";
        boolean isFirstLine = true;
        Vector<CovidData> data = new Vector<CovidData>(1);
        try {
            FileReader fileReader = new FileReader(caminho);
            BufferedReader reader = new BufferedReader(fileReader);
            while((linha = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                data.add(new CovidData(linha));
            }
            reader.close();
            fileReader.close();
        } catch (FileNotFoundException error) {
            System.err.println("Arquivo nao encontrado.");
        } catch (IOException error) {
            System.err.println("Erro ao ler linha.");
        }
        return data;
    }
}
