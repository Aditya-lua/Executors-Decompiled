package pv;

import mv.f0;
import mv.z;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmv/f0;", "b", "(Lmv/f0;)Lmv/f0;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final f0 b(f0 f0Var) {
        z cacheUrlOverride = f0Var.getCacheUrlOverride();
        if (cacheUrlOverride != null) {
            return (sv.f.f31916a.b(f0Var.getMethod()) || Intrinsics.c(f0Var.getMethod(), "POST")) ? f0Var.j().e().v(cacheUrlOverride).c(null).b() : f0Var;
        }
        return f0Var;
    }
}
