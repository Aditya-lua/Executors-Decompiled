package h1;

import android.util.Size;
import f1.o;
import f1.x;
import g0.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import m1.r1;
import n0.a2;
import n0.z1;

/* JADX INFO: loaded from: classes.dex */
public class h implements z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f18505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<x> f18506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<Size> f18507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<k0> f18508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r1.a f18509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<Integer, a2> f18510h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<k0, o> f18511i = new HashMap();

    public h(z1 z1Var, Collection<x> collection, Collection<k0> collection2, Collection<Size> collection3, r1.a aVar) {
        c(collection2);
        this.f18505c = z1Var;
        this.f18506d = new HashSet(collection);
        this.f18508f = new HashSet(collection2);
        this.f18507e = new HashSet(collection3);
        this.f18509g = aVar;
    }

    public static void c(Collection<k0> collection) {
        for (k0 k0Var : collection) {
            if (!k0Var.e()) {
                throw new IllegalArgumentException("Contains non-fully specified DynamicRange: " + k0Var);
            }
        }
    }

    private a2 g(int i10) {
        if (this.f18510h.containsKey(Integer.valueOf(i10))) {
            return this.f18510h.get(Integer.valueOf(i10));
        }
        a2 a2VarB = this.f18505c.b(i10);
        x.b bVarE = e(i10);
        if (bVarE != null && !h(a2VarB)) {
            a2VarB = j(a2VarB, d(bVarE));
        }
        this.f18510h.put(Integer.valueOf(i10), a2VarB);
        return a2VarB;
    }

    public static boolean i(a2 a2Var, k0 k0Var) {
        if (a2Var == null) {
            return false;
        }
        Iterator<a2.c> it = a2Var.b().iterator();
        while (it.hasNext()) {
            if (n1.b.f(it.next(), k0Var)) {
                return true;
            }
        }
        return false;
    }

    public static a2 j(a2 a2Var, a2 a2Var2) {
        if (a2Var == null && a2Var2 == null) {
            return null;
        }
        int iA = a2Var != null ? a2Var.a() : a2Var2.a();
        int iE = a2Var != null ? a2Var.e() : a2Var2.e();
        List<a2.a> listF = a2Var != null ? a2Var.f() : a2Var2.f();
        ArrayList arrayList = new ArrayList();
        if (a2Var != null) {
            arrayList.addAll(a2Var.b());
        }
        if (a2Var2 != null) {
            arrayList.addAll(a2Var2.b());
        }
        return a2.b.h(iA, iE, listF, arrayList);
    }

    @Override // n0.z1
    public boolean a(int i10) {
        return g(i10) != null;
    }

    @Override // n0.z1
    public a2 b(int i10) {
        return g(i10);
    }

    public final a2 d(x.b bVar) {
        i iVarC;
        x2.g.a(this.f18506d.contains(bVar));
        a2 a2VarB = this.f18505c.b(bVar.e(1));
        for (Size size : bVar.f()) {
            if (this.f18507e.contains(size)) {
                TreeMap treeMap = new TreeMap(new p0.e());
                ArrayList arrayList = new ArrayList();
                for (k0 k0Var : this.f18508f) {
                    if (!i(a2VarB, k0Var) && (iVarC = f(k0Var).c(size)) != null) {
                        a2.c cVarK = iVarC.k();
                        r1 r1VarA = this.f18509g.a(cVarK.i());
                        if (r1VarA != null && r1VarA.e(size.getWidth(), size.getHeight())) {
                            treeMap.put(cVarK.k(), iVarC);
                            arrayList.add(n1.c.a(cVarK, size, r1VarA.g()));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    a2 a2Var = (a2) w0.d.a(size, treeMap);
                    Objects.requireNonNull(a2Var);
                    a2 a2Var2 = a2Var;
                    return a2.b.h(a2Var2.a(), a2Var2.e(), a2Var2.f(), arrayList);
                }
            }
        }
        return null;
    }

    public final x.b e(int i10) {
        Iterator<x> it = this.f18506d.iterator();
        while (it.hasNext()) {
            x.b bVar = (x.b) it.next();
            if (bVar.e(1) == i10) {
                return bVar;
            }
        }
        return null;
    }

    public final o f(k0 k0Var) {
        if (this.f18511i.containsKey(k0Var)) {
            o oVar = this.f18511i.get(k0Var);
            Objects.requireNonNull(oVar);
            return oVar;
        }
        o oVar2 = new o(new e(this.f18505c, k0Var), 1);
        this.f18511i.put(k0Var, oVar2);
        return oVar2;
    }

    public final boolean h(a2 a2Var) {
        if (a2Var == null) {
            return false;
        }
        Iterator<k0> it = this.f18508f.iterator();
        while (it.hasNext()) {
            if (!i(a2Var, it.next())) {
                return false;
            }
        }
        return true;
    }
}
