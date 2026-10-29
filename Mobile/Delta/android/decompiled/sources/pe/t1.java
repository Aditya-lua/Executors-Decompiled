package pe;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f28539a;

    public static final class a {
        public static final a b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f28540c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f28541d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28542a;

        public a(String str) {
            this.f28542a = str;
        }

        public String toString() {
            return this.f28542a;
        }
    }

    public t1(a aVar) {
        this.f28539a = aVar;
    }

    public static t1 b(a aVar) {
        return new t1(aVar);
    }

    @Override // oe.x
    public boolean a() {
        return this.f28539a != a.f28541d;
    }

    public a c() {
        return this.f28539a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t1) && ((t1) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(t1.class, this.f28539a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f28539a + ")";
    }
}
