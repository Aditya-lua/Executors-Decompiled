package p379qe;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: renamed from: qe.o1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10549o1 extends AbstractC10511c {

    /* JADX INFO: renamed from: a */
    public final a f37835a;

    /* JADX INFO: renamed from: b */
    public final int f37836b;

    /* JADX INFO: renamed from: qe.o1$a */
    public static final class a {

        /* JADX INFO: renamed from: b */
        public static final a f37837b = new a("TINK");

        /* JADX INFO: renamed from: c */
        public static final a f37838c = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f37839a;

        public a(String str) {
            this.f37839a = str;
        }

        public String toString() {
            return this.f37839a;
        }
    }

    public C10549o1(a aVar, int i10) {
        this.f37835a = aVar;
        this.f37836b = i10;
    }

    /* JADX INFO: renamed from: b */
    public static C10549o1 m40439b(a aVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new C10549o1(aVar, i10);
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f37835a != a.f37838c;
    }

    /* JADX INFO: renamed from: c */
    public int m40440c() {
        return this.f37836b;
    }

    /* JADX INFO: renamed from: d */
    public a m40441d() {
        return this.f37835a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10549o1)) {
            return false;
        }
        C10549o1 c10549o1 = (C10549o1) obj;
        return c10549o1.m40441d() == m40441d() && c10549o1.m40440c() == m40440c();
    }

    public int hashCode() {
        return Objects.hash(C10549o1.class, this.f37835a, Integer.valueOf(this.f37836b));
    }

    public String toString() {
        return "X-AES-GCM Parameters (variant: " + this.f37835a + "salt_size_bytes: " + this.f37836b + ")";
    }
}
