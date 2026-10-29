package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1gSDK implements AFc1kSDK {

    /* JADX INFO: renamed from: d */
    @NotNull
    private final AFc1dSDK<SharedPreferences> f6880d;

    @NotNull
    private final InterfaceC7341h registerClient;

    public AFc1gSDK(@NotNull AFc1dSDK<SharedPreferences> aFc1dSDK) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.f6880d = aFc1dSDK;
        this.registerClient = C7342i.m30456b(new Function0() { // from class: com.appsflyer.internal.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFc1gSDK.m8761q_(this.f7180a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q_ */
    public static final SharedPreferences m8761q_(AFc1gSDK aFc1gSDK) {
        return aFc1gSDK.f6880d.AFKeystoreWrapper.invoke();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final boolean AFKeystoreWrapper(@Nullable String str) {
        try {
            return ((SharedPreferences) this.registerClient.getValue()).getBoolean(str, false);
        } catch (ClassCastException e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFc1kSDK
    public final void AFLogger(@Nullable String str, long j10) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putLong(str, j10).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFc1kSDK
    /* JADX INFO: renamed from: d */
    public final void mo8764d(@Nullable String str, @Nullable String str2) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    @NotNull
    /* JADX INFO: renamed from: p_ */
    public final SharedPreferences mo8765p_() {
        return (SharedPreferences) this.registerClient.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFc1kSDK
    public final void registerClient(@Nullable String str, boolean z10) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putBoolean(str, z10).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final long unregisterClient(@Nullable String str, long j10) {
        try {
            return ((SharedPreferences) this.registerClient.getValue()).getLong(str, j10);
        } catch (ClassCastException e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return j10;
        }
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final int AFLogger(@Nullable String str, int i10) {
        try {
            return ((SharedPreferences) this.registerClient.getValue()).getInt(str, i10);
        } catch (ClassCastException e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return i10;
        }
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    @Nullable
    /* JADX INFO: renamed from: d */
    public final String mo8762d(@Nullable String str) {
        try {
            return ((SharedPreferences) this.registerClient.getValue()).getString(str, null);
        } catch (ClassCastException e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final boolean registerClient(@Nullable String str) {
        return ((SharedPreferences) this.registerClient.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void AFLogger(@Nullable String str) {
        ((SharedPreferences) this.registerClient.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    /* JADX INFO: renamed from: d */
    public final void mo8763d(@Nullable String str, int i10) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putInt(str, i10).apply();
    }
}
