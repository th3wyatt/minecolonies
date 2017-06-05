package com.minecolonies.coremod.client.gui;

import com.minecolonies.api.lib.Constants;
import com.minecolonies.coremod.colony.buildings.AbstractBuildingWorker;
import org.jetbrains.annotations.NotNull;

/**
 * Window for worker.
 * Placeholder for many different jobs.
 *
 * @param <B> Object extending {@link AbstractBuildingWorker.View}.
 */
public class WindowHutWorkerPlaceholder<B extends AbstractBuildingWorker.View> extends AbstractWindowWorkerBuilding<B>
{
    private static final String WORKER_PLACEHOLDER_RESOURCE_SUFFIX = ":gui/windowhutworkerplaceholder.xml";
    private final String name;

    /**
     * Window for worker placeholder.
     * Used by Baker, Blacksmith, Lumberjack ans Stonemason.
     *
     * @param building AbstractBuilding extending {@link AbstractBuildingWorker.View}.
     * @param name     Name of the the view (resource).
     */
    public WindowHutWorkerPlaceholder(final B building, final String name)
    {
        super(building, Constants.MOD_ID + WORKER_PLACEHOLDER_RESOURCE_SUFFIX);
        this.name = name;
    }

    @NotNull
    @Override
    public String getBuildingName()
    {
        return "com.minecolonies.coremod.gui.workerHuts." + name;
    }
}
