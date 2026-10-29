package f1;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public class d1 implements h1 {
    public final n0.z1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<g0.k0, o> f15835e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<g0.k0, o> f15836f = new HashMap();

    public d1(int i10, n0.o0 o0Var, int i11, m1.r1.a aVar) {
        x2.g.b(i10 == 0 || i10 == 1, "Not a supported video capabilities source: " + i10);
        int i12 = i11 == 2 ? 2 : 1;
        this.f15834d = i12;
        this.b = h(i10, o0Var, aVar, i12);
        for (g0.k0 k0Var : o0Var.c()) {
            o oVar = new o(new h1.e(this.b, k0Var), this.f15834d);
            if (!oVar.g().isEmpty()) {
                this.f15835e.put(k0Var, oVar);
            }
        }
        this.f15833c = o0Var.o();
    }

    public static n0.z1 h(int i10, n0.o0 o0Var, m1.r1.a aVar, int i11) {
        m1.r1.a aVar2;
        n0.z1 z1VarX = o0Var.x();
        if (i11 == 2) {
            return !o0Var.s() ? n0.z1.f24975a : z1VarX;
        }
        if (!o.b(z1VarX, i11)) {
            g0.r1.l("RecorderVideoCapabilities", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
            z1VarX = new o1.c(o0Var, Arrays.asList(x.f16051c, x.b, x.f16050a), aVar);
        }
        k3 k3VarC = k1.c.c();
        n0.z1 dVar = new o1.d(z1VarX, k3VarC, o0Var, aVar);
        if (i10 == 1) {
            aVar2 = aVar;
            dVar = new h1.h(dVar, x.b(), Collections.singleton(g0.k0.f17470d), o0Var.m(34), aVar2);
        } else {
            aVar2 = aVar;
        }
        n0.z1 eVar = new o1.e(dVar, k3VarC);
        if (i(o0Var)) {
            eVar = new h1.b(eVar, aVar2);
        }
        return new o1.f(eVar, o0Var, k3VarC);
    }

    public static boolean i(n0.o0 o0Var) {
        for (g0.k0 k0Var : o0Var.c()) {
            Integer numValueOf = Integer.valueOf(k0Var.b());
            int iA = k0Var.a();
            if (numValueOf.equals(3) && iA == 10) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.h1
    public x a(Size size, g0.k0 k0Var) {
        o oVarG = g(k0Var);
        return oVarG == null ? x.f16055g : oVarG.d(size);
    }

    @Override // f1.h1
    public h1.i b(Size size, g0.k0 k0Var) {
        o oVarG = g(k0Var);
        if (oVarG == null) {
            return null;
        }
        return oVarG.c(size);
    }

    @Override // f1.h1
    public Set<g0.k0> c() {
        return this.f15835e.keySet();
    }

    @Override // f1.h1
    public h1.i d(x xVar, g0.k0 k0Var) {
        o oVarG = g(k0Var);
        if (oVarG == null) {
            return null;
        }
        return oVarG.f(xVar);
    }

    @Override // f1.h1
    public List<x> e(g0.k0 k0Var) {
        o oVarG = g(k0Var);
        return oVarG == null ? new ArrayList() : oVarG.g();
    }

    public final o f(g0.k0 k0Var) {
        if (n0.y1.c(k0Var, c())) {
            return new o(new h1.e(this.b, k0Var), this.f15834d);
        }
        return null;
    }

    public final o g(g0.k0 k0Var) {
        if (k0Var.e()) {
            return this.f15835e.get(k0Var);
        }
        if (this.f15836f.containsKey(k0Var)) {
            return this.f15836f.get(k0Var);
        }
        o oVarF = f(k0Var);
        this.f15836f.put(k0Var, oVarF);
        return oVarF;
    }
}
