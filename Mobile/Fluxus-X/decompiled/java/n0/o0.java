package n0;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import j0.ResolvedFeatureGroup;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface o0 extends g0.t {
    default boolean A(ResolvedFeatureGroup bVar, g0.g2 g2Var) {
        for (i0.b bVar2 : bVar.a()) {
            if (!bVar2.d(this, g2Var)) {
                g0.r1.a("CameraInfoInternal", bVar2 + " is not supported.");
                return false;
            }
        }
        try {
            c4.c(this, g2Var, false, bVar);
            return true;
        } catch (IllegalArgumentException | s0.f.a e10) {
            g0.r1.b("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e10);
            return false;
        }
    }

    Set<Integer> a();

    Set<g0.k0> c();

    String e();

    void f(Executor executor, u uVar);

    default void g(g0.y yVar) {
        c4.b(yVar);
    }

    Rect h();

    List<Size> j(int i10);

    Object k();

    k3 l();

    List<Size> m(int i10);

    default Set<Integer> n() {
        return Collections.EMPTY_SET;
    }

    boolean o();

    default o0 q() {
        return this;
    }

    List<Size> r(Range<Integer> range);

    boolean s();

    a4 t();

    void v(u uVar);

    z1 x();

    List<Size> y();
}
