package bf;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import ve.l0;
import ve.s0;
import ze.p0;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements oe.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe.a0 f4152a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4153c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4154a;

        static {
            int[] iArr = new int[p0.values().length];
            f4154a = iArr;
            try {
                iArr[p0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4154a[p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4154a[p0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4154a[p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public p(oe.a0 a0Var, byte[] bArr, byte[] bArr2) {
        this.f4152a = a0Var;
        this.b = bArr;
        this.f4153c = bArr2;
    }

    public static oe.a0 b(ve.p pVar) throws GeneralSecurityException {
        l0 l0VarB = pVar.b(oe.j.a());
        return new p((oe.a0) oe.b0.d(ze.f0.h0().D(l0VarB.f()).E(l0VarB.g()).C(l0VarB.d()).build(), oe.a0.class), d(l0VarB), c(l0VarB));
    }

    public static byte[] c(l0 l0Var) {
        return l0Var.e().equals(p0.LEGACY) ? new byte[]{0} : new byte[0];
    }

    public static byte[] d(l0 l0Var) throws GeneralSecurityException {
        int i10 = a.f4154a[l0Var.e().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return ve.e0.a(l0Var.c().intValue()).d();
        }
        if (i10 == 3) {
            return ve.e0.b(l0Var.c().intValue()).d();
        }
        if (i10 == 4) {
            return ve.e0.f32930a.d();
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }

    @Override // oe.a0
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0 && this.f4153c.length == 0) {
            this.f4152a.a(bArr, bArr2);
            return;
        }
        if (!s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        byte[] bArr4 = this.f4153c;
        if (bArr4.length != 0) {
            bArr2 = cf.e.a(bArr2, bArr4);
        }
        this.f4152a.a(Arrays.copyOfRange(bArr, this.b.length, bArr.length), bArr2);
    }
}
