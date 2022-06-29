package questao3;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FaturamentoUtil {

    public static Double menorValorPorMes(List<DadosFaturamento> faturamentos, int diaDoMes) {
        var menorValor =  faturamentos
                .stream()
                .filter(e -> e.getDia() == diaDoMes)
                .map(el -> el.getValor())
                .collect(Collectors.toList());

        Collections.sort(menorValor);
        return menorValor.get(0);

    }

    public static Double maiorValorPorMes(List<DadosFaturamento> faturamentos, int diaDoMes) {
        var menorValor =  faturamentos
                .stream()
                .filter(e -> e.getDia() == diaDoMes)
                .map(el -> el.getValor())
                .collect(Collectors.toList());

        Collections.sort(menorValor);
        return menorValor.get(menorValor.size() - 1);
    }

    public static Double menorValorDeTodos(List<DadosFaturamento> faturamentos) {
        var menorValor =  faturamentos
                .stream()
                .map(el -> el.getValor())
                .collect(Collectors.toList());

        Collections.sort(menorValor);
        return menorValor.get(0);
    }

    public static Integer faturamentoMaiorQueAMedia(List<DadosFaturamento> faturamentos, double media) {
        int quantidadeMaiorQueAMedia = 0;

        for (DadosFaturamento faturamento: faturamentos) {
            if(faturamento.getValor() > media) {
                quantidadeMaiorQueAMedia ++;
            }

        }
        return quantidadeMaiorQueAMedia;
    }

    public static Double calculaMedia(List<DadosFaturamento> faturamentos) {

        Double sum = faturamentos.stream()
                .map(e -> e.getValor())
                .mapToDouble(Double::doubleValue)
                .sum();
        return sum / faturamentos.size();
    }
}
