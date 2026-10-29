package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import p504w1.C12283g;
import p504w1.C12286j;
import p533x2.C12635e;
import p533x2.InterfaceC12634d;

/* JADX INFO: renamed from: androidx.recyclerview.widget.u */
/* JADX INFO: loaded from: classes.dex */
public class C1070u {

    /* JADX INFO: renamed from: a */
    public final C12286j<RecyclerView.AbstractC1023f0, a> f4336a = new C12286j<>();

    /* JADX INFO: renamed from: b */
    public final C12283g<RecyclerView.AbstractC1023f0> f4337b = new C12283g<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.u$a */
    public static class a {

        /* JADX INFO: renamed from: d */
        public static InterfaceC12634d<a> f4338d = new C12635e(20);

        /* JADX INFO: renamed from: a */
        public int f4339a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC1031n.c f4340b;

        /* JADX INFO: renamed from: c */
        public RecyclerView.AbstractC1031n.c f4341c;

        /* JADX INFO: renamed from: a */
        public static void m6086a() {
            while (f4338d.mo47067b() != null) {
            }
        }

        /* JADX INFO: renamed from: b */
        public static a m6087b() {
            a aVarMo47067b = f4338d.mo47067b();
            return aVarMo47067b == null ? new a() : aVarMo47067b;
        }

        /* JADX INFO: renamed from: c */
        public static void m6088c(a aVar) {
            aVar.f4339a = 0;
            aVar.f4340b = null;
            aVar.f4341c = null;
            f4338d.mo47066a(aVar);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.u$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo5399a(RecyclerView.AbstractC1023f0 abstractC1023f0, RecyclerView.AbstractC1031n.c cVar, RecyclerView.AbstractC1031n.c cVar2);

        /* JADX INFO: renamed from: b */
        void mo5400b(RecyclerView.AbstractC1023f0 abstractC1023f0);

        /* JADX INFO: renamed from: c */
        void mo5401c(RecyclerView.AbstractC1023f0 abstractC1023f0, @NonNull RecyclerView.AbstractC1031n.c cVar, RecyclerView.AbstractC1031n.c cVar2);

        /* JADX INFO: renamed from: d */
        void mo5402d(RecyclerView.AbstractC1023f0 abstractC1023f0, @NonNull RecyclerView.AbstractC1031n.c cVar, @NonNull RecyclerView.AbstractC1031n.c cVar2);
    }

    /* JADX INFO: renamed from: a */
    public void m6069a(RecyclerView.AbstractC1023f0 abstractC1023f0, RecyclerView.AbstractC1031n.c cVar) {
        a aVarM6087b = this.f4336a.get(abstractC1023f0);
        if (aVarM6087b == null) {
            aVarM6087b = a.m6087b();
            this.f4336a.put(abstractC1023f0, aVarM6087b);
        }
        aVarM6087b.f4339a |= 2;
        aVarM6087b.f4340b = cVar;
    }

    /* JADX INFO: renamed from: b */
    public void m6070b(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        a aVarM6087b = this.f4336a.get(abstractC1023f0);
        if (aVarM6087b == null) {
            aVarM6087b = a.m6087b();
            this.f4336a.put(abstractC1023f0, aVarM6087b);
        }
        aVarM6087b.f4339a |= 1;
    }

    /* JADX INFO: renamed from: c */
    public void m6071c(long j10, RecyclerView.AbstractC1023f0 abstractC1023f0) {
        this.f4337b.m45604i(j10, abstractC1023f0);
    }

    /* JADX INFO: renamed from: d */
    public void m6072d(RecyclerView.AbstractC1023f0 abstractC1023f0, RecyclerView.AbstractC1031n.c cVar) {
        a aVarM6087b = this.f4336a.get(abstractC1023f0);
        if (aVarM6087b == null) {
            aVarM6087b = a.m6087b();
            this.f4336a.put(abstractC1023f0, aVarM6087b);
        }
        aVarM6087b.f4341c = cVar;
        aVarM6087b.f4339a |= 8;
    }

    /* JADX INFO: renamed from: e */
    public void m6073e(RecyclerView.AbstractC1023f0 abstractC1023f0, RecyclerView.AbstractC1031n.c cVar) {
        a aVarM6087b = this.f4336a.get(abstractC1023f0);
        if (aVarM6087b == null) {
            aVarM6087b = a.m6087b();
            this.f4336a.put(abstractC1023f0, aVarM6087b);
        }
        aVarM6087b.f4340b = cVar;
        aVarM6087b.f4339a |= 4;
    }

    /* JADX INFO: renamed from: f */
    public void m6074f() {
        this.f4336a.clear();
        this.f4337b.m45598a();
    }

    /* JADX INFO: renamed from: g */
    public RecyclerView.AbstractC1023f0 m6075g(long j10) {
        return this.f4337b.m45601e(j10);
    }

    /* JADX INFO: renamed from: h */
    public boolean m6076h(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        a aVar = this.f4336a.get(abstractC1023f0);
        return (aVar == null || (aVar.f4339a & 1) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m6077i(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        a aVar = this.f4336a.get(abstractC1023f0);
        return (aVar == null || (aVar.f4339a & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public void m6078j() {
        a.m6086a();
    }

    /* JADX INFO: renamed from: k */
    public void m6079k(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        m6084p(abstractC1023f0);
    }

    /* JADX INFO: renamed from: l */
    public final RecyclerView.AbstractC1031n.c m6080l(RecyclerView.AbstractC1023f0 abstractC1023f0, int i10) {
        a aVarM45629k;
        RecyclerView.AbstractC1031n.c cVar;
        int iM45623d = this.f4336a.m45623d(abstractC1023f0);
        if (iM45623d >= 0 && (aVarM45629k = this.f4336a.m45629k(iM45623d)) != null) {
            int i11 = aVarM45629k.f4339a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVarM45629k.f4339a = i12;
                if (i10 == 4) {
                    cVar = aVarM45629k.f4340b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarM45629k.f4341c;
                }
                if ((i12 & 12) == 0) {
                    this.f4336a.m45627i(iM45623d);
                    a.m6088c(aVarM45629k);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public RecyclerView.AbstractC1031n.c m6081m(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        return m6080l(abstractC1023f0, 8);
    }

    /* JADX INFO: renamed from: n */
    public RecyclerView.AbstractC1031n.c m6082n(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        return m6080l(abstractC1023f0, 4);
    }

    /* JADX INFO: renamed from: o */
    public void m6083o(b bVar) {
        for (int size = this.f4336a.getSize() - 1; size >= 0; size--) {
            RecyclerView.AbstractC1023f0 abstractC1023f0M45625f = this.f4336a.m45625f(size);
            a aVarM45627i = this.f4336a.m45627i(size);
            int i10 = aVarM45627i.f4339a;
            if ((i10 & 3) == 3) {
                bVar.mo5400b(abstractC1023f0M45625f);
            } else if ((i10 & 1) != 0) {
                RecyclerView.AbstractC1031n.c cVar = aVarM45627i.f4340b;
                if (cVar == null) {
                    bVar.mo5400b(abstractC1023f0M45625f);
                } else {
                    bVar.mo5401c(abstractC1023f0M45625f, cVar, aVarM45627i.f4341c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.mo5399a(abstractC1023f0M45625f, aVarM45627i.f4340b, aVarM45627i.f4341c);
            } else if ((i10 & 12) == 12) {
                bVar.mo5402d(abstractC1023f0M45625f, aVarM45627i.f4340b, aVarM45627i.f4341c);
            } else if ((i10 & 4) != 0) {
                bVar.mo5401c(abstractC1023f0M45625f, aVarM45627i.f4340b, null);
            } else if ((i10 & 8) != 0) {
                bVar.mo5399a(abstractC1023f0M45625f, aVarM45627i.f4340b, aVarM45627i.f4341c);
            }
            a.m6088c(aVarM45627i);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m6084p(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        a aVar = this.f4336a.get(abstractC1023f0);
        if (aVar == null) {
            return;
        }
        aVar.f4339a &= -2;
    }

    /* JADX INFO: renamed from: q */
    public void m6085q(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        for (int iM45607n = this.f4337b.m45607n() - 1; iM45607n >= 0; iM45607n--) {
            if (abstractC1023f0 == this.f4337b.m45608o(iM45607n)) {
                this.f4337b.m45606k(iM45607n);
                break;
            }
        }
        a aVarRemove = this.f4336a.remove(abstractC1023f0);
        if (aVarRemove != null) {
            a.m6088c(aVarRemove);
        }
    }
}
