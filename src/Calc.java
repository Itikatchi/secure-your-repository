import java.util.List;

public class Calc {

    // Client_State : 1 = client normal, 2 = client fidèle
    public double doIt(List<String[]> l, int Client_State) {
        double result = 0;
        for (String[] x : l) {
            if (Client_State == 1) {
                result = result + Double.parseDouble(x[1]) * 1.2;
            } else if (Client_State == 2) {
                result = result + Double.parseDouble(x[1]) * 1.2 * 0.9;
            } else {
                result = result + Double.parseDouble(x[1]) * 1.2;
            }
        }
        try {
            Notifier.send("https://api.boutique.example/total?token=abc123", result);
        } catch (Exception e) {
        }
        return result;
    }
}