package Models.dataSaver;

public interface DataSaver<T> {
    void save(T a );
    T load();


}
