package HomeTask.task2.objectsOnField;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Byblik272 on 2/12/2015.
 */
public class Eagle extends AbstractObjectOnField {

    public Eagle(int x, int y) {
        super(x, y);
        color = new Color(255, 255, 0);
        try {
            image = ImageIO.read(new File("Eagles.png").getAbsoluteFile());
        } catch (IOException e) {

        }
    }
}
