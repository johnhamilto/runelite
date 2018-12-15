/*
 * Copyright (c) 2018, Uber RS
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.ubertweak;


import com.google.inject.Provides;
import net.runelite.api.Client;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.input.KeyManager;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.grounditems.GroundItemsPlugin;

import javax.inject.Inject;

import static java.lang.Boolean.TRUE;

@PluginDescriptor(
        name = "Uber Tweaks Plugin",
        description = "Personal Tweaks",
        tags = {"tweak", "tweaks", "uber", "uberrs"},
        enabledByDefault = false
)
public class UberTweakPlugin extends Plugin
{
    @Inject
    private Client client;
    
    @Inject
    private UberTweakConfig config;
    
    @Inject
    private ConfigManager configManager;
    
    @Inject
    private KeyManager keyManager;
    
    @Inject
    private MenuManager menuManager;
    
    @Provides
    UberTweakConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(UberTweakConfig.class);
    }
    
    @Override
    public void startUp()
    {
    
    }
    
    @Override
    public void shutDown()
    {
    
    }
    
    @Subscribe
    public void onMenuEntryAdded(MenuEntryAdded menuEntryAdded)
    {
    
    }
}
