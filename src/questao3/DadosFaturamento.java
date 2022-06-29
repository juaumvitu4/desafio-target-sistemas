package questao3;

import com.google.gson.annotations.SerializedName;

public class DadosFaturamento {

    @SerializedName("dia")
    public int dia;

    @SerializedName("valor")
    public Double valor;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


}
