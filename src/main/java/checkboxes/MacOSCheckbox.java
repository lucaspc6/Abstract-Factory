package checkboxes;

/**
 * Implementação concreta da interface Checkbox para o sistema macOS.
 * 
 * Essa classe representa uma caixa de seleção estilizada para o ambiente macOS, garantindo que,
 * ao ser renderizada, siga o padrão visual e comportamental esperado para esse sistema operacional.
 * 
 * Esse design permite criar componentes gráficos flexíveis e desacoplados, facilitando a implementação 
 * de diferentes estilos de UI para múltiplas plataformas.
 */
public class MacOSCheckbox implements Checkbox {  

    /**
     * Renderiza a caixa de seleção no estilo macOS.
     * 
     * Em uma aplicação real, esse método seria responsável por desenhar uma caixa de seleção com o design do macOS 
     * dentro de uma interface gráfica. Aqui, para fins de demonstração, apenas exibe uma mensagem no console.
     */
    @Override  
    public void paint() {  
        System.out.println("You have created MacOSCheckbox."); // Simula a criação da caixa de seleção no macOS.
    }  
}  

