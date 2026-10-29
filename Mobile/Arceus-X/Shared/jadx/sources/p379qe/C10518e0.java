package p379qe;

import java.util.Objects;

/* JADX INFO: renamed from: qe.e0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10518e0 extends AbstractC10511c {

    /* JADX INFO: renamed from: a */
    public final a f37747a;

    /* JADX INFO: renamed from: qe.e0$a */
    public static final class a {

        /* JADX INFO: renamed from: b */
        public static final a f37748b = new a("TINK");

        /* JADX INFO: renamed from: c */
        public static final a f37749c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d */
        public static final a f37750d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f37751a;

        public a(String str) {
            this.f37751a = str;
        }

        public String toString() {
            return this.f37751a;
        }
    }

    public C10518e0(a aVar) {
        this.f37747a = aVar;
    }

    /* JADX INFO: renamed from: b */
    public static C10518e0 m40350b(a aVar) {
        return new C10518e0(aVar);
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f37747a != a.f37750d;
    }

    /* JADX INFO: renamed from: c */
    public a m40351c() {
        return this.f37747a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10518e0) && ((C10518e0) obj).m40351c() == m40351c();
    }

    public int hashCode() {
        return Objects.hash(C10518e0.class, this.f37747a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f37747a + ")";
    }
}
