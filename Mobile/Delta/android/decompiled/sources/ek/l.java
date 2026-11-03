package ek;

import android.content.Context;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lek/l;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)Z", "", "minVersionCode", "a", "(Landroid/content/Context;I)Z", "utils_googleRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f16137a = new l();

    public static final boolean a(@NotNull Context context, int minVersionCode) {
        Object objB;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            gt.n.Companion companion = gt.n.INSTANCE;
            int iH = j9.c.o().h(context, minVersionCode);
            boolean z10 = iH == 0;
            q.b("GooglePlayServices", "Google Play Services status for minVersionCode=" + minVersionCode + ": " + iH + ", available=" + z10);
            objB = gt.n.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            gt.n.Companion companion2 = gt.n.INSTANCE;
            objB = gt.n.b(gt.o.a(th2));
        }
        Throwable thE = gt.n.e(objB);
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
            gt.n.Companion companion = gt.n.INSTANCE;
            int iG = j9.c.o().g(context);
            boolean z10 = iG == 0;
            q.b("GooglePlayServices", "Google Play Services availability status: " + iG + ", available=" + z10);
            objB = gt.n.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            gt.n.Companion companion2 = gt.n.INSTANCE;
            objB = gt.n.b(gt.o.a(th2));
        }
        Throwable thE = gt.n.e(objB);
        if (thE != null) {
            Log.w("GooglePlayServices", "Failed to query Google Play Services availability", thE);
        }
        Boolean bool = Boolean.FALSE;
        if (gt.n.g(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }
}
