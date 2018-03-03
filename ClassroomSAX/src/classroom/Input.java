/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom;

import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class Input {
    private ArrayList<Element> elements;
    
    public Input(){
        elements = new ArrayList<Element>();        
    }
    
    public ArrayList<Element> getElements() {
        return elements;
    }
    
    public void addElement(Element e) {
        elements.add(e);
    }
}
