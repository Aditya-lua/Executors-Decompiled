package nr;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnr/f;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Lnr/a;", "config", "Lnr/d;", "a", "(Landroid/content/Context;Lnr/a;)Lnr/d;", "Ljava/lang/Class;", "b", "()Ljava/lang/Class;", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f26614a = new f();

    @Nullable
    public final d a(@NotNull Context context, @NotNull SilentNetworkAuthConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            Class<?> clsB = b();
            if (clsB == null) {
                return null;
            }
            Object objNewInstance = clsB.newInstance();
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.sna.SnaClient.Factory");
            return ((d.a) objNewInstance).a(context, config);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Class<?> b() {
        try {
            return Class.forName("com.withpersona.sdk2.inquiry.sna.impl.VonageSnaClientFactory");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
