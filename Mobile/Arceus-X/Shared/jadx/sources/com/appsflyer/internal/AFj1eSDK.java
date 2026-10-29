package com.appsflyer.internal;

import com.appsflyer.share.platform_extension.Plugin;
import com.appsflyer.share.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7690k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.C7352s;
import p229jt.InterfaceC7341h;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1eSDK implements AFj1cSDK {

    @NotNull
    private final InterfaceC7341h AFKeystoreWrapper = C7342i.m30456b(new Function0() { // from class: com.appsflyer.internal.g1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AFj1eSDK.AFKeystoreWrapper();
        }
    });

    @Nullable
    private PluginInfo AFLogger;

    /* JADX INFO: Access modifiers changed from: private */
    public static final PluginInfo AFKeystoreWrapper() {
        return new PluginInfo(Plugin.NATIVE, "7.0.1", null, 4, null);
    }

    @Override // com.appsflyer.internal.AFj1cSDK
    @NotNull
    public final Map<String, Object> AFLogger() {
        PluginInfo pluginInfo = this.AFLogger;
        if (pluginInfo == null) {
            pluginInfo = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        Pair pairM30477a = C7352s.m30477a("platform", pluginInfo.getPlugin().getPluginName());
        PluginInfo pluginInfo2 = this.AFLogger;
        if (pluginInfo2 == null) {
            pluginInfo2 = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        Map<String, Object> mapM31799n = C7690k0.m31799n(pairM30477a, C7352s.m30477a("version", pluginInfo2.getVersion()));
        PluginInfo pluginInfo3 = this.AFLogger;
        if (pluginInfo3 == null) {
            pluginInfo3 = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        if (!pluginInfo3.getAdditionalParams().isEmpty()) {
            PluginInfo pluginInfo4 = this.AFLogger;
            if (pluginInfo4 == null) {
                pluginInfo4 = (PluginInfo) this.AFKeystoreWrapper.getValue();
            }
            mapM31799n.put("extras", pluginInfo4.getAdditionalParams());
        }
        return mapM31799n;
    }

    @Override // com.appsflyer.internal.AFj1cSDK
    public final void registerClient(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.AFLogger = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFj1cSDK
    @NotNull
    public final String unregisterClient() {
        PluginInfo pluginInfo = this.AFLogger;
        if (pluginInfo == null) {
            pluginInfo = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        return pluginInfo.getPlugin().getPluginName();
    }
}
