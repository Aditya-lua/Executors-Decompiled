package sh;

import ae.C0155c;
import ae.InterfaceC0152b;
import android.content.Context;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p601zd.C13772a;

/* JADX INFO: renamed from: sh.i */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lsh/i;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "b", "", "", "c", "(Landroid/content/Context;)Ljava/util/Set;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11384i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11384i f40265a = new C11384i();

    /* JADX INFO: renamed from: a */
    public static final void m42698a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C13772a.m50188a(context);
    }

    /* JADX INFO: renamed from: b */
    public static final void m42699b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C13772a.m50189b(context);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Set<String> m42700c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC0152b interfaceC0152bM489a = C0155c.m489a(context);
        Intrinsics.checkNotNullExpressionValue(interfaceC0152bM489a, "create(...)");
        Set<String> setMo487e = interfaceC0152bM489a.mo487e();
        Intrinsics.checkNotNullExpressionValue(setMo487e, "getInstalledModules(...)");
        return setMo487e;
    }
}
