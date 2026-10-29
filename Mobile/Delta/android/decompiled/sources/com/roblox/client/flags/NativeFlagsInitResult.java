package com.roblox.client.flags;

import androidx.annotation.Keep;
import gk.p;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/roblox/client/flags/NativeFlagsInitResult;", "", "", "nativeFlagProviderId", "<init>", "(I)V", "", "key", "", "resolveFlagValue", "(Ljava/lang/String;)Z", "value", "found", "", "addBoolean", "(Ljava/lang/String;ZZ)V", "I", "getNativeFlagProviderId", "()I", "", "booleanCachedMap", "Ljava/util/Map;", "getBooleanCachedMap", "()Ljava/util/Map;", "Companion", "a", "flags_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NativeFlagsInitResult {

    @NotNull
    private static final String TAG = "NativeFlagsInitResult";

    @NotNull
    private final Map<String, Boolean> booleanCachedMap = new LinkedHashMap();
    private final int nativeFlagProviderId;

    public NativeFlagsInitResult(int i10) {
        this.nativeFlagProviderId = i10;
    }

    private final boolean resolveFlagValue(String key) {
        a aVarK0 = h.a().K0(key);
        if (!(aVarK0 instanceof a.d)) {
            p.k(TAG, "resolveFlagValue: Unexpected type (not NativeBoolean) or flag not found for key: " + key + ". Defaulting to false.");
            return false;
        }
        a.d dVar = (a.d) aVarK0;
        p.h(TAG, "resolveFlagValue: Using initial value: " + dVar.d() + " for " + key);
        Boolean boolD = dVar.d();
        Intrinsics.checkNotNull(boolD);
        return boolD.booleanValue();
    }

    public final void addBoolean(@NotNull String key, boolean value, boolean found) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!found) {
            value = resolveFlagValue(key);
        }
        String str = "FFlag" + key;
        p.b(TAG, "addBoolean: Adding " + str + " = " + value);
        this.booleanCachedMap.put(str, Boolean.valueOf(value));
    }

    @NotNull
    public final Map<String, Boolean> getBooleanCachedMap() {
        return this.booleanCachedMap;
    }

    public final int getNativeFlagProviderId() {
        return this.nativeFlagProviderId;
    }
}
