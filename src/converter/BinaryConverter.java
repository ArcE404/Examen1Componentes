package converter;

public class BinaryConverter implements ConvertInterface {

    @Override
    public String fromDecima(int _data) {
        return Integer.toBinaryString(_data);
    }

    @Override
    public int toDecimal(String _data) {
        return Integer.parseInt(_data, 2);
    }
}
