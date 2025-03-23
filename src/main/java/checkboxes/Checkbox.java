package checkboxes;

/**
 * Interface que define o comportamento padrão para caixas de seleção em uma interface gráfica.
 * 
 * Qualquer classe que implemente essa interface deve fornecer sua própria implementação do método `paint()`,
 * garantindo que a caixa de seleção seja renderizada de acordo com o estilo do sistema operacional ou tema escolhido.
 * 
 * Esse design permite criar componentes reutilizáveis e independentes da plataforma.
 */
public interface Checkbox {  

    /**
     * Renderiza a caixa de seleção na interface gráfica.
     * 
     * A implementação desse método pode variar conforme o sistema operacional (ex: Windows, macOS, Linux)
     * ou conforme o design desejado. Em uma aplicação real, isso poderia envolver a criação de um
     * componente gráfico em um framework GUI.
     */
    void paint();  
}
