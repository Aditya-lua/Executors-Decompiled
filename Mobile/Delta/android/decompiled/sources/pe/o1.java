package pe;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f28505a;
    public final int b;

    public static final class a {
        public static final a b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f28506c = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28507a;

        public a(String str) {
            this.f28507a = str;
        }

        public String toString() {
            return this.f28507a;
        }
    }

    public o1(a aVar, int i10) {
        this.f28505a = aVar;
        this.b = i10;
    }

    public static o1 b(a aVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new o1(aVar, i10);
    }

    @Override // oe.x
    public boolean a() {
        return this.f28505a != a.f28506c;
    }

    public int c() {
        return this.b;
    }

    public a d() {
        return this.f28505a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return o1Var.d() == d() && o1Var.c() == c();
    }

    public int hashCode() {
        return Objects.hash(o1.class, this.f28505a, Integer.valueOf(this.b));
    }

    public String toString() {
        return "X-AES-GCM Parameters (variant: " + this.f28505a + "salt_size_bytes: " + this.b + ")";
    }
}
