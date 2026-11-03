package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.j<RecyclerView.f0, a> f3142a = new w1.j<>();
    public final w1.g<RecyclerView.f0> b = new w1.g<>();

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static x2.d<a> f3143d = new x2.e(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3144a;
        public RecyclerView.n.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RecyclerView.n.c f3145c;

        public static void a() {
            while (f3143d.b() != null) {
            }
        }

        public static a b() {
            a aVarB = f3143d.b();
            return aVarB == null ? new a() : aVarB;
        }

        public static void c(a aVar) {
            aVar.f3144a = 0;
            aVar.b = null;
            aVar.f3145c = null;
            f3143d.a(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.f0 f0Var, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void b(RecyclerView.f0 f0Var);

        void c(RecyclerView.f0 f0Var, @NonNull RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void d(RecyclerView.f0 f0Var, @NonNull RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2);
    }

    public void a(RecyclerView.f0 f0Var, RecyclerView.n.c cVar) {
        a aVarB = this.f3142a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3142a.put(f0Var, aVarB);
        }
        aVarB.f3144a |= 2;
        aVarB.b = cVar;
    }

    public void b(RecyclerView.f0 f0Var) {
        a aVarB = this.f3142a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3142a.put(f0Var, aVarB);
        }
        aVarB.f3144a |= 1;
    }

    public void c(long j10, RecyclerView.f0 f0Var) {
        this.b.i(j10, f0Var);
    }

    public void d(RecyclerView.f0 f0Var, RecyclerView.n.c cVar) {
        a aVarB = this.f3142a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3142a.put(f0Var, aVarB);
        }
        aVarB.f3145c = cVar;
        aVarB.f3144a |= 8;
    }

    public void e(RecyclerView.f0 f0Var, RecyclerView.n.c cVar) {
        a aVarB = this.f3142a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3142a.put(f0Var, aVarB);
        }
        aVarB.b = cVar;
        aVarB.f3144a |= 4;
    }

    public void f() {
        this.f3142a.clear();
        this.b.a();
    }

    public RecyclerView.f0 g(long j10) {
        return this.b.e(j10);
    }

    public boolean h(RecyclerView.f0 f0Var) {
        a aVar = this.f3142a.get(f0Var);
        return (aVar == null || (aVar.f3144a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.f0 f0Var) {
        a aVar = this.f3142a.get(f0Var);
        return (aVar == null || (aVar.f3144a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.f0 f0Var) {
        p(f0Var);
    }

    public final RecyclerView.n.c l(RecyclerView.f0 f0Var, int i10) {
        a aVarK;
        RecyclerView.n.c cVar;
        int iD = this.f3142a.d(f0Var);
        if (iD >= 0 && (aVarK = this.f3142a.k(iD)) != null) {
            int i11 = aVarK.f3144a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVarK.f3144a = i12;
                if (i10 == 4) {
                    cVar = aVarK.b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarK.f3145c;
                }
                if ((i12 & 12) == 0) {
                    this.f3142a.i(iD);
                    a.c(aVarK);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.n.c m(RecyclerView.f0 f0Var) {
        return l(f0Var, 8);
    }

    public RecyclerView.n.c n(RecyclerView.f0 f0Var) {
        return l(f0Var, 4);
    }

    public void o(b bVar) {
        for (int size = this.f3142a.getSize() - 1; size >= 0; size--) {
            RecyclerView.f0 f0VarF = this.f3142a.f(size);
            a aVarI = this.f3142a.i(size);
            int i10 = aVarI.f3144a;
            if ((i10 & 3) == 3) {
                bVar.b(f0VarF);
            } else if ((i10 & 1) != 0) {
                RecyclerView.n.c cVar = aVarI.b;
                if (cVar == null) {
                    bVar.b(f0VarF);
                } else {
                    bVar.c(f0VarF, cVar, aVarI.f3145c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(f0VarF, aVarI.b, aVarI.f3145c);
            } else if ((i10 & 12) == 12) {
                bVar.d(f0VarF, aVarI.b, aVarI.f3145c);
            } else if ((i10 & 4) != 0) {
                bVar.c(f0VarF, aVarI.b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(f0VarF, aVarI.b, aVarI.f3145c);
            }
            a.c(aVarI);
        }
    }

    public void p(RecyclerView.f0 f0Var) {
        a aVar = this.f3142a.get(f0Var);
        if (aVar == null) {
            return;
        }
        aVar.f3144a &= -2;
    }

    public void q(RecyclerView.f0 f0Var) {
        for (int iN = this.b.n() - 1; iN >= 0; iN--) {
            if (f0Var == this.b.o(iN)) {
                this.b.k(iN);
                break;
            }
        }
        a aVarRemove = this.f3142a.remove(f0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
