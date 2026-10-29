package bf;

import java.util.Objects;

/* JADX INFO: renamed from: bf.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C1398i extends AbstractC1381a1 {

    /* JADX INFO: renamed from: a */
    public final a f5476a;

    /* JADX INFO: renamed from: bf.i$a */
    public static final class a {

        /* JADX INFO: renamed from: b */
        public static final a f5477b = new a("TINK");

        /* JADX INFO: renamed from: c */
        public static final a f5478c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d */
        public static final a f5479d = new a("LEGACY");

        /* JADX INFO: renamed from: e */
        public static final a f5480e = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f5481a;

        public a(String str) {
            this.f5481a = str;
        }

        public String toString() {
            return this.f5481a;
        }
    }

    public C1398i(a aVar) {
        this.f5476a = aVar;
    }

    /* JADX INFO: renamed from: b */
    public static C1398i m7289b(a aVar) {
        return new C1398i(aVar);
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f5476a != a.f5480e;
    }

    /* JADX INFO: renamed from: c */
    public a m7290c() {
        return this.f5476a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1398i) && ((C1398i) obj).m7290c() == m7290c();
    }

    public int hashCode() {
        return Objects.hash(C1398i.class, this.f5476a);
    }

    public String toString() {
        return "Ed25519 Parameters (variant: " + this.f5476a + ")";
    }
}
