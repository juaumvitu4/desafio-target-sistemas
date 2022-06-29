package questao3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Questao3 {
    public static void main(String[] args) throws IOException {

        String file = "src/questao3/dados.json";
        String json = new String(Files.readAllBytes(Paths.get(file)));

        Type collectionType = new TypeToken<List<DadosFaturamento>>() {
        }.getType();
        List<DadosFaturamento> faturamentos = new Gson().fromJson(json, collectionType);

        System.out.println("O maior valor para o dia 1 é de: " + FaturamentoUtil.maiorValorPorMes(faturamentos, 1));

        System.out.println("O menor valor para o dia 1 é de: " + FaturamentoUtil.menorValorPorMes(faturamentos, 1));

        System.out.println("O menor valor de todo o mes é de: " + FaturamentoUtil.menorValorDeTodos(faturamentos));

        System.out.println(String.format("Foram " + FaturamentoUtil.faturamentoMaiorQueAMedia(faturamentos, FaturamentoUtil.calculaMedia(faturamentos)) + " dias maiores que a média: %.2f", FaturamentoUtil.calculaMedia(faturamentos)));

    }
}
