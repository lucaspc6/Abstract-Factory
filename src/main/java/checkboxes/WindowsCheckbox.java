package checkboxes;

/**
 * Implementação concreta da interface Checkbox para o sistema Windows.
 * 
 * Esta classe representa uma caixa de seleção estilizada para o ambiente Windows, garantindo que,
 * ao ser renderizada, ela siga o padrão visual e comportamental esperado para esse sistema operacional.
 * 
 * O uso desse design permite criar interfaces gráficas flexíveis e compatíveis com diferentes plataformas.
 */
public class WindowsCheckbox implements Checkbox {  

    /**
     * Renderiza a caixa de seleção no estilo Windows.
     * 
     * Em um ambiente gráfico real, esse método seria responsável por exibir uma caixa de seleção com
     * a aparência nativa do Windows. Aqui, para fins de demonstração, apenas imprime uma mensagem no console.
     */
    @Override  
    public void paint() {  
        System.out.println("You have created WindowsCheckbox."); // Simula a renderização da caixa de seleção no Windows.
    }  
}

