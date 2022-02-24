import java.util.List;

public interface ISaveable {
    void read(List<String> values);
    List<String> write();
}
