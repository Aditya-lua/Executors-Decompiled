package af;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f417a;

    public static final class a {
        public static final a b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f418c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f419d = new a("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f420e = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f421a;

        public a(String str) {
            this.f421a = str;
        }

        public String toString() {
            return this.f421a;
        }
    }

    public i(a aVar) {
        this.f417a = aVar;
    }

    public static i b(a aVar) {
        return new i(aVar);
    }

    @Override // oe.x
    public boolean a() {
        return this.f417a != a.f420e;
    }

    public a c() {
        return this.f417a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && ((i) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(i.class, this.f417a);
    }

    public String toString() {
        return "Ed25519 Parameters (variant: " + this.f417a + ")";
    }
}
