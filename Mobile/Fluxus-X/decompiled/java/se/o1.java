package se;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f31384a;
    public final int b;

    public static final class a {
        public static final a b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f31385c = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31386a;

        public a(String str) {
            this.f31386a = str;
        }

        public String toString() {
            return this.f31386a;
        }
    }

    public o1(a aVar, int i10) {
        this.f31384a = aVar;
        this.b = i10;
    }

    public static o1 b(a aVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new o1(aVar, i10);
    }

    @Override // re.x
    public boolean a() {
        return this.f31384a != a.f31385c;
    }

    public int c() {
        return this.b;
    }

    public a d() {
        return this.f31384a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return o1Var.d() == d() && o1Var.c() == c();
    }

    public int hashCode() {
        return Objects.hash(o1.class, this.f31384a, Integer.valueOf(this.b));
    }

    public String toString() {
        return "X-AES-GCM Parameters (variant: " + this.f31384a + "salt_size_bytes: " + this.b + ")";
    }
}
