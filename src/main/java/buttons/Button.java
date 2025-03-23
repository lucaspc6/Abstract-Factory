package buttons;

/**
 * A interface Button define um contrato para a criação de botões em uma interface gráfica.
 * Qualquer classe que implemente esta interface deve fornecer sua própria implementação do método `paint()`,
 * permitindo a personalização do desenho do botão conforme o estilo desejado (ex: Windows, macOS, Linux).
 *
 * Essa abordagem facilita a criação de componentes gráficos flexíveis e desacoplados do sistema operacional.
 */
public interface Button {
    /**
     * Método responsável por renderizar o botão na interface gráfica.
     * Cada implementação desse método definirá a aparência e o comportamento do botão.
     */
    void paint();
}

