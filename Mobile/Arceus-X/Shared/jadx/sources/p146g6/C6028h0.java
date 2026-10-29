package p146g6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p533x2.InterfaceC12631a;
import p536x5.AbstractC12732w;
import p536x5.C12727t0;

/* JADX INFO: renamed from: g6.h0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lx2/a;", "Lx5/t0;", "info", "", "tag", "", "a", "(Lx2/a;Lx5/t0;Ljava/lang/String;)V", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6028h0 {
    /* JADX INFO: renamed from: a */
    public static final void m26823a(@NotNull InterfaceC12631a<C12727t0> interfaceC12631a, @NotNull C12727t0 info, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(interfaceC12631a, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            interfaceC12631a.accept(info);
        } catch (Throwable th2) {
            AbstractC12732w.m47441e().mo47447d(tag, "Exception handler threw an exception", th2);
        }
    }
}
