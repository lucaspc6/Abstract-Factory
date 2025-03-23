package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

/**
 * A classe Application atua como um cliente para a fábrica abstrata (GUIFactory).
 * Ela utiliza a fábrica fornecida para criar componentes gráficos (botão e caixa de seleção)
 * sem depender diretamente de implementações específicas.
 * 
 * Isso permite que a aplicação funcione com diferentes estilos de interface gráfica
 * (exemplo: Windows, macOS, Linux) sem modificar o código da classe.
 */
public class Application {
    private Button button;    // Botão da interface gráfica, criado dinamicamente.
    private Checkbox checkbox; // Caixa de seleção da interface gráfica, criada dinamicamente.

    /**
     * Construtor da aplicação.
     * Recebe uma fábrica concreta (GUIFactory), que determina o estilo dos componentes visuais.
     * Essa abordagem segue o padrão Abstract Factory, garantindo flexibilidade e desacoplamento.
     *
     * @param factory Uma fábrica específica que cria os componentes gráficos.
     */
    public Application(GUIFactory factory) {
        button = factory.createButton();  // Instancia um botão com base na fábrica fornecida.
        checkbox = factory.createCheckbox(); // Instancia uma caixa de seleção com base na fábrica fornecida.
    }

    /**
     * Renderiza os componentes gráficos da aplicação.
     * Chama os métodos de desenho do botão e da caixa de seleção para exibição na tela.
     */
    public void paint() {
        button.paint();    // Aciona o método de desenho do botão.
        checkbox.paint();  // Aciona o método de desenho da caixa de seleção.
    }
}
