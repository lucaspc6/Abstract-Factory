package buttons;

/**
 * Implementação concreta da interface Button para o sistema Windows.
 * 
 * Esta classe representa um botão estilizado para o ambiente Windows, garantindo que,
 * ao ser renderizado, ele siga a aparência e o comportamento esperados para esse sistema operacional.
 * 
 * O uso dessa abordagem permite a criação de interfaces gráficas flexíveis e independentes da plataforma.
 */
public class WindowsButton implements Button {

    /**
     * Renderiza o botão na interface gráfica.
     * 
     * Em um ambiente real, esse método seria responsável por exibir um botão com a estética do Windows
     * em uma GUI. Aqui, para fins de demonstração, apenas imprime uma mensagem no console.
     */
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton."); // Simulação da renderização do botão no Windows.
    }
}
