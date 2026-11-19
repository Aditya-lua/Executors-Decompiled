package g0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u1> f16877a;
    public final List<u1> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<u1> f16878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16879d;

    public m0(a aVar) {
        this.f16877a = Collections.unmodifiableList(aVar.f16880a);
        this.b = Collections.unmodifiableList(aVar.b);
        this.f16878c = Collections.unmodifiableList(aVar.f16881c);
        this.f16879d = aVar.f16882d;
    }

    public long a() {
        return this.f16879d;
    }

    public List<u1> b() {
        return this.b;
    }

    public List<u1> c() {
        return this.f16877a;
    }

    public List<u1> d() {
        return this.f16878c;
    }

    public boolean e() {
        return this.f16879d > 0;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<u1> f16880a;
        public final List<u1> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<u1> f16881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f16882d;

        public a(u1 u1Var, int i10) {
            this.f16880a = new ArrayList();
            this.b = new ArrayList();
            this.f16881c = new ArrayList();
            this.f16882d = 5000L;
            a(u1Var, i10);
        }

        public a a(u1 u1Var, int i10) {
            boolean z10 = false;
            x2.g.b(u1Var != null, "Point cannot be null.");
            if (i10 >= 1 && i10 <= 7) {
                z10 = true;
            }
            x2.g.b(z10, "Invalid metering mode " + i10);
            if ((i10 & 1) != 0) {
                this.f16880a.add(u1Var);
            }
            if ((i10 & 2) != 0) {
                this.b.add(u1Var);
            }
            if ((i10 & 4) != 0) {
                this.f16881c.add(u1Var);
            }
            return this;
        }

        public m0 b() {
            return new m0(this);
        }

        public a c() {
            this.f16882d = 0L;
            return this;
        }

        public a d(int i10) {
            if ((i10 & 1) != 0) {
                this.f16880a.clear();
            }
            if ((i10 & 2) != 0) {
                this.b.clear();
            }
            if ((i10 & 4) != 0) {
                this.f16881c.clear();
            }
            return this;
        }

        public a e(long j10, TimeUnit timeUnit) {
            x2.g.b(j10 >= 1, "autoCancelDuration must be at least 1");
            this.f16882d = timeUnit.toMillis(j10);
            return this;
        }

        public a(m0 m0Var) {
            ArrayList arrayList = new ArrayList();
            this.f16880a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f16881c = arrayList3;
            this.f16882d = 5000L;
            arrayList.addAll(m0Var.c());
            arrayList2.addAll(m0Var.b());
            arrayList3.addAll(m0Var.d());
            this.f16882d = m0Var.a();
        }
    }
}
