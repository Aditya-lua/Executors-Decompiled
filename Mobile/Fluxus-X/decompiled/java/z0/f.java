package z0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;
import p0.a0;
import x0.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static f h(int i10, int i11, Rect rect, Size size, int i12, boolean z10) {
        return i(i10, i11, rect, size, i12, z10, false);
    }

    public static f i(int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        return new b(UUID.randomUUID(), i10, i11, rect, size, i12, z10, z11);
    }

    public static f j(n0 n0Var) {
        return h(n0Var.t(), n0Var.p(), n0Var.n(), a0.f(n0Var.n(), n0Var.q()), n0Var.q(), n0Var.w());
    }

    public abstract Rect a();

    public abstract int b();

    public abstract int c();

    public abstract Size d();

    public abstract int e();

    public abstract UUID f();

    public abstract boolean g();

    public abstract boolean k();
}
