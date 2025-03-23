package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;

/**
 * Fábrica concreta para criação de componentes gráficos no estilo Windows.
 * 
 * Esta classe implementa a interface GUIFactory e define a lógica para criar 
 * elementos de interface gráfica compatíveis com o ambiente Windows. 
 * 
 * Ela segue o padrão Abstract Factory, garantindo que a aplicação possa criar 
 * componentes gráficos com aparência e comportamento padronizados para esse sistema operacional.
 * Isso permite que a interface da aplicação se adapte ao ambiente em que está sendo executada.
 */
public class WindowsFactory implements GUIFactory {

    /**
     * Cria um botão estilizado para o Windows.
     * 
     * Esse método retorna um objeto da classe WindowsButton, garantindo que o 
     * botão renderizado tenha a aparência e o comportamento característicos do Windows.
     * 
     * @return uma instância de WindowsButton.
     */
    @Override
    public Button createButton() {
        return new WindowsButton();  
    }

    /**
     * Cria uma caixa de seleção estilizada para o Windows.
     * 
     * Esse método retorna uma instância de WindowsCheckbox, assegurando que a caixa de seleção 
     * renderizada tenha o design e o comportamento esperados no ambiente Windows.
     * 
     * @return uma instância de WindowsCheckbox.
     */
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();  
    }
}
