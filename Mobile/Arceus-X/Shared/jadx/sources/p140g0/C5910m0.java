package p140g0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p533x2.C12637g;

/* JADX INFO: renamed from: g0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5910m0 {

    /* JADX INFO: renamed from: a */
    public final List<C5943u1> f22563a;

    /* JADX INFO: renamed from: b */
    public final List<C5943u1> f22564b;

    /* JADX INFO: renamed from: c */
    public final List<C5943u1> f22565c;

    /* JADX INFO: renamed from: d */
    public final long f22566d;

    public C5910m0(a aVar) {
        this.f22563a = Collections.unmodifiableList(aVar.f22567a);
        this.f22564b = Collections.unmodifiableList(aVar.f22568b);
        this.f22565c = Collections.unmodifiableList(aVar.f22569c);
        this.f22566d = aVar.f22570d;
    }

    /* JADX INFO: renamed from: a */
    public long m26528a() {
        return this.f22566d;
    }

    /* JADX INFO: renamed from: b */
    public List<C5943u1> m26529b() {
        return this.f22564b;
    }

    /* JADX INFO: renamed from: c */
    public List<C5943u1> m26530c() {
        return this.f22563a;
    }

    /* JADX INFO: renamed from: d */
    public List<C5943u1> m26531d() {
        return this.f22565c;
    }

    /* JADX INFO: renamed from: e */
    public boolean m26532e() {
        return this.f22566d > 0;
    }

    /* JADX INFO: renamed from: g0.m0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final List<C5943u1> f22567a;

        /* JADX INFO: renamed from: b */
        public final List<C5943u1> f22568b;

        /* JADX INFO: renamed from: c */
        public final List<C5943u1> f22569c;

        /* JADX INFO: renamed from: d */
        public long f22570d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(C5943u1 c5943u1, int i10) {
            this.f22567a = new ArrayList();
            this.f22568b = new ArrayList();
            this.f22569c = new ArrayList();
            this.f22570d = 5000L;
            m26533a(c5943u1, i10);
        }

        /* JADX INFO: renamed from: a */
        public a m26533a(C5943u1 c5943u1, int i10) {
            boolean z10 = false;
            C12637g.m47070b(c5943u1 != null, "Point cannot be null.");
            if (i10 >= 1 && i10 <= 7) {
                z10 = true;
            }
            C12637g.m47070b(z10, "Invalid metering mode " + i10);
            if ((i10 & 1) != 0) {
                this.f22567a.add(c5943u1);
            }
            if ((i10 & 2) != 0) {
                this.f22568b.add(c5943u1);
            }
            if ((i10 & 4) != 0) {
                this.f22569c.add(c5943u1);
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C5910m0 m26534b() {
            return new C5910m0(this);
        }

        /* JADX INFO: renamed from: c */
        public a m26535c() {
            this.f22570d = 0L;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m26536d(int i10) {
            if ((i10 & 1) != 0) {
                this.f22567a.clear();
            }
            if ((i10 & 2) != 0) {
                this.f22568b.clear();
            }
            if ((i10 & 4) != 0) {
                this.f22569c.clear();
            }
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m26537e(long j10, TimeUnit timeUnit) {
            C12637g.m47070b(j10 >= 1, "autoCancelDuration must be at least 1");
            this.f22570d = timeUnit.toMillis(j10);
            return this;
        }

        public a(C5910m0 c5910m0) {
            ArrayList arrayList = new ArrayList();
            this.f22567a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f22568b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f22569c = arrayList3;
            this.f22570d = 5000L;
            arrayList.addAll(c5910m0.m26530c());
            arrayList2.addAll(c5910m0.m26529b());
            arrayList3.addAll(c5910m0.m26531d());
            this.f22570d = c5910m0.m26528a();
        }
    }
}
