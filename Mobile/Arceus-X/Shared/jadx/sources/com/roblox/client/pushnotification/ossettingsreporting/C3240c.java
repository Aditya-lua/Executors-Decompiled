package com.roblox.client.pushnotification.ossettingsreporting;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.roblox.client.pushnotification.ossettingsreporting.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/c;", "Lcom/roblox/client/pushnotification/ossettingsreporting/b;", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "", "channels", "", "changedChannels", "deviceId", "", "userId", "", "a", "(Landroid/content/Context;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;J)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3240c implements InterfaceC3239b {
    @Override // com.roblox.client.pushnotification.ossettingsreporting.InterfaceC3239b
    /* JADX INFO: renamed from: a */
    public void mo15445a(@NotNull Context appContext, @NotNull Map<String, String> channels, @NotNull List<String> changedChannels, @NotNull String deviceId, long userId) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(channels, "channels");
        Intrinsics.checkNotNullParameter(changedChannels, "changedChannels");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        NotificationPushAckWorker.INSTANCE.m15442b(appContext, new NotificationPushAckWorker.AbstractC3236b.SettingChangeInput(deviceId, userId, channels, changedChannels));
    }
}
