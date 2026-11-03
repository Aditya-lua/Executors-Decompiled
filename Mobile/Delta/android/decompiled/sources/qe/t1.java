package qe;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f29787a;

    public static final class a {
        public static final a b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f29788c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f29789d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29790a;

        public a(String str) {
            this.f29790a = str;
        }

        public String toString() {
            return this.f29790a;
        }
    }

    public t1(a aVar) {
        this.f29787a = aVar;
    }

    public static t1 b(a aVar) {
        return new t1(aVar);
    }

    @Override // pe.x
    public boolean a() {
        return this.f29787a != a.f29789d;
    }

    public a c() {
        return this.f29787a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t1) && ((t1) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(t1.class, this.f29787a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f29787a + ")";
    }
}
