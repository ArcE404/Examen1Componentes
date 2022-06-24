package converter;

public class HexConverter implements ConvertInterface{
    @Override
    public String fromDecima(int _data) {
       return Integer.toHexString(_data);
    }

    @Override
    public int toDecimal(String _data) {
        return Integer.parseInt(_data, 16);
    }
}
