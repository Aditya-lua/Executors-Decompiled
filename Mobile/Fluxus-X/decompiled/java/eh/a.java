package eh;

import android.content.SharedPreferences;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Leh/a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "json", "Lorg/json/JSONObject;", "b", "(Ljava/lang/String;)Lorg/json/JSONObject;", "dma", BuildConfig.FLAVOR, "a", "(Lorg/json/JSONObject;)Ljava/lang/Boolean;", "Landroid/content/SharedPreferences;", "prefs", BuildConfig.FLAVOR, "nowMs", "ttlMs", "Leh/b0;", "d", "(Landroid/content/SharedPreferences;JJ)Leh/b0;", "defaultTtlMs", "blockAwareEnabled", "optOutStorageEnabled", "Leh/t;", "c", "(Landroid/content/SharedPreferences;JJZZ)Leh/t;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f13471a = new a();

    @Nullable
    public static final Boolean a(@Nullable JSONObject dma) {
        if (dma == null || !dma.has("consented")) {
            return null;
        }
        return Boolean.valueOf(dma.optBoolean("consented"));
    }

    @Nullable
    public static final JSONObject b(@Nullable String json) {
        if (json == null) {
            return null;
        }
        try {
            return new JSONObject(json);
        } catch (JSONException unused) {
            return null;
        }
    }

    @NotNull
    public static final FirebaseColdStartInputs c(@NotNull SharedPreferences prefs, long nowMs, long defaultTtlMs, boolean blockAwareEnabled, boolean optOutStorageEnabled) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        if (prefs.contains("delayedStartFreshnessTtlMs")) {
            defaultTtlMs = prefs.getLong("delayedStartFreshnessTtlMs", defaultTtlMs);
        }
        long j10 = prefs.getLong("delayedStartEligibilityTs", 0L);
        boolean z10 = j10 != 0 && nowMs - j10 <= defaultTtlMs && (!blockAwareEnabled || prefs.getBoolean("delayedStartEligibilityBlockAware", false));
        return new FirebaseColdStartInputs(z10 ? Boolean.valueOf(prefs.getBoolean("delayedStartFlagged", true)) : null, d(prefs, nowMs, defaultTtlMs), optOutStorageEnabled && prefs.getBoolean("disableDeeplinkTracking", false), z10 && blockAwareEnabled && prefs.getBoolean("delayedStartAttributionBlocked", false), blockAwareEnabled && !z10);
    }

    @NotNull
    public static final b0 d(@NotNull SharedPreferences prefs, long nowMs, long ttlMs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        String string = prefs.getString("delayedStartConsentDma", null);
        JSONObject jSONObjectB = b(string);
        return c0.a(prefs.getLong("delayedStartConsentTs", 0L), prefs.contains("delayedStartConsentApplySharingFilter"), prefs.getBoolean("delayedStartConsentApplySharingFilter", true), a(jSONObjectB), string != null && jSONObjectB == null, nowMs, ttlMs);
    }
}
