package buttons;

/**
 * Implementação concreta da interface Button para o sistema MacOS.
 * 
 * Esta classe representa um botão estilizado para o ambiente MacOS, garantindo que,
 * ao ser renderizado, siga a aparência e o comportamento esperados para este sistema operacional.
 */
public class MacOSButton implements Button {

    /**
     * Renderiza o botão na interface gráfica.
     * 
     * No contexto real, esse método poderia ser responsável por desenhar um botão com a estética do MacOS
     * em uma GUI. Aqui, para fins de demonstração, apenas exibe uma mensagem no console.
     */
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton."); // Simulação da renderização do botão MacOS.
    }
}


