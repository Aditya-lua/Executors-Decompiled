package p151gk;

import android.content.Context;
import android.util.Log;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p213j9.C7089c;
import p229jt.C7347n;
import p229jt.C7348o;

/* JADX INFO: renamed from: gk.l */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lgk/l;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "utils_googleRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6119l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6119l f23456a = new C6119l();

    /* JADX INFO: renamed from: a */
    public static final boolean m27042a(@Nullable Context context) {
        Object objM30460b;
        if (context == null) {
            return false;
        }
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            int iMo29854g = C7089c.m29849o().mo29854g(context);
            boolean z10 = iMo29854g == 0;
            C6124q.m27057b("GooglePlayServices", "Google Play Services availability status: " + iMo29854g + ", available=" + z10);
            objM30460b = C7347n.m30460b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e != null) {
            Log.w("GooglePlayServices", "Failed to query Google Play Services availability", thM30463e);
        }
        Boolean bool = Boolean.FALSE;
        if (C7347n.m30465g(objM30460b)) {
            objM30460b = bool;
        }
        return ((Boolean) objM30460b).booleanValue();
    }
}
