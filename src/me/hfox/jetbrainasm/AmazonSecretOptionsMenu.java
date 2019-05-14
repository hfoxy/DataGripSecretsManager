package me.hfox.jetbrainasm;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmazonSecretOptionsMenu extends AnAction {

    private static final Logger LOGGER = LoggerFactory.getLogger(AmazonSecretOptionsMenu.class);

    @Override
    public void actionPerformed(AnActionEvent e) {
        DefaultActionGroup mainMenu = (DefaultActionGroup) e.getActionManager().getAction("MainMenu");
        LOGGER.info("Main Menu: [{}] {}", mainMenu.getClass(), mainMenu);

        AmazonSecretOptionsMenu
        e.getActionManager().registerAction("TestAcount", );

        mainMenu.addSeparator();
        mainMenu.add();
    }

}
