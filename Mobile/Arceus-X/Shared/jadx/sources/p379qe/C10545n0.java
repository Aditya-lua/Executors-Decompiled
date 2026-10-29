package p379qe;

import java.util.Objects;

/* JADX INFO: renamed from: qe.n0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10545n0 extends AbstractC10511c {

    /* JADX INFO: renamed from: a */
    public final String f37825a;

    /* JADX INFO: renamed from: b */
    public final a f37826b;

    /* JADX INFO: renamed from: qe.n0$a */
    public static final class a {

        /* JADX INFO: renamed from: b */
        public static final a f37827b = new a("TINK");

        /* JADX INFO: renamed from: c */
        public static final a f37828c = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f37829a;

        public a(String str) {
            this.f37829a = str;
        }

        public String toString() {
            return this.f37829a;
        }
    }

    public C10545n0(String str, a aVar) {
        this.f37825a = str;
        this.f37826b = aVar;
    }

    /* JADX INFO: renamed from: b */
    public static C10545n0 m40426b(String str, a aVar) {
        return new C10545n0(str, aVar);
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f37826b != a.f37828c;
    }

    /* JADX INFO: renamed from: c */
    public String m40427c() {
        return this.f37825a;
    }

    /* JADX INFO: renamed from: d */
    public a m40428d() {
        return this.f37826b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10545n0)) {
            return false;
        }
        C10545n0 c10545n0 = (C10545n0) obj;
        return c10545n0.f37825a.equals(this.f37825a) && c10545n0.f37826b.equals(this.f37826b);
    }

    public int hashCode() {
        return Objects.hash(C10545n0.class, this.f37825a, this.f37826b);
    }

    public String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f37825a + ", variant: " + this.f37826b + ")";
    }
}
