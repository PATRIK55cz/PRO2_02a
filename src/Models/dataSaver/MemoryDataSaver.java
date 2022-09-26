package Models.dataSaver;

public class MemoryDataSaver implements DataSaver<T>{
    private T data;

    @Override
    public void Save(T a) {
        data = a;
    }

    @Override
    public T Load() {
        return data;
    }
}
