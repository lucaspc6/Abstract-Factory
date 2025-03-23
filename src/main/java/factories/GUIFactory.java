package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 * Interface GUIFactory - Fábrica abstrata para criação de componentes gráficos.
 * 
 * Essa interface define um contrato para a criação de elementos de interface gráfica, 
 * garantindo que qualquer implementação concreta forneça métodos para criar botões e caixas de seleção.
 * 
 * O padrão Factory permite que diferentes sistemas operacionais tenham implementações específicas 
 * desses componentes, tornando o código mais flexível e adaptável a múltiplas plataformas.
 */
public interface GUIFactory {  

    /**
     * Cria um botão específico para a plataforma correspondente.
     * 
     * Implementações concretas dessa interface devem fornecer a lógica para criar botões no 
     * estilo do sistema operacional em que a aplicação está rodando (ex: Windows, macOS).
     *
     * @return um objeto que implementa a interface Button.
     */
    Button createButton();  
    
    /**
     * Cria uma caixa de seleção específica para a plataforma correspondente.
     * 
     * Implementações concretas dessa interface devem fornecer a lógica para criar caixas de seleção 
     * no estilo do sistema operacional em que a aplicação está rodando.
     *
     * @return um objeto que implementa a interface Checkbox.
     */
    Checkbox createCheckbox();  
    
}  
