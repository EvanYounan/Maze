package maze;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.*;
import javax.swing.ImageIcon;

public class Map {
    
    private Scanner m;
    
    private String Map[] = new String[14];
    
    private Image grass,
                  wall;
    
    public Map(){
        
        ImageIcon img = new ImageIcon("rsc/grass.png");
        grass = img.getImage();
        img = new ImageIcon("rsc/wall.png");
        wall = img.getImage();        
                
        openFile();
        readFile();
        closeFile();
    }
    
    public Image getGrass(){
        return grass;
    }
    
    public Image getWall(){
        return wall;
    }
    
    
    
    public String getMap(int x, int y){
        String index = Map[y].substring(x, x+ 1);
        return index;
    }
    
    public void openFile(){
        
        try{
        	m = new Scanner(new File("rsc/Map.txt"));
        }catch(Exception e){
            System.out.println("error loading map");
        }
    }
    
    public void readFile(){
        while(m.hasNext()){
            for(int i = 0; i < 14; i++){
                Map[i] = m.next();
            }
        }
    }
    
    public void closeFile(){
    m.close();    
}
    
}