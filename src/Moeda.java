import java.util.Map;

public record Moeda( String base_code,
                     String target_code,
                     double conversion_rate,
                     double conversion_result) {
    @Override
    public String toString() {
        return String.format("Conversão de %s para %s:\nTaxa: %.4f\nValor convertido: %.2f",
                base_code, target_code, conversion_rate, conversion_result);
    }
}
