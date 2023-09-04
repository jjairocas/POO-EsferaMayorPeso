import java.util.*;

public class EsferaMayorPeso {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ESFERA A:");
        int PesoEsferaA= input.nextInt();
        System.out.println("ESFERA B:");
        int PesoEsferaB= input.nextInt();
        System.out.println("ESFERA C:");
        int PesoEsferaC= input.nextInt();

        int EsferaMayor;

        if((PesoEsferaA>PesoEsferaB) && (PesoEsferaA>PesoEsferaC)){
            EsferaMayor=PesoEsferaA;
            System.out.println("LA ESFERA DE MAYOR PESO ES LA ESFERA A DE:"+EsferaMayor+"gr");
        }
        else if((PesoEsferaB>PesoEsferaA) && (PesoEsferaB>PesoEsferaC)){
            EsferaMayor=PesoEsferaB;
            System.out.println("LA ESFERA DE MAYOR PESO ES LA ESFERA B DE:"+EsferaMayor+"gr");
        }
        else if((PesoEsferaC>PesoEsferaA) && (PesoEsferaC>PesoEsferaB)){
            EsferaMayor=PesoEsferaC;
            System.out.println("LA ESFERA DE MAYOR PESO ES LA ESFERA C DE: "+EsferaMayor+"gr");
        }

    }
}