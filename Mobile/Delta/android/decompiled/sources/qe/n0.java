package qe;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29747a;
    public final a b;

    public static final class a {
        public static final a b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f29748c = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29749a;

        public a(String str) {
            this.f29749a = str;
        }

        public String toString() {
            return this.f29749a;
        }
    }

    public n0(String str, a aVar) {
        this.f29747a = str;
        this.b = aVar;
    }

    public static n0 b(String str, a aVar) {
        return new n0(str, aVar);
    }

    @Override // pe.x
    public boolean a() {
        return this.b != a.f29748c;
    }

    public String c() {
        return this.f29747a;
    }

    public a d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return n0Var.f29747a.equals(this.f29747a) && n0Var.b.equals(this.b);
    }

    public int hashCode() {
        return Objects.hash(n0.class, this.f29747a, this.b);
    }

    public String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f29747a + ", variant: " + this.b + ")";
    }
}
