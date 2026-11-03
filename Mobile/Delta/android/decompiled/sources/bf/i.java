package bf;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4089a;

    public static final class a {
        public static final a b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f4090c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f4091d = new a("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f4092e = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4093a;

        public a(String str) {
            this.f4093a = str;
        }

        public String toString() {
            return this.f4093a;
        }
    }

    public i(a aVar) {
        this.f4089a = aVar;
    }

    public static i b(a aVar) {
        return new i(aVar);
    }

    @Override // pe.x
    public boolean a() {
        return this.f4089a != a.f4092e;
    }

    public a c() {
        return this.f4089a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && ((i) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(i.class, this.f4089a);
    }

    public String toString() {
        return "Ed25519 Parameters (variant: " + this.f4089a + ")";
    }
}
