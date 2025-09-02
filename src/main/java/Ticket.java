import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Ticket {
    private int value;

    public boolean isLucky() {
        return true;
    }
}
