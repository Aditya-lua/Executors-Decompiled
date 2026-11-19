package n0;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static g a(SurfaceConfig surfaceConfig, int i10, Size size, g0.k0 k0Var, List<j4.b> list, n1 n1Var, int i11, Range<Integer> range, boolean z10) {
        return new h(surfaceConfig, i10, size, k0Var, list, n1Var, i11, range, z10);
    }

    public abstract List<j4.b> b();

    public abstract g0.k0 c();

    public abstract int d();

    public abstract n1 e();

    public abstract int f();

    public abstract Size g();

    public abstract SurfaceConfig h();

    public abstract Range<Integer> i();

    public abstract boolean j();

    public t3 k(n1 n1Var) {
        return t3.a(g()).g(f()).c(i()).b(c()).d(n1Var).a();
    }
}
