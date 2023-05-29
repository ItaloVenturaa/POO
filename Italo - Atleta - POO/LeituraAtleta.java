//Nome: Italo Pereira Ventura -  RA: 2467259

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class LeituraAtleta {

    public String entDados(String rotulo) {

        System.out.println(rotulo);
        String resp = "";

        InputStreamReader tec = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(tec);

        try {
            resp = buff.readLine();
        } catch (IOException ioe) {
            System.out.println("\n ERRO NA INCERCAO DE DADO");
        }

        return resp;
    }

}
