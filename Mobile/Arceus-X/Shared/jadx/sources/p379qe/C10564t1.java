package p379qe;

import java.util.Objects;

/* JADX INFO: renamed from: qe.t1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10564t1 extends AbstractC10511c {

    /* JADX INFO: renamed from: a */
    public final a f37881a;

    /* JADX INFO: renamed from: qe.t1$a */
    public static final class a {

        /* JADX INFO: renamed from: b */
        public static final a f37882b = new a("TINK");

        /* JADX INFO: renamed from: c */
        public static final a f37883c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d */
        public static final a f37884d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f37885a;

        public a(String str) {
            this.f37885a = str;
        }

        public String toString() {
            return this.f37885a;
        }
    }

    public C10564t1(a aVar) {
        this.f37881a = aVar;
    }

    /* JADX INFO: renamed from: b */
    public static C10564t1 m40493b(a aVar) {
        return new C10564t1(aVar);
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f37881a != a.f37884d;
    }

    /* JADX INFO: renamed from: c */
    public a m40494c() {
        return this.f37881a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10564t1) && ((C10564t1) obj).m40494c() == m40494c();
    }

    public int hashCode() {
        return Objects.hash(C10564t1.class, this.f37881a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f37881a + ")";
    }
}
