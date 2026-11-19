package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.j<RecyclerView.g0, a> f2844a = new w1.j<>();
    public final w1.g<RecyclerView.g0> b = new w1.g<>();

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static x2.d<a> f2845d = new x2.e(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2846a;
        public RecyclerView.n.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RecyclerView.n.c f2847c;

        public static void a() {
            while (f2845d.b() != null) {
            }
        }

        public static a b() {
            a aVarB = f2845d.b();
            return aVarB == null ? new a() : aVarB;
        }

        public static void c(a aVar) {
            aVar.f2846a = 0;
            aVar.b = null;
            aVar.f2847c = null;
            f2845d.a(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.g0 g0Var, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void b(RecyclerView.g0 g0Var);

        void c(RecyclerView.g0 g0Var, @NonNull RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void d(RecyclerView.g0 g0Var, @NonNull RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2);
    }

    public void a(RecyclerView.g0 g0Var, RecyclerView.n.c cVar) {
        a aVarB = this.f2844a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2844a.put(g0Var, aVarB);
        }
        aVarB.f2846a |= 2;
        aVarB.b = cVar;
    }

    public void b(RecyclerView.g0 g0Var) {
        a aVarB = this.f2844a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2844a.put(g0Var, aVarB);
        }
        aVarB.f2846a |= 1;
    }

    public void c(long j10, RecyclerView.g0 g0Var) {
        this.b.k(j10, g0Var);
    }

    public void d(RecyclerView.g0 g0Var, RecyclerView.n.c cVar) {
        a aVarB = this.f2844a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2844a.put(g0Var, aVarB);
        }
        aVarB.f2847c = cVar;
        aVarB.f2846a |= 8;
    }

    public void e(RecyclerView.g0 g0Var, RecyclerView.n.c cVar) {
        a aVarB = this.f2844a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2844a.put(g0Var, aVarB);
        }
        aVarB.b = cVar;
        aVarB.f2846a |= 4;
    }

    public void f() {
        this.f2844a.clear();
        this.b.a();
    }

    public RecyclerView.g0 g(long j10) {
        return this.b.e(j10);
    }

    public boolean h(RecyclerView.g0 g0Var) {
        a aVar = this.f2844a.get(g0Var);
        return (aVar == null || (aVar.f2846a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.g0 g0Var) {
        a aVar = this.f2844a.get(g0Var);
        return (aVar == null || (aVar.f2846a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.g0 g0Var) {
        p(g0Var);
    }

    public final RecyclerView.n.c l(RecyclerView.g0 g0Var, int i10) {
        a aVarJ;
        RecyclerView.n.c cVar;
        int iD = this.f2844a.d(g0Var);
        if (iD >= 0 && (aVarJ = this.f2844a.j(iD)) != null) {
            int i11 = aVarJ.f2846a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVarJ.f2846a = i12;
                if (i10 == 4) {
                    cVar = aVarJ.b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarJ.f2847c;
                }
                if ((i12 & 12) == 0) {
                    this.f2844a.h(iD);
                    a.c(aVarJ);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.n.c m(RecyclerView.g0 g0Var) {
        return l(g0Var, 8);
    }

    public RecyclerView.n.c n(RecyclerView.g0 g0Var) {
        return l(g0Var, 4);
    }

    public void o(b bVar) {
        for (int size = this.f2844a.getSize() - 1; size >= 0; size--) {
            RecyclerView.g0 g0VarF = this.f2844a.f(size);
            a aVarH = this.f2844a.h(size);
            int i10 = aVarH.f2846a;
            if ((i10 & 3) == 3) {
                bVar.b(g0VarF);
            } else if ((i10 & 1) != 0) {
                RecyclerView.n.c cVar = aVarH.b;
                if (cVar == null) {
                    bVar.b(g0VarF);
                } else {
                    bVar.c(g0VarF, cVar, aVarH.f2847c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(g0VarF, aVarH.b, aVarH.f2847c);
            } else if ((i10 & 12) == 12) {
                bVar.d(g0VarF, aVarH.b, aVarH.f2847c);
            } else if ((i10 & 4) != 0) {
                bVar.c(g0VarF, aVarH.b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(g0VarF, aVarH.b, aVarH.f2847c);
            }
            a.c(aVarH);
        }
    }

    public void p(RecyclerView.g0 g0Var) {
        a aVar = this.f2844a.get(g0Var);
        if (aVar == null) {
            return;
        }
        aVar.f2846a &= -2;
    }

    public void q(RecyclerView.g0 g0Var) {
        for (int iP = this.b.p() - 1; iP >= 0; iP--) {
            if (g0Var == this.b.q(iP)) {
                this.b.o(iP);
                break;
            }
        }
        a aVarRemove = this.f2844a.remove(g0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
