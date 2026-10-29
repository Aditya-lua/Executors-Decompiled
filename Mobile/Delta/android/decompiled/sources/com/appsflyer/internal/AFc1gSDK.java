package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1gSDK implements AFc1kSDK {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFc1dSDK<SharedPreferences> f5252d;

    @NotNull
    private final jt.h registerClient;

    public AFc1gSDK(@NotNull AFc1dSDK<SharedPreferences> aFc1dSDK) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.f5252d = aFc1dSDK;
        this.registerClient = jt.i.b(new Function0() { // from class: com.appsflyer.internal.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFc1gSDK.q_(this.f5530a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences q_(AFc1gSDK aFc1gSDK) {
        return aFc1gSDK.f5252d.AFKeystoreWrapper.invoke();
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

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void AFLogger(@Nullable String str, long j10) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putLong(str, j10).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void d(@Nullable String str, @Nullable String str2) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    @NotNull
    public final SharedPreferences p_() {
        return (SharedPreferences) this.registerClient.getValue();
    }

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
    public final String d(@Nullable String str) {
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
    public final void d(@Nullable String str, int i10) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putInt(str, i10).apply();
    }
}
