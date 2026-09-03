# nfe-gerar-cacerts-lib

Lib Java para gerar Cadeia de Certificados para NF-e, NFC-e, MDF-e, CT-e.

Baseada no repositório <https://github.com/wmixvideo/nfe/>.

## Instalação

Adicione o repositório do jitpack ao seu arquivo `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Em seguida, adicione a dependência em seu arquivo `pom.xml`:

```xml
<dependency>
  <groupId>com.github.open-fidias</groupId>
  <artifactId>nfe-gerar-cacerts-lib</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Como usar

```java
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
```
