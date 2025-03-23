import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

/*
 * O padrão Abstract Factory permite criar famílias de objetos (neste caso, botões e caixas de seleção)
 * de forma flexível e desacoplada da implementação concreta.
 * 
 * Dependendo do sistema operacional em uso, uma fábrica específica (MacOSFactory ou WindowsFactory) 
 * é escolhida para criar os componentes gráficos adequados.
 * 
 * A interface GUIFactory serve como um contrato que define os métodos para criar os componentes gráficos.
 * As implementações concretas dessas fábricas fornecem as versões específicas dos componentes 
 * de acordo com o sistema operacional.
 */

/**
 * A classe Demo é responsável por configurar e executar a aplicação,
 * criando a interface gráfica de acordo com o sistema operacional detectado.
 * 
 * Ela utiliza o padrão Abstract Factory para criar os componentes gráficos adequados 
 * (botões e caixas de seleção) conforme o sistema operacional.
 */
public class Demo {

    /**
     * Configura a aplicação, selecionando a fábrica correta com base no sistema operacional.
     * 
     * Esse método determina se o sistema operacional é MacOS ou Windows, e, com isso, escolhe 
     * a fábrica correspondente para criar os componentes gráficos.
     * 
     * @return a aplicação configurada com os componentes gráficos do sistema operacional.
     */
    private static Application configureApplication() {
        Application app;  // Declaração da aplicação, onde a interface gráfica será desenhada.
        GUIFactory factory;  // Declaração da fábrica que criará os componentes gráficos.
        
        // Obtém o nome do sistema operacional para decidir qual fábrica usar.
        String osName = System.getProperty("os.name").toLowerCase();
        
        // Verifica se o sistema é MacOS. Se for, usa a fábrica MacOSFactory.
        // Caso contrário, usa a WindowsFactory.
        if (osName.contains("mac")) {
            factory = new MacOSFactory();  // Cria a fábrica do MacOS.
        } else {
            factory = new WindowsFactory();  // Cria a fábrica do Windows.
        }
        
        // Cria a aplicação com a fábrica escolhida e seus respectivos componentes gráficos.
        app = new Application(factory);  
        return app;  // Retorna a aplicação configurada.
    }

    /**
     * Método principal da aplicação.
     * 
     * Esse método chama o método de configuração da aplicação e, em seguida,
     * desenha a interface gráfica com base no sistema operacional e nos componentes selecionados.
     * 
     * @param args argumentos de linha de comando (não utilizados nesse caso).
     */
    public static void main(String[] args) {
        Application app = configureApplication();  // Configura a aplicação.
        app.paint();  // Desenha a interface gráfica com os componentes configurados.
    }
}
