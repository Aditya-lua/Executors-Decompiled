package df;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f12287a;

    public static final class a {
        public static final a b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f12288c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f12289d = new a("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f12290e = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12291a;

        public a(String str) {
            this.f12291a = str;
        }

        public String toString() {
            return this.f12291a;
        }
    }

    public i(a aVar) {
        this.f12287a = aVar;
    }

    public static i b(a aVar) {
        return new i(aVar);
    }

    @Override // re.x
    public boolean a() {
        return this.f12287a != a.f12290e;
    }

    public a c() {
        return this.f12287a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && ((i) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(i.class, this.f12287a);
    }

    public String toString() {
        return "Ed25519 Parameters (variant: " + this.f12287a + ")";
    }
}
