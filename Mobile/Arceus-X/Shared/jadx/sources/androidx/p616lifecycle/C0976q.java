package androidx.p616lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p256ku.C7864g1;
import p256ku.C7948z2;

/* JADX INFO: renamed from: androidx.lifecycle.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31665d2 = {"Landroidx/lifecycle/l;", "Landroidx/lifecycle/m;", "a", "(Landroidx/lifecycle/l;)Landroidx/lifecycle/m;", "coroutineScope", "lifecycle-common"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0976q {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AbstractC0968m m4971a(@NotNull AbstractC0966l abstractC0966l) {
        C0970n c0970n;
        Intrinsics.checkNotNullParameter(abstractC0966l, "<this>");
        do {
            C0970n c0970n2 = (C0970n) abstractC0966l.m4937c().m4892b();
            if (c0970n2 != null) {
                return c0970n2;
            }
            c0970n = new C0970n(abstractC0966l, C7948z2.m32943b(null, 1, null).plus(C7864g1.m32645c().mo32847X()));
        } while (!abstractC0966l.m4937c().m4891a(null, c0970n));
        c0970n.m4959c();
        return c0970n;
    }
}
