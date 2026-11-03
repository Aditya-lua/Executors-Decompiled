package we;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends pe.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f34452a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34453a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[af.f0.c.values().length];
            b = iArr;
            try {
                iArr[af.f0.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[af.f0.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[af.p0.values().length];
            f34453a = iArr2;
            try {
                iArr2[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34453a[af.p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34453a[af.p0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34453a[af.p0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public p(l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        c(l0Var, d0Var);
        this.f34452a = l0Var;
    }

    public static void c(l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        int i10 = a.b[l0Var.d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            pe.d0.b(d0Var);
        }
    }

    @Override // pe.l
    public Integer a() {
        return this.f34452a.c();
    }

    public l0 b(pe.d0 d0Var) throws GeneralSecurityException {
        c(this.f34452a, d0Var);
        return this.f34452a;
    }
}
