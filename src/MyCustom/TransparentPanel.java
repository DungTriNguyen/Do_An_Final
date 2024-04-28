package MyCustom;

import java.awt.LayoutManager;
import javax.swing.JPanel;

public class TransparentPanel extends JPanel {
// đặt trong suốt, đối tượng phía sau sẽ được hiển thị
    public TransparentPanel() {
        this.setOpaque(false);
    }
    
    public TransparentPanel(LayoutManager layout) {
        this.setLayout(layout);
    }

}
