package me.hfox.jetbrainasm;

import com.intellij.openapi.components.ServiceManager;

public interface JetbrainsAsmPlugin {

    static JetbrainsAsmPlugin getInstance() {
        return ServiceManager.getService(JetbrainsAsmPlugin.class);
    }

}
