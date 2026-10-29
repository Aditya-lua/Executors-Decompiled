package pe;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f28437a;

    public static final class a {
        public static final a b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f28438c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f28439d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28440a;

        public a(String str) {
            this.f28440a = str;
        }

        public String toString() {
            return this.f28440a;
        }
    }

    public e0(a aVar) {
        this.f28437a = aVar;
    }

    public static e0 b(a aVar) {
        return new e0(aVar);
    }

    @Override // oe.x
    public boolean a() {
        return this.f28437a != a.f28439d;
    }

    public a c() {
        return this.f28437a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e0) && ((e0) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(e0.class, this.f28437a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f28437a + ")";
    }
}
