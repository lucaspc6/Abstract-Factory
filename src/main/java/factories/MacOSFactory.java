package factories;

import buttons.Button;
import buttons.MacOSButton;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;

/**
 * Fábrica concreta para criação de componentes gráficos no estilo macOS.
 * 
 * Esta classe implementa a interface GUIFactory e fornece a lógica para criar 
 * elementos de interface gráfica específicos do macOS. Ela segue o padrão Abstract Factory, 
 * permitindo que a aplicação crie botões e caixas de seleção compatíveis com esse sistema operacional.
 * 
 * Dessa forma, se a aplicação estiver rodando no macOS, esta fábrica será utilizada para garantir 
 * que os elementos gráficos sigam a aparência e comportamento esperados nesse ambiente.
 */
public class MacOSFactory implements GUIFactory {

    /**
     * Cria um botão estilizado para o macOS.
     * 
     * Quando este método é chamado, ele retorna um objeto da classe MacOSButton,
     * garantindo que o botão renderizado siga o design característico do macOS.
     * 
     * @return uma instância de MacOSButton.
     */
    @Override
    public Button createButton() {
        return new MacOSButton();  
    }

    /**
     * Cria uma caixa de seleção estilizada para o macOS.
     * 
     * Este método retorna uma instância de MacOSCheckbox, assegurando que a caixa de seleção 
     * renderizada siga a aparência nativa do macOS.
     * 
     * @return uma instância de MacOSCheckbox.
     */
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();  
    }
}
