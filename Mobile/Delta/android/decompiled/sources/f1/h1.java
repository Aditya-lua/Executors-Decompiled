package f1;

import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f15862a = new a();

    public class a implements h1 {
        @Override // f1.h1
        public Set<g0.k0> c() {
            return new HashSet();
        }

        @Override // f1.h1
        public List<x> e(g0.k0 k0Var) {
            return new ArrayList();
        }
    }

    default x a(Size size, g0.k0 k0Var) {
        return x.f16055g;
    }

    default h1.i b(Size size, g0.k0 k0Var) {
        return null;
    }

    Set<g0.k0> c();

    default h1.i d(x xVar, g0.k0 k0Var) {
        return null;
    }

    List<x> e(g0.k0 k0Var);
}
