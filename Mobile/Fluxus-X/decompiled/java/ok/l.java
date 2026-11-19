package ok;

import android.content.Context;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lok/l;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;)Z", BuildConfig.FLAVOR, "minVersionCode", "a", "(Landroid/content/Context;I)Z", "utils_googleRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f28250a = new l();

    public static final boolean a(@NotNull Context context, int minVersionCode) {
        Object objB;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            int iH = k9.e.o().h(context, minVersionCode);
            boolean z10 = iH == 0;
            q.b("GooglePlayServices", "Google Play Services status for minVersionCode=" + minVersionCode + ": " + iH + ", available=" + z10);
            objB = zt.n.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        Throwable thE = zt.n.e(objB);
        if (thE != null) {
            Log.w("GooglePlayServices", "Failed to query Google Play Services version", thE);
            objB = Boolean.FALSE;
        }
        return ((Boolean) objB).booleanValue();
    }

    public static final boolean b(@Nullable Context context) {
        Object objB;
        if (context == null) {
            return false;
        }
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            int iG = k9.e.o().g(context);
            boolean z10 = iG == 0;
            q.b("GooglePlayServices", "Google Play Services availability status: " + iG + ", available=" + z10);
            objB = zt.n.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        Throwable thE = zt.n.e(objB);
        if (thE != null) {
            Log.w("GooglePlayServices", "Failed to query Google Play Services availability", thE);
        }
        Boolean bool = Boolean.FALSE;
        if (zt.n.g(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }
}
