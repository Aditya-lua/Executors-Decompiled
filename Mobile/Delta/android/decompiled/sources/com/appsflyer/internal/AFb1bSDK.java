package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFb1bSDK;", "", "Landroid/content/Context;", "p0", "Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;", "p1", "", "unregisterClient", "(Landroid/content/Context;Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;)V", "AFKeystoreWrapper", "()V", "AFa1tSDK", "AFa1zSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AFb1bSDK {

    /* JADX INFO: renamed from: AFa1tSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.AFKeystoreWrapper;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1bSDK$AFa1tSDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion AFKeystoreWrapper = new Companion();
        private static long registerClient = 500;

        private Companion() {
        }

        public static long unregisterClient() {
            return registerClient;
        }
    }

    public interface AFa1zSDK {
        void m_(@NotNull Intent intent);

        void n_(@NotNull Intent intent);

        void registerClient();
    }

    void AFKeystoreWrapper();

    void unregisterClient(@NotNull Context p8, @NotNull AFa1zSDK p10);
}
