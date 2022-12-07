
package figures;

import java.io.IOException;
import java.net.URISyntaxException;

public class Ellipse{


    public static void main(String[] args) {
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri= new java.net.URI("file:///Users/mariofelipecorellamarquez/Documents/figures/ellipse.html");
                    desktop.browse(uri);    
                }catch(URISyntaxException | IOException ex){}
                
          
            }
        }    
    }    
}
