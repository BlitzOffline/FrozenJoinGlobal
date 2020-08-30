package com.github.frcsty

import com.github.frcsty.listener.bungee.FrozenHandshakeListener
import com.github.frcsty.listener.bungee.FrozenPostLoginListener
import com.github.frcsty.listener.spigot.FrozenJoinListener
import com.github.frcsty.listener.spigot.FrozenQuitListener
import com.github.frcsty.listener.spigot.FrozenSwitchWorldListener
import com.github.frcsty.listener.spigot.worldguard.*
import com.google.common.eventbus.EventBus

class ListenerRegistration {

    private val listeners = setOf(
            FrozenJoinListener,
            FrozenQuitListener,
            FrozenSwitchWorldListener,

            RegionEnteredListener,
            RegionLeftListener,
            RegionsChangedListener,
            RegionsEnteredListener,
            RegionsLeftListener,

            FrozenHandshakeListener,
            FrozenPostLoginListener
    )

    val eventBus = EventBus()

    fun register() {
        listeners.forEach { eventBus.register(it) }
    }
}