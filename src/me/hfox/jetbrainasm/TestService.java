package me.hfox.jetbrainasm;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public interface TestService {
    static TestService getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, TestService.class);
    }
}
