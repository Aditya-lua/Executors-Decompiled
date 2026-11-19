package ai;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lai/j;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "a", "(Landroid/content/Context;)V", "b", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "c", "(Landroid/content/Context;)Ljava/util/Set;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f489a = new j();

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        be.a.a(context);
    }

    public static final void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        be.a.b(context);
    }

    @NotNull
    public static final Set<String> c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ce.b bVarA = ce.c.a(context);
        Intrinsics.checkNotNullExpressionValue(bVarA, "create(...)");
        Set<String> setB = bVarA.b();
        Intrinsics.checkNotNullExpressionValue(setB, "getInstalledModules(...)");
        return setB;
    }
}
