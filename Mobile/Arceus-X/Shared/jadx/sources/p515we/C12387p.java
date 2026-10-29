package p515we;

import af.C0218f0;
import af.EnumC0238p0;
import java.security.GeneralSecurityException;
import pe.AbstractC10231l;
import pe.C10218d0;

/* JADX INFO: renamed from: we.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C12387p extends AbstractC10231l {

    /* JADX INFO: renamed from: a */
    public final C12380l0 f44325a;

    /* JADX INFO: renamed from: we.p$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44326a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f44327b;

        static {
            int[] iArr = new int[C0218f0.c.values().length];
            f44327b = iArr;
            try {
                iArr[C0218f0.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44327b[C0218f0.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0238p0.values().length];
            f44326a = iArr2;
            try {
                iArr2[EnumC0238p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44326a[EnumC0238p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44326a[EnumC0238p0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44326a[EnumC0238p0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C12387p(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        m46418c(c12380l0, c10218d0);
        this.f44325a = c12380l0;
    }

    /* JADX INFO: renamed from: c */
    public static void m46418c(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        int i10 = a.f44327b[c12380l0.m46394d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            C10218d0.m39310b(c10218d0);
        }
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f44325a.m46393c();
    }

    /* JADX INFO: renamed from: b */
    public C12380l0 m46419b(C10218d0 c10218d0) throws GeneralSecurityException {
        m46418c(this.f44325a, c10218d0);
        return this.f44325a;
    }
}
