public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado"; // condição ternaria

        System.out.println(resultado);
    }
    
}
