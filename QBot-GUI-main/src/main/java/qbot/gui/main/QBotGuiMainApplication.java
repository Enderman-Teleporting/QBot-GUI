package qbot.gui.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import qbot.gui.Windows.Help;
import qbot.gui.Windows.Main;
import qbot.gui.Windows.Set;
import qbot.gui.Windows.Update_Checker;
@SpringBootApplication
public class QBotGuiMainApplication  {

    public static void main(String[] args) {
        SpringApplication.run(QBotGuiMainApplication.class, args);
    }

}
