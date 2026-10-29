package gk;

import android.content.Context;
import android.util.Log;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgk/k;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "utils_googleRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f18239a = new k();

    public static final boolean a(@Nullable Context context) {
        Object objB;
        if (context == null) {
            return false;
        }
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            int iG = j9.c.o().g(context);
            boolean z10 = iG == 0;
            p.b("GooglePlayServices", "Google Play Services availability status: " + iG + ", available=" + z10);
            objB = jt.n.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        Throwable thE = jt.n.e(objB);
        if (thE != null) {
            Log.w("GooglePlayServices", "Failed to query Google Play Services availability", thE);
        }
        Boolean bool = Boolean.FALSE;
        if (jt.n.g(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }
}
