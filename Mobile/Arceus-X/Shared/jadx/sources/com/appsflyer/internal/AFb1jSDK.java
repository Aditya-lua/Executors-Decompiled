package com.appsflyer.internal;

import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, m31665d2 = {"Lcom/appsflyer/internal/AFb1jSDK;", "", "<init>", "()V", "", "p0", "Lcom/appsflyer/internal/AFc1kSDK;", "p1", "", "d", "(Ljava/lang/String;Lcom/appsflyer/internal/AFc1kSDK;)V", "AFLogger", "(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;", "registerClient", "Ljava/lang/String;", "AFKeystoreWrapper"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFb1jSDK {

    @NotNull
    public static final AFb1jSDK INSTANCE = new AFb1jSDK();

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata */
    @Nullable
    private static String AFKeystoreWrapper;

    private AFb1jSDK() {
    }

    @NotNull
    public static final synchronized String AFLogger(@NotNull AFc1kSDK p8) {
        String str;
        try {
            Intrinsics.checkNotNullParameter(p8, "");
            if (AFKeystoreWrapper == null) {
                String strMo8762d = p8.mo8762d("AF_INSTALLATION");
                if (strMo8762d == null) {
                    strMo8762d = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
                    p8.mo8764d("AF_INSTALLATION", strMo8762d);
                }
                AFKeystoreWrapper = strMo8762d;
            }
            str = AFKeystoreWrapper;
            Intrinsics.checkNotNull(str);
        } catch (Throwable th2) {
            throw th2;
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static final synchronized void m8742d(@NotNull String p8, @NotNull AFc1kSDK p10) {
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p10, "");
        AFKeystoreWrapper = p8;
        p10.registerClient("CUSTOM_INSTALL_ID_APPLIED", true);
        p10.mo8764d("AF_INSTALLATION", p8);
    }
}
