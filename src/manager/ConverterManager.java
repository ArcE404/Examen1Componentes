package manager;

import converter.BinaryConverter;
import converter.ConvertInterface;

import java.util.Scanner;

public class ConverterManager {
    private ConvertInterface converter;
    Scanner input = new Scanner(System.in);

    public void setConverter(ConvertInterface _converter){
        this.converter = _converter;
    }

    public void runToDecimal(String _data, String _type){
        int result = this.converter.toDecimal(_data);
        System.out.println("El numero " + _data + " en "+  _type + "es: " + result + " en decimal");
    }

    public void runFromDecimal(int _data, String _type){
        String result = this.converter.fromDecima(_data);
        System.out.println("El numero " + _data + " en decimal es: " + result + " en " + _type );
    }

    public void run(){
        if(converter.getClass() == BinaryConverter.class){
            menu("Binario");
        }else{
            menu("Hexadecimal");
        }
    }

    private void menu(String _type){
        System.out.println("Quiere convertir de "+_type+" a decimal (1) o de decimal a "+_type+" (2)?");
        int option = input.nextInt();
        if(option == 1){
            System.out.println("Escriba el numero "+_type+" que quiere converir a decimal");
            String numero = input.next();
            runToDecimal(numero, _type);
        }else if(option == 2){
            System.out.println("Escriba el numero decimal que quiere convertia a "+_type);
            int numero = input.nextInt();
            runFromDecimal(numero, _type);
        }else{
            System.out.println("Esta opcion no existe");
        }
    }
}
