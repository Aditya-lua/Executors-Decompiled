package se;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f31418a;

    public static final class a {
        public static final a b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f31419c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f31420d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31421a;

        public a(String str) {
            this.f31421a = str;
        }

        public String toString() {
            return this.f31421a;
        }
    }

    public t1(a aVar) {
        this.f31418a = aVar;
    }

    public static t1 b(a aVar) {
        return new t1(aVar);
    }

    @Override // re.x
    public boolean a() {
        return this.f31418a != a.f31420d;
    }

    public a c() {
        return this.f31418a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t1) && ((t1) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(t1.class, this.f31418a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f31418a + ")";
    }
}
