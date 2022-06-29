public class porcentagem {

    public static void main(String[] args) {


        double saoPaulo = 67.83643;
        double rioDeJaneiro = 36.67866;
        double minasGerais = 29.22988;
        double espirtoSanto = 27.16548;
        double outros = 19.84953;
        double total = (saoPaulo + rioDeJaneiro + minasGerais + espirtoSanto + outros);

        System.out.printf("total " + "%.2f%n",total);
        double pSaoPaulo = ((saoPaulo / total) * 100);
        double pRioDeJaneiro = ((rioDeJaneiro / total) * 100);
        double pMinasGerais = ((minasGerais / total) * 100);
        double pEspiritoSantos = ((espirtoSanto / total) * 100);
        double pOutros = ((outros / total) * 100);


        System.out.println(String.format("Porcentagem de São Paulo %.2f", pSaoPaulo ) + "%");
        System.out.println(String.format("Porcentagem de Rio Janeiro %.2f", pRioDeJaneiro)+ "%");
        System.out.println(String.format("Porcentagem de Minas Gerais %.2f", pMinasGerais)+ "%");
        System.out.println(String.format("Porcentagem de Espirito Santo %.2f", pEspiritoSantos)+ "%");
        System.out.println(String.format("Porcentagem de Outros % .2f", pOutros) + "%");
    }
}
