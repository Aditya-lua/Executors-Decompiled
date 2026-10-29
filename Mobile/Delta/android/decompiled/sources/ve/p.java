package ve;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends oe.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f32998a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32999a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ze.f0.c.values().length];
            b = iArr;
            try {
                iArr[ze.f0.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ze.f0.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ze.p0.values().length];
            f32999a = iArr2;
            try {
                iArr2[ze.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32999a[ze.p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32999a[ze.p0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32999a[ze.p0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public p(l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        c(l0Var, d0Var);
        this.f32998a = l0Var;
    }

    public static void c(l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        int i10 = a.b[l0Var.d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            oe.d0.b(d0Var);
        }
    }

    @Override // oe.l
    public Integer a() {
        return this.f32998a.c();
    }

    public l0 b(oe.d0 d0Var) throws GeneralSecurityException {
        c(this.f32998a, d0Var);
        return this.f32998a;
    }
}
