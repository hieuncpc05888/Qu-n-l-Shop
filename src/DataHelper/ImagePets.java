/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataHelper;

import com.sun.source.tree.TryTree;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author NGUYEN CHI HIEU
 */
public class ImagePets {

    public static Image getAppIcon() {
        URL url = ImagePets.class.getResource("/imgPet/2.logopet.png");
        return new ImageIcon(url).getImage();
    }

    public static void save() {
    }

    public static ImageIcon read(String fileName) {
        File path = new File("imgPets", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }

    public static void save(File src) {
        File dst = new File("src/imgPets", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
            //tao thu muc logos neu ch exsist
        }

        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            //copy file vao thu muc logos
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
