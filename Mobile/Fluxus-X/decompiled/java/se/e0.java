package se;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f31316a;

    public static final class a {
        public static final a b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f31317c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f31318d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31319a;

        public a(String str) {
            this.f31319a = str;
        }

        public String toString() {
            return this.f31319a;
        }
    }

    public e0(a aVar) {
        this.f31316a = aVar;
    }

    public static e0 b(a aVar) {
        return new e0(aVar);
    }

    @Override // re.x
    public boolean a() {
        return this.f31316a != a.f31318d;
    }

    public a c() {
        return this.f31316a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e0) && ((e0) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(e0.class, this.f31316a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f31316a + ")";
    }
}
