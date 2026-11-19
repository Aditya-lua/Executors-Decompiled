package se;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31378a;
    public final a b;

    public static final class a {
        public static final a b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f31379c = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31380a;

        public a(String str) {
            this.f31380a = str;
        }

        public String toString() {
            return this.f31380a;
        }
    }

    public n0(String str, a aVar) {
        this.f31378a = str;
        this.b = aVar;
    }

    public static n0 b(String str, a aVar) {
        return new n0(str, aVar);
    }

    @Override // re.x
    public boolean a() {
        return this.b != a.f31379c;
    }

    public String c() {
        return this.f31378a;
    }

    public a d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return n0Var.f31378a.equals(this.f31378a) && n0Var.b.equals(this.b);
    }

    public int hashCode() {
        return Objects.hash(n0.class, this.f31378a, this.b);
    }

    public String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f31378a + ", variant: " + this.b + ")";
    }
}
