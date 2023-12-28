package com.zaneschepke.wireguardautotunnel.ui.screens.settings

import com.zaneschepke.wireguardautotunnel.data.model.Settings
import com.zaneschepke.wireguardautotunnel.data.model.TunnelConfig
import com.zaneschepke.wireguardautotunnel.service.tunnel.VpnState
import com.zaneschepke.wireguardautotunnel.util.Error
data class SettingsUiState(
    val settings : Settings = Settings(),
    val tunnels : List<TunnelConfig> = emptyList(),
    val vpnState: VpnState = VpnState(),
    val isLocationDisclosureShown : Boolean = true,
    val loading : Boolean = true,
    val errorEvent: Error = Error.NONE
)
