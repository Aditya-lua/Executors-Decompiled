package h1;

import g0.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import n0.a2;
import n0.z1;

/* JADX INFO: loaded from: classes.dex */
public class e implements z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f18501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f18502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Integer, a2> f18503e = new HashMap();

    public e(z1 z1Var, k0 k0Var) {
        this.f18501c = z1Var;
        this.f18502d = k0Var;
    }

    public static a2 c(a2 a2Var, k0 k0Var) {
        if (a2Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (a2.c cVar : a2Var.b()) {
            if (n1.b.f(cVar, k0Var)) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return a2.b.h(a2Var.a(), a2Var.e(), a2Var.f(), arrayList);
    }

    private a2 d(int i10) {
        if (this.f18503e.containsKey(Integer.valueOf(i10))) {
            return this.f18503e.get(Integer.valueOf(i10));
        }
        if (!this.f18501c.a(i10)) {
            return null;
        }
        a2 a2VarC = c(this.f18501c.b(i10), this.f18502d);
        this.f18503e.put(Integer.valueOf(i10), a2VarC);
        return a2VarC;
    }

    @Override // n0.z1
    public boolean a(int i10) {
        return this.f18501c.a(i10) && d(i10) != null;
    }

    @Override // n0.z1
    public a2 b(int i10) {
        return d(i10);
    }
}
