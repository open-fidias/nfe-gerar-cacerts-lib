package br.com.fidias.nfe.cacerts;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFLog;
import com.fincatto.documentofiscal.utils.DFCadeiaCertificados;
import java.io.File;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author atila
 */
public class App {

    public static void main(String[] args) {
        try {
            System.out.println("baixando arquivos produção ...");
            final byte[] geraCadeiaCertificados = DFCadeiaCertificados.geraCadeiaCertificados(
                    DFAmbiente.PRODUCAO, "senha");
            FileUtils.writeByteArrayToFile(new File("/tmp/producao.cacerts"), geraCadeiaCertificados);
            System.out.println("arquivos produção baixados");
        } catch (Exception e) {
            DFLog.getLogger(App.class).error(null, e);
        }
    }
}
