/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava01.ortega15;

import java.awt.Desktop; import java.io.*;

/**
 *
 * @author ubu2
 */
public class Prjava01Ortega15 {

    public static void main(String[] args) throws IOException {
        
        File f = new File("prj011-ortega15.html"); 
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) { 
            bw.write("<html>");bw.newLine(); bw.write(" <head>");
            bw.newLine(); bw.write(" <title>");bw.newLine(); 
            bw.write(" Nova p&agrave;gina web de Jesus Ortega");bw.newLine();
            bw.write(" DAW2 UF4 Pr&agrave;ctica 2 ");bw.newLine(); 
            bw.write(" </title>");bw.newLine(); bw.write(" </head>");
            bw.newLine(); bw.write(" <body>");bw.newLine();
            bw.write(" Nova p&agrave;gina web de Jesus Ortega");bw.newLine();
            bw.write(" </body>");bw.newLine(); bw.write("</html>");
            bw.newLine(); bw.close(); } 
    } 
    
}
