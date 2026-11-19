package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/platform/d;", BuildConfig.FLAVOR, "<init>", "()V", "Lokhttp3/internal/platform/c;", "a", "()Lokhttp3/internal/platform/c;", BuildConfig.FLAVOR, "c", "()Z", "isAndroid", "Landroid/content/Context;", "value", "b", "()Landroid/content/Context;", "d", "(Landroid/content/Context;)V", "applicationContext", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f28269a = new d();

    @NotNull
    public final c a() {
        yv.c.f38205a.b();
        c cVarA = a.INSTANCE.a();
        if (cVarA == null) {
            cVarA = b.INSTANCE.a();
        }
        if (cVarA != null) {
            return cVarA;
        }
        throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
    }

    @Nullable
    public final Context b() {
        Object objE = c.INSTANCE.e();
        xv.c cVar = objE instanceof xv.c ? (xv.c) objE : null;
        if (cVar != null) {
            return cVar.getApplicationContext();
        }
        return null;
    }

    public final boolean c() {
        return true;
    }

    public final void d(@Nullable Context context) {
        Object objE = c.INSTANCE.e();
        xv.c cVar = objE instanceof xv.c ? (xv.c) objE : null;
        if (cVar != null) {
            cVar.a(context);
        }
    }
}
