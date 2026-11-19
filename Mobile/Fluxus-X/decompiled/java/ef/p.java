package ef;

import cf.p0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import ye.l0;
import ye.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements re.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re.a0 f13426a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f13427c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13428a;

        static {
            int[] iArr = new int[p0.values().length];
            f13428a = iArr;
            try {
                iArr[p0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13428a[p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13428a[p0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13428a[p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public p(re.a0 a0Var, byte[] bArr, byte[] bArr2) {
        this.f13426a = a0Var;
        this.b = bArr;
        this.f13427c = bArr2;
    }

    public static re.a0 b(ye.p pVar) throws GeneralSecurityException {
        l0 l0VarB = pVar.b(re.j.a());
        return new p((re.a0) re.b0.c(cf.f0.h0().F(l0VarB.f()).G(l0VarB.g()).D(l0VarB.d()).build(), re.a0.class), d(l0VarB), c(l0VarB));
    }

    public static byte[] c(l0 l0Var) {
        return l0Var.e().equals(p0.LEGACY) ? new byte[]{0} : new byte[0];
    }

    public static byte[] d(l0 l0Var) throws GeneralSecurityException {
        int i10 = a.f13428a[l0Var.e().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return ye.e0.a(l0Var.c().intValue()).d();
        }
        if (i10 == 3) {
            return ye.e0.b(l0Var.c().intValue()).d();
        }
        if (i10 == 4) {
            return ye.e0.f37741a.d();
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }

    @Override // re.a0
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0 && this.f13427c.length == 0) {
            this.f13426a.a(bArr, bArr2);
            return;
        }
        if (!s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        byte[] bArr4 = this.f13427c;
        if (bArr4.length != 0) {
            bArr2 = ff.e.a(bArr2, bArr4);
        }
        this.f13426a.a(Arrays.copyOfRange(bArr, this.b.length, bArr.length), bArr2);
    }
}
